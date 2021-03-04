package com.hub.programminghub;

/**
 * Created by Arvin on 2/21/2018.
 */

public class Question {

    public String questions[] = {
            "C Language developed at ___?",
            "C Language developed at ___?",
            "C programs are converted into machine language with the help of ____.",
            "Can any function call itself?",
            "Who is father of C Language?",
            "For 16-bit compiler allowable range for integer constants is ____ ?"

    };

    public String choices[][] = {
            {"Bjarne Stroustrup", "Dennis Ritchie", "James A. Gosling", "Dr. E.F. Codd"},
            {"AT & T’s Bell Laboratories of USA in 1972", "AT & T’s Bell Laboratories of USA in 1970", "Sun Microsystems in 1973", "Semi Colon"},
            {"Siemens Applications", "Student Applications", "Social Applications", "Commercial Applications"},
            {"Yes","No","Compilation Error","Runtime Error"},
            {"“Bjarne Stroustrup”, “Dennis Ritchie”,“James A. Gosling”, “Dr. E.F. Codd”"},
            {"“-3.4e38 to 3.4e38”, “-32767 to 32768”, “-32768 to 32767”, “-32668 to 32667”"}
    };

    public String correctAnswer[] = {
        "Dennis Ritchie",
        "Brackets",
        "Commercial Applications",
            "Yes",
      "Dennis Ritchi",
            "-32768 to 32767"

    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}
