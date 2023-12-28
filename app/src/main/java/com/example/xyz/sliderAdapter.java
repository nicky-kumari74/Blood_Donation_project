package com.example.xyz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;

public class sliderAdapter extends RecyclerView.Adapter<sliderAdapter.viewHolder> {
    ArrayList<Integer> al;
    ViewPager2 vp;
    sliderAdapter(ArrayList<Integer> al,ViewPager2 vp){
        this.al=al;
        this.vp=vp;
    }
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.imglist,parent,false);
        viewHolder vh=new viewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.rv.setImageResource(al.get(position));
        if(position==al.size()-2)
        {
            vp.post(runnable);
        }

    }

    @Override
    public int getItemCount() {
        return al.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        RoundedImageView rv;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            rv=itemView.findViewById(R.id.img);
        }
    }
    private Runnable runnable=new Runnable() {
        @Override
        public void run() {
            al.addAll(al);
            notifyDataSetChanged();
        }
    };
}
