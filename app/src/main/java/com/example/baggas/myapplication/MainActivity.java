package com.example.baggas.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {


    ProgressBar pb;
    WebView wb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pb=(ProgressBar) findViewById(R.id.progress);
        wb=(WebView) findViewById(R.id.webView);
        wb.loadUrl("https://www.google.com");
        wb.setWebChromeClient(new WebChromeClient(){
            public void onProgressChanged(WebView vb,int progress)
            {
                if(progress==100){
                    pb.setVisibility(View.GONE);
                    wb.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
