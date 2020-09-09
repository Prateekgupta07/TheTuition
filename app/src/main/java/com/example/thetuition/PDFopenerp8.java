package com.example.thetuition;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFopenerp8 extends AppCompatActivity {
    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_fopenerp8);

        myPDFViewer = findViewById(R.id.pdfViewer);
        String getItem = getIntent().getExtras().getString("pdf");

        if (getItem.equals("Algebraic Expressions level two")){
            myPDFViewer.fromAsset("Algebraic Expressions level two.pdf").load();
        }
        if (getItem.equals("Algebraic Expressions  level one")){
            myPDFViewer.fromAsset("Algebraic Expressions  level one.pdf").load();
        }
        if (getItem.equals("Compound Interest")){
            myPDFViewer.fromAsset("Compound Interest.pdf").load();
        }
        if (getItem.equals("Cube & Cube Roots")){
            myPDFViewer.fromAsset("Cube & Cube Roots.pdf").load();
        }
        if (getItem.equals("Direct & Inverse Variation")){
            myPDFViewer.fromAsset("Direct & Inverse Variation.pdf").load();
        }
        if (getItem.equals("Exponents & Powers eight")){
            myPDFViewer.fromAsset("Exponents & Powers eight.pdf").load();
        }
        if (getItem.equals("Factorisation")){
            myPDFViewer.fromAsset("Factorisation.pdf").load();
        }
        if (getItem.equals("Linear Equations")){
            myPDFViewer.fromAsset("Linear Equations.pdf").load();
        }
        if (getItem.equals("Mensuration")){
            myPDFViewer.fromAsset("Mensuration.pdf").load();
        }
        if (getItem.equals("Percentage & Its Applications")){
            myPDFViewer.fromAsset("Percentage & Its Applications.pdf").load();
        }
        if (getItem.equals("Profit & Loss")){
            myPDFViewer.fromAsset("Profit & Loss.pdf").load();
        }
        if (getItem.equals("Quadrilaterals")){
            myPDFViewer.fromAsset("Quadrilaterals.pdf").load();
        }
        if (getItem.equals("Rational Numbers level four")){
            myPDFViewer.fromAsset("Rational Numbers level four.pdf").load();
        }
        if (getItem.equals("Rational Numbers level one")){
            myPDFViewer.fromAsset("Rational Numbers level one.pdf").load();
        }
        if (getItem.equals("Rational Numbers  level three")){
            myPDFViewer.fromAsset("Rational Numbers level three.pdf").load();
        }
        if (getItem.equals("Rational Numbers level two")){
            myPDFViewer.fromAsset("Rational Numbers level two.pdf").load();
        }
        if (getItem.equals("Squares and Square Roots")){
            myPDFViewer.fromAsset("Squares and Square Roots.pdf").load();
        }

    }
}