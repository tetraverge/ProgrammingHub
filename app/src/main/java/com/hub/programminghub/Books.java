package com.hub.programminghub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Books extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        Button one = (Button) findViewById(R.id.btnone);
        Button two = (Button) findViewById(R.id.btntwo);
        Button three = (Button) findViewById(R.id.btnthree);
        Button four = (Button) findViewById(R.id.btnfour);
        Button five = (Button) findViewById(R.id.btnFive);
        Button six = (Button) findViewById(R.id.btnsix);
        Button seven = (Button) findViewById(R.id.btnseven);
        Button eight = (Button) findViewById(R.id.btneight);
        Button nine = (Button) findViewById(R.id.btnine);
        Button ten = (Button) findViewById(R.id.btnten);
        Button eleven = (Button) findViewById(R.id.btneleven);
        Button twelve = (Button) findViewById(R.id.btntwleve);
        Button thirteen = (Button) findViewById(R.id.btnthirteen);
        Button fourteen = (Button) findViewById(R.id.btnfourteen);
        Button fifteen = (Button) findViewById(R.id.btnfifteen);
        Button sixteen= (Button) findViewById(R.id.btnsixteen);
        Button seventeen = (Button) findViewById(R.id.btnseventeen);
        Button eighteen = (Button) findViewById(R.id.btneigteen);
        Button ninteen = (Button) findViewById(R.id.btnninteen);
        Button twentee = (Button) findViewById(R.id.btntwentte);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1cJDTai7wEuqjc3kdRyANEpX8GReu5XbQ/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1DfhshrxJwBLijzvGNGahc7bb5D4AoZOC/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1vb1Py8LVLBsXg1I4SNb_S9HAyfBCB2ej/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1JOF0wqcd-lEr5MQBivZHkDV6G3U0niey/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1mZlI1RHrkU7PWkeb4BCOuQUu-jeXilT7/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1VkKz8WThmCO4OKIO21447KrV1KT6X-vi/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1y0aqnbxqBG04WDersjUPLe2zAPMQ14Lx/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1sgdcQwZ2SGKE6JhNi8rTPvsV7Y_f3w1z/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1JrBkOzVfbrs_fCpzDxLRIwK_Vt4OnK5Z/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1mt3TlDkvnpt5rec6szrIEKNrs_sjiCaM/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });
        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1gnlgSTcljA2AJiGezTA1JK1UCaiT92QW/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });
        twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1-NGfolDyP_6H2cFbfYew7pSSNldF1UfZ/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });
        thirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Onyccf88fSVWxH_sQTOFS-NE_w3gsHCc/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });
        fourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1cGL_ggIIartH6b3V5dgEtkVa16vObUah/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });
        fifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1nJ5UBhSW-PirATanl7IrmlsewdttlPQH/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });
        sixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1yb1u_b3uZM2rsnK7hu990a4TuiUKehQI/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });
        seventeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1c6UHOhy4sSFQ-OGohKq1zZLzKJOgWm2I/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });
        eighteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1J5MgFM4A3yz_aoro_3YdyH2935K4KKOX/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });
        ninteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1LWJYA7nJbfuJcHe5wraqstQc-NR_sudj/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });
        twentee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1_t8MkeQt262F1FInR2hzu_QAT3ClQcLn/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });


    }
}