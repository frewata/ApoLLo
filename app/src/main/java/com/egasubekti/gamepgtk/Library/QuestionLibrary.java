package com.egasubekti.gamepgtk.Library;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.egasubekti.gamepgtk.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by hilal13 on 06/03/18.
 */

public class QuestionLibrary extends AppCompatActivity {
    private static String[] mQuestions={"belahketupat", "persegi", "persegipanjang", "segitiga", "trapesium","bulat", "jajargenjang", "layanglayang", "segienam", "segilima"};
//    private static String[] mQuestions;
    private String[][] mChoices ={
            {"jajargenjang", "segitiga", "trapesium"},//belahketupat
            {"persegipanjang", "jajargenjang", "segitiga"},//persegi
            {"jajargenjang", "persegi", "belahketupat"},//persegipanjang
            {"trapesium", "persegipanjang", "belahketupat"},//segitiga
            {"segitiga", "persegipanjang", "bulat"},//trapesium
            {"persegi", "segienam", "trapesium"},//bulat
            {"persegipanjang", "belahketupat", "segitiga"},//jajargenjang
            {"segienam", "persegi", "segilima"},//layanglayang
            {"bulat", "segilima", "belahketupat"},//segienam
            {"segitiga", "persegipanjang", "bulat"}//segilima
    };
//    private String[][] mChoicesStatic;

    private String[] mCorrectAnswers={"belahketupat", "persegi", "persegipanjang", "segitiga", "trapesium","bulat", "jajargenjang", "layanglayang", "segienam", "segilima"};
    private static String[] AllAsset={"belahketupat", "persegi", "persegipanjang", "segitiga", "trapesium","bulat", "jajargenjang", "layanglayang", "segienam", "segilima"};
    public String[] getAllAsset()
    {
        String[] asset = AllAsset;
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
