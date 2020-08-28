package com.example.thetuition;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class practicepap7 extends AppCompatActivity {
    ListView pdfListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicepap7);


        pdfListView = (ListView) findViewById(R.id.myPDFList);

        String[] pdfFiles = {"Integer", "Fractions", "Decimals", "Rational Numbers", "Exponents & Powers", "Algebraic Expressions", "Linear Equations", "Ratio & Proportion", "Percentage &its Application", "Percentage & S.P. C.P.", "Lines & Angles", "Triangles & its Properties", "Congruence of Triangles", "Perimeter & Area", "Data Handling", "Bar Graphs"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pdfFiles) {

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView myText = (TextView) view.findViewById(R.id.text);
                return view;
            }
        };

        pdfListView.setAdapter(adapter);
        pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = pdfListView.getItemAtPosition(i).toString();
                Intent start = new Intent(getApplicationContext(), PDFopenerp7.class);
                start.putExtra("pdfFileName", item);
                startActivity(start);
            }
        });
    }
}