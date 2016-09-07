package com.example.pam_android.firstapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by PAM-Android on 9/5/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<String> mDataset;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtHeader;
        public TextView txtFooter;

        public ViewHolder(View itemView) {
            super(itemView);
            txtHeader = (TextView) itemView.findViewById(R.id.firstLine);
            txtFooter = (TextView) itemView.findViewById(R.id.secondLine);
        }
    }

    public MyAdapter(ArrayList<String> myDataset) {
        mDataset = myDataset;
    }

    public void add(int position, String item) {
        mDataset.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(String item) {
        int position = mDataset.indexOf(item);
        mDataset.remove(position);
        notifyItemRemoved(position);
    }




    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        final String name = mDataset.get(position);
        holder.txtHeader.setText(mDataset.get(position));
        holder.txtFooter.setText("Footer: " + mDataset.get(position));
        holder.txtHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                remove(name);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }


}
