package com.example.indiaskitchen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
      String[] option={"Indian snacks","Indian meals"};
     int[] foodimages={R.drawable.indiansnacks,R.drawable.indianmeals};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= findViewById(R.id.listview);
        OptionAdapter ad = new OptionAdapter(this,R.layout.foodoption,option,foodimages);
        listView.setAdapter(ad);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               switch (position){
                   case 0:
                       Toast.makeText(MainActivity.this, "Indian snacks", Toast.LENGTH_SHORT).show();
                       Intent intent = new Intent(MainActivity.this,FoodMenu_Activity.class);
                       startActivity(intent);
                       break;
                   case 1 :
                       Toast.makeText(MainActivity.this, "Indian meals", Toast.LENGTH_SHORT).show();
                       Intent intent1 = new Intent(MainActivity.this,Mealmenu_Activity.class);
                       startActivity(intent1);
                     break;
               }
            }
        });

    }
}