package com.egasubekti.gamepgtk;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.squareup.picasso.Picasso;


public class BelajarActivity extends AppCompatActivity {

    LinearLayout layoutMenu;
    CardView permainan1, permainan2, permainan3, permainan4, permainan5, permainan6, permainan7;
    Intent tekanPermainan1, tekanPermainan2, tekanPermainan3, tekanPermainan4,
            tekanPermainan5,tekanPermainan6,tekanPermainan7;
    MediaPlayer tombol1, tombol2;

    private AdView mAdView;
    private String TAG = BelajarActivity.class.getSimpleName();
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.interstitial_full_screen));
        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showInterstitial();
            }
        });

        layoutMenu = (LinearLayout) findViewById(R.id.layoutMenu);
//        tombol1 = MediaPlayer.create(this, R.raw.suara_tombol);
//        tombol2 = MediaPlayer.create(this, R.raw.suara_tombol);

        permainan1 = (CardView) findViewById(R.id.permainan1);
        permainan2 = (CardView) findViewById(R.id.permainan2);
        permainan3 = (CardView) findViewById(R.id.permainan3);
        permainan4 = (CardView) findViewById(R.id.permainan4);
        permainan5 = (CardView) findViewById(R.id.permainan5);
        permainan6 = (CardView) findViewById(R.id.permainan6);
        permainan7 = (CardView) findViewById(R.id.permainan7);

        tekanPermainan1 = new Intent(this,Belajar1.class); //bentuk
        tekanPermainan2 = new Intent(this,Belajar2.class); //buah
        tekanPermainan3 = new Intent(this,Belajar3.class); //binatang1
        tekanPermainan4 = new Intent(this,Belajar4.class); //binatang2
        tekanPermainan5 = new Intent(this,Belajar5.class); //binatang3
        tekanPermainan6 = new Intent(this,Belajar6.class); //sayur
        tekanPermainan7 = new Intent(this,Belajar7.class); //transport


        permainan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.get(BelajarActivity.this).clearMemory();
                startActivity(tekanPermainan1);
                BelajarActivity.this.finish();
//                tombol1.start();
            }
        });

        permainan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.get(BelajarActivity.this).clearMemory();
                startActivity(tekanPermainan2);
                BelajarActivity.this.finish();
//                tombol2.start();

            }
        });

        permainan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.get(BelajarActivity.this).clearMemory();
                startActivity(tekanPermainan3);
                BelajarActivity.this.finish();
//                tombol1.start();
            }
        });

        permainan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.get(BelajarActivity.this).clearMemory();
                startActivity(tekanPermainan4);
                BelajarActivity.this.finish();
//                tombol2.start();
            }
        });

        permainan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.get(BelajarActivity.this).clearMemory();
                startActivity(tekanPermainan5);
                BelajarActivity.this.finish();
//                tombol1.start();
            }
        });

        permainan6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.get(BelajarActivity.this).clearMemory();
                startActivity(tekanPermainan6);
                BelajarActivity.this.finish();
//                tombol1.start();
            }
        });

        permainan7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.get(BelajarActivity.this).clearMemory();
                startActivity(tekanPermainan7);
                BelajarActivity.this.finish();
//                tombol1.start();
            }
        });

    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(),MenuAwal.class);
        startActivity(intent);
        this.finish();
    }

    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }
}