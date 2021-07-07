package com.example.listviewclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListArray extends AppCompatActivity {

    ListView listView;
    String[] listItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_array);

        listView=findViewById(R.id.list1);
        listItem=getResources().getStringArray(R.array.musiclist);

        final ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,listItem);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Value=adapter.getItem(position);
                Toast.makeText(getApplicationContext(), Value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}