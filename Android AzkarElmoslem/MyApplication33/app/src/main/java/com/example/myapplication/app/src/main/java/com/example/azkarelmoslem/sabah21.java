package com.example.myapplication.app.src.main.java.com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.azkarelmoslem.sabah22;

public class sabah21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabah21);
        ImageButton Next21=findViewById(R.id.Next21);
        Next21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent sabah22=new Intent(getApplicationContext(), com.example.azkarelmoslem.sabah22.class);
                startActivity(sabah22);
                finish();
            }
        });
    }
}
