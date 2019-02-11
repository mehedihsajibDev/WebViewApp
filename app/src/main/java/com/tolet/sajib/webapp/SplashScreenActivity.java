package com.tolet.sajib.webapp;

import android.content.Intent;
import android.net.MailTo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashScreenActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        progressBar = findViewById(R.id.progressid);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                dowork();
               activity();
            }
        });
        thread.start();
    }

    private void activity() {
        Intent intent=new Intent(SplashScreenActivity.this,Webactivity.class);
        startActivity(intent);
        finish();
    }

    private void dowork() {
        for (int progress = 50; progress <=100; progress = progress + 50) {
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
