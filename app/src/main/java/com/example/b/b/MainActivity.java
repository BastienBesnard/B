package com.example.b.b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView simpleWebView = (WebView)findViewById(R.id.simpleWebView);
        simpleWebView.loadUrl("file:///android_asset/sample.html");
        simpleWebView.getSettings().setJavaScriptEnabled(true);
    }
}
