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
                "The major difference being the OOPS concept, C++ is an object-oriented language whereas C language is a procedural language. Apart from this, there are many other features of C++ which give this language an upper hand on C language.\n" +
                "\n" +
                "Following features of C++ makes it a stronger language than C,\n" +
                "\n" +
                "There is Stronger Type Checking in C++.\n" +
                "All the OOPS features in C++ like Abstraction, Encapsulation, Inheritance, etc make it more worthy and useful for programmers.\n" +
                "C++ supports and allows user-defined operators (i.e Operator Overloading) and function overloading is also supported in it.\n" +
                "Exception Handling is there in C++.\n" +
                "The Concept of Virtual functions and also Constructors and Destructors for Objects.\n" +
                "Inline Functions in C++ instead of Macros in C language. Inline functions make complete function bodies act like Macro, safely.\n" +
                "Variables can be declared anywhere in the program in C++ but must be declared before they are used.\n" +
                "Applications of C++ Programming\n" +
                "As mentioned before, C++ is one of the most widely used programming languages. It has it's presence in almost every area of software development. I'm going to list few of them here:\n" +
                "\n" +
                "Application Software Development - C++ programming has been used in developing almost all the major Operating Systems like Windows, Mac OSX and Linux. Apart from the operating systems, the core part of many browsers like Mozilla Firefox and Chrome have been written using C++. C++ also has been used in developing the most popular database system called MySQL.\n" +
                "\n" +
                "Programming Languages Development - C++ has been used extensively in developing new programming languages like C#, Java, JavaScript, Perl, UNIX’s C Shell, PHP and Python, and Verilog etc.\n" +
                "\n" +
                "Computation Programming - C++ is the best friends of scientists because of fast speed and computational efficiencies.\n" +
                "\n" +
                "Games Development - C++ is extremely fast which allows programmers to do procedural programming for CPU intensive functions and provides greater control over hardware, because of which it has been widely used in development of gaming engines.\n" +
                "\n" +
                "Embedded System - C++ is being heavily used in developing Medical and Engineering Applications like softwares for MRI machines, high-end CAD/CAM systems etc.\n" +
                "\n" +
                "There are many C++ compilers available which you can use to compile and run above mentioned program:\n" +
                "\n" +
                "Apple C++. Xcode\n" +
                "\n" +
                "Bloodshed Dev-C++\n" +
                "\n" +
                "Clang C++\n" +
                "\n" +
                "Cygwin (GNU C++)\n" +
                "\n" +
                "Mentor Graphics\n" +
                "\n" +
                "MINGW - \"Minimalist GNU for Windows\"\n" +
                "\n" +
                "GNU CC source\n" +
                "\n" +
                "IBM C++\n" +
                "\n" +
                "Intel C++\n" +
                "\n" +
                "Microsoft Visual C++\n" +
                "\n" +
                "Oracle C++\n" +
                "\n" +
                "HP C++\n" +
                "\n" +
                "Basic types of Variables\n" +
                "Each variable while declaration must be given a datatype, on which the memory assigned to the variable depends. Following are the basic types of variables,\n" +
                "\n" +
                "bool\tFor variable to store boolean values( True or False )\n" +
                "char\tFor variables to store character types.\n" +
                "int\tfor variable with integral values\n" +
                "float and double are also types for variables with large and floating point values\n" +
                "Declaration and Initialization\n" +
                "Variable must be declared before they are used. Usually it is preferred to declare them at the starting of the program, but in C++ they can be declared in the middle of program too, but must be done before using them.\n" +
                "\n" +
                "For example:\n" +
                "\n" +
                "int i;// declared but not initialised\n" +
                "char c; \n" +
                "int i, j, k;// Multiple declaration\n" +
                "Initialization means assigning value to an already declared variable,\n" +
                "\n" +
                "int i;// declaration\n" +
                "i =10;// initialization\n" +
                "Initialization and declaration can be done in one single step also,\n" +
                "\n" +
                "int i=10;//initialization and declaration in same step\n" +
                "int i=10, j=11;\n" +
                "If a variable is declared and not initialized by default it will hold a garbage value. Also, if a variable is once declared and if try to declare it again, we will get a compile time error.\n" +
                "\n" +
                "int i,j;\n" +
                "i=10;\n" +
                "j=20;\n" +
                "int j=i+j;//compile time error, cannot redeclare a variable in same scope\n" +
                "Scope of Variables\n" +
                "All the variables have their area of functioning, and out of that boundary they don't hold their value, this boundary is called scope of the variable. For most of the cases its between the curly braces,in which variable is declared that a variable exists, not outside it. We will study the storage classes later, but as of now, we can broadly divide variables into two main types,\n" +
                "\n" +
                "Global Variables\n" +
                "Local variables\n" +
                "Global variables\n" +
                "Global variables are those, which ar once declared and can be used througho"));
    }
}