package com.example.thetuition;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFopenerp7 extends AppCompatActivity {
    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_fopenerp7);

        myPDFViewer = findViewById(R.id.pdfViewer);
        String getItem = getIntent().getExtras().getString("pdf");
        if (getItem.equals("Algebraic Expressions")){
            myPDFViewer.fromAsset("Algebraic Expressions.pdf").load();
        }
        if (getItem.equals("Decimals")){
            myPDFViewer.fromAsset("Decimals.pdf").load();
        }
        if (getItem.equals("Exponents & Powers")){
            myPDFViewer.fromAsset("Exponents & Powers.pdf").load();
        }
        if (getItem.equals("Fractions")){
            myPDFViewer.fromAsset("Fractions.pdf").load();
        }
        if (getItem.equals("Integers")){
            myPDFViewer.fromAsset("Integers.pdf").load();
        }
        if (getItem.equals("Rational Numbers")){
            myPDFViewer.fromAsset("Rational Numbers.pdf").load();
        }
    }
}