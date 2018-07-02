package com.egasubekti.gamepgtk.Library;

/**
 * Created by hilal13 on 07/03/18.
 */

public class QuestionLibrarySayur {
    private static String[] mQuestions={
            "bawangmerah", "bawangputih", "bayam", "brokoli",
            "cabai", "daunkemangi", "kol", "lada",
            "lengkuas", "seledri", "tomat"
    }; //total 11

    private String[][] mChoices ={
            {"kol", "cabai", "bawangputih"}, //bawangmerah
            {"bawangmerah", "cabai", "brokoli"},//bawangputih
            {"cabai", "kol", "bawangputih"},//bayam
            {"daunkemangi", "bawangmerah", "kol"},//brokoli
            {"lengkuas", "lada", "bayam"},//cabai
            {"bayam", "cabai", "brokoli"},//daunkemangi
            {"bawangmerah", "lada", "lengkuas"},//kol
            {"tomat", "daunkemangi", "brokoli"},//lada
            {"seledri", "brokoli", "bawangmerah"},//lengkuas
            {"bawangputih", "daunkemangi", "bayam"},//seledri
            {"bayam", "bawangputih", "cabai"},//tomat
    };

    private String[] mCorrectAnswers={
            "bawangmerah", "bawangputih", "bayam", "brokoli",
            "cabai", "daunkemangi", "kol", "lada",
            "lengkuas", "seledri", "tomat"
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
