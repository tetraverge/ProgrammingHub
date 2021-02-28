package com.hub.programminghub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FavouriteCode_Activity extends AppCompatActivity {

    private ListView codetitlelistview;
    private DatabaseReference CodeDBRef, favouriteEventDBREF;
    private String userCurrentId;
    private List<DataManager> codeslist;
    private String codepostid;
    private FirebaseAuth mAuth;
    private FirebaseUser currentuser;
    String getCodeId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_code_);

        favouriteEventDBREF = FirebaseDatabase.getInstance().getReference().child("Favourite");
        mAuth = FirebaseAuth.getInstance();

        codetitlelistview = (ListView) findViewById(R.id.codeTitleListView);
        codeslist = new ArrayList<>();
        codetitlelistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                final DataManager idsofcode = codeslist.get(position);
                codepostid = idsofcode.getPostid();
                String title = idsofcode.getCodetitle();
                String inputcode = idsofcode.getCode();
                String outputcode = idsofcode.getCoderesult();
                String codedescription = idsofcode.getCodedescription();
                Intent intent = new Intent(FavouriteCode_Activity.this, Code_DetailsView_Activity.class);
                intent.putExtra("DATA_ID",codepostid);
                intent.putExtra("DATA_TITEL",title);
                intent.putExtra("DATA_INPUT",inputcode);
                intent.putExtra("DATA_OUTPUT",outputcode);
                intent.putExtra("DATA_DESCRIPTION",codedescription);
                startActivity(intent);

                Log.i("this is", codepostid);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        currentuser = mAuth.getCurrentUser();

        if (currentuser==null)
        {
            Toast.makeText(FavouriteCode_Activity.this,"You are Not Logged In Please Login or Register",Toast.LENGTH_LONG).show();
        }
        else
        {
            userCurrentId = mAuth.getCurrentUser().getUid();
            adaptersetup();
        }
    }

    public void adaptersetup(){
        favouriteEventDBREF.orderByChild("userid").equalTo(userCurrentId).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                try {
                    codeslist.clear();
                    for (DataSnapshot usersnapshot: dataSnapshot.getChildren())
                    {
                        DataManager alleventdata = usersnapshot.getValue(DataManager.class);
                        codeslist.add(alleventdata);
                    }
                    CodeView_List_Adapter adapter = new CodeView_List_Adapter(FavouriteCode_Activity.this, codeslist);
                    codetitlelistview.setAdapter(adapter);

                } catch (Exception e)
                {
                    Log.i("exception is", String.valueOf(e));
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}