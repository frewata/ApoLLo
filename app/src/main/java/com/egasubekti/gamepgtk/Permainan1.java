package com.egasubekti.gamepgtk;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.egasubekti.gamepgtk.Library.QuestionLibrary;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


/**
 * Created by RandyHK on 3/3/2018.
 */

public class Permainan1 extends AppCompatActivity {

    MediaPlayer tombol1,tombolsoal, btnsuara1, btnsuara2, btnsuara3, btnsuara4, tombolbenar, tombolsalah;
    ImageButton btn1,btn2,btn3,btn4;
    TextView soalke,skor;
    public int delay=1712; //delay mulai audio ke soal berikutnya
    public int bound=10; //batas array soal maksimal
    String jawaban1,jawaban2,jawaban3,jawaban4;
    public Integer i;
    String jawaban, mAnswer;
    private QuestionLibrary mQuestionLibrary= new QuestionLibrary();
    String[] shuffleJawaban;
    Random randomNumber = new Random();
    int random;

    public int mScore = 0;
    private int mQuestionNumber = 0;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permainan1);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);

//        String[] mQuestionAll = QuestionLibrary.getAllQuestion();
//        List<String> shuffle = new ArrayList<String>(Arrays.asList(mQuestionAll));
//        Collections.shuffle(shuffle); //acak pilihan
        btn1 = (ImageButton) findViewById(R.id.jawab1);
        btn2 = (ImageButton) findViewById(R.id.jawab2);
        btn3 = (ImageButton) findViewById(R.id.jawab3);
        btn4 = (ImageButton) findViewById(R.id.jawab4);


        soalke = (TextView) findViewById(R.id.soalke);
        skor = (TextView) findViewById(R.id.skor);



            updateQuestion(mQuestionNumber);
            mAnswer = mQuestionLibrary.getCorrectAnswer(0);
            setSoal(0);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disableButton();
