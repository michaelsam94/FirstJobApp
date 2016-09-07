package com.example.pam_android.firstapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by PAM-Android on 9/5/2016.
 */
public class ItemsList extends BaseActivity {

    @Bind(R.id.myRecyclerView)
    RecyclerView recyclerView;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_layout);
        ButterKnife.bind(this);
        ArrayList<String> dataSet = new ArrayList<>();
        for(int i=0;i<100;i++){
            dataSet.add("Sam");
        }
        GridLayoutManager mLayoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(mLayoutManager);
        MyAdapter adapter = new MyAdapter(dataSet);
        recyclerView.setAdapter(adapter);
    }
}
