package com.example.demogestureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SwipeActivity extends AppCompatActivity {

    Button bt;
    MainActivity activity=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);
        bt=(Button)findViewById(R.id.bt_bck);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SwipeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}

