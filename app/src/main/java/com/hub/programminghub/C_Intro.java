package com.hub.programminghub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class C_Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__intro);
        TextView intro = (TextView) findViewById(R.id.cintro);
        intro .setText(String.valueOf("C is a general-purpose high level language that was originally developed by Dennis Ritchie for the Unix operating system. It was first implemented on the Digital Eqquipment Corporation PDP-11 computer in 1972.\n" +
                "\n" +
                "The Unix operating system and virtually all Unix applications are written in the C language. C has now become a widely used professional language for various reasons.\n" +
                "\n" +
                "Easy to learn\n" +
                "\n" +
                "Structured language\n" +
                "\n" +
                "It produces efficient programs.\n" +
                "\n" +
                "It can handle low-level activities.\n" +
                "\n" +
                "It can be compiled on a variety of computers.\n" +
                "\n" +
                "Facts about C\n" +
                "C was invented to write an operating system called UNIX.\n" +
                "\n" +
                "C is a successor of B language which was introduced around 1970\n" +
                "\n" +
                "The language was formalized in 1988 by the American National Standard Institue (ANSI).\n" +
                "\n" +
                "By 1973 UNIX OS almost totally written in C.\n" +
                "\n" +
                "Today C is the most widely used System Programming Language.\n" +
                "\n" +
                "Most of the state of the art software have been implemented using C\n" +
                "\n" +
                "Applications of C Programming\n" +
                "C was initially used for system development work, particularly the programs that make-up the operating system. C was adopted as a system development language because it produces code that runs nearly as fast as the code written in assembly language. Some examples of the use of C are -\n" +
                "\n" +
                "Operating Systems\n" +
                "\n" +
                "Language Compilers\n" +
                "\n" +
                "Assemblers\n" +
                "\n" +
                "Text Editors\n" +
                "\n" +
                "Print Spoolers\n" +
                "\n" +
                "Network Drivers\n" +
                "\n" +
                "Modern Programs\n" +
                "\n" +
                "Databases\n" +
                "\n" +
                "Language Interpreters\n" +
                "\n" +
                "Utilities\n" +
                "\n" +
                "Basic Definitions\n" +
                "break and continue\n" +
                "The break statement makes program jump out of the innermost enclosing loop (while, do, for or switch statements) explicitly.\n" +
                "\n" +
                "The continue statement skips the certain statements inside the loop.\n" +
                "\n" +
                "for (i=1;i<=10;++i)\n" +
                "{\n" +
                "   if (i==3)\n" +
                "   continue;\n" +
                "   if (i==7)\n" +
                "   break;\n" +
                "   printf(\"%d \",i);\n" +
                "} \n" +
                "Output\n" +
                "\n" +
                "1 2 4 5 6\n" +
                "When i is equal to 3, continue statement comes into effect and skips 3. When i is equal to 7, break statement comes into effect and terminates the for loop.\n" +
                "\n" +
                "switch, case and default\n" +
                "The switch and case statement is used when a block of statements has to be executed among many blocks. For example:\n" +
                "\n" +
                "switch(expression)\n" +
                "{\n" +
                "    case '1':\n" +
                "    //some statements to execute when 1\n" +
                "    break;\n" +
                "    case '5':\n" +
                "    //some statements to execute when 5\n" +
                "    break;\n" +
                "    default:\n" +
                "    //some statements to execute when default;\n" +
                "}\n" +
                "char\n" +
                "The char keyword declares a character variable. For example:\n" +
                "\n" +
                "char alphabet;\n" +
                "Here, alphabet is a character type variable.\n" +
                "\n" +
                "const\n" +
                "An identifier can be declared constant by using const keyword.\n" +
                "\n" +
                "const int a = 5;\n" +
                "do...while\n" +
                "int i;\n" +
                "do \n" +
                "{\n" +
                "   print(\"%d \",i);\n" +
                "   i++;\n" +
                "}\n" +
                "while (i<10)\n" +
                "double and float\n" +
                "Keywords double and float are used for declaring floating type variables. For example:\n" +
                "\n" +
                "float number;\n" +
                "double longNumber;\n" +
                "Here, number is single precision floating type variable whereas, longNumber is a double precision floating type variable.\n" +
                "\n" +
                "if and else\n" +
                "In C programming, if and else are used to make decisions.\n" +
                "\n" +
                "if (i == 1)\n" +
                "   printf(\"i is 1.\")\n" +
                "else\n" +
                "   prinf(\"i is not 1.\")\n" +
                "If value of i is other than 1, output will be :\n" +
                "\n" +
                "i is not 1\n" +
                "enum\n" +
                "Enumeration types are declared in C programming using keyword enum. For example:\n" +
                "\n" +
                "enum suit\n" +
                "{\n" +
                "    hearts;\n" +
                "    spades;\n" +
                "    clubs;\n" +
                "    diamonds;\n" +
                "};\n" +
                "Here, a enumerated variable suit is created having tags: hearts, spades, clubs and diamonds.\n" +
                "\n" +
                "extern\n" +
                "The extern keyword declares that a variable or a function has external linkage outside of the file it is declared.\n" +
                "\n" +
                "for\n" +
                "There are three types of loops in C programming. The for loop is written in C programming using keyword for. For example:\n" +
                "\n" +
                "for (i=0; i< 9;++i)\n" +
                "{\n" +
                "  printf(\"%d \",i);\n" +
                "}\n" +
                "Output\n" +
                "\n" +
                "0 1 2 3 4 5 6 7 8\n" +
                "goto\n" +
                "The goto keyword is used for unconditional jump to a labeled statement inside a function. For example:\n" +
                "\n" +
                "for(i=1; i<5; ++i)\n" +
                "{\n" +
                "    if (i==10)\n" +
                "    goto error;\n" +
                "}\n" +
                "printf(\"i is not 10\");\n" +
                "error:\n" +
                "    printf(\"Error, count cannot be 10.\");\n" +
                "Output\n" +
                "\n" +
                "Error, count cannot be 10.\n" +
                "int\n" +
                "The int keyword declares integer type variable. For example:\n" +
                "\n" +
                "int count;\n" +
                "Here, count is a integer variable.\n" +
                "\n" +
                "short, long, signed and unsigned\n" +
                "The short, long, signed and unsigned keywodrs are type modifiers that alters the meaning of a base data type to yield a new type.\n" +
                "\n" +
                "short int smallInteger;\n" +
                "long int bigInteger;\n" +
                "signed int normalInteger;\n" +
                "unsigned int positiveInteger;\n" +
                "Range of int type data types\n" +
                "Data types\tRange\n" +
                "short int\t-32768 to 32767\n" +
                "long int\t-2147483648 to 214743648\n" +
                "signed int\t-32768 to 32767\n" +
                "unsigned int\t0 to 65535\n" +
                "return\n" +
                "The return keyword terminates the function and returns the value.\n" +
                "\n" +
                "int func()\n" +
                "{\n" +
                "    int b = 5;\n" +
                "    return b;\n" +
                "}\n" +
                "This function func() returns 5 to the calling function.\n" +
                "\n" +
                "sizeof\n" +
                "The sizeof keyword evaluates the size of data (a variable or a constant).\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "int main()\n" +
                "{\n" +
                "    printf(\"%u bytes.\",sizeof(char));\n" +
                "}\n" +
                "void\n" +
                "The void keyword indicates that a function doesn't return any value.\n" +
                "\n" +
                "void testFunction(int a)\n" +
                "{\n" +
                "  .....\n" +
                "}\n" +
                "Here, function testFunction( ) cannot return a value because the return type is void.\n" +
                "Aa\n"));
    }
}