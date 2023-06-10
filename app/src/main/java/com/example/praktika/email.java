package com.example.praktika;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.text.Editable;
public class email extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        EditText edit = findViewById(R.id.editTextTextEmailAddress);
        Button butt = findViewById(R.id.button2);
        edit.addTextChangedListener(new TextWatcher() { /* обработчик, который проверяет EditText
            до/во время/после ввода текста(TextWatcher)
            */
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                butt.setEnabled(true); // если в поле был введен текст, то кнопка включается
            }
            @Override
            public void afterTextChanged(Editable s) {
                int l = edit.length(); // переменная l, которая хранит длину введенного текста(почты)
                if(l==0){ // если она равна 0(текст не введен), то кнока вновь отключается
                    butt.setEnabled(false);
                }
            }
        });
        }
    public void onClick(View v) {
        EditText edit1 = findViewById(R.id.editTextTextEmailAddress);
        String email = edit1.getText().toString(); /* запись значения EditText(почты) в переменную email
        после нажатия кнопки(После нажатия кнопки "Далее")
        */
        Intent intent = new Intent(this, pin.class);
        startActivity(intent);
    }
}






