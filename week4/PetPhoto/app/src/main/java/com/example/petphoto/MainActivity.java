package com.example.petphoto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2, textView3;
    CheckBox checkBox;
    RadioGroup radioGroup;
    RadioButton radioButton1, radioButton2, radioButton3;
    Button button;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        textView3 = (TextView)findViewById(R.id.textView3);
        checkBox = (CheckBox)findViewById(R.id.checkBox);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        radioButton1 = (RadioButton)findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton)findViewById(R.id.radioButton3);
        button =(Button)findViewById(R.id.button);
        imageView = (ImageView)findViewById(R.id.imageView);


        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox.isChecked() ==true){
                    textView3.setVisibility(View.VISIBLE);
                    radioGroup.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.VISIBLE);
                }

                else{
                    textView3.setVisibility(View.INVISIBLE);
                    radioGroup.setVisibility(View.INVISIBLE);
                    button.setVisibility(View.INVISIBLE);
                    imageView.setVisibility(View.INVISIBLE);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.radioButton1:
                        imageView.setImageResource(R.drawable.dog);
                        break;
                    case R.id.radioButton2:
                        imageView.setImageResource(R.drawable.cat);
                        break;
                    case R.id.radioButton3:
                        imageView.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"Please choose animal",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}