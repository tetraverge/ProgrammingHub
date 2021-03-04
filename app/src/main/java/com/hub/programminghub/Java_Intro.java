package com.hub.programminghub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Java_Intro extends AppCompatActivity {

    TextView jvintro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java__intro);

        jvintro = (TextView) findViewById(R.id.javaintro);
        jvintro.setText(String.valueOf("Java is a programming language created by James Gosling from Sun Microsystems (Sun) in 1991. The target of Java is to write a program once and then run this program on multiple operating systems. The first publicly available version of Java (Java 1.0) was released in 1995. Sun Microsystems was acquired by the Oracle Corporation in 2010. Oracle has now the steermanship for Java. In 2006 Sun started to make Java available under the GNU General Public License (GPL). Oracle continues this project called OpenJDK.\n" +
                "\n" +
                "Over time new enhanced versions of Java have been released. The current version of Java is Java 1.8 which is also known as Java 8."
        ));
    }
}