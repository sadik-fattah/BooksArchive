package com.guercifzone.booksarchive;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BooksDaiteils extends AppCompatActivity {
    String url;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.books_daiteils);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        webView = (WebView) findViewById(R.id.pdfView);
        Intent in = getIntent();
        url = in.getStringExtra("Book_loc");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        if (TextUtils.isEmpty(url)){
            Toast.makeText(getApplicationContext(), "url not found", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}