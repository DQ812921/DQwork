package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RelativeActivity extends AppCompatActivity implements View.OnClickListener{
    int visible_id;
    TextView view_upper;
    TextView view_down;
    TextView view_left;
    TextView view_right;

    Button btn_center;
    Button btn_upper;
    Button btn_down;
    Button btn_left;
    Button btn_right;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        view_upper=findViewById(R.id.view_upper);
        view_down=findViewById(R.id.view_down);
        view_left=findViewById(R.id.view_left);
        view_right=findViewById(R.id.view_right);

        btn_center=findViewById(R.id.btn_center);
        btn_upper=findViewById(R.id.btn_upper);
        btn_down=findViewById(R.id.btn_down);
        btn_left=findViewById(R.id.btn_left);
        btn_right=findViewById(R.id.btn_right);

        btn_center.setOnClickListener(this);
        btn_upper.setOnClickListener(this);
        btn_down.setOnClickListener(this);
        btn_left.setOnClickListener(this);
        btn_right.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_upper:
                visible_id = changeVisible(view_upper.getVisibility());
                view_upper.setVisibility(visible_id);
                break;
            case R.id.btn_down:
                visible_id = changeVisible(view_down.getVisibility());
                view_down.setVisibility(visible_id);
                break;
            case R.id.btn_left:
                visible_id = changeVisible(view_left.getVisibility());
                view_left.setVisibility(visible_id);
                break;
            case R.id.btn_right:
                visible_id = changeVisible(view_right.getVisibility());
                view_right.setVisibility(visible_id);
                break;
            case R.id.btn_center:
                view_upper.setVisibility(View.INVISIBLE);
                view_down.setVisibility(View.INVISIBLE);
                view_left.setVisibility(View.INVISIBLE);
                view_right.setVisibility(View.INVISIBLE);
                break;
            default:
                break;
        }
    }

    private int changeVisible(int stateld)
    {
        if(stateld==View.INVISIBLE)
        {
            return View.VISIBLE;
        }
        return View.INVISIBLE;
    }
}