package com.example.doginfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class beagle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beagle);

        Button b=(Button)findViewById(R.id.image);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dog= "http://www.vetstreet.com/dogs/beagle#0_w4h5tw4x";
                Uri webaddress=Uri.parse(dog);
                Intent getgoogle=new Intent(Intent.ACTION_VIEW, webaddress);
                if(getgoogle.resolveActivity(getPackageManager())!=null)
                    startActivity(getgoogle);
            }
        });



    }
}
