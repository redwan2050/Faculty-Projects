package com.example.myapplication.app.src.main.java.com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.azkarelmoslem.sabah24;

public class sabah23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabah23);
        ImageButton Next23=findViewById(R.id.Next23);
        Next23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent sabah24=new Intent(getApplicationContext(), com.example.azkarelmoslem.sabah24.class);
                startActivity(sabah24);
                finish();
            }
        });
    }
}
