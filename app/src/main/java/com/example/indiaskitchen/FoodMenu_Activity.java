package com.example.indiaskitchen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class FoodMenu_Activity extends AppCompatActivity {
ListView foodmenu;

String[] snackitems={"poha","upma","samosa"};
int[] snackimages={R.drawable.poharecipe,R.drawable.ravaupma,R.drawable.samosarecipe};
int[]recepe={R.string.poha_recepe,R.string.upma_recepe,R.string.samosa_recepe};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);

            foodmenu = findViewById(R.id.foodmenulist);
            OptionAdapter oad = new OptionAdapter(this, R.layout.foodoption, snackitems, snackimages);
            foodmenu.setAdapter(oad);
           foodmenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
               @Override
               public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent= new Intent(FoodMenu_Activity.this,show_recepe.class);
               intent.putExtra("recepe",recepe[position]);
               intent.putExtra("snackimages",snackimages[position]);
                startActivity(intent);


               }
           });









    }
}