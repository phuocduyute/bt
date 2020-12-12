package com.example.coffehouse;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class tab1 extends Fragment {
    private View view;
    private orderScreen orderScreen;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public tab1() {
    }
    public static tab1 newInstance(String param1, String param2) {
        tab1 fragment = new tab1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tab1,container,false);
        recycle_list();
        return view;
    }
    public void recycle_list(){
        RecyclerView order_recycle=view.findViewById(R.id.popular_recycle);
        order_recycle.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new GridLayoutManager(orderScreen,2);
        order_recycle.setLayoutManager(linearLayoutManager);
        List<orderItem> orderItems = new ArrayList<>();
        orderItems.add(new orderItem("Cafe Sữa","69.000‘",R.drawable.coffee_2));
        orderItems.add(new orderItem("Cafe Sữa","69.000‘",R.drawable.coffee_2));
        orderItems.add(new orderItem("Cafe Sữa","69.000‘",R.drawable.coffee_2));
        orderItems.add(new orderItem("Cafe Sữa","69.000‘",R.drawable.coffee_2));
        orderItems.add(new orderItem("Cafe Sữa","69.000‘",R.drawable.coffee_2));
        orderItems.add(new orderItem("Cafe Sữa","69.000‘",R.drawable.coffee_2));
        orderItems.add(new orderItem("Cafe Sữa","69.000‘",R.drawable.coffee_2));
        orderItems.add(new orderItem("Cafe Sữa","69.000‘",R.drawable.coffee_2));
        orderItems.add(new orderItem("Cafe Sữa","69.000‘",R.drawable.coffee_2));
        orderItems.add(new orderItem("Cafe Sữa","69.000‘",R.drawable.coffee_2));
        orderItems.add(new orderItem("Cafe Sữa","69.000‘",R.drawable.coffee_2));
        orderAdapter orderAdapter=new orderAdapter(orderScreen,orderItems,R.layout.row_grid);
        order_recycle.setAdapter(orderAdapter);
    }
}