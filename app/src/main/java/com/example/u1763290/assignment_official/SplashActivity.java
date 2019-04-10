package com.example.u1763290.assignment_official;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by u1763290 on 10/04/2019.
 */


public class SplashActivity extends AppCompatActivity implements Runnable {
    private final static int DELAY = 7000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.football_splash);

        Handler splashHandler = new Handler();
        splashHandler.postDelayed( this, DELAY );

    }
    @Override
    public void run() {
        Intent intent = new Intent( SplashActivity.this, Football_activity.class );
        SplashActivity.this.startActivity( intent );
        // If you don't call the finish method the Splash activity remains on the stack
        SplashActivity.this.finish();
    }
}
