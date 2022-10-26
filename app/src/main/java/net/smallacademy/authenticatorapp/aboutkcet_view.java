package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class aboutkcet_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutkcet_view);
        WebView webView=findViewById(R.id.webview1);
        webView.loadUrl("file:///android_asset/aboutkcet.html");
    }
}