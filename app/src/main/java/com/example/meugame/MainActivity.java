package com.example.meugame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Games> lstGames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstGames = new ArrayList<>();


        RecyclerView mRecycleView = findViewById(R.id.recyclerview);

        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(getApplication(), lst)
    }



}