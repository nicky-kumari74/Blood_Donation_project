package com.example.xyz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class update_city extends AppCompatActivity {
    Spinner city;
    Button search;
    ArrayList<String> cname=new ArrayList<>();
    String cy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_city);
        search=findViewById(R.id.update);
        city=findViewById(R.id.u_city);
        cname.add("--select--");
        cname.add("greater noida");
        cname.add("kanpur");
        cname.add("ghaziabad");
        cname.add("meerut");
        cname.add("agra");cname.add("lucknow");
        ArrayAdapter ad=new ArrayAdapter(getApplicationContext(),R.layout.selected,cname);
        ad.setDropDownViewResource(R.layout.dropdown);
        city.setAdapter(ad);
        city.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                cy=cname.get(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cy.equals("--select--"))
                    Toast.makeText(update_city.this, "Please select city", Toast.LENGTH_SHORT).show();
                else {
                    Intent i = new Intent(update_city.this, blood_update.class);
                    i.putExtra("city", cy);
                    startActivity(i);
                }
            }
        });
    }
}