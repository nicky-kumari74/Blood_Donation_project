package com.example.xyz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class showcmp extends AppCompatActivity {
TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showcmp);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t3);
        t3=findViewById(R.id.t4);

        t1.setText(getIntent().getStringExtra("time"));
        t2.setText(getIntent().getStringExtra("dept"));
        t3.setText(getIntent().getStringExtra("sbj"));
    }
}