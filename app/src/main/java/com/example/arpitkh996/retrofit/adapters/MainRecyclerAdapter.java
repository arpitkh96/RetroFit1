package com.example.arpitkh996.retrofit.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.arpitkh996.retrofit.R;
import com.example.arpitkh996.retrofit.model.Center;

import java.util.List;

/**
 * Created by arpitkh996 on 05-08-2016.
 */

public class MainRecyclerAdapter extends RecyclerView.Adapter<MainRecyclerAdapter.LocalViewHolder> {
    List<Center> arrayList;
    Context c;

    public MainRecyclerAdapter(List<Center> arrayList, Context c) {
        this.arrayList = arrayList;
        this.c = c;

    }


    @Override
    public LocalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.simple_row, parent, false);
        return new LocalViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(LocalViewHolder holder, final int position) {

        holder.title.setText(arrayList.get(position).getCenterName());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class LocalViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        View r;

        public LocalViewHolder(View itemView) {
            super(itemView);
            this.r = itemView;
            title = (TextView) itemView.findViewById(R.id.simpleText);
        }

        public View getView() {
            return r;
        }
    }
}
