package com.example.myapplication.app.src.main.java.com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.azkarelmoslem.sabah_5;

public class sabah_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabah_4);
        ImageButton Next5=findViewById(R.id.Next3);
        Next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Sabah5=new Intent(getApplicationContext(), sabah_5.class);
                startActivity(Sabah5);
                finish();
            }
        });
    }
}
