package com.hub.programminghub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Code_DetailsView_Activity extends AppCompatActivity {

    TextView titlecode, inputcode, outputcode, codedescription;

    String gettitel,getinput,getoutput,getdesription,getid;

    private DatabaseReference userDBRef,favouriteEventDBREF;
    private FirebaseAuth mAuth;
    String userCurrentId;
    private FirebaseUser currentuser;
    FloatingActionButton mAddFab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code__details_view_);

        Intent i =getIntent();
        getid = i.getStringExtra("DATA_ID");
        gettitel = i.getStringExtra("DATA_TITEL");
        getinput = i.getStringExtra("DATA_INPUT");
        getoutput = i.getStringExtra("DATA_OUTPUT");
        getdesription = i.getStringExtra("DATA_DESCRIPTION");

        favouriteEventDBREF = FirebaseDatabase.getInstance().getReference().child("Favourite");
        mAuth = FirebaseAuth.getInstance();
        mAddFab = findViewById(R.id.floatingActionButton);

        titlecode = (TextView) findViewById(R.id.codetitle);
        inputcode = (TextView) findViewById(R.id.inputCode);
        outputcode = (TextView) findViewById(R.id.outPutCode);
        codedescription = (TextView) findViewById(R.id.codeDescription);

        titlecode.setText(gettitel);
        inputcode.setText(getinput);
        outputcode.setText(getoutput);
        codedescription.setText(getdesription);

        mAddFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String favouritid = String.valueOf(System.currentTimeMillis());


                HashMap postHash = new HashMap();
                postHash.put("codetitle",gettitel);
                postHash.put("code",getinput);
                postHash.put("coderesult",getoutput);
                postHash.put("codedescription",getdesription);
                postHash.put("postid",getid);
                postHash.put("favid",favouritid);
                postHash.put("userid",userCurrentId);

                favouriteEventDBREF.child(favouritid).setValue(postHash).addOnCompleteListener(new OnCompleteListener() {
                    @Override
                    public void onComplete(Task task) {

                        if (task.isSuccessful())
                        {

                            Toast.makeText(Code_DetailsView_Activity.this,"Successfully Added in Favourite",Toast.LENGTH_LONG).show();

                        }
                        else {
                            Toast.makeText(Code_DetailsView_Activity.this,"Error",Toast.LENGTH_LONG).show();
                        }


                    }
                });
            }
        });

    }


    @Override
    protected void onStart() {
        super.onStart();
        currentuser = mAuth.getCurrentUser();

        if (currentuser==null)
        {
            Toast.makeText(Code_DetailsView_Activity.this,"You are Not Logged In Please Login or Register",Toast.LENGTH_LONG).show();
        }
        else
        {
            userCurrentId = mAuth.getCurrentUser().getUid();
        }
    }
}