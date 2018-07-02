package com.egasubekti.gamepgtk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

public class SplashscreenActivity extends Activity {

    //Set waktu lama activity_splashscreen
    private static int splashInterval = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent i = new Intent(SplashscreenActivity.this, MenuAwal.class);
                startActivity(i);


                //jeda selesai Splashscreen
                this.finish();
            }

            private void finish(    ) {
                // TODO Auto-generated method stub

            }
        }, splashInterval);

    };

}