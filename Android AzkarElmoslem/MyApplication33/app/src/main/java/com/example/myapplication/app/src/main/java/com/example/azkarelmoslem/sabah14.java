package com.example.myapplication.app.src.main.java.com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.azkarelmoslem.sabah15;

public class sabah14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabah14);
        ImageButton Next14=findViewById(R.id.Next14);
        Next14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent sabah15=new Intent(getApplicationContext(), com.example.azkarelmoslem.sabah15.class);
                startActivity(sabah15);
                finish();
            }
        });
    }
}
