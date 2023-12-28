package com.example.xyz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class cmplist extends AppCompatActivity {
    ListView lv;
    String[] s1={"7/04/2020","26/11/2023","7/062023","04/11/2023","23/12/2022","26/11/2023","7/062023","04/11/2023"};
    String[] s2={"Medical","Non-medical","Medical","Non-medical","Non-medical","Non-medical","Medical","Non-medical"};
    String[] s3={"fghjnsbvfdgh","fgbhfkfn","tghjkmnbvcdd","fdwsaqszxcvbnn","cvbnmkkjhgthh","fgbhfkfn","tghjkmnbvcdd","fdwsaqszxcvbnn"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmplist);
        lv=findViewById(R.id.lv);
        Customadapter ca=new Customadapter(getApplicationContext(),s1,s2,s3);
        lv.setAdapter(ca);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent x=new Intent(cmplist.this, showcmp.class);
                x.putExtra("time",s1[i]);
                x.putExtra("dept",s2[i]);
                x.putExtra("sbj",s3[i]);
                startActivity(x);
            }
        });
    }
}