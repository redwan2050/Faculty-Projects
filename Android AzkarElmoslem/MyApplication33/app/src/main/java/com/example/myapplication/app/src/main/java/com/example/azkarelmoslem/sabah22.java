package com.example.myapplication.app.src.main.java.com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.azkarelmoslem.sabah23;

public class sabah22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabah22);
        ImageButton Next22=findViewById(R.id.Next22);
        Next22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent sabah23=new Intent(getApplicationContext(), com.example.azkarelmoslem.sabah23.class);
                startActivity(sabah23);
                finish();
            }
        });
    }
}
