package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.INotificationSideChannel;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import net.smallacademy.authenticatorapp.utility.NetworkChangeList;

public class admissionprocess extends AppCompatActivity {
    NetworkChangeList networkChangeList = new NetworkChangeList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admissionprocess);
        ImageView back=findViewById(R.id.back5);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),aboutkcet2.class));
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
                finish();
            }
        });
        CardView schedule = findViewById(R.id.schedule);
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("pdf_url","https://cache.careers360.mobi/media/uploads/froala_editor/files/finalcoresyllabus_neet-ug-4-11_SbhTheL.pdf");
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);



            }
        });
        CardView required_documents = findViewById(R.id.required_documents);
        required_documents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("pdf_url","https://cache.careers360.mobi/media/uploads/froala_editor/files/finalcoresyllabus_neet-ug-12-21.pdf");
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


            }
        });
        CardView official_notification = findViewById(R.id.official_notification);
        official_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), webview.class);
                intent.putExtra("pdf_url","https://cache.careers360.mobi/media/uploads/froala_editor/files/finalcoresyllabus_neet-ug-22-28.pdf");
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

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
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(getApplicationContext(),aboutkcet2.class);
        startActivity(intent);
        finish();
    }
}