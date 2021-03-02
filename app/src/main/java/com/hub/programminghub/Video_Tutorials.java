package com.hub.programminghub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Video_Tutorials extends AppCompatActivity implements View.OnClickListener {

    Button cb,ce,cpb,cpe,pb,pe,jb,je;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video__tutorials);
        cb = (Button) findViewById(R.id.cbangla);
        ce = (Button) findViewById(R.id.cenglish);
        cpb = (Button) findViewById(R.id.cpusbangla);
        cpe = (Button) findViewById(R.id.cplusenglish);
        pb = (Button) findViewById(R.id.pythonbangal);
        pe = (Button) findViewById(R.id.pythonenglish);
        jb = (Button) findViewById(R.id.javabangla);
        je = (Button) findViewById(R.id.javaenglish);

        cb.setOnClickListener(this);
        ce.setOnClickListener(this);
        cpb.setOnClickListener(this);
        cpe.setOnClickListener(this);
        pb.setOnClickListener(this);
        pe.setOnClickListener(this);
        jb.setOnClickListener(this);
        je.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        if (view==cb){
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/playlist?list=PLgH5QX0i9K3pCMBZcul1fta6UivHDbXvz"
                    ));
            startActivity(browserIntent);
        }else if (view==ce) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/playlist?list=PLBlnK6fEyqRggZZgYpPMUxdY1CYkZtARR"));
            startActivity(browserIntent);
        }
        else if (view==cpb) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/playlist?list=PLgH5QX0i9K3q0ZKeXtF--CZ0PdH1sSbYL"));
            startActivity(browserIntent);
        }
        else if (view==cpe) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/playlist?list=PLfVsf4Bjg79Cu5MYkyJ-u4SyQmMhFeC1C"));
            startActivity(browserIntent);
        }
        else if (view==pb) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/playlist?list=PLgH5QX0i9K3rz5XqMsTk41_j15_6682BN"));
            startActivity(browserIntent);
        }else if (view==pe) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/playlist?list=PL-osiE80TeTt2d9bfVyTiXJA-UTHn6WwU"));
            startActivity(browserIntent);
        }else if (view==jb) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/playlist?list=PLgH5QX0i9K3oAZUB2QXR-dZac0c9HNyRa"));
            startActivity(browserIntent);
        }else if (view==je) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/playlist?list=PLsyeobzWxl7oZ-fxDYkOToURHhMuWD1BK"));
            startActivity(browserIntent);
        }





    }
}