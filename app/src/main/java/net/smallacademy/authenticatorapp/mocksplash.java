package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class mocksplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mocksplash);
        getWindow().setStatusBarColor(ContextCompat.getColor(mocksplash.this,R.color.colorPrimaryDark));

        new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
         String url11 = getIntent().getStringExtra("pdf_url11");
         Intent intent = new Intent(mocksplash.this, mockquestions.class);
         intent.putExtra("pdf_url111", url11);
         startActivity(intent);
         }
         }, 1500);
    }
}