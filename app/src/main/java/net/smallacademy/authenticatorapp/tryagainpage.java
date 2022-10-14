package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;

public class tryagainpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tryagainpage);
        getWindow().setStatusBarColor(ContextCompat.getColor(tryagainpage.this,R.color.colorPrimaryDark));
    }
}