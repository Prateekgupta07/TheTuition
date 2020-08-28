package com.example.thetuition;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.Objects;

public class PDFopenerp7 extends AppCompatActivity {
    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_fopenerp7);

        myPDFViewer = (PDFView) findViewById(R.id.pdfViewer);
        String getItem = getIntent().getStringExtra("pdffilename");
        if (Objects.equals(getItem, "Integers")){
            myPDFViewer.fromAsset("Integers.pdf").load();
        }

        if (getItem.equals("Fractions")){
            myPDFViewer.fromAsset("Fractions.pdf").load();
        }

        if (getItem.equals("Decimals")){
            myPDFViewer.fromAsset("Decimals.pdf").load();
        }

        if (getItem.equals("Rational Numbers")){
            myPDFViewer.fromAsset("Rational Numbers.pdf").load();
        }

        if (getItem.equals("Exponents & Powers")){
            myPDFViewer.fromAsset("Exponents & Powers.pdf").load();
        }

        if (getItem.equals("Algebraic Expressions")){
            myPDFViewer.fromAsset("Algebraic Expressions.pdf").load();
        }

        if (getItem.equals("Linear Equations")){
            myPDFViewer.fromAsset("Linear Equations.docx");
        }

        if (getItem.equals("Ratio & Proportion")){
            myPDFViewer.fromAsset("Ratio & Proportion.docx");
        }

        if (getItem.equals("Percentage &its Application")){
            myPDFViewer.fromAsset("Percentage & Its Application.docx");
        }

        if (getItem.equals("Percentage & S.P. C.P.")){
            myPDFViewer.fromAsset("Percentage & S.P. C.P..docx");
        }

        if (getItem.equals("Lines & Angles")){
            myPDFViewer.fromAsset("Lines & Angles.docx");
        }

        if (getItem.equals("Triangles & its Properties")){
            myPDFViewer.fromAsset("Triangles & Its Properties.docx");
        }

        if (getItem.equals("Congruence of Triangles")){
            myPDFViewer.fromAsset("Congruence of Triangles.docx");
        }

        if (getItem.equals("Perimeter & Area")){
            myPDFViewer.fromAsset("Perimeter & Area.docx");
        }

        if (getItem.equals("Data Handling")){
            myPDFViewer.fromAsset("Data Handling.docx");
        }

        if (getItem.equals("Bar Graphs")){
            myPDFViewer.fromAsset("Bar Graphs.docx");
        }
    }
}