package com.hub.programminghub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Compiler_Activity extends AppCompatActivity implements View.OnClickListener {

    Button cbutton, cplusbutton, javabutton,pythonebutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compiler_);

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
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://repl.it/languages/c"));
            startActivity(browserIntent);
        }else if (view==cplusbutton){
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://repl.it/languages/cpp"));
            startActivity(browserIntent);
        }
        else if (view==pythonebutton){
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://repl.it/languages/python3"));
            startActivity(browserIntent);
        }
        else if (view==javabutton){
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://repl.it/languages/java10"));
            startActivity(browserIntent);
        }
    }
}