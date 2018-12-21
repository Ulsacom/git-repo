package uz.ulugbek.browser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
public WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web=(WebView)findViewById(R.id.webViev  )  ;
        WebSettings ws = web.getSettings();
        ws.setJavaScriptEnabled(true);
        web.loadUrl("https://google.com/");
web.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if (web.canGoBack())
            web.goBack();
        else
        super.onBackPressed();


    }
}

