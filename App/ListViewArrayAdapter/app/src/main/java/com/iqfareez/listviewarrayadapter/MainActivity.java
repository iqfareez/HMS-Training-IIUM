package com.iqfareez.listviewarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<StatesView> arrayList = new ArrayList<>(Arrays.asList(
                new StatesView(R.drawable._50px_flag_of_perlis_svg, "Perlis", "Indera Kayangan"),
                new StatesView(R.drawable._50px_flag_of_kedah_svg, "Kedah", "Darul Aman"),
                new StatesView(R.drawable._50px_flag_of_penang__malaysia__svg, "Pulau Pinang", "N/A"),
                new StatesView(R.drawable._50px_flag_of_perak_svg, "Perak", "Darul Ridzuan"),
                new StatesView(R.drawable._50px_flag_of_terengganu_svg, "Terengganu", "Darul Iman"),
                new StatesView(R.drawable._50px_flag_of_perlis_svg, "Kelantan", "Darul Naim"),
                new StatesView(R.drawable.flag_of_pahang_svg, "Pahang", "Darul Makmur"),
                new StatesView(R.drawable._50px_flag_of_selangor_svg, "Selangor", "Darul Ehsan"),
                new StatesView(R.drawable._50px_flag_of_negeri_sembilan_svg, "Negeri Sembilan", "Darul Khusus"),
                new StatesView(R.drawable._50px_flag_of_johor_svg, "Johor", "Darul Takzim"),
                new StatesView(R.drawable._50px_flag_of_malacca_svg, "Melaka", "N/A"),
                new StatesView(R.drawable._50px_flag_of_sarawak_svg, "Sarawak", "N/A"),
                new StatesView(R.drawable._50px_flag_of_sabah_svg, "Sabah", "N/A")
        ));

        StatesViewAdapter statesViewAdapter = new StatesViewAdapter(this, arrayList);

        ListView statesListView = findViewById(R.id.listview);
        statesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Snackbar.make(view, arrayList.get(position).getStatesTitle() + arrayList.get(position).getStatesName(), BaseTransientBottomBar.LENGTH_SHORT).show();
            }
        });

        statesListView.setAdapter(statesViewAdapter);

    }
}