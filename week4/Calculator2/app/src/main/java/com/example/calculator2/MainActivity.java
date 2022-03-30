package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button button1, button2, button3, button4, button5;
    TextView textView1;
    String num1, num2;
    Float result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기(수정)");

        editText1 = (EditText)findViewById(R.id.edittext1);
        editText2 = (EditText)findViewById(R.id.edittext2);
        textView1 = (TextView)findViewById(R.id.textview1);

        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = editText1.getText().toString();
                num2 = editText2.getText().toString();

                if(num1.isEmpty() || num2.isEmpty()){
                    String msg = "please write number";
                    Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
                    textView1.setText("계산 결과 : ");
                }

                else {
                    result = Float.parseFloat(num1) + Float.parseFloat(num2);
                    textView1.setText("계산 결과 : " + result.toString());
                }
            }
        });

        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = editText1.getText().toString();
                num2 = editText2.getText().toString();

                if(num1.isEmpty() || num2.isEmpty()){
                    String msg = "please write number";
                    Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
                    textView1.setText("계산 결과 : ");
                }

                else {
                    result = Float.parseFloat(num1) - Float.parseFloat(num2);
                    textView1.setText("계산 결과 : " + result.toString());
                }
            }
        });

        button3= (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = editText1.getText().toString();
                num2 = editText2.getText().toString();

                if(num1.isEmpty() || num2.isEmpty()){
                    String msg = "please write number";
                    Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
                    textView1.setText("계산 결과 : ");
                }

                else {
                    result = Float.parseFloat(num1) * Float.parseFloat(num2);
                    textView1.setText("계산 결과 : " + result.toString());
                }
            }
        });

        button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = editText1.getText().toString();
                num2 = editText2.getText().toString();

                if(num1.isEmpty() || num2.isEmpty()){
                    String msg = "please write number";
                    Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
                    textView1.setText("계산 결과 : ");
                }

                else {
                    result = Float.parseFloat(num1) / Float.parseFloat(num2);
                    textView1.setText("계산 결과 : " + result.toString());
                }
            }
        });

        button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = editText1.getText().toString();
                num2 = editText2.getText().toString();

                float check;
                check = Float.parseFloat(num2);
                if (check==0){
                    String msg = "you can't divide by 0";
                    Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
                    textView1.setText("계산 결과 : ");
                }
                else if(num1.isEmpty() || num2.isEmpty()){
                    String msg = "please write number";
                    Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
                    textView1.setText("계산 결과 : ");
                }

                else {
                    result = Float.parseFloat(num1) % Float.parseFloat(num2);
                    textView1.setText("계산 결과 : " + result.toString());
                }
            }
        });

    }
}