//                btnsuara1.start();
                if(mAnswer==btn1.getTag())
                {
                    startTombolBenar();
                    startSuara();
                    randomize();
                    mQuestionNumber++;
                    updateScore();
//                    checkStatus(mQuestionNumber);
                    soalke.setText(String.valueOf(mQuestionNumber+1));
//                        setSoal(random);
                    updateQuestion(random);
                }else{
                    startTombolSalah();
                    startSuara();
                    randomize();
                    mQuestionNumber++;
//                    checkStatus(mQuestionNumber);
                    soalke.setText(String.valueOf(mQuestionNumber+1));
//                        setSoal(random);
                    updateQuestion(random);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disableButton();
//                btnsuara2.start();
                if(mAnswer==btn2.getTag())
                {
                    startTombolBenar();
                    startSuara();
                    randomize();
                    mQuestionNumber++;
                    updateScore();
//                    checkStatus(mQuestionNumber);
                    soalke.setText(String.valueOf(mQuestionNumber+1));
//                        setSoal(random);
                    updateQuestion(random);
                }else{
                    startTombolSalah();
                    startSuara();
                    randomize();
                    mQuestionNumber++;
//                    checkStatus(mQuestionNumber);
                    soalke.setText(String.valueOf(mQuestionNumber+1));
//                        setSoal(random);
                    updateQuestion(random);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disableButton();
//                btnsuara3.start();
                if(mAnswer==btn3.getTag())
                {
                    startTombolBenar();
                    startSuara();
                    randomize();
                    mQuestionNumber++;
                    updateScore();
//                    checkStatus(mQuestionNumber);
                    soalke.setText(String.valueOf(mQuestionNumber+1));
//                        setSoal(random);
                    updateQuestion(random);
                }else{
                    startTombolSalah();
                    startSuara();
                    randomize();
                    mQuestionNumber++;
//                    checkStatus(mQuestionNumber);
                    soalke.setText(String.valueOf(mQuestionNumber+1));
//                        setSoal(random);
                    updateQuestion(random);
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disableButton();
//                btnsuara4.start();
                if(mAnswer==btn4.getTag())
                {
                    startTombolBenar();
                    startSuara();
                    randomize();
                    mQuestionNumber++;
                    updateScore();
//                    checkStatus(mQuestionNumber);
                    soalke.setText(String.valueOf(mQuestionNumber+1));
//                        setSoal(random);
                    updateQuestion(random);
                }else{
                    startTombolSalah();
                    startSuara();
                    randomize();
                    mQuestionNumber++;
//                    checkStatus(mQuestionNumber);
                    soalke.setText(String.valueOf(mQuestionNumber+1));
//                        setSoal(random);
                    updateQuestion(random);
                }
            }
        });
    }



    public void disableButton() {
        btn1 = (ImageButton) findViewById(R.id.jawab1);
        btn2 = (ImageButton) findViewById(R.id.jawab2);
        btn3 = (ImageButton) findViewById(R.id.jawab3);
        btn4 = (ImageButton) findViewById(R.id.jawab4);

        btn1.setClickable(false);
        btn2.setClickable(false);
        btn3.setClickable(false);
        btn4.setClickable(false);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                btn1.setClickable(true);
                btn2.setClickable(true);
                btn3.setClickable(true);
                btn4.setClickable(true);
            }
        }, delay + 1000);
    }

    public void updateScore()
    {
        this.mScore = this.mScore + 10;
        skor.setText(String.valueOf(mScore));
    }

    public void randomize()
    {
        this.random=randomNumber.nextInt(bound);
    }

    public void updateQuestion(int a)
    {
        Glide.get(this).clearMemory();
        mAnswer=mQuestionLibrary.getCorrectAnswer(a);
        btn1 = (ImageButton) findViewById(R.id.jawab1);
        btn2 = (ImageButton) findViewById(R.id.jawab2);
        btn3 = (ImageButton) findViewById(R.id.jawab3);
        btn4 = (ImageButton) findViewById(R.id.jawab4);
        jawaban = mQuestionLibrary.getCorrectAnswer(a); //set jawaban benar
        String pilihan1 = mQuestionLibrary.getChoices1(a);
        String pilihan2 = mQuestionLibrary.getChoices2(a);
        String pilihan3 = mQuestionLibrary.getChoices3(a);
//        Toast.makeText(getApplicationContext(),"pilihan1 :"+pilihan1, Toast.LENGTH_LONG).show();
        String[] arrayShuffle = {jawaban,pilihan1,pilihan2,pilihan3};
        List<String> shuffle = new ArrayList<String>(Arrays.asList(arrayShuffle));
        Collections.shuffle(shuffle); //acak pilihan
        Picasso.get().load(getImage(shuffle.get(0))).fit().centerInside().into(btn1);
        Picasso.get().load(getImage(shuffle.get(1))).fit().centerInside().into(btn2);
        Picasso.get().load(getImage(shuffle.get(2))).fit().centerInside().into(btn3);
        Picasso.get().load(getImage(shuffle.get(3))).fit().centerInside().into(btn4);
//        btnsuara1 = MediaPlayer.create(this, (getResourceID(shuffle.get(0), "raw", getApplicationContext())));
//        btnsuara2 = MediaPlayer.create(this, (getResourceID(shuffle.get(1), "raw", getApplicationContext())));
//        btnsuara3 = MediaPlayer.create(this, (getResourceID(shuffle.get(2), "raw", getApplicationContext())));
//        btnsuara4 = MediaPlayer.create(this, (getResourceID(shuffle.get(3), "raw", getApplicationContext())));

        btn1.setTag(shuffle.get(0));
        btn2.setTag(shuffle.get(1));
        btn3.setTag(shuffle.get(2));
        btn4.setTag(shuffle.get(3));


    }
    public void startTombolBenar() {
        tombolbenar = MediaPlayer.create(this, R.raw.benar);
        tombolbenar.start();
        tombolbenar.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                tombolbenar.release();
            }
        });
    }

    public void startTombolSalah() {
        tombolsalah = MediaPlayer.create(this, R.raw.salah);
        tombolsalah.start();
        tombolsalah.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                tombolsalah.release();
            }
        });
    }
    public void setSoal(int a)
    {
        String soalBenar = QuestionLibrary.getQuestion(a);
        tombolsoal = MediaPlayer.create(this, (getResourceID(soalBenar, "raw", getApplicationContext()))); //set suara
        tombolsoal.start();
        tombolsoal.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                tombolsoal.release();
            }
        });
    }

    public void pilih1(View v){

    }
    public void pilih2(View v){

    }
    public void pilih3(View v){

    }
    public void pilih4(View v){


    }
    public int getImage(String imageName) {

        int drawableResourceId = this.getResources().getIdentifier(imageName, "drawable", this.getPackageName());

        return drawableResourceId;
    }

    public void startSuara() {
        //start handler as activity become visible

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                setSoal(random);

            }
        }, delay);

    }

    protected final static int getResourceID
            (final String resName, final String resType, final Context ctx)
    {
        final int ResourceID =
                ctx.getResources().getIdentifier(resName, resType,
                        ctx.getApplicationInfo().packageName);
        if (ResourceID == 0)
        {
            throw new IllegalArgumentException
                    (
                            "No resource string found with name " + resName
                    );
        }
        else
        {
            return ResourceID;
        }
    }

    boolean doubleBackToExitPressedOnce = false;
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        mScore=0;
        startActivity(intent);
        this.finish();

//        Glide.get(this).clearDiskCache();
        Glide.get(this).clearMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();


//        Glide.get(this).clearDiskCache();
        Glide.get(this).clearMemory();
    }
}
