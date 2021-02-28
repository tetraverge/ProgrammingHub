package com.hub.programminghub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Java_Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java__intro);

        TextView intro = (TextView) findViewById(R.id.javaintro);
        intro.setText(String.valueOf("Java is a programming language created by James Gosling from Sun Microsystems (Sun) in 1991. The target of Java is to write a program once and then run this program on multiple operating systems. The first publicly available version of Java (Java 1.0) was released in 1995. Sun Microsystems was acquired by the Oracle Corporation in 2010. Oracle has now the steermanship for Java. In 2006 Sun started to make Java available under the GNU General Public License (GPL). Oracle continues this project called OpenJDK.\n" +
                "\n" +
                "Over time new enhanced versions of Java have been released. The current version of Java is Java 1.8 which is also known as Java 8.\n" +
                "\n" +
                "Java is defined by a specification and consists of a programming language, a compiler, core libraries and a runtime (Java virtual machine) The Java runtime allows software developers to write program code in other languages than the Java programming language which still runs on the Java virtual machine. The Java platform is usually associated with the Java virtual machine and the Java core libraries\n" +
                "\n" +
                "Java language was designed with the following properties\n" +
                "\n" +
                "Platform independent: Java programs use the Java virtual machine as abstraction and do not access the operating system directly. This makes Java programs highly portable. A Java program (which is standard-compliant and follows certain rules) can run unmodified on all supported platforms, e.g., Windows or Linux.\n" +
                "\n" +
                "Object-orientated programming language: Except the primitive data types, all elements in Java are objects.\n" +
                "\n" +
                "Strongly-typed programming language: Java is strongly-typed, e.g., the types of the used variables must be pre-defined and conversion to other objects is relatively strict, e.g., must be done in most cases by the programmer.\n" +
                "\n" +
                "Interpreted and compiled language: Java source code is transferred into the bytecode format which does not depend on the target platform. These bytecode instructions will be interpreted by the Java Virtual machine (JVM). The JVM contains a so called Hotspot-Compiler which translates performance critical bytecode instructions into native code instructions.\n" +
                "\n" +
                "Automatic memory management: Java manages the memory allocation and de-allocation for creating new objects. The program does not have direct access to the memory. The so-called garbage collector automatically deletes objects to which no active pointer exists\n" +
                "\n" +
                "Applications of Java Programming\n" +
                "\n" +
                "1. Desktop GUI Applications:\n" +
                "\n" +
                "Java provides GUI development through various means like Abstract Windowing Toolkit (AWT), Swing and JavaFX. While AWT contains a number of pre-constructed components such as menu, button, list, and numerous third-party components, Swing, a GUI widget toolkit, additionally provides certain advanced components like trees, tables, scroll panes, tabbed panel and lists. JavaFX, a set of graphics and media packages, provides Swing interoperability, 3D graphic features and self-contained deployment model which facilitates quick scripting of Java applets and applications.\n" +
                "\n" +
                "2. Mobile Applications:\n" +
                "\n" +
                "Java Platform, Micro Edition (Java ME or J2ME) is a cross-platform framework to build applications that run across all Java supported devices, including feature phones and smart phones. Further, applications for Android, one of the most popular mobile operating systems, are usually scripted in Java using the Android Software Development Kit (SDK) or other environments.\n" +
                "\n" +
                "3. Embedded Systems:\n" +
                "\n" +
                "Embedded systems, ranging from tiny chips to specialized computers, are components of larger electromechanical systems performing dedicated tasks. Several devices, such as SIM cards, blue-ray disk players, utility meters and televisions, use embedded Java technologies. According to Oracle, 100% of Blu-ray Disc Players and 125 million TV devices employ Java.\n" +
                "\n" +
                "4. Web Applications:\n" +
                "\n" +
                "\n" +
                "Java provides support for web applications through Servlets, Struts or JSPs. The easy programming and higher security offered by the programming language has allowed a large number of government applications for health, social security, education and insurance to be based on Java. Java also finds application in development of eCommerce web applications using open-source eCommerce platforms, such as Broadleaf.\n" +
                "\n" +
                "5. Web Servers and Application Servers:\n" +
                "\n" +
                "The Java ecosystem today contains multiple Java web servers and application servers. While Apache Tomcat, Simple, Jo!, Rimfaxe Web Server (RWS) and Project Jigsaw dominate the web server space, WebLogic, WebSphere, and Jboss EAP dominate commercial application server space.\n" +
                "\n" +
                "6. Enterprise Applications:\n" +
                "\n" +
                "Java Enterprise Edition (Java EE) is a popular platform that provides API and runtime environment for scripting and running enterprise software, including network applications and web-services. Oracle claims Java is running in 97% of enterprise computers. The higher performance guarantee and faster computing in Java has resulted in high frequency trading systems like Murex to be scripted in the language. It is also the backbone for a variety of banking applications which have Java running from front user end to back server end.\n" +
                "\n" +
                "7. Scientific Applications:\n" +
                "\n" +
                "Java is the choice of many software developers for writing applications involving scientific calculations and mathematical operations. These programs are generally considered to be fast and secure, have a higher degree of portability and low maintenance. Applications like MATLAB use Java both for interacting user interface and as part of the core system.\n" +
                "\n" +
                "There are many Java compilers available which you can use to compile and run above mentioned program:\n" +
                "\n" +
                "NetBeans\n" +
                "\n" +
                "Eclipse\n" +
                "\n" +
                "IntelliJ IDE\n" +
                "\n" +
                "Android Studio\n" +
                "\n" +
                "Enide Studio\n" +
                "\n" +
                "BlueJ\n" +
                "\n" +
                "jEdit\n" +
                "\n" +
                "jGRASP\n" +
                "\n" +
                "JSource\n" +
                "\n" +
                "JDeveloper\n" +
                "\n" +
                "DrJava\n" +
                "\n" +
                "Basic types of Variables\n" +
                "\n" +
                "Local Variables: A variable defined within a block or method or constructor is called local variable.\n" +
                "\n" +
                "These variable are created when the block in entered or the function is called and destroyed after exiting from the block or when the call returns from the function.\n" +
                "\n" +
                "The scope of these variables exists only within the block in which the variable is declared. i.e. we can access these variable only within that block.\n" +
                "\n" +
                "Initilisation of Local Variable is Mandatory.\n" +
                "\n" +
                "Sample Program 1:\n" +
                "\n" +
                "publicclassStudentDetails {\n" +
                "\n" +
                "publicvoidStudentAge()\n" +
                "\n" +
                "{\n" +
                "\n" +
                "// local variable age\n" +
                "\n" +
                "intage = 0;\n" +
                "\n" +
                "age = age + 5;\n" +
                "\n" +
                "System.out.println(\"Student age is : \"+ age);\n" +
                "\n" +
                "}\n" +
                "\n" +
                "publicstaticvoidmain(String args[])\n" +
                "\n" +
                "{\n" +
                "\n" +
                "StudentDetails obj = newStudentDetails();\n" +
                "\n" +
                "obj.StudentAge();\n" +
                "\n" +
                "}\n" +
                "\n" +
                "}\n" +
                "\n" +
                "Output:\n" +
                "Student age is : 5 \n" +
                "\n" +
                "In the above program, the variable age is a local variable to the function StudentAge(). If we use the variable age outside StudentAge() function, the compiler will produce an error as shown in below program.\n" +
                "Sample Program 2:\n" +
                "\n" +
                "publicclassStudentDetails {\n" +
                "\n" +
                "publicvoidStudentAge()\n" +
                "\n" +
                "{ // local variable age\n" +
                "\n" +
                "intage = 0;\n" +
                "\n" +
                "age = age + 5;\n" +
                "\n" +
                "}\n" +
                "\n" +
                "publicstaticvoidmain(String args[])\n" +
                "\n" +
                "{\n" +
                "\n" +
                "// using local variable age outside it's scope\n" +
                "\n" +
                "System.out.println(\"Student age is : \"+ age);\n" +
                "\n" +
                "}\n" +
                "\n" +
                "}\n" +
                "\n" +
                "Output:\n" +
                "Compilation Error in java code :- prog.java:12: error: cannot find symbol System.out.println(\"Student age is : \" + age); ^ symbol: variable age location: class StudentDetails 1 error \n" +
                "\n" +
                "Instance Variables: Instance variables are non-static variables and are declared in a class outside any method, constructor or block.\n" +
                "\n" +
                "As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.\n" +
                "\n" +
                "Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier then the default access specifier will be used.\n" +
                "\n" +
                "Initilisation of Instance Variable is not Mandatory. Its default value is 0\n" +
                "\n" +
                "Instance Variable can be accessed only by creating objects.\n" +
                "\n" +
                "Sample Program:\n" +
                "\n" +
                "importjava.io.*;\n" +
                "\n" +
                "classMarks {\n" +
                "\n" +
                "// These variables are instance variables.\n" +
                "\n" +
                "\n" +
                "// These variables are in a class\n" +
                "\n" +
                "// and are not inside any function\n" +
                "\n" +
                "intengMarks;\n" +
                "\n" +
                "intmathsMarks;\n" +
                "\n" +
                "intphyMarks;\n" +
                "\n" +
                "}\n" +
                "\n" +
                "classMarksDemo {\n" +
                "\n" +
                "publicstaticvoidmain(String args[])\n" +
                "\n" +
                "{\n" +
                "\n" +
                "// first object\n" +
                "\n" +
                "Marks obj1 = newMarks();\n" +
                "\n" +
                "obj1.engMarks = 50;\n" +
                "\n" +
                "obj1.mathsMarks = 80;\n" +
                "\n" +
                "obj1.phyMarks = 90;\n" +
                "\n" +
                "// second object\n" +
                "\n" +
                "Marks obj2 = newMarks();\n" +
                "\n" +
                "obj2.engMarks = 80;\n" +
                "\n" +
                "obj2.mathsMarks = 60;\n" +
                "\n" +
                "obj2.phyMarks = 85;\n" +
                "\n" +
                "// displaying marks for first object\n" +
                "\n" +
                "System.out.println(\"Marks for first object:\");\n" +
                "\n" +
                "System.out.println(obj1.engMarks);\n" +
                "\n" +
                "System.out.println(obj1.mathsMarks);\n" +
                "\n" +
                "System.out.println(obj1.phyMarks);\n" +
                "\n" +
                "// displaying marks for second object\n" +
                "\n" +
                "System.out.println(\"Marks for second object:\");\n" +
                "\n" +
                "System.out.println(obj2.engMarks);\n" +
                "\n" +
                "System.out.println(obj2.mathsMarks);\n" +
                "\n" +
                "System.out.println(obj2.phyMarks);\n" +
                "\n" +
                "}\n" +
                "\n" +
                "}\n" +
                "\n" +
                "Output:Marks for first object: 50 80 90 Marks for second object: 80 60 85 \n" +
                "\n" +
                "As you can see in the above program the variables, engMarks , mathsMarks , phyMarksare instance variables. In case we have multiple objects as in the above program, each object will have its own copies of instance variables. It is clear from the above output that each object will have its own copy of instance variable.\n" +
                "\n" +
                "Static Variables: Static variables are also known as Class variables.\n" +
                "\n" +
                "These variables are declared similarly as instance variables, the difference is that static variables are declared using the static keyword within a class outside any method constructor or block.\n" +
                "\n" +
                "Unlike instance variables, we can only have one copy of a static variable per class irrespective of how many objects we create.\n" +
                "\n" +
                "Static variables are created at the start of program execution and destroyed automatically when execution ends.\n" +
                "\n" +
                "Initilisation of Static Variable is not Mandatory. Its default value is 0\n" +
                "\n" +
                "If we access the static variable like Instance variable (through an object), the compiler will show the warning message and it won’t halt the program. The compiler will replace the object name to class name automatically.\n" +
                "\n" +
                "If we access the static variable without the class name, Compiler will automatically append the class name.\n" +
                "\n" +
                "To access static variables, we need not create an object of that class, we can simply access the variable as\n" +
                "class_name.variable_name;\n" +
                "Sample Program:\n" +
                "\n" +
                "importjava.io.*;\n" +
                "\n" +
                "classEmp {\n" +
                "\n" +
                "// static variable salary\n" +
                "\n" +
                "publicstaticdoublesalary;\n" +
                "\n" +
                "publicstaticString name = \"Harsh\";\n" +
                "\n" +
                "}\n" +
                "\n" +
                "publicclassEmpDemo {\n" +
                "\n" +
                "publicstaticvoidmain(String args[])\n" +
                "\n" +
                "{\n" +
                "\n" +
                "// accessing static variable without object\n" +
                "\n" +
                "Emp.salary = 1000;\n" +
                "\n" +
                "System.out.println(Emp.name + \"'s average salary:\"\n" +
                "\n" +
                "+ Emp.salary);\n" +
                "\n" +
                "}\n" +
                "\n" +
                "}\n" +
                "\n" +
                "Output:Harsh's average salary:1000.0\n" +
                "\n" +
                "Declaration and Initialization\n" +
                "\n" +
                "1. Overview\n" +
                "\n" +
                "Simply put, before we can work with an object on the JVM, it has to be initialized.\n" +
                "In the following sections, we'll take a look at various ways we can initialize primitive types and objects.\n" +
                "\n" +
                "2. Declaration vs. Initialization\n" +
                "\n" +
                "Let's start by making sure that we're on the same page.\n" +
                "Declaration is the process of defining the variable along with its type and name.\n" +
                "Here, we're declaring the id variable:\n" +
                "\n" +
                "1\n" +
                "\n" +
                "intid;\n" +
                "\n" +
                "Initialization, on the other hand, is all about assigning a value; for example:\n" +
                "\n" +
                "1\n" +
                "\n" +
                "id = 1;\n" +
                "\n" +
                "To demonstrate, we'll create a User class with a name and id properties:\n" +
                "\n" +
                "1\n" +
                "\n" +
                "2\n" +
                "\n" +
                "3\n" +
                "\n" +
                "4\n" +
                "\n" +
                "5\n" +
                "\n" +
                "6\n" +
                "\n" +
                "publicclassUser implements{\n" +
                "\n" +
                "privateString name;\n" +
                "\n" +
                "privateintid;\n" +
                "\n" +
                "// standard constructor, getters, setters,\n" +
                "\n" +
                "}\n" +
                "\n" +
                "Next, we'll see that initialization works differently depending on the type of field we're initializing.\n" +
                "\n" +
                "3. Objects vs. Primitives\n" +
                "\n" +
                "Java provides two types of data representation: primitive types and reference types. In this section, we'll discuss the differences between the two with regards to initialization.\n" +
                "Java has eight built-in data types, referred to as Java primitive types; variables of this type hold their values directly.\n" +
                "\n" +
                "Reference types hold references to objects (instances of classes). Unlike primitive types that hold their values in the memory where the variable is allocated, references don't hold the value of the object they refer to.\n" +
                "Instead, a reference points to an object by storing the memory address where the object is located.\n" +
                "\n" +
                "Note that Java doesn't allow us to discover what the physical memory address is. Rather, we can only use the reference to refer to the object.\n" +
                "Let's take a look at an example that declares and initializes a reference type out of our User class:\n" +
                "\n" +
                "1\n" +
                "\n" +
                "2\n" +
                "\n" +
                "3\n" +
                "\n" +
                "4\n" +
                "\n" +
                "5\n" +
                "\n" +
                "6\n" +
                "\n" +
                "@Test\n" +
                "\n" +
                "publicvoidwhenIntializedWithNew_thenInstanceIsNotNull() {\n" +
                "\n" +
                "User user = newUser();\n" +
                "\n" +
                "assertThat(user).isNotNull();\n" +
                "\n" +
                "}\n" +
                "\n" +
                "As we can see here, a reference can be assigned to a new by using the keyword new, which is responsible for creating the new User object.\n" +
                "Let's continue with learning more about object creation.\n" +
                "\n" +
                "5. Creating Objects\n" +
                "\n" +
                "Unlike with primitives, objects creation is a bit more complex. This is because we're not just adding the value to the field; instead, we trigger the initialization using the new keyword. This, in return, invokes a constructor and initializes the object in memory.\n" +
                "Let's discuss constructors and the new keyword in further detail.\n" +
                "The new keyword is responsible for allocating memory for the new object through a constructor.\n" +
                "A constructor is typically used to initialize instance variables representing the main properties of the created object.\n" +
                "If we don't supply a constructor explicitly, the compiler will create a default constructor which has no arguments and just allocates memory for the object.\n" +
                "A class can have many constructors as long as their parameters lists are different (overload). Every constructor that doesn't call another constructor in the same class has a call to its parent constructor whether it was written explicitly or inserted by the compiler through super().\n" +
                "Let's add a constructor to our User class:\n" +
                "\n" +
                "1\n" +
                "\n" +
                "2\n" +
                "\n" +
                "3\n" +
                "\n" +
                "4\n" +
                "\n" +
                "publicUser(String name, intid) {\n" +
                "\n" +
                "this.name = name;\n" +
                "\n" +
                "this.id = id;\n" +
                "\n" +
                "}\n" +
                "\n" +
                "Now we can use our constructor to create a User object with initial values for its properties:\n" +
                "\n" +
                "1\n" +
                "\n" +
                "User user = newUser(\"Alice\", 1);\n" +
                "\n" +
                "6. Variable Scope\n" +
                "\n" +
                "In the following sections, we'll take a look at the different types of scopes that a variable in Java can exist within and how this affects the initialization process.\n" +
                "\n" +
                "6.1. Instance and Class Variables\n" +
                "\n" +
                "Instance and class variables don't require us to initialize them. As soon as we declare these variables, they are given a default value as follows:\n" +
                " \n" +
                "Now, let's try to define some instance and class-related variables and test whether they have a default value or not:\n" +
                "\n" +
                "1\n" +
                "\n" +
                "2\n" +
                "\n" +
                "3\n" +
                "\n" +
                "4\n" +
                "\n" +
                "5\n" +
                "\n" +
                "6\n" +
                "\n" +
                "7\n" +
                "\n" +
                "@Test\n" +
                "\n" +
                "publicvoidwhenValuesAreNotInitialized_thenUserNameAndIdReturnDefault() {\n" +
                "\n" +
                "User user = newUser();\n" +
                "\n" +
                "assertThat(user.getName()).isNull();\n" +
                "\n" +
                "assertThat(user.getId() == 0);\n" +
                "\n" +
                "}\n" +
                "\n" +
                "6.2. Local Variables\n" +
                "\n" +
                "Local variables must be initialized before use, as they don't have a default value and the compiler won't let us use an uninitialized value.\n" +
                "For example, the following code generates a compiler error:\n" +
                "\n" +
                "1\n" +
                "\n" +
                "2\n" +
                "\n" +
                "3\n" +
                "\n" +
                "4\n" +
                "\n" +
                "publicvoidprint(){\n" +
                "\n" +
                "inti;\n" +
                "\n" +
                "System.out.println(i);\n" +
                "\n" +
                "}\n" +
                "\n" +
                "7. The Final Keyword\n" +
                "\n" +
                "The final keyword applied to a field means that the field's value can no longer be changed after initialization. In this way, we can define constants in Java.\n" +
                "Let's add a constant to our User class:\n" +
                "\n" +
                "1\n" +
                "\n" +
                "privatestaticfinalintYEAR = 2000;\n" +
                "\n" +
                "Constants must be initialized either when they're declared or in a constructor.\n" +
                "\n" +
                "8. Initializers in Java\n" +
                "\n" +
                "In Java, an initializer is a block of code that has no associated name or data type and is placed outside of any method, constructor, or another block of code.\n" +
                "Java offers two types of initializers, static and instance initializers. Let's see how we can use each of them.\n" +
                "\n" +
                "8.1. Instance Initializers\n" +
                "\n" +
                "We can use these to initialize instance variables.\n" +
                "To demonstrate, let’s provide a value for a user id using an instance initializer in our User class:\n" +
                "\n" +
                "1\n" +
                "\n" +
                "2\n" +
                "\n" +
                "3\n" +
                "\n" +
                "{\n" +
                "\n" +
                "id = 0;\n" +
                "\n" +
                "}\n" +
                "\n" +
                "8.2. Static Initialization Block\n" +
                "\n" +
                "\n" +
                "A static initializer or static block – is a block of code which is used to initialize static fields. In other words, it’s a simple initializer marked with the keyword static:\n" +
                "\n" +
                "1\n" +
                "\n" +
                "2\n" +
                "\n" +
                "3\n" +
                "\n" +
                "4\n" +
                "\n" +
                "privatestaticString forum;\n" +
                "\n" +
                "static{\n" +
                "\n" +
                "forum = \"Java\";\n" +
                "\n" +
                "}\n" +
                "\n" +
                "9. Order of Initialization\n" +
                "\n" +
                "When writing code that initializes different types of fields, of course, we have to keep an eye on the order of initialization.\n" +
                "In Java, the order for initialization statements is as follows:\n" +
                "\n" +
                "static variables and static initializers in order\n" +
                "\n" +
                "instance variables and instance initializers in order\n" +
                "\n" +
                "constructors\n" +
                "\n" +
                "10. Object Life Cycle\n" +
                "\n" +
                "Now that we've learned how to declare and initialize objects, let's discover what happens to objects when they're not in use.\n" +
                "Unlike other languages where we have to worry about object destruction, Java takes care of obsolete objects through its garbage collector.\n" +
                "All objects in Java are stored in our program's heap memory. In fact, the heap represents a large pool of unused memory, allocated for our Java application.\n" +
                "On the other hand, the garbage collector is a Java program that takes care of automatic memory management by deleting objects that are no longer reachable.\n" +
                "For a Java object to become unreachable, it has to encounter one of the following situations:\n" +
                "\n" +
                "The object no longer has any references pointing to it\n" +
                "\n" +
                "All reference pointing to the object are out of scope\n" +
                "\n" +
                "In conclusion, an object is first created from a class, usually using the keyword new. Then the object lives its life and provides us with access to its methods and fields.\n" +
                "\n" +
                "Finally, when it's no longer needed, the garbage collector destroys it.\n" +
                "\n" +
                "11. Other Methods for Creating Objects\n" +
                "\n" +
                "In this section, we’ll take a brief look at methods other than new keyword to create objects and how to apply them, specifically reflection, cloning, and serialization.\n" +
                "Reflection is a mechanism we can use to inspect classes, fields, and methods at run-time. Here's an example of creating our User object using reflection:\n" +
                "\n" +
                "1\n" +
                "\n" +
                "2\n" +
                "\n" +
                "3\n" +
                "\n" +
                "4\n" +
                "\n" +
                "5\n" +
                "\n" +
                "6\n" +
                "\n" +
                "7\n" +
                "\n" +
                "8\n" +
                "\n" +
                "@Test\n" +
                "\n" +
                "publicvoidwhenInitializedWithReflection_thenInstanceIsNotNull()\n" +
                "\n" +
                "throwsException {\n" +
                "\n" +
                "User user = User.class.getConstructor(String.class, int.class)\n" +
                "\n" +
                ".newInstance(\"Alice\", 2);\n" +
                "\n" +
                "assertThat(user).isNotNull();\n" +
                "\n" +
                "}\n" +
                "\n" +
                "In this case, we're using reflection to find and invoke a constructor of the User class.\n" +
                "The next method, cloning, is a way to create an exact copy of an object. For this, our User class must implement the Cloneable interface:\n" +
                "\n" +
                "1\n" +
                "\n" +
                "publicclassUser implementsCloneable { //... }\n" +
                "\n" +
                "Now we can use the clone() method to create a new clonedUser object which has the same property values as the user object:\n" +
                "\n" +
                "1\n" +
                "\n" +
                "2\n" +
                "\n" +
                "3\n" +
                "\n" +
                "4\n" +
                "\n" +
                "5\n" +
                "\n" +
                "6\n" +
                "\n" +
                "7\n" +
                "\n" +
                "8\n" +
                "\n" +
                "@Test\n" +
                "\n" +
                "publicvoidwhenCopiedWithClone_thenExactMatchIsCreated()\n" +
                "\n" +
                "throwsCloneNotSupportedException {\n" +
                "\n" +
                "User user = newUser(\"Alice\", 3);\n" +
                "\n" +
                "User clonedUser = (User) user.clone();\n" +
                "\n" +
                "assertThat(clonedUser).isEqualTo(user);\n" +
                "\n" +
                "}\n" +
                "\n" +
                "1\n" +
                "\n" +
                "User u = (User) unsafeInstance.allocateInstance(User.class);\n" +
                "\n" +
                "Operators in Java\n" +
                "\n" +
                "Operator in java is a symbol that is used to perform operations. For example: +, -, *, / etc.\n" +
                "There are many types of operators in java which are given below:\n" +
                "\n" +
                "Unary Operator,\n" +
                "\n" +
                "Arithmetic Operator,\n" +
                "\n" +
                "Shift Operator,\n" +
                "\n" +
                "Relational Operator,\n" +
                "\n" +
                "Bitwise Operator,\n" +
                "\n" +
                "Logical Operator,\n" +
                "\n" +
                "Ternary Operator and\n" +
                "\n" +
                "Assignment Operator.\n" +
                "\n" +
                "Unary Operators\n" +
                "\n" +
                "Unary operator performs operation on only one operand.\n" +
                "OperatorMeaning+Unary plus (not necessary to use since numbers are positive without using it)-Unary minus; inverts the sign of an expression++Increment operator; increments value by 1--decrement operator; decrements value by 1!Logical complement operator; inverts the value of a boolean\n" +
                "\n" +
                "Arithmetic Operators\n" +
                "\n" +
                "Arithmetic operators are used to perform mathematical operations like addition, subtraction, multiplication etc.\n" +
                "Java Arithmetic OperatorsOperatorMeaning+Addition (also used for string concatenation)-Subtraction Operator*Multiplication Operator/Division Operator%Remainder Operator\n" +
                "\n" +
                "Assignment Operator\n" +
                "\n" +
                "\n" +
                "Assignment operators are used in Java to assign values to variables. For example,\n" +
                "int age; age = 5;\n" +
                "The assignment operator assigns the value on its right to the variable on its left. Here, 5 is assigned to the variable age using = operator.\n" +
                "\n" +
                "Equality and Relational Operators\n" +
                "\n" +
                "The equality and relational operators determines the relationship between two operands. It checks if an operand is greater than, less than, equal to, not equal to and so on. Depending on the relationship, it results to either true or false.\n" +
                "Java Equality and Relational OperatorsOperatorDescriptionExample==equal to5 == 3 is evaluated to false!=not equal to5 != 3 is evaluated to true>greater than5 > 3 is evaluated to true<less than5 < 3 is evaluated to false>=greater than or equal to5 >= 5 is evaluated to true<=less then or equal to5 <= 5 is evaluated to true\n" +
                "\n" +
                "Logical Operators\n" +
                "\n" +
                "The logical operators || (conditional-OR) and && (conditional-AND) operates on boolean expressions. Here's how they work.\n" +
                "Java Logical OperatorsOperatorDescriptionExample||conditional-OR; true if either of the boolean expression is truefalse || true is evaluated to true&&conditional-AND; true if all boolean expressions are truefalse && true is evaluated to false\n" +
                "\n" +
                "Ternary Operator\n" +
                "\n" +
                "The conditional operator or ternary operator ?: is shorthand for if-then-else statement. The syntax of conditional operator is:\n" +
                "variable = Expression ? expression1 : expression2\n" +
                "Here's how it works.\n" +
                "\n" +
                "If the Expression is true, expression1 is assigned to variable.\n" +
                "\n" +
                "If the Expression is false, expression2 is assigned to variable.\n" +
                "\n" +
                "Bitwise and Bit Shift Operators\n" +
                "\n" +
                "To perform bitwise and bit shift operators in Java, these operators are used.\n" +
                "Java Bitwise and Bit Shift OperatorsOperatorDescription~Bitwise Complement<<Left Shift>>Right Shift>>>Unsigned Right Shift&Bitwise AND^Bitwise exclusive OR|Bitwise inclusive OR"));
    }
}