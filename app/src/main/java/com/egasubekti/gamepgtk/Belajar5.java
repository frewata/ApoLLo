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
import com.egasubekti.gamepgtk.Library.QuestionLibraryHewan;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.squareup.picasso.Picasso;

public class Belajar5 extends AppCompatActivity {
    ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20;
    MediaPlayer btnsuara1,btnsuara2 ,btnsuara3 ,
            btnsuara4 ,btnsuara5 ,btnsuara6 ,
            btnsuara7 ,btnsuara8 ,btnsuara9 ,
            btnsuara10,btnsuara11,btnsuara12,
            btnsuara13,btnsuara14,btnsuara15,
            btnsuara16,btnsuara17,btnsuara18,
            btnsuara19,btnsuara20;
    private QuestionLibraryHewan mQuestionLibrary= new QuestionLibraryHewan();
    String[] asset;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar5);

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
        btn12 = (ImageButton) findViewById(R.id.jawab12);
        btn13 = (ImageButton) findViewById(R.id.jawab13);
        btn14 = (ImageButton) findViewById(R.id.jawab14);
        btn15 = (ImageButton) findViewById(R.id.jawab15);
        btn16  = (ImageButton) findViewById(R.id.jawab16 );
        btn17  = (ImageButton) findViewById(R.id.jawab17 );
        btn18  = (ImageButton) findViewById(R.id.jawab18 );
        btn19  = (ImageButton) findViewById(R.id.jawab19 );
        btn20 = (ImageButton) findViewById(R.id.jawab20);


//        for (int a = 0; a < 15; a++) {
        asset = mQuestionLibrary.getAllAsset3();
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
        Picasso.get().load(getImage(asset[11])).fit().centerInside().into(btn12);
        Picasso.get().load(getImage(asset[12])).fit().centerInside().into(btn13);
        Picasso.get().load(getImage(asset[13])).fit().centerInside().into(btn14);
        Picasso.get().load(getImage(asset[14])).fit().centerInside().into(btn15);
        Picasso.get().load(getImage(asset[15])).fit().centerInside().into(btn16);
        Picasso.get().load(getImage(asset[16])).fit().centerInside().into(btn17);
        Picasso.get().load(getImage(asset[17])).fit().centerInside().into(btn18);
        Picasso.get().load(getImage(asset[18])).fit().centerInside().into(btn19);
        Picasso.get().load(getImage(asset[19])).fit().centerInside().into(btn20);
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
        btn12 = (ImageButton) findViewById(R.id.jawab12);
        btn13 = (ImageButton) findViewById(R.id.jawab13);
        btn14 = (ImageButton) findViewById(R.id.jawab14);
        btn15 = (ImageButton) findViewById(R.id.jawab15);
        btn16  = (ImageButton) findViewById(R.id.jawab16 );
        btn17  = (ImageButton) findViewById(R.id.jawab17 );
        btn18  = (ImageButton) findViewById(R.id.jawab18 );
        btn19  = (ImageButton) findViewById(R.id.jawab19 );
        btn20 = (ImageButton) findViewById(R.id.jawab20);

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
        btn12.setClickable(false);
        btn13.setClickable(false);
        btn14.setClickable(false);
        btn15.setClickable(false);
        btn16.setClickable(false);
        btn17.setClickable(false);
        btn18.setClickable(false);
        btn19.setClickable(false);
        btn20.setClickable(false);

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
                btn12.setClickable(true);
                btn13.setClickable(true);
                btn14.setClickable(true);
                btn15.setClickable(true);
                btn16.setClickable(true);
                btn17.setClickable(true);
                btn18.setClickable(true);
                btn19.setClickable(true);
                btn20.setClickable(true);
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
    public void pilih12(View v){
        disableButton();
        btnsuara12 = MediaPlayer.create(this, (getResourceID(asset[11], "raw", getApplicationContext())));
        btnsuara12.start();
        btnsuara12.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                btnsuara12.release();
            }
        });
    }
    public void pilih13(View v){
        disableButton();
        btnsuara13 = MediaPlayer.create(this, (getResourceID(asset[12], "raw", getApplicationContext())));
        btnsuara13.start();
        btnsuara13.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                btnsuara13.release();
            }
        });
    }
    public void pilih14(View v){
        disableButton();
        btnsuara14 = MediaPlayer.create(this, (getResourceID(asset[13], "raw", getApplicationContext())));
        btnsuara14.start();
        btnsuara14.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                btnsuara14.release();
            }
        });
    }
    public void pilih15(View v){
        disableButton();
        btnsuara15 = MediaPlayer.create(this, (getResourceID(asset[14], "raw", getApplicationContext())));
        btnsuara15.start();
        btnsuara15.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                btnsuara15.release();
            }
        });
    }
    public void pilih16(View v){
        disableButton();
        btnsuara16 = MediaPlayer.create(this, (getResourceID(asset[15], "raw", getApplicationContext())));
        btnsuara16.start();
        btnsuara16.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                btnsuara16.release();
            }
        });
    }
    public void pilih17(View v){
        disableButton();
        btnsuara17 = MediaPlayer.create(this, (getResourceID(asset[16], "raw", getApplicationContext())));
        btnsuara17.start();
        btnsuara17.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                btnsuara17.release();
            }
        });
    }
    public void pilih18(View v){
        disableButton();
        btnsuara18 = MediaPlayer.create(this, (getResourceID(asset[17], "raw", getApplicationContext())));
        btnsuara18.start();
        btnsuara18.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                btnsuara18.release();
            }
        });
    }
    public void pilih19(View v){
        disableButton();
        btnsuara19 = MediaPlayer.create(this, (getResourceID(asset[18], "raw", getApplicationContext())));
        btnsuara19.start();
        btnsuara19.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                btnsuara19.release();
            }
        });
    }
    public void pilih20(View v){
        disableButton();
        btnsuara20 = MediaPlayer.create(this, (getResourceID(asset[19], "raw", getApplicationContext())));
        btnsuara20.start();
        btnsuara20.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                btnsuara20.release();
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
        Belajar5.this.finish();
        startActivity(intent);

        Glide.get(this).clearMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Glide.get(this).clearMemory();
    }
}
