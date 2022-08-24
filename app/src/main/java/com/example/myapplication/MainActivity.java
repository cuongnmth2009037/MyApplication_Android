package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caculator);

//        final String[] datas = {"SAMSUNG","LG","HTC","SONY","NOKIA","SAMSUNG",
//                "LG","HTC","SONY","NOKIA","SAMSUNG","LG","HTC","SONY",
//                "NOKIA","SAMSUNG","LG","HTC","SONY","NOKIA"};
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
//                android.R.layout.simple_list_item_1, datas);
//
//        ListView lvContact = findViewById(R.id.listView);
//        lvContact.setAdapter(adapter);
//
//        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                String data = datas[position];
//                Toast.makeText(MainActivity.this, data, Toast.LENGTH_SHORT).show();
//            }
//        });

    }
}