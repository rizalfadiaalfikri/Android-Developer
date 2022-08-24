package com.rizalfadiaalfikri.a09_pdfviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdfView = findViewById(R.id.pdfViewer);

        pdfView.fromAsset("khs.pdf")
                .enableSwipe(true)
                .enableDoubletap(true)
                .load();

    }
}