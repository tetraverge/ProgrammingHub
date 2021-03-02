package com.hub.programminghub;

/**
 * Created by Arvin on 2/21/2018.
 */

public class Question {

    public String questions[] = {
            "Which is a Programming Language?",
            "In COMAL language program, after name of procedure parameters must be in?",
            "Programming language COBOL works best for use in?",
            "Can any function call itself?",
            "Who is father of C Language?",
            "For 16-bit compiler allowable range for integer constants is ____ ?"

    };

    public String choices[][] = {
            {"HTML", "CSS", "Vala", "PHP"},
            {"Punction Marks", "Back-Slash", "Brackets", "Semi Colon"},
            {"Siemens Applications", "Student Applications", "Social Applications", "Commercial Applications"},
            {"Yes","No","Compilation Error","Runtime Error"},
            {"“Bjarne Stroustrup”, “Dennis Ritchie”,“James A. Gosling”, “Dr. E.F. Codd”"},
            {"“-3.4e38 to 3.4e38”, “-32767 to 32768”, “-32768 to 32767”, “-32668 to 32667”"}
    };

    public String correctAnswer[] = {
        "PHP",
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
