package com.example.indiaskitchen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Mealmenu_Activity extends AppCompatActivity {
    String[] mealitems={"Palak paneer","Paneer Buttur Masala"};
    int[] mealimages={R.drawable.palakpaneer,R.drawable.paneerbuttermasala};
    int[] mealrecepe={R.string.palak_paneer_recepe,R.string.pbm_recepe};
    ListView mealmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mealmenu);
        mealmenu=findViewById(R.id.meallist);
        OptionAdapter opad = new OptionAdapter(this,R.layout.foodoption,mealitems,mealimages);
        mealmenu.setAdapter(opad);
        mealmenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(Mealmenu_Activity.this,show_mealrecepe.class);
                intent.putExtra("mealrecepe",mealrecepe[position]);
                startActivity(intent);
            }
        });
    }
}