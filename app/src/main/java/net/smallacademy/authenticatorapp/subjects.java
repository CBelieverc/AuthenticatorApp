package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import net.smallacademy.authenticatorapp.utility.NetworkChangeList;

public class subjects extends AppCompatActivity {
    NetworkChangeList networkChangeList = new NetworkChangeList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);
        ImageView back3=findViewById(R.id.back5);
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

        //Question Paper
        CardView button22 = findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url1 = getIntent().getStringExtra("pdf_url1");
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("pdf_url",url1);
                startActivity(intent);
            }
        });



        //KEY ANSWERS
        Button button26 = findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url5 = getIntent().getStringExtra("pdf_url5");
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("pdf_url",url5);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        IntentFilter filter =new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(networkChangeList,filter);

        super.onStart();
    }

    @Override
    protected void onStop() {
        unregisterReceiver(networkChangeList);
        super.onStop();
    }
}
