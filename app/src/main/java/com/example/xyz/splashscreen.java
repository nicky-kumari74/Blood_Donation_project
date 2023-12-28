package com.example.xyz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class splashscreen extends AppCompatActivity {
ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        iv=findViewById(R.id.sw);
        iv.animate().scaleY(1f).scaleX(1f).setDuration(2000);
        iv.animate().scaleY(1.3f).scaleX(1.3f).setDuration(2000);
        iv.animate().scaleY(1.5f).scaleX(1.5f).setDuration(2000);
        iv.animate().scaleY(1.8f).scaleX(1.8f).setDuration(2000);
        iv.animate().scaleY(2f).scaleX(2f).setDuration(3000);
        iv.animate().scaleY(2.5f).scaleX(2.5f).setDuration(3000);
        iv.animate().scaleY(3f).scaleX(3f).setDuration(3000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(splashscreen.this,loginpage.class);
                startActivity(i);
                finish();

            }
        },3500);
    }
}