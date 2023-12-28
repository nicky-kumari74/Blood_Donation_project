package com.example.xyz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class application extends AppCompatActivity {
    Spinner sp;
    EditText t1,t2;
    Button btn;
    String a,b,c;
    ArrayList<String> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application);
        sp=findViewById(R.id.sp);
        list.add("--Select--");
        list.add("Medical");
        list.add("Non-Medical");
        list.add("Other");
        ArrayAdapter ad=new ArrayAdapter(getApplicationContext(),R.layout.selected,list);
        ad.setDropDownViewResource(R.layout.dropdown);
        sp.setAdapter(ad);

        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        btn=findViewById(R.id.btn);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                a=list.get(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}