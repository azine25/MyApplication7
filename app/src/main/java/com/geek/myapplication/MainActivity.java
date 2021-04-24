package com.geek.myapplication;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;
    private EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.tv_next);
        editText = findViewById(R.id.email);
        editText2  = findViewById(R.id.tv_password);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!editText.getText().toString().equals("") && !editText2.getText().toString().equals("")){
                    button.setBackground(getResources().getDrawable(R.drawable.btn2));
                    button.setTextColor(getResources().getColor(R.color.white));

                }
            }
        });
        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!editText.getText().toString().equals("") && !editText2.getText().toString().equals("")){
                    button.setBackground(getResources().getDrawable(R.drawable.btn2));
                    button.setTextColor(getResources().getColor(R.color.white));
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this , "Please enter email",Toast .LENGTH_LONG).show();
                }if (editText2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this , "Please enter password",Toast .LENGTH_LONG).show();
                }else {
                    Intent intent = new Intent(MainActivity.this , MainActivity2.class);
                    startActivity(intent);
                }

            }
        });
    }
}