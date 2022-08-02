package com.example.indiaskitchen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class OptionAdapter extends ArrayAdapter<String> {

    // when we call adapter the array values from MainAcyivity stored in this.
    String[] optn;
    int[] img;
    Context mcontext;

    public OptionAdapter(Context context, int foodoption, String[] option, int[] foodimages) {
        super(context,R.layout.foodoption);
        this.optn=option;
        this.img=foodimages;
        this.mcontext=context;
    }




    // following is youtuber method
    // this method get names according to position from String array.
    @Override
    public int getCount() {
        //it returns array optn length
        return optn.length;
    }

  /*  @Nullable
    @Override
    public String getItem(int position) {

        return optn[position];
    }*/

  // following is youtuber method
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        /*here we inflate the layout which we made specialy and we can now access variable from
        our layout like imgview, textview with the help of convetview.*/
        ViewHolder vh = new ViewHolder();//this is not so necessory unless you have long list
        if (convertView==null){
        LayoutInflater mInflater=(LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=mInflater.inflate(R.layout.foodoption,parent,false);
        // now we import some views from our self made layout called foodoption.xml.
       vh.imgs=(ImageView) convertView.findViewById(R.id.imageView);
        vh.t = (TextView) convertView.findViewById(R.id.textView);
        vh.imgs.setImageResource(img[position]);
        vh.t.setText(optn[position]);
        }
        //it returns convertview.
        return convertView;
    }
    static class ViewHolder{
     ImageView imgs ;
     TextView t ;


    }
}
