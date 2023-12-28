package com.example.xyz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout ly1,ly2;
    BottomNavigationView nv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nv=findViewById(R.id.nv);
        nv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if(id==R.id.home)
                {
                    setfrag(new homefragment());
                }
                else if(id==R.id.profile)
                {
                   setfrag(new profilefragement());
                }
                return true;
            }
        });
        nv.setSelectedItemId(R.id.home);

    }
public void setfrag(Fragment fragment)
{
    FragmentManager fm=getSupportFragmentManager();
    FragmentTransaction ft=fm.beginTransaction();
    ft.replace(R.id.frame,fragment);
    ft.commit();
}
}