package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;

public class notification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        getWindow().setStatusBarColor(ContextCompat.getColor(notification.this,R.color.colorPrimaryDark));
    }
}