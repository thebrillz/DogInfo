package com.example.doginfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pops extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pops);

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


        Button gsd=(Button)findViewById(R.id.gsd);

        gsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start2=new Intent(getApplicationContext(), german.class);
                startActivity(start2);
            }
        });

        Button poodle=(Button)findViewById(R.id.poodle);

        poodle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start2=new Intent(getApplicationContext(), poodle.class);
                startActivity(start2);
            }
        });


    }
}
