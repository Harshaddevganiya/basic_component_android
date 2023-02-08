package com.example.basic_component_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] cities = {"Surat", "Mumbai", "Dubai", "Ahmadabad", "Delhi", "punjab", "Bhavnagar", "Val sad", "Tokyo", "New York", "Surat", "Mumbai", "Dubai", "Ahmadabad"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, cities);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String str=listView.getAdapter().getItem(position).toString();
                    Intent intent = new Intent(view.getContext(), NewActivity.class);
                    intent.putExtra("name",str);
                    startActivity(intent);
                }
        });

    }
}
