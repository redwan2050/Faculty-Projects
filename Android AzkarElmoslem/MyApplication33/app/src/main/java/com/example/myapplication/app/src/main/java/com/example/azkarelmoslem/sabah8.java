package com.example.myapplication.app.src.main.java.com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.azkarelmoslem.sabah9;


public class sabah8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabah8);

        ImageButton Next8=findViewById(R.id.Next8);
        Next8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent sabah9=new Intent(getApplicationContext(), com.example.azkarelmoslem.sabah9.class);
                startActivity(sabah9);
                finish();
            }
        });
    }
}
