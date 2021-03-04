package com.hub.programminghub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Cplus_Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplus__intro);
        TextView intro = (TextView) findViewById(R.id.cplusintro);

        intro.setText(String.valueOf("C++, as we all know is an extension to C language and was developed by Bjarne Stroustrup at bell labs. C++ is an intermediate-level language, as it comprises a confirmation of both high level and low-level language features. C++ is a statically typed, free form, multiparadigm, compiled general-purpose language.\n" +
                "\n" +
                "C++ is an Object Oriented Programming language but is not purely Object Oriented. Its features like Friend and Virtual, violate some of the very important OOPS features, rendering this language unworthy of being called completely Object Oriented. It's a middle-level language.\n" +
                "\n" +
                "Benefits of C++ over C Language\n" +
                "The major difference being the OOPS concept, C++ is an object-oriented language whereas C language is a procedural language. Apart from this, there are many other features of C++ which give this language an upper hand on C language."));

    }
}