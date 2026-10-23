package com.sooraj.autocadmcq;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
  private WebView web;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    web = new WebView(this);
    web.setBackgroundColor(0xFF081225);
    WebSettings settings = web.getSettings();
    settings.setJavaScriptEnabled(true);
    settings.setDomStorageEnabled(true);
    settings.setAllowFileAccess(true);
    web.setWebViewClient(new WebViewClient());
    setContentView(web);
    web.loadUrl("file:///android_asset/index.html");
  }

  @Override
  @SuppressWarnings("deprecation")
  public void onBackPressed() {
    if (web == null) {
      super.onBackPressed();
      return;
    }
    web.evaluateJavascript(
      "window.handleAndroidBack ? window.handleAndroidBack() : false",
      value -> {
        if (!"true".equals(value)) {
          MainActivity.super.onBackPressed();
        }
      }
    );
  }
}
