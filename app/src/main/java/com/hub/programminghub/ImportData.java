package com.hub.programminghub;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ImportData extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    String item;
    EditText titleinput, codeinput, resultinput, descriptioninput;
    Button sbbutton;
    private DatabaseReference postdbref;
    private ProgressDialog loadingbar;

    String codetitle, code, coderesult, codedescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_import_data);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        titleinput = (EditText) findViewById(R.id.event_title);
        codeinput = (EditText) findViewById(R.id.event_code);
        resultinput = (EditText) findViewById(R.id.event_result);
        descriptioninput = (EditText) findViewById(R.id.event_description);
        sbbutton = (Button) findViewById(R.id.submitbtn);
        loadingbar = new ProgressDialog(this);
        postdbref = FirebaseDatabase.getInstance().getReference();

        spinner.setOnItemSelectedListener(this);
        List<String> categories = new ArrayList<String>();
        categories.add("C");
        categories.add("C++");
        categories.add("Java");
        categories.add("Python");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);



        sbbutton.setOnClickListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
         item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View view) {
        if (view==sbbutton){
            submitnewpost();
            loadingbar.setTitle("Add Code");
            loadingbar.setMessage("Please Wait Adding New Code ...   ");
            loadingbar.show();
            loadingbar.setCanceledOnTouchOutside(true);
        }
    }

    private void submitnewpost() {

        codetitle = titleinput.getText().toString();
        code = codeinput.getText().toString();
        coderesult = resultinput.getText().toString();
        codedescription = descriptioninput.getText().toString();
        String postid;
        postid=  postdbref.push().getKey();

        HashMap postHash = new HashMap();
        postHash.put("codetitle",codetitle);
        postHash.put("code",code);
        postHash.put("coderesult",coderesult);
        postHash.put("codedescription",codedescription);
        postHash.put("postid",postid);

        postdbref.child(item).child(postid).updateChildren(postHash).addOnCompleteListener(new OnCompleteListener() {
            @Override
            public void onComplete(Task task) {
                Toast.makeText(ImportData.this,"Post Successful",Toast.LENGTH_LONG).show();
                loadingbar.dismiss();
                titleinput.setText("");
                codeinput.setText("");
                resultinput.setText("");
                descriptioninput.setText("");
            }
        });
    }
}