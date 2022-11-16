package net.smallacademy.authenticatorapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class predictor extends AppCompatActivity {

    private WebView webview;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predictor);
        getWindow().setStatusBarColor(ContextCompat.getColor(predictor.this,R.color.colorPrimaryDark));
        ImageView back6 =findViewById(R.id.back6);
        back6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        AdBlocker.init(this);

        textView=findViewById(R.id.ignore);
        webview=(WebView)findViewById(R.id.web1);
        webview.setWebViewClient(new MyBrowser());

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webview.loadUrl("https://collegestack.in/college_predictor_neetug_2022/?utm_source=c2&vt_keyword=neet%20rank%20predictor&gclid=Cj0KCQjwqoibBhDUARIsAH2OpWi6huPIbfe9wGx2yUJ74WM7GQZML6eid3NTRx2d2ibwVVSyNlEaY0YaAk0JEALw_wcB");

    }
    class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        private Map<String, Boolean> loadedUrls = new HashMap<>();
        @Nullable
        @Override
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            boolean ad;
            if (!loadedUrls.containsKey(url)) {
                ad = AdBlocker.isAd(url);
                loadedUrls.put(url, ad);
            } else {
                ad = loadedUrls.get(url);
            }
            return ad ? AdBlocker.createEmptyResource() :
                    super.shouldInterceptRequest(view, url);
        }
    }
    @Override
    public void onBackPressed() {

        if (webview.canGoBack()) {
            webview.goBack();
        } else {
            super.onBackPressed();
        }
    }

}
