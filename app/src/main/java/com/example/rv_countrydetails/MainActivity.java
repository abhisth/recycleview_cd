package com.example.rv_countrydetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<details> countrylist;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();



    }

    private void initData() {
        countrylist = new ArrayList<>();
        countrylist.add(new details(R.drawable.india,"91","India"));
        countrylist.add(new details(R.drawable.india,"91","India"));
        countrylist.add(new details(R.drawable.india,"91","India"));
        countrylist.add(new details(R.drawable.india,"91","India"));
        countrylist.add(new details(R.drawable.india,"91","India"));
        countrylist.add(new details(R.drawable.india,"91","India"));


    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this
        );
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}