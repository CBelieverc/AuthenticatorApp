package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class course_select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_select);
    }

    public void openactivity_t1(View view){
        String s1 = getIntent().getStringExtra("subject1");
        Intent intent = new Intent(this, puc.class);
        intent.putExtra("subject1",s1);
        intent.putExtra("course","complete_course");
        startActivity(intent);
    }
    public void openactivity_t2(View view){
        String s1 = getIntent().getStringExtra("subject1");
        Intent intent = new Intent(this, puc.class);
        intent.putExtra("subject1",s1);
        intent.putExtra("course","crash_course");
        startActivity(intent);
    }
}