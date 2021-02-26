package com.hub.programminghub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodeView_Activity extends AppCompatActivity {

    private ListView codetitlelistview;
    private DatabaseReference CodeDBRef;
    private String userCurrentId;
    private List<DataManager> codeslist;
    private String codepostid;

    String getCodeId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_view_);
        CodeDBRef = FirebaseDatabase.getInstance().getReference();

        Intent i =getIntent();
        getCodeId = i.getStringExtra("DATA_ID");

        if (getCodeId.equals("C"))
        {
            CodeDBRef = FirebaseDatabase.getInstance().getReference().child("C");
        }
        else if (getCodeId.equals("C++"))
        {
            CodeDBRef = FirebaseDatabase.getInstance().getReference().child("C++");
        }
        else if (getCodeId.equals("Python"))
        {
            CodeDBRef = FirebaseDatabase.getInstance().getReference().child("Python");
        }
        else if (getCodeId.equals("Java"))
        {
            CodeDBRef = FirebaseDatabase.getInstance().getReference().child("Java");
        }


        codetitlelistview = (ListView) findViewById(R.id.codeTitleListView);

        codeslist = new ArrayList<>();

        adaptersetup();

        codetitlelistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                final DataManager idsofcode = codeslist.get(position);
                codepostid = idsofcode.getPostid();
                String title = idsofcode.getCodetitle();
                String inputcode = idsofcode.getCode();
                String outputcode = idsofcode.getCoderesult();
                String codedescription = idsofcode.getCodedescription();
                Intent intent = new Intent(CodeView_Activity.this, Code_DetailsView_Activity.class);
                intent.putExtra("DATA_TITEL",title);
                intent.putExtra("DATA_INPUT",inputcode);
                intent.putExtra("DATA_OUTPUT",outputcode);
                intent.putExtra("DATA_DESCRIPTION",codedescription);
                startActivity(intent);

                Log.i("this is", codepostid);
            }
        });
    }

    public void adaptersetup(){
        CodeDBRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                try {
                    codeslist.clear();
                    for (DataSnapshot usersnapshot: dataSnapshot.getChildren())
                    {
                        DataManager alleventdata = usersnapshot.getValue(DataManager.class);
                        codeslist.add(alleventdata);
                    }
                    CodeView_List_Adapter adapter = new CodeView_List_Adapter(CodeView_Activity.this, codeslist);
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