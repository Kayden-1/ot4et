package com.example.praktika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.CountDownTimer;
import android.text.TextWatcher;
import android.text.Editable;

public class pin extends AppCompatActivity {
    private TextView mTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);
        mTimer = (TextView) findViewById(R.id.text1);
        new CountDownTimer(60000, 1000){
            public void onTick (long millisUntilFinished){
                mTimer.setText("Отправить код повторно можно будет через " + millisUntilFinished/1000 + " секунд");
            }
            public void onFinish(){
            }
        }
                .start();
        EditText e1 = findViewById(R.id.n1);
        EditText e2 = findViewById(R.id.n2);
        EditText e3 = findViewById(R.id.n3);
        EditText e4 = findViewById(R.id.n4);
        Button butt = findViewById(R.id.but1);
        e4.addTextChangedListener(new TextWatcher() { /* обработчик, который проверяет EditText(e4(Четвертое
        поле ввода пин-кода)) до/во время/после ввода текста(TextWatcher)
            */
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable arg0) {
                String z1 = e1.getText().toString(); // значение 1-ого EditText, которое вводит пользователь
                String z2 = e2.getText().toString(); // значение 2-ого EditText, которое вводит пользователь
                String z3 = e3.getText().toString(); // значение 3-ого EditText, которое вводит пользователь
                String z4 = e4.getText().toString(); // значение 4-ого EditText, которое вводит пользователь
                if (!z1.isEmpty() & !z2.isEmpty() & !z3.isEmpty() & !z4.isEmpty())  { /* Если все четыре
                значения НЕ Пустые, то кнока становится включенной(изначально она выключена)
                */
                    butt.setEnabled(true);
                }

            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
        });
    }


    public void onClick(View v) {
        Intent intent1 = new Intent(this, email.class);
        startActivity(intent1);
    }

    public void onClick1(View v) {
        Intent intent = new Intent(this, password.class);
        startActivity(intent);
   }


}