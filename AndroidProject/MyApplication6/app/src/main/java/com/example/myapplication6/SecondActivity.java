package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_second);

//        Intent intent2=getIntent();
//        String data_get=intent2.getStringExtra("hello");
//        int id=intent2.getIntExtra("id",0);
//        Log.d("DQ",data_get+id);

        /*Button btn2=findViewById(R.id.Button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent();
                intent3.putExtra("data_return","hello FirstActivity!");
                setResult(RESULT_OK,intent3);
                finish();


            }
        });*/

        Intent intent2=getIntent();
        Bundle bundle2=intent2.getBundleExtra("Message");
        String name=bundle2.getString("name");
        int id =bundle2.getInt("id",0);
        Log.d("DQ",name+id);

    }
}