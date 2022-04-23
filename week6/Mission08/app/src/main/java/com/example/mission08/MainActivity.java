package com.example.mission08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().equals("") || editText2.getText().toString().equals("")){
                    Toast toast =  Toast.makeText(getApplicationContext(),"아이디와 비밀번호를 입력해주세요",Toast.LENGTH_SHORT);
                    toast.show();
                }

                else{
                    Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
                    intent.putExtra("id",editText.getText().toString());
                    intent.putExtra("password",editText2.getText().toString());
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}