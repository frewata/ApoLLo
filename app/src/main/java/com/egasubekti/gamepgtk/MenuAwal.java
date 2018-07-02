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

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;


public class MenuAwal extends AppCompatActivity {

    LinearLayout layoutMenu;
    CardView bermain, tentang, belajar;
    Intent tekanBermain, tekanTentang, tekanBelajar;
    MediaPlayer tombol1, tombol2;

    private AdView mAdView;
    private String TAG = MenuAwal.class.getSimpleName();
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_awal);

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

        bermain = (CardView) findViewById(R.id.bermain);
        tentang = (CardView) findViewById(R.id.tentang);
        belajar = (CardView) findViewById(R.id.belajar);


        tekanBermain = new Intent(this,MainActivity.class);
        tekanBelajar = new Intent(this,BelajarActivity.class);
        tekanTentang = new Intent(this,Tentang.class);

        bermain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(tekanBermain);
                MenuAwal.this.finish();
//                tombol2.start();

            }
        });

        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(tekanTentang);
                MenuAwal.this.finish();
//                tombol1.start();

            }
        });
        belajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(tekanBelajar);
                MenuAwal.this.finish();
//                tombol2.start();

            }
        });
    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Tekan dua kali untuk keluar", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;

            }
        }, 2000);
    }

    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }

}