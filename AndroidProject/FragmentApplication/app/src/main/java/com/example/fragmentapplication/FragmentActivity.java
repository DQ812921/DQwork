package com.example.fragmentapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_fragment);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
        replaceFragment(new RightFragment());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                replaceFragment(new RightFragment2());
                break;
            default:
                break;
        }
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();      /*获取FragmentManager*/
        FragmentTransaction transaction = fragmentManager.beginTransaction();    /*通过FragmentManager开启一个FragmentTransaction事务*/
        transaction.replace(R.id.right_layout, fragment);    /*调用FragmentTransaction对象的replace()方法替换Fragment实例*/
        transaction.addToBackStack(null);   /*在碎片中模拟返回栈*/
        transaction.commit();   /*提交事务*/
    }
}

