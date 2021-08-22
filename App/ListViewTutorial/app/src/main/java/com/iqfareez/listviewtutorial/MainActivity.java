package com.iqfareez.listviewtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.mylistview);

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Egypt", "Palestinian Territories", "Somalia", "Mauritania", "Morocco", "Philippines", "Iceland", "American Samoa", "Czech Republic", "Cyprus", "New Caledonia", "Nicaragua", "Croatia", "Eritrea", "Poland", "Oman", "St. Pierre & Miquelon", "British Virgin Islands", "Djibouti", "Burkina Faso", "Jordan"));

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
//        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "Clicked item " + position + " " + arrayList.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}