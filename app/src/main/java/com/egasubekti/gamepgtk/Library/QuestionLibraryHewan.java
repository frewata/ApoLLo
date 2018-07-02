package com.egasubekti.gamepgtk.Library;

import com.egasubekti.gamepgtk.R;

import java.util.Collections;

/**
 * Created by hilal13 on 06/03/18.
 */

public class QuestionLibraryHewan {

    private static String[] mQuestions={"angsa","anjing", "ayam",
            "babi", "bebek", "berang", "beruang", "biawak",
            "bintanglaut", "buaya", "burungbangau", "burungbeo", "burungelang",
            "burunggagak", "burunghantu", "burungkakatua", "burungmerak", "burungpelikan",
            "burungunta", "domba", "hamster", "harimau", "ikancupang",
            "ikanhiu", "ikankoi", "ikanpari", "jerapah", "kalkun",
            "kambing", "katak", "kelinci", "kepiting", "kucing",
            "kuda", "kurakura", "lalat", "lumbalumba", "macantutul",
            "marmut", "nyamuk", "paus", "penyu", "rubah",
            "rusa", "semut", "singa", "srigala", "tupai",
            "uburubur", "unta"
    }; //50 total

    private String[][] mChoices ={
            {"bebek", "burungbangau", "buaya"}, //angsa
            {"bintanglaut", "babi", "burungelang"}, //anjing
            {"burungkakatua", "unta", "srigala"}, //ayam
            {"tupai", "penyu", "macantutul"}, //babi
            {"rusa", "nyamuk", "lalat"}, //bebek
            {"kambing", "kuda", "ikankoi"}, //berang
            {"burungpelikan", "macantutul", "kelinci"}, //beruang
            {"kelinci", "hamster", "paus"}, //biawak
            {"hamster", "macantutul", "angsa"}, //bintanglaut
            {"burungpelikan", "unta", "angsa"}, //buaya

            {"ikancupang", "burungbeo", "buaya"}, //burungbangau
            {"bintanglaut", "babi", "burungelang"}, //burungbeo
            {"burungkakatua", "unta", "srigala"}, //burungelang
            {"tupai", "penyu", "macantutul"}, //burunggagak
            {"burungbeo", "nyamuk", "burungunta"}, //burunghantu
            {"kambing", "ikancupang", "ikankoi"}, //burungkakaktua
            {"burungpelikan", "macantutul", "kelinci"}, //burungmerak
            {"burungunta", "hamster", "biawak"}, //burungpelikan
            {"hamster", "macantutul", "angsa"}, //burungunta
            {"burungbeo", "unta", "angsa"}, //domba

            {"singa", "burungbangau", "marmut"}, //hamster
            {"marmut", "babi", "burungelang"},//harimau
            {"burungkakatua", "unta", "srigala"},//ikancupang
            {"tupai", "penyu", "marmut"},//ikanhiu
            {"rusa", "nyamuk", "lalat"},//ikankoi
            {"marmut", "kuda", "ikankoi"},//ikanpari
            {"burungpelikan", "macantutul", "kelinci"},//jerapah
            {"kelinci", "hamster", "biawak"},//kalkun
            {"hamster", "macantutul", "marmut"},//kambing
            {"burungpelikan", "unta", "angsa"},//katak

            {"burungbeo", "burungbangau", "buaya"},//kelinci
            {"paus", "babi", "burungelang"},//kepiting
            {"burungkakatua", "unta", "kelinci"},//kucing
            {"tupai", "penyu", "paus"},//kuda
            {"rusa", "nyamuk", "lalat"},//kurakura
            {"kelinci", "kuda", "ikankoi"},//lalat
            {"paus", "macantutul", "kelinci"},//lumbalumba
            {"kelinci", "hamster", "biawak"},//macantutul
            {"hamster", "macantutul", "angsa"},//marmut
            {"paus", "unta", "angsa"},//nyamuk

            {"bebek", "tupai", "buaya"},//paus
            {"semut", "babi", "burungelang"},//penyu
            {"burungkakatua", "unta", "srigala"},//rubah
            {"tupai", "penyu", "macantutul"},//rusa
            {"srigala", "tupai", "lalat"},//semut
            {"kambing", "kuda", "ikankoi"},//singa
            {"burungpelikan", "macantutul", "kelinci"},//srigala
            {"kelinci", "hamster", "biawak"},//tupai
            {"rubah", "macantutul", "angsa"},//uburubur
            {"burungpelikan", "penyu", "angsa"}//unta

    };

    private String[] mCorrectAnswers={"angsa","anjing", "ayam",
            "babi", "bebek", "berang", "beruang", "biawak",
            "bintanglaut", "buaya", "burungbangau", "burungbeo", "burungelang",
            "burunggagak", "burunghantu", "burungkakatua", "burungmerak", "burungpelikan",
            "burungunta", "domba", "hamster", "harimau", "ikancupang",
            "ikanhiu", "ikankoi", "ikanpari", "jerapah", "kalkun",
            "kambing", "katak", "kelinci", "kepiting", "kucing",
            "kuda", "kurakura", "lalat", "lumbalumba", "macantutul",
            "marmut", "nyamuk", "paus", "penyu", "rubah",
            "rusa", "semut", "singa", "srigala", "tupai",
            "uburubur", "unta"
    };

    private String[] AllAsset1={"angsa","anjing", "ayam",
            "babi", "bebek", "berang", "beruang", "biawak",
            "bintanglaut", "buaya", "burungbangau", "burungbeo", "burungelang",
            "burunggagak", "burunghantu"};
    private String[] AllAsset2={"burungkakatua", "burungmerak", "burungpelikan",
            "burungunta", "domba", "hamster", "harimau", "ikancupang",
            "ikanhiu", "ikankoi", "ikanpari", "jerapah", "kalkun",
            "kambing", "katak"};
    private String[] AllAsset3={"kelinci", "kepiting", "kucing",
            "kuda", "kurakura", "lalat", "lumbalumba", "macantutul",
            "marmut", "nyamuk", "paus", "penyu", "rubah",
            "rusa", "semut", "singa", "srigala", "tupai",
            "uburubur", "unta"};

    public String[] getAllAsset1()
    {
        String[] asset = AllAsset1; //15
        return asset;
    }
    public String[] getAllAsset2()
    {
        String[] asset = AllAsset2; //15
        return asset;
    }
    public String[] getAllAsset3()
    {
        String[] asset = AllAsset3; //20
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
