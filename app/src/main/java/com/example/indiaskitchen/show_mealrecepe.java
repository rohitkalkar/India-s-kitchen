package com.example.indiaskitchen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class show_mealrecepe extends AppCompatActivity {
    TextView mealrecepe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_mealrecepe);

        mealrecepe=findViewById(R.id.textView3);
        Bundle rbundle= getIntent().getExtras();
        mealrecepe.setText(rbundle.getInt("mealrecepe"));
    }
}