package com.example.myapplication6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_first);

        Log.d("DQ","onCreate被调用");


        Button btn1=findViewById(R.id.Button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
//                Intent intent1=new Intent(FirstActivity.this,SecondActivity.class);
//                startActivity(intent1);


//                Intent intent1=new Intent("com.example.activityapplication.MY_ACTTON");
//                intent1.addCategory("android.intent.category.DEFAULT");
//                startActivity(intent1);

//                Intent intent1=new Intent(Intent.ACTION_VIEW);
//                intent1.setData(Uri.parse("https://www.baidu.com"));
//                startActivity(intent1);


//                Intent intent1=new Intent(Intent.ACTION_DIAL);
//                intent1.setData(Uri.parse("tel:10086"));
//                startActivity(intent1);



               /* String data ="hello SecondActivity";
                Intent intent1=new Intent(FirstActivity.this,SecondActivity.class);
                intent1.putExtra("hello",data);
                intent1.putExtra("id",41802415);
                startActivityForResult(intent1,1);*/

               Bundle bundle1=new Bundle();
               bundle1.putString("name","DQJY");
               bundle1.putInt("id",41802415);
               Intent intent1=new Intent(FirstActivity.this,SecondActivity.class);
               intent1.putExtra("Message",bundle1);
               startActivity(intent1);


           }
        });
    }

   /* @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:
                if (resultCode==RESULT_OK)
                {
                    String returnedData=data.getStringExtra("data_return");
                    Log.d("DQ",returnedData);
                }
        }
    }*/

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("DQ","onStart被调用");
    }
}