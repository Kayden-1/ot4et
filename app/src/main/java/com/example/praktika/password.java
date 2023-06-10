package com.example.praktika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.text.InputType;
import android.text.TextWatcher;
import android.text.Editable;

public class password extends AppCompatActivity {

    ImageView i1, i2, i3, i4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        i1 = (ImageView) findViewById(R.id.imageview_circle1);
        i2 = (ImageView) findViewById(R.id.imageview_circle2);
        i3 = (ImageView) findViewById(R.id.imageview_circle3);
        i4 = (ImageView) findViewById(R.id.imageview_circle4);


    }
    int t = 0;
    int j = 0;
    int g = 0;
    public void onClick1(View v) {
        if (t == 1) {
            i2.setImageResource(R.drawable.circle2);

            if(j==1){
                i3.setImageResource(R.drawable.circle2);
                if(g==1){
                    i4.setImageResource(R.drawable.circle2);
                }
                g=1;
            }
            j=1;
        }
        i1.setImageResource(R.drawable.circle2);
        t = 1;
    }}