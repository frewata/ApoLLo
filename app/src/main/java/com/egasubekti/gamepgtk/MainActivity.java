package com.egasubekti.gamepgtk;

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


public class MainActivity extends AppCompatActivity {

    LinearLayout layoutMenu;
    CardView permainan1, permainan2, permainan3, permainan4, permainan5, permainan6,tentang, belajar;
    Intent tekanPermainan1, tekanPermainan2, tekanPermainan3, tekanPermainan4, tekanPermainan5,tekanPermainan6,tekanTentang, tekanBelajar;
    MediaPlayer tombol1, tombol2;

    private AdView mAdView;
    private String TAG = MainActivity.class.getSimpleName();
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
//        permainan6 = (CardView) findViewById(R.id.permainan6);


        tekanPermainan1 = new Intent(this,Permainan1.class);
        tekanPermainan2 = new Intent(this,Permainan2.class);
        tekanPermainan3 = new Intent(this,Permainan3.class);
        tekanPermainan4 = new Intent(this,Permainan4.class);
        tekanPermainan5 = new Intent(this,Permainan5.class);
//        tekanPermainan6 = new Intent(this,Tentang.class);


        permainan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.get(MainActivity.this).clearMemory();
                startActivity(tekanPermainan1);
                MainActivity.this.finish();
//                tombol2.start();
            }
        });

        permainan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.get(MainActivity.this).clearMemory();
                startActivity(tekanPermainan1);
                MainActivity.this.finish();
//                tombol1.start();
            }
        });

        permainan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.get(MainActivity.this).clearMemory();
                startActivity(tekanPermainan2);
                MainActivity.this.finish();
//                tombol2.start();

            }
        });

        permainan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.get(MainActivity.this).clearMemory();
                startActivity(tekanPermainan3);
                MainActivity.this.finish();
//                tombol1.start();
            }
        });

        permainan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.get(MainActivity.this).clearMemory();
                startActivity(tekanPermainan4);
                MainActivity.this.finish();
//                tombol2.start();

            }
        });

        permainan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.get(MainActivity.this).clearMemory();
                startActivity(tekanPermainan5);
                MainActivity.this.finish();
//                tombol1.start();

            }
        });

//        permainan6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(tekanPermainan6);
//                MainActivity.this.finish();
//                tombol2.start();
//
//            }
//        });

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