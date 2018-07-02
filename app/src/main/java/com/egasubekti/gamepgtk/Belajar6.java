package com.egasubekti.gamepgtk;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.egasubekti.gamepgtk.Library.QuestionLibrarySayur;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.squareup.picasso.Picasso;

public class Belajar6 extends AppCompatActivity {
    ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15;
    MediaPlayer btnsuara1,btnsuara2 ,btnsuara3 ,
            btnsuara4 ,btnsuara5 ,btnsuara6 ,
            btnsuara7 ,btnsuara8 ,btnsuara9 ,
            btnsuara10,btnsuara11,btnsuara12,
            btnsuara13,btnsuara14,btnsuara15;
    private QuestionLibrarySayur mQuestionLibrary= new QuestionLibrarySayur();
    String[] asset;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar6);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);

        btn1 = (ImageButton) findViewById(R.id.jawab1);
        btn2 = (ImageButton) findViewById(R.id.jawab2);
        btn3 = (ImageButton) findViewById(R.id.jawab3);
        btn4 = (ImageButton) findViewById(R.id.jawab4);
        btn5 = (ImageButton) findViewById(R.id.jawab5);
        btn6 = (ImageButton) findViewById(R.id.jawab6);
        btn7 = (ImageButton) findViewById(R.id.jawab7);
        btn8 = (ImageButton) findViewById(R.id.jawab8);
        btn9 = (ImageButton) findViewById(R.id.jawab9);
        btn10 = (ImageButton) findViewById(R.id.jawab10);
        btn11 = (ImageButton) findViewById(R.id.jawab11);

//        for (int a = 0; a < 15; a++) {
        asset = mQuestionLibrary.getAllAsset();
//    }

        Picasso.get().load(getImage(asset[0])).fit().centerInside().into(btn1);
        Picasso.get().load(getImage(asset[1])).fit().centerInside().into(btn2);
        Picasso.get().load(getImage(asset[2])).fit().centerInside().into(btn3);
        Picasso.get().load(getImage(asset[3])).fit().centerInside().into(btn4);
        Picasso.get().load(getImage(asset[4])).fit().centerInside().into(btn5);
        Picasso.get().load(getImage(asset[5])).fit().centerInside().into(btn6);
        Picasso.get().load(getImage(asset[6])).fit().centerInside().into(btn7);
        Picasso.get().load(getImage(asset[7])).fit().centerInside().into(btn8);
        Picasso.get().load(getImage(asset[8])).fit().centerInside().into(btn9);
        Picasso.get().load(getImage(asset[9])).fit().centerInside().into(btn10);
        Picasso.get().load(getImage(asset[10])).fit().centerInside().into(btn11);

    }
    public int getImage(String imageName) {

        int drawableResourceId = this.getResources().getIdentifier(imageName, "drawable", this.getPackageName());

        return drawableResourceId;
    }
    public void disableButton() {
        btn1 = (ImageButton) findViewById(R.id.jawab1);
        btn2 = (ImageButton) findViewById(R.id.jawab2);
        btn3 = (ImageButton) findViewById(R.id.jawab3);
        btn4 = (ImageButton) findViewById(R.id.jawab4);
        btn5 = (ImageButton) findViewById(R.id.jawab5);
        btn6 = (ImageButton) findViewById(R.id.jawab6);
        btn7 = (ImageButton) findViewById(R.id.jawab7);
        btn8 = (ImageButton) findViewById(R.id.jawab8);
        btn9 = (ImageButton) findViewById(R.id.jawab9);
        btn10 = (ImageButton) findViewById(R.id.jawab10);
        btn11 = (ImageButton) findViewById(R.id.jawab11);

        btn1.setClickable(false);
        btn2.setClickable(false);
        btn3.setClickable(false);
        btn4.setClickable(false);
        btn5.setClickable(false);
        btn6.setClickable(false);
        btn7.setClickable(false);
        btn8.setClickable(false);
        btn9.setClickable(false);
        btn10.setClickable(false);
        btn11.setClickable(false);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                btn1.setClickable(true);
                btn2.setClickable(true);
                btn3.setClickable(true);
                btn4.setClickable(true);
                btn5.setClickable(true);
                btn6.setClickable(true);
                btn7.setClickable(true);
                btn8.setClickable(true);
                btn9.setClickable(true);
                btn10.setClickable(true);
                btn11.setClickable(true);
            }
        }, 1000);
    }
    public void pilih1(View v){
        disableButton();
        btnsuara1 = MediaPlayer.create(this, (getResourceID(asset[0], "raw", getApplicationContext())));
        btnsuara1.start();
        btnsuara1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                
                btnsuara1.release();
            }
        });
    }
    public void pilih2(View v){
        disableButton();
        btnsuara2 = MediaPlayer.create(this, (getResourceID(asset[1], "raw", getApplicationContext())));
        btnsuara2.start();
        btnsuara2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                
                btnsuara2.release();
            }
        });
    }
    public void pilih3(View v){
        disableButton();
        btnsuara3 = MediaPlayer.create(this, (getResourceID(asset[2], "raw", getApplicationContext())));
        btnsuara3.start();
        btnsuara3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                
                btnsuara3.release();
            }
        });
    }
    public void pilih4(View v){
        disableButton();
        btnsuara4 = MediaPlayer.create(this, (getResourceID(asset[3], "raw", getApplicationContext())));
        btnsuara4.start();
        btnsuara4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                
                btnsuara4.release();
            }
        });
    }
    public void pilih5(View v){
        disableButton();
        btnsuara5 = MediaPlayer.create(this, (getResourceID(asset[4], "raw", getApplicationContext())));
        btnsuara5.start();
        btnsuara5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                
                btnsuara5.release();
            }
        });
    }
    public void pilih6(View v){
        disableButton();
        btnsuara6 = MediaPlayer.create(this, (getResourceID(asset[5], "raw", getApplicationContext())));
        btnsuara6.start();
        btnsuara6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                
                btnsuara6.release();
            }
        });
    }
    public void pilih7(View v) {
        disableButton();
        btnsuara7 = MediaPlayer.create(this, (getResourceID(asset[6], "raw", getApplicationContext())));
        btnsuara7.start();
        btnsuara7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                
                btnsuara7.release();
            }
        });
    }
    public void pilih8(View v) {
        disableButton();
        btnsuara8 = MediaPlayer.create(this, (getResourceID(asset[7], "raw", getApplicationContext())));
        btnsuara8.start();
        btnsuara8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                
                btnsuara8.release();
            }
        });
    }
    public void pilih9(View v) {
        disableButton();
        btnsuara9 = MediaPlayer.create(this, (getResourceID(asset[8], "raw", getApplicationContext())));
        btnsuara9.start();
        btnsuara9.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                
                btnsuara9.release();
            }
        });
    }
    public void pilih10(View v){
        disableButton();
        btnsuara10 = MediaPlayer.create(this, (getResourceID(asset[9], "raw", getApplicationContext())));
        btnsuara10.start();
        btnsuara10.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                
                btnsuara10.release();
            }
        });
    }
    public void pilih11(View v){
        disableButton();
        btnsuara11 = MediaPlayer.create(this, (getResourceID(asset[10], "raw", getApplicationContext())));
        btnsuara11.start();
        btnsuara11.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                
                btnsuara11.release();
            }
        });
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
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(),BelajarActivity.class);
        Belajar6.this.finish();
        startActivity(intent);

        Glide.get(this).clearMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Glide.get(this).clearMemory();
    }
}
