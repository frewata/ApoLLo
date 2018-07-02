package com.egasubekti.gamepgtk.Library;

/**
 * Created by hilal13 on 07/03/18.
 */

public class QuestionLibraryTransport {
    private static String[] mQuestions={
            "becak", "kano", "mobil", "perahu", "pesawatterbang",
            "sepeda", "sepedamotor", "bajai", "bus", "kereta"
    }; //total 10

    private String[][] mChoices ={
            {"kereta", "bajai", "sepeda"}, //becak
            {"mobil", "becak", "sepeda"},//kano
            {"sepedamotor", "perahu", "bajai"},//mobil
            {"kano", "bajai", "becak"},//perahu
            {"bajai", "becak", "kereta"},//pesawatterbang
            {"sepedamotor", "mobil", "pesawatterbang"},//sepeda
            {"pesawatterbang", "bus", "kereta"},//sepedamotor
            {"kano", "bus", "becak"},//perahu
            {"pesawatterbang", "mobil", "kano"},//sepeda
            {"perahu", "mobil", "sepedamotor"},//kano
    };

    private String[] mCorrectAnswers={
            "becak", "kano", "mobil", "perahu", "pesawatterbang",
            "sepeda", "sepedamotor", "bajai", "bus", "kereta"
    };

    private String[] AllAsset={
            "becak", "kano", "mobil", "perahu", "pesawatterbang",
            "sepeda", "sepedamotor", "bajai", "bus", "kereta"
    };

    public String[] getAllAsset()
    {
        String[] asset = mQuestions;
        return asset;
    }

    public static String getQuestion(int a)
    {
        String question = mQuestions[a];
        return question;
    }

    public String getChoices1(int a)
    {
        String choices0 = mChoices[a][0];
        return choices0;
    }
    public String getChoices2(int a)
    {
        String choices1 = mChoices[a][1];
        return choices1;
    }
    public String getChoices3(int a)
    {
        String choices2 = mChoices[a][2];
        return choices2;
    }
    public String getCorrectAnswer(int a)
    {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
