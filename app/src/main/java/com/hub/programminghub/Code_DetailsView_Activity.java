package com.hub.programminghub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Code_DetailsView_Activity extends AppCompatActivity {

    TextView titlecode, inputcode, outputcode, codedescription;

    String gettitel,getinput,getoutput,getdesription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code__details_view_);

        Intent i =getIntent();
        gettitel = i.getStringExtra("DATA_TITEL");
        getinput = i.getStringExtra("DATA_INPUT");
        getoutput = i.getStringExtra("DATA_OUTPUT");
        getdesription = i.getStringExtra("DATA_DESCRIPTION");

        titlecode = (TextView) findViewById(R.id.codetitle);
        inputcode = (TextView) findViewById(R.id.inputCode);
        outputcode = (TextView) findViewById(R.id.outPutCode);
        codedescription = (TextView) findViewById(R.id.codeDescription);

        titlecode.setText(gettitel);
        inputcode.setText(getinput);
        outputcode.setText(getoutput);
        codedescription.setText(getdesription);

    }
}