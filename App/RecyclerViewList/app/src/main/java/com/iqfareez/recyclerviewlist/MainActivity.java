package com.iqfareez.recyclerviewlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    ArrayList courseImg = new ArrayList<>(Arrays.asList(
            R.drawable.cards,
            R.drawable.cart,
            R.drawable.clock,
            R.drawable.clock_1,
            R.drawable.cloud,
            R.drawable.computer,
            R.drawable.cross,
            R.drawable.diagram,
            R.drawable.empty_box,
            R.drawable.empty_files,
            R.drawable.telescope));

    ArrayList courseName = new ArrayList(Arrays.asList(
            "cards",
            "cart",
            "clock",
            "clock_1",
            "cloud",
            "computer",
            "cross",
            "diagram",
            "empty_box",
            "empty_files",
            "telescope"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
//        getSupportActionBar().setTitle("RecyclerView (Grid)");
//        recyclerView.setLayoutManager(gridLayoutManager);

        Adapter adapter = new Adapter(MainActivity.this, courseImg, courseName);

        recyclerView.setAdapter(adapter);
    }
}