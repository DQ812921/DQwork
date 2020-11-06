package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity01 extends AppCompatActivity {
    private String[] data={"app1","app2","app3","app4","app5","app6","app7","app8","app9","app10","app11","app12","app13","app14","app15","app16","app17","app18","app19","app20"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listview);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(ListViewActivity01.this,android.R.layout.simple_expandable_list_item_1,data);

        ListView listView=findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}