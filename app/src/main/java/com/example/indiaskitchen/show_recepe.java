package com.example.indiaskitchen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class show_recepe extends AppCompatActivity {
    TextView textView;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_recepe);
        textView=findViewById(R.id.textView2);
        imageView=findViewById(R.id.imageView2);
        Bundle mbundle=getIntent().getExtras();
        imageView.setImageResource(mbundle.getInt("snackimages"));
        textView.setText(mbundle.getInt("recepe"));
    }
}