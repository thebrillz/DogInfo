package com.example.doginfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class goldenret extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goldenret);

        Button golden=(Button)findViewById(R.id.image);

        golden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dog= "http://www.vetstreet.com/dogs/golden-retriever#1_tt6xo5v9";
                Uri webaddress=Uri.parse(dog);
                Intent getgoogle=new Intent(Intent.ACTION_VIEW, webaddress);
                if(getgoogle.resolveActivity(getPackageManager())!=null)
                    startActivity(getgoogle);
            }
        });


    }
}
