package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /*变量声明*/
    EditText edit_text;
    boolean clear_flag;

    String etinput;/*全局*/
    Button btn_back;
    Button btn_clear;
    Button btn_num0;
    Button btn_num1;
    Button btn_num2;
    Button btn_num3;
    Button btn_num4;
    Button btn_num5;
    Button btn_num6;
    Button btn_num7;
    Button btn_num8;
    Button btn_num9;
    Button btn_add;
    Button btn_chen;
    Button btn_div;
    Button btn_dot;
    Button btn_equ;
    Button btn_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        /*资源映射*/
        edit_text=findViewById(R.id.edit_text);
        btn_back=findViewById(R.id.btn_back);
        btn_add=findViewById(R.id.btn_add);
        btn_clear=findViewById(R.id.btn_clear);
        btn_chen=findViewById(R.id.btn_chen);
        btn_div=findViewById(R.id.btn_div);
        btn_dot=findViewById(R.id.btn_dot);
        btn_equ=findViewById(R.id.btn_equ);
        btn_num0=findViewById(R.id.btn_num0);
        btn_num1=findViewById(R.id.btn_num1);
        btn_num2=findViewById(R.id.btn_num2);
        btn_num3=findViewById(R.id.btn_num3);
        btn_num4=findViewById(R.id.btn_num4);
        btn_num5=findViewById(R.id.btn_num5);
        btn_num6=findViewById(R.id.btn_num6);
        btn_num7=findViewById(R.id.btn_num7);
        btn_num8=findViewById(R.id.btn_num8);
        btn_num9=findViewById(R.id.btn_num9);
        btn_sub=findViewById(R.id.btn_sub);
        /*注册事件监听*/
        btn_num0.setOnClickListener(this);
        btn_num1.setOnClickListener(this);
        btn_num2.setOnClickListener(this);
        btn_num3.setOnClickListener(this);
        btn_num4.setOnClickListener(this);
        btn_num5.setOnClickListener(this);
        btn_num6.setOnClickListener(this);
        btn_num7.setOnClickListener(this);
        btn_num8.setOnClickListener(this);
        btn_num9.setOnClickListener(this);
        btn_back.setOnClickListener(this);
        btn_chen.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_add.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_equ.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
    }



        /*点击事件*/
    @Override
    public void onClick(View view) {
        etinput=edit_text.getText().toString();
        String etTemp="";
        switch (view.getId())
        {
            case R.id.btn_num0:
            case R.id.btn_num1:
            case R.id.btn_num2:
            case R.id.btn_num3:
            case R.id.btn_num4:
            case R.id.btn_num5:
            case R.id.btn_num6:
            case R.id.btn_num7:
            case R.id.btn_num8:
            case R.id.btn_num9:
            case R.id.btn_dot:
                if(clear_flag){
                    etClear();
                }
                etTemp=etinput+((Button)view).getText().toString();
                showText(etTemp);
                break;

            /*点击运算符，添加空格符间隔显示，为运算时数据提取做铺垫*/
            case R.id.btn_add:
            case R.id.btn_sub:
            case R.id.btn_chen:
            case R.id.btn_div:
                if (clear_flag) { etClear(); }
                etTemp = etinput + " " + ((Button)view).getText() + " ";
                showText(etTemp);
                break;

            /*点击回退键，若内容不为空，则去掉最后一位*/
            case R.id.btn_back:
                if (clear_flag) {
                    etClear();
                } else if (etinput != null && !etinput.equals(" ")) {
                    etTemp = etinput.substring(0, etinput.length() - 1);
                    showText(etTemp);
                }
                break;

            /*点击清除键，清除所有内容*/
            case R.id.btn_clear:
                etClear();
                break;

            /*点击“=”键，显示计算结果*/
            case R.id.btn_equ:
                getResult();
                clear_flag = true;
                break;
            default:
                break;
        }
    }

    private void getResult() {
        String dataIn = etinput;
        double result = 0;

        if (dataIn == null || dataIn.equals("")) {  /*没有输入数据*/
            return;
        }
        if (!dataIn.contains(" ")) {  /*输入数据中未包含运算符*/
            return;
        }

        /*从输入数据中提取数据字符串和运算符*/
        String str1 = dataIn.substring(0, dataIn.indexOf(" "));
        String operator = dataIn.substring(dataIn.indexOf(" ") + 1, dataIn.indexOf(" ") + 2);
        String str2 = dataIn.substring(dataIn.indexOf(" ") + 3);

        /*将数据字符串转换为double型数据*/
        double data1 = Double.parseDouble(str1);
        double data2 = Double.parseDouble(str2);

        /*根据运算符进行相应的运算处理*/
        switch (operator) {
            case "+":
                result = data1 + data2;
                break;
            case "-":
                result = data1 - data2;
                break;
            case "*":
                result = data1 * data2;
                break;
            case "/":
                if (data2 == 0) {
                    etClear();
                    break;
                }
                result = data1 / data2;
                break;
        }

//        if (!str1.contains(".") && !str2.contains(".") && !operator.equals("/")) {
//            edit_text.setText(dataIn + "=" + (int)result);
//            return;
//        }
        edit_text.setText(dataIn + "=" + result);
    }


    private void etClear() {
       clear_flag=false;
       etinput="";
        edit_text.setText("");
    }

    private void showText(String content) {
        edit_text.setText(content);
        edit_text.setSelection(content.length());
    }
}
