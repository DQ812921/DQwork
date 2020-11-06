package com.example.myapplication4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class login_Activity extends AppCompatActivity implements View.OnClickListener {

    Button btn_register;
    Button btn_loginin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_register=findViewById(R.id.btn_register);
        btn_loginin=findViewById(R.id.btn_loginin);

        btn_register.setOnClickListener(this);
        btn_loginin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_register:
                final Toast toast=Toast.makeText(login_Activity.this,"注册成功",Toast.LENGTH_SHORT);
                toast.show();

                /*简化代码Toast.makeText(login_Activity.this,"注册成功",Toast.LENGTH_SHORT).show();*/

                break;
            case R.id.btn_loginin:
                Toast.makeText(login_Activity.this,"登录成功",Toast.LENGTH_SHORT).show();
                AlertDialog.Builder alerBuilder=new AlertDialog.Builder(login_Activity.this);
                alerBuilder.setIcon(R.mipmap.ic_launcher);
                alerBuilder.setTitle("确认登陆");
                alerBuilder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(login_Activity.this, "登陆成功", Toast.LENGTH_SHORT).show();
                    }
                });

                alerBuilder.setPositiveButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(login_Activity.this, "登陆失败", Toast.LENGTH_SHORT).show();
                    }
                });

                AlertDialog myAlert=alerBuilder.create();
                myAlert.show();
                break;
            default:
                break;
        }
    }

}