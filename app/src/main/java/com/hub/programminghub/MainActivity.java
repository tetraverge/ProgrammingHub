package com.hub.programminghub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    private FirebaseAuth mAuth;
    private DatabaseReference userRef;
    private CircleImageView profilenavimage;
    private TextView prifilenavname;
    String currentuserid;

    Button cbutton, cplusbutton, javabutton,pythonebutton, videobutton, booksbutton,btncompile,btnquiz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        cbutton = (Button) findViewById(R.id.btnOne);
        cplusbutton = (Button) findViewById(R.id.btnTwo);
        pythonebutton = (Button) findViewById(R.id.btnThree);
        javabutton = (Button) findViewById(R.id.btnFour);
        videobutton = (Button) findViewById(R.id.btnFive);
        booksbutton = (Button) findViewById(R.id.btnSix);
        btncompile = (Button) findViewById(R.id.btncompiler);
        btnquiz = (Button) findViewById(R.id.btnquize);

        cbutton.setOnClickListener(this);
        cplusbutton.setOnClickListener(this);
        pythonebutton.setOnClickListener(this);
        javabutton.setOnClickListener(this);
        videobutton.setOnClickListener(this);
        booksbutton.setOnClickListener(this);
        btncompile.setOnClickListener(this);
        btnquiz.setOnClickListener(this);

        mAuth = FirebaseAuth.getInstance(); //firebase authentication
        userRef = FirebaseDatabase.getInstance().getReference().child("Users"); // firebase database
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);  // android drawer
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);
        View navview = navigationView.getHeaderView(0);
        profilenavimage = (CircleImageView) navview.findViewById(R.id.navimageView); // drawer image view
        prifilenavname = (TextView) navview.findViewById(R.id.navname);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_register) {

            senduserTologin();

        }

        else if (id==R.id.nav_introduction){
            Intent intent = new Intent(MainActivity.this, Introduction_Activity.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_about){
            Intent intent = new Intent(MainActivity.this, About_Us.class);
            startActivity(intent);

        }
        else if (id==R.id.nav_about_app){
            Intent intent = new Intent(MainActivity.this, About_App_Activity.class);
            startActivity(intent);
        }

        else if (id == R.id.nav_logout) {
            mAuth.signOut();
            Toast.makeText(this,"Logout Successful",Toast.LENGTH_LONG).show(); //logout mathode
            senduserTologin();
        }
        else if (id == R.id.nav_favourite) {
            Intent intent = new Intent(MainActivity.this, FavouriteCode_Activity.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_share){
        sharebutton();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void senduserToadcode() {

        Intent intent = new Intent(MainActivity.this, ImportData.class);
        startActivity(intent);
    }

    private void senduserTologin() {
        Intent intent = new Intent(MainActivity.this, Login_Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentuser = mAuth.getCurrentUser(); //get current user id

        if (currentuser==null)
        {
            Toast.makeText(MainActivity.this,"You are Not Logged In Please Login or Register",Toast.LENGTH_LONG).show();
        }
        else
        {
            currentuserid = mAuth.getCurrentUser().getUid();
            userRef.child(currentuserid).addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {

                    if (dataSnapshot.exists())
                    {


                        String Fullname = dataSnapshot.child("username").getValue().toString();
                        String imageurl = dataSnapshot.child("profileimageurl").getValue().toString();

                        prifilenavname.setText(Fullname); // updating data from database
                        Picasso.with(MainActivity.this)
                                .load(imageurl)
                                .fit()
                                .placeholder(R.drawable.user)
                                .into(profilenavimage);


                    }

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

        }
    }


    @Override
    public void onClick(View view) {
        if (view ==cbutton){
            Intent intent = new Intent(MainActivity.this, CodeView_Activity.class);
            intent.putExtra("DATA_ID","C");
            startActivity(intent);

        }else if (view==cplusbutton){
            Intent intent = new Intent(MainActivity.this, CodeView_Activity.class);
            intent.putExtra("DATA_ID","C++");
            startActivity(intent);
        }
        else if (view==pythonebutton){
            Intent intent = new Intent(MainActivity.this, CodeView_Activity.class);
            intent.putExtra("DATA_ID","Python");
            startActivity(intent);
        }
        else if (view==javabutton){
            Intent intent = new Intent(MainActivity.this, CodeView_Activity.class);
            intent.putExtra("DATA_ID","Java");
            startActivity(intent);
        }
        else if (view==videobutton){
            Intent intent = new Intent(MainActivity.this, Video_Tutorials.class);
            startActivity(intent);
        }
        else if (view==booksbutton){
            Intent intent = new Intent(MainActivity.this, Books.class);
            startActivity(intent);
        }

        else if (view==btncompile){
            Intent intent = new Intent(MainActivity.this, Compiler_Activity.class);
            startActivity(intent);
        }
        else if (view==btnquiz){
            Intent intent = new Intent(MainActivity.this, Books_Activity.class);
            startActivity(intent);
        }
    }

    private void sharebutton() {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "Programming Hub Android App";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Programming Hub Android App");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }
}