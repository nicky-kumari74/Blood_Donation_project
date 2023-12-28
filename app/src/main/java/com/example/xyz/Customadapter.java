package com.example.xyz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Customadapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    String a[],b[],c[];
    Customadapter(Context context,String a[],String b[],String c[])
    {
        this.context=context;
        this.a=a;
        this.b=b;
        this.c=c;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return a.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.list,null);
        TextView tv=(TextView) view.findViewById(R.id.t1);
        TextView tv2=(TextView) view.findViewById(R.id.t3);
        TextView tv3=(TextView) view.findViewById(R.id.t4);
        tv.setText(a[i]);
        tv2.setText(b[i]);
        tv3.setText(c[i]);
        return view;
    }
}

