package com.example.myapplication.app.src.main.java.com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.azkarelmoslem.sabah11;

public class sabah10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabah10);
        ImageButton Next10=findViewById(R.id.Next10);
        Next10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent sabah11=new Intent(getApplicationContext(), com.example.azkarelmoslem.sabah11.class);
                startActivity(sabah11);
                finish();
            }
        });
    }
}
