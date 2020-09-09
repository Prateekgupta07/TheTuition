package com.example.thetuition;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class testpap7 extends AppCompatActivity {
    ListView pdfListView;
    ArrayList<String> pdfName = new ArrayList<>();
    ListViewAdapter listViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testpap7);
        pdfListView = findViewById(R.id.myPDFList);
        pdfName.add("Algebraic Expressions");
        pdfName.add("C.P. & S.P. (Only)");
        pdfName.add("Constructions");
        pdfName.add("Data Handling (Mean, Median & Mode)");
        pdfName.add("Exponents & Powers");
        pdfName.add("Fractions & Decimals");
        pdfName.add("Integers");
        pdfName.add("Linear Equations");
        pdfName.add("Lines & Angles");
        pdfName.add("Percentage & C.P. & S.P.");
        pdfName.add("Percentage (Extra)");
        pdfName.add("Percentage (Only)");
        pdfName.add("Ratio Prop., %age, Unitary Method, S.I.");
        pdfName.add("Ratio Prop. & Unitary Method");
        pdfName.add("Rational Numbers");
        pdfName.add("Trinagles & Its Prop. And Congruence of Triangles");



        listViewAdapter = new ListViewAdapter(getApplicationContext(), pdfName);
        pdfListView.setAdapter(listViewAdapter);
        pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                String name = pdfName.get(position);
                Intent intent = new Intent(getApplicationContext(),PDFopenert7.class);
                intent.putExtra("pdf",name);
                startActivity(intent);
            }
        });
    }
}