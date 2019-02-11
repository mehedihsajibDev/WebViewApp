package com.tolet.sajib.webapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class Webactivity extends AppCompatActivity {
  private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webactivity);
        webView=findViewById(R.id.webid);

         WebSettings webSettings= webView.getSettings();
         webSettings.setJavaScriptEnabled(true);
         webView.setWebViewClient(new WebViewClient());
         webView.loadUrl("https://daffodilvarsity.edu.bd/");
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }
        else {
            super.onBackPressed();
        }
 
    }
}
