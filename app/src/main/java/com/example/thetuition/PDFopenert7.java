package com.example.thetuition;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFopenert7 extends AppCompatActivity {
    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_fopenert7);
        myPDFViewer = findViewById(R.id.pdfViewer);
        String getItem = getIntent().getExtras().getString("pdf");
        if (getItem.equals("Algebraic Expressions")){
            myPDFViewer.fromAsset("Algebraic Expressions.pdf").load();
        }
        if (getItem.equals("C.P. & S.P. (Only)")){
            myPDFViewer.fromAsset("C.P. & S.P. (Only).pdf").load();
        }
        if (getItem.equals("Constructions")){
            myPDFViewer.fromAsset("Constructions.pdf").load();
        }
        if (getItem.equals("Data Handling (Mean, Median & Mode)")){
            myPDFViewer.fromAsset("Data Handling (Mean, Median & Mode).pdf").load();
        }
        if (getItem.equals("Exponents & Powers")){
            myPDFViewer.fromAsset("Exponents & Powers.pdf").load();
        }
        if (getItem.equals("Fractions & Decimals")){
            myPDFViewer.fromAsset("Fractions & Decimals.pdf").load();
        }
        if (getItem.equals("Integers")){
            myPDFViewer.fromAsset("Integers.pdf").load();
        }
        if (getItem.equals("Linear Equations")){
            myPDFViewer.fromAsset("Linear Equations.pdf").load();
        }
        if (getItem.equals("Lines & Angles")){
            myPDFViewer.fromAsset("Lines & Angles.pdf").load();
        }
        if (getItem.equals("Percentage & C.P. & S.P.")){
            myPDFViewer.fromAsset("Percentage & C.P. & S.P..pdf").load();
        }
        if (getItem.equals("Percentage (Extra)")){
            myPDFViewer.fromAsset("Percentage (Extra).pdf").load();
        }
        if (getItem.equals("Percentage (Only)")){
            myPDFViewer.fromAsset("Percentage (Only).pdf").load();
        }
        if (getItem.equals("Ratio Prop., %age, Unitary Method, S.I.")){
            myPDFViewer.fromAsset("Ratio Prop., %age, Unitary Method, S.I..pdf").load();
        }
        if (getItem.equals("Ratio Prop. & Unitary Method")){
            myPDFViewer.fromAsset("Ratio Prop. & Unitary Method.pdf").load();
        }
        if (getItem.equals("Rational Numbers")){
            myPDFViewer.fromAsset("Rational Numbers.pdf").load();
        }
        if (getItem.equals("Trinagles & Its Prop. And Congruence of Triangles")){
            myPDFViewer.fromAsset("Trinagles & Its Prop. And Congruence of Triangles.pdf").load();
        }
    }
}