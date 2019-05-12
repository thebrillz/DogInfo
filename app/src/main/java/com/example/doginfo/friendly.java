package com.example.doginfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class friendly extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendly);

        Button golden=(Button)findViewById(R.id.golden);

        golden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start=new Intent(getApplicationContext(), goldenret.class);
                startActivity(start);
            }
        });

        Button beagles=(Button)findViewById(R.id.beagle);

        beagles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start2=new Intent(getApplicationContext(), beagle.class);
                startActivity(start2);
            }
        });

        Button lab=(Button)findViewById(R.id.lab);

        lab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start2=new Intent(getApplicationContext(), labrador.class);
                startActivity(start2);
            }
        });

        Button pug=(Button)findViewById(R.id.pug);

        pug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start2=new Intent(getApplicationContext(), Pug.class);
                startActivity(start2);
            }
        });

        Button bulldog=(Button)findViewById(R.id.bulldog);

        bulldog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start2=new Intent(getApplicationContext(), bull.class);
                startActivity(start2);
            }
        });

    }
}
