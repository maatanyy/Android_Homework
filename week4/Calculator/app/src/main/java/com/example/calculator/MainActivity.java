package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button button1, button2, button3, button4;
    TextView textView1;
    String num1, num2;
    Integer result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        editText1 = (EditText)findViewById(R.id.edittext1);
        editText2 = (EditText)findViewById(R.id.edittext2);
        textView1 = (TextView)findViewById(R.id.textview1);

        button1 = (Button)findViewById(R.id.button1);
        button1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = editText1.getText().toString();
                num2 = editText2.getText().toString();
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                textView1.setText("계산 결과 : " +result.toString());
                return false;
            }
        });

        button2 = (Button)findViewById(R.id.button2);
        button2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = editText1.getText().toString();
                num2 = editText2.getText().toString();
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                textView1.setText("계산 결과 : " +result.toString());
                return false;
            }
        });

        button3= (Button)findViewById(R.id.button3);
        button3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = editText1.getText().toString();
                num2 = editText2.getText().toString();
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                textView1.setText("계산 결과 : " +result.toString());
                return false;
            }
        });

        button4 = (Button)findViewById(R.id.button4);
        button4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = editText1.getText().toString();
                num2 = editText2.getText().toString();
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                textView1.setText("계산 결과 : " +result.toString());
                return false;
            }
        });
    }
}