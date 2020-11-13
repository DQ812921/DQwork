package com.example.myapplication9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StaticReceiverActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_receiver);
        Button btn_normal =findViewById(R.id.btn_normal);
        btn_normal.setOnClickListener(this);

        Button btn_order=findViewById(R.id.btn_order);
        btn_order.setOnClickListener(this);
    }




    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_normal:
                Intent intent_nomal=new Intent("com.example.myapplication9.MY_BROADCAST");
                intent_nomal.setPackage(getPackageName());
                sendBroadcast(intent_nomal);
                break;

            case R.id.btn_order:
                Intent intent_order=new Intent("com.example.myapplication9.Ordder_MY_BROADCAST");
                intent_order.setPackage(getPackageName());
                sendBroadcast(intent_order,null);
                break;
            default:
                break;

        }
    }
}