package com.hub.programminghub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Pythone_Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pythone__intro);
        TextView into = (TextView) findViewById(R.id.pythonintro);
        into.setText(String.valueOf("Python is a general-purpose interpreted, interactive, object-oriented, and high-level programming language. It was created by Guido van Rossum during 1985- 1990. Like Perl, Python source code is also available under the GNU General Public License (GPL). This tutorial gives enough understanding on Python programming language.\n" +
                "\n" +
                "Why to Learn Python?\n" +
                "\n" +
                "Python is a high-level, interpreted, interactive and object-oriented scripting language. Python is designed to be highly readable. It uses English keywords frequently where as other languages use punctuation, and it has fewer syntactical constructions than other languages.\n" +
                "Python is a MUST for students and working professionals to become a great Software Engineer specially when they are working in Web Development Domain. I will list down some of the key advantages of learning Python:\n" +
                "\n" +
                "Python is Interpreted − Python is processed at runtime by the interpreter. You do not need to compile your program before executing it. This is similar to PERL and PHP.\n" +
                "\n" +
                "Python is Interactive − You can actually sit at a Python prompt and interact with the interpreter directly to write your programs.\n" +
                "\n" +
                "Python is Object-Oriented − Python supports Object-Oriented style or technique of programming that encapsulates code within objects.\n" +
                "\n" +
                "Python is a Beginner's Language − Python is a great language for the beginner-level programmers and supports the development of a wide range of applications from simple text processing to WWW browsers to games.\n" +
                "\n" +
                "Python Language advantages and applications\n" +
                "\n" +
                "Python is a high level, interpreted and general purpose dynamic programming language that focuses on code readability.It has fewer steps when compared to Java and C.It was founded in 1991 by developer Guido Van Rossum.It is used in many organizations as it supports multiple programming paradigms.It also performs automatic memory management.\n" +
                "Advantages :\n" +
                "1) Presence of third-party modules\n" +
                "2) Extensive support libraries(NumPy for numerical calculations, Pandas for data analytics etc)\n" +
                "3) Open source and community development\n" +
                "4) Easy to learn\n" +
                "5) User-friendly data structures\n" +
                "6) High-level language\n" +
                "7) Dynamically typed language(No need to mention data type based on value assigned, it takes data type)\n" +
                "8) Object-oriented language\n" +
                "9) Portable and Interactive\n" +
                "10) Portable across Operating systems\n" +
                "Applications :\n" +
                "1) GUI based desktop applications(Games, Scientific Applications)\n" +
                "2) Web frameworks and applications\n" +
                "3) Enterprise and Business applications\n" +
                "4) Operating Systems\n" +
                "5) Language Development\n" +
                "6) Prototyping\n" +
                "Organizations using Python :\n" +
                "1) Google(Components of Google spider and Search Engine)\n" +
                "2) Yahoo(Maps)\n" +
                "3) YouTube\n" +
                "4) Mozilla\n" +
                "5) Dropbox\n" +
                "6) Microsoft\n" +
                "7) Cisco\n" +
                "8) Spotify\n" +
                "9) Quora\n" +
                "\n" +
                "There are many Python compilers available which you can use to compile and run above mentioned program:\n" +
                "\n" +
                "Brython\n" +
                "\n" +
                "Nuitka\n" +
                "\n" +
                "PyJS\n" +
                "\n" +
                "Shed Skin\n" +
                "\n" +
                "Skulpt\n" +
                "\n" +
                "Transcrypt\n" +
                "\n" +
                "WinPython\n" +
                "\n" +
                "Overview\n" +
                "\n" +
                "Python has five standard Data Types:\n" +
                "\n" +
                "Numbers\n" +
                "\n" +
                "String\n" +
                "\n" +
                "List\n" +
                "\n" +
                "Tuple\n" +
                "\n" +
                "Dictionary\n" +
                "\n" +
                "Python sets the variable type based on the value that is assigned to it. Unlike more riggers languages, Python will change the variable type if the variable value is set to another value. For example:\n" +
                "var = 123# This will create a number integer assignment var = 'john'# the var variable is now a string type.\n" +
                "\n" +
                "Numbers\n" +
                "\n" +
                "Python numbers variables are created by the standard Python method:\n" +
                "var = 382\n" +
                "Most of the time using the standard Python number type is fine. Python will automatically convert a number from one type to another if it needs. But, under certain circumstances that a specific number type is needed (ie. complex, hexidecimal), the format can be forced into a format by using additional syntax in the table below:\n" +
                "TypeFormatDescriptioninta = 10Signed Integerlonga = 345L(L) Long integers, they can also be represented in octal and hexadecimalfloata = 45.67(.) Floating point real valuescomplexa = 3.14J(J) Contains integer in the range 0 to 255.\n" +
                "\n" +
                "V1510N, [15.02.21 20:52]\n" +
                "Most of the time Python will do variable conversion automatically. You can also use Python conversion functions (int(), long(), float(), complex()) to convert data from one type to another. In addition, the type function returns information about how your data is stored within a variable.\n" +
                "message = \"Good morning\" num = 85 pi = 3.14159 print(type(message)) # This will return a string print(type(n)) # This will return an integer print(type(pi)) # This will return a float\n" +
                "\n" +
                "String\n" +
                "\n" +
                "Create string variables by enclosing characters in quotes. Python uses single quotes ' double quotes \" and triple quotes \"\"\" to denote literal strings. Only the triple quoted strings \"\"\" also will automatically continue across the end of line statement.\n" +
                "firstName = 'john' lastName = \"smith\" message = \"\"\"This is a string that will span across multiple lines. Using newline characters and no spaces for the next lines. The end of lines within this string also count as a newline when printed\"\"\"\n" +
                "Strings can be accessed as a whole string, or a substring of the complete variable using brackets ‘[]’. Here are a couple examples:\n" +
                "var1 = 'Hello World!' var2 = 'RhinoPython'print var1[0] # this will print the first character in the string an Hprint var2[1:5] # this will print the substring 'hinoP`\n" +
                "Python can use a special syntax to format multiple strings and numbers. The string formatter is quickly covered here because it is seen often and it is important to recognize the syntax.\n" +
                "print\"The item {} is repeated {} times\".format(element,count)) \n" +
                "The {} are placeholders that are substituted by the variables element and count in the final string. This compact syntax is meant to keep the code more readable and compact.\n" +
                "Python is currently transitioning to the format syntax above, but python can use an older syntax, which is being phased out, but is still seen in some example code:\n" +
                "print\"The item %i is repeated %i times\"% (element,count) \n" +
                "\n" +
                "List\n" +
                "\n" +
                "Lists are a very useful variable type in Python. A list can contain a series of values. List variables are declared by using brackets [ ] following the variable name.\n" +
                "A = [ ] # This is a blank list variable B = [1, 23, 45, 67] # this list creates an initial list of 4 numbers. C = [2, 4, 'john'] # lists can contain different variable types.\n" +
                "All lists in Python are zero-based indexed. When referencing a member or the length of a list the number of list elements is always the number shown plus one.\n" +
                "mylist = ['Rhino', 'Grasshopper', 'Flamingo', 'Bongo'] B = len(mylist) # This will return the length of the list which is 3. The index is 0, 1, 2, 3.print mylist[1] # This will return the value at index 1, which is 'Grasshopper'print mylist[0:2] # This will return the first 3 elements in the list.\n" +
                "You can assign data to a specific element of the list using an index into the list. The list index starts at zero. Data can be assigned to the elements of an array as follows:\n" +
                "mylist = [0, 1, 2, 3] mylist[0] = 'Rhino' mylist[1] = 'Grasshopper' mylist[2] = 'Flamingo' mylist[3] = 'Bongo'print mylist[1] \n" +
                "Lists aren’t limited to a single dimension. Although most people can’t comprehend more than three or four dimensions. You can declare multiple dimensions by separating an with commas. In the following example, the MyTable variable is a two-dimensional array :\n" +
                "MyTable = [[], []] \n" +
                "In a two-dimensional array, the first number is always the number of rows; the second number is the number of columns.\n" +
                "\n" +
                "Tuple\n" +
                "\n" +
                "Tuples are a group of values like a list and are manipulated in similar ways. But, tuples are fixed in size once they are assigned. In Python the fixed size is considered immutable as compared to a list that is dynamic and mutable. Tuples are defined by parenthesis ().\n" +
                "myGroup = ('Rhino', 'Grasshopper', 'Flamingo', 'Bongo') \n" +
                "Here are some advantages of tuples over lists:\n" +
                "\n" +
                "Elements to a tuple. Tuples have no append or extend method.\n" +
                "\n" +
                "Elements cannot be removed from a tuple.\n" +
                "\n" +
                "You can find elements in a tuple, since this doesn’t change the tuple.\n" +
                "\n" +
                "You can also use the in operator to check if an element exists in the tuple.\n" +
                "\n" +
                "\n" +
                "Tuples are faster than lists. If you’re defining a constant set of values and all you’re ever going to do with it is iterate through it, use a tuple instead of a list.\n" +
                "\n" +
                "It makes your code safer if you “write-protect” data that does not need to be changed.\n" +
                "\n" +
                "It seems tuples are very restrictive, so why are they useful? There are many datastructures in Rhino that require a fixed set of values. For instance a Rhino point is a list of 3 numbers [34.5, 45.7, 0]. If this is set as tuple, then you can be assured the original 3 number structure stays as a point (34.5, 45.7, 0). There are other datastructures such as lines, vectors, domains and other data in Rhino that also require a certain set of values that do not change. Tuples are great for this.\n" +
                "\n" +
                "Dictionary\n" +
                "\n" +
                "Dictionaries in Python are lists of Key:Value pairs. This is a very powerful datatype to hold a lot of related information that can be associated through keys. The main operation of a dictionary is to extract a value based on the key name. Unlike lists, where index numbers are used, dictionaries allow the use of a key to access its members. Dictionaries can also be used to sort, iterate and compare data.\n" +
                "Dictionaries are created by using braces ({}) with pairs separated by a comma (,) and the key values associated with a colon(:). In Dictionaries the Key must be unique. Here is a quick example on how dictionaries might be used:\n" +
                "room_num = {'john': 425, 'tom': 212} room_num['john'] = 645# set the value associated with the 'john' key to 645print (room_num['tom']) # print the value of the 'tom' key. room_num['isaac'] = 345# Add a new key 'isaac' with the associated valueprint (room_num.keys()) # print out a list of keys in the dictionaryprint ('isaac'in room_num) # test to see if 'issac' is in the dictionary. This returns true."));
    }
}