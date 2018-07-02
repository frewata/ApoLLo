package com.egasubekti.gamepgtk.Library;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.egasubekti.gamepgtk.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by hilal13 on 06/03/18.
 */

public class QuestionLibraryBuah extends AppCompatActivity {
    private static String[] mQuestions={"anggur", "apel", "buahnaga",
            "dukuh", "jambu", "jeruk",
            "kelapa", "lemon", "lengkeng",
            "mangga", "melon", "pepaya",
            "pisang", "rambutan", "salak",
            "semangka"
    }; //total 16

    private String[][] mChoices ={
            {"melon", "pepaya", "lengkeng"}, //anggur
            {"salak", "rambutan", "lemon"},//apel
            {"pisang", "anggur", "semangka"},//buahnaga
            {"kelapa", "jambu", "buahnaga"},//dukuh
            {"rambutan", "apel", "salak"},//jambu
            {"lengkeng", "anggur", "buahnaga"},//jeruk
            {"dukuh", "jeruk", "pisang"},//kelapa
            {"buahnaga", "pepaya", "apel"},//lemon
            {"lemon", "melon", "rambutan"},//lengkeng
            {"dukuh", "pepaya", "pisang"},//mangga
            {"anggur", "pepaya", "lengkeng"},//melon
            {"salak", "rambutan", "lemon"},//pepaya
            {"rambutan", "anggur", "semangka"},//pisang
            {"kelapa", "jambu", "buahnaga"},//rambutan
            {"rambutan", "apel", "semangka"},//salak
            {"lengkeng", "anggur", "buahnaga"},//semangka
    };

    private String[] mCorrectAnswers={"anggur", "apel", "buahnaga",
            "dukuh", "jambu", "jeruk",
            "kelapa", "lemon", "lengkeng",
            "mangga", "melon", "pepaya",
            "pisang", "rambutan", "salak",
            "semangka"
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
