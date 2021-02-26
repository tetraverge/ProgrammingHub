package com.hub.programminghub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Introduction_Activity extends AppCompatActivity implements View.OnClickListener {

    Button cbutton, cplusbutton, javabutton,pythonebutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_);

        cbutton = (Button) findViewById(R.id.btnOne);
        cplusbutton = (Button) findViewById(R.id.btnTwo);
        pythonebutton = (Button) findViewById(R.id.btnThree);
        javabutton = (Button) findViewById(R.id.btnFour);
        cbutton.setOnClickListener(this);
        cplusbutton.setOnClickListener(this);
        pythonebutton.setOnClickListener(this);
        javabutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view ==cbutton){
            Intent intent = new Intent(Introduction_Activity.this, C_Intro.class);
            startActivity(intent);
        }else if (view==cplusbutton){
            Intent intent = new Intent(Introduction_Activity.this, Cplus_Intro.class);
            startActivity(intent);
        }
        else if (view==pythonebutton){
            Intent intent = new Intent(Introduction_Activity.this, Pythone_Intro.class);
            startActivity(intent);
        }
        else if (view==javabutton){
            Intent intent = new Intent(Introduction_Activity.this, Java_Intro.class);
            startActivity(intent);
        }
    }
}