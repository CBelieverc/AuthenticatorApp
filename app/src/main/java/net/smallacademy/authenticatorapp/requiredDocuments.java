package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;

public class requiredDocuments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_required_documents);
        getWindow().setStatusBarColor(ContextCompat.getColor(requiredDocuments.this,R.color.colorPrimaryDark));
    }
}