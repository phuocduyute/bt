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

public class tab3 extends Fragment {
    private View view;
    private orderScreen orderScreen;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public tab3() {
    }
    public static tab3 newInstance(String param1, String param2) {
        tab3 fragment = new tab3();
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
        view = inflater.inflate(R.layout.fragment_tab3,container,false);
        recycle_list();
        return view;
    }
    public void recycle_list(){
        RecyclerView order_recycle=view.findViewById(R.id.doan_recycle);
        order_recycle.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new GridLayoutManager(orderScreen,2);
        order_recycle.setLayoutManager(linearLayoutManager);
        List<orderItem> orderItems = new ArrayList<>();
        orderItems.add(new orderItem("Sococla Kem","69.000‘",R.drawable.product_7));
        orderItems.add(new orderItem("Sococla Kem","69.000‘",R.drawable.product_7));
        orderItems.add(new orderItem("Sococla Kem","69.000‘",R.drawable.product_7));
        orderItems.add(new orderItem("Sococla Kem","69.000‘",R.drawable.product_7));
        orderItems.add(new orderItem("Sococla Kem","69.000‘",R.drawable.product_7));
        orderItems.add(new orderItem("Sococla Kem","69.000‘",R.drawable.product_7));
        orderItems.add(new orderItem("Sococla Kem","69.000‘",R.drawable.product_7));
        orderItems.add(new orderItem("Sococla Kem","69.000‘",R.drawable.product_7));
        orderItems.add(new orderItem("Sococla Kem","69.000‘",R.drawable.product_7));
        orderItems.add(new orderItem("Sococla Kem","69.000‘",R.drawable.product_7));
        orderAdapter orderAdapter=new orderAdapter(orderScreen,orderItems,R.layout.row_grid);
        order_recycle.setAdapter(orderAdapter);
    }
}