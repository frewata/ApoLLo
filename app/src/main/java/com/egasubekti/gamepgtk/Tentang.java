package com.egasubekti.gamepgtk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

/**
 * Created by RandyHK on 2/12/2018.
 */


public class Tentang extends AppCompatActivity {

    private AdView mAdView;
    private String TAG = Tentang.class.getSimpleName();
    InterstitialAd mInterstitialAd;

    String developerName = "eganagari";
    String packageName = "com.eganagari.bookeganagari";
    MediaPlayer tombol1, tombol2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

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

//        tombol1 = MediaPlayer.create(this, R.raw.suara_tombol);
//        tombol2 = MediaPlayer.create(this, R.raw.suara_tombol);

        Button moreApp = (Button) findViewById(R.id.moreApp);
        moreApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent moreapp = new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id="+developerName));
                startActivity(moreapp);
//                tombol2.start();
            }
        });

        Button rateApp = (Button) findViewById(R.id.rateApp);
        rateApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent rateapp = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id="+packageName));
                startActivity(rateapp);
//                tombol1.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent kembaliKeMenu = new Intent(this,MenuAwal.class);
        startActivity(kembaliKeMenu);
        Tentang.this.finish();
    }


    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }
}
