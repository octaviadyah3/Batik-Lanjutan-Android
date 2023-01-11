package com.dyahexample.myloginapp.ui.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

import com.dyahexample.myloginapp.R;

public class SplashActivity extends AppCompatActivity {
    ProgressBar progressBar;
    private static int SPLASH_DURATION_TIME = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ne handler().postDelayed(new Runnable() {
            @override
            public void run(){
                intent i = new intent(splashscreen.this, MainActivity.class);
                StartActivity(i);
                finish();
            }
        } ,SPLASH_DURATION_TIME)
    }

    private fun showloading(state:Boolean){
       if (state) {
            progressbar.visibility =View.VISIBLE;
       }else{
           progressbar.visibility =View.GONE;
       }
    }
}