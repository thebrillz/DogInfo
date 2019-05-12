package com.example.doginfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button friend=(Button)findViewById(R.id.friend);

        friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start=new Intent(getApplicationContext(), friendly.class);
                startActivity(start);
            }
        });

        Button popular=(Button)findViewById(R.id.popular);

        popular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start=new Intent(getApplicationContext(), pops.class);
                startActivity(start);
            }
        });

    }




}
