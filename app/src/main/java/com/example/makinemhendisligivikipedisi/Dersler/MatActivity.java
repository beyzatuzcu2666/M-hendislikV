package com.example.makinemhendisligivikipedisi.Dersler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.makinemhendisligivikipedisi.R;

import java.util.ArrayList;

public class MatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematik);


        ListView listView =findViewById(R.id.matematikList);



        final ArrayList<String> konu  = new ArrayList<>();
        konu.add("Fonksiyonlar");
        konu.add("Faktöriyel");
        konu.add("İntegral");
        konu.add("Türev");
        konu.add("Logaritma");


        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,konu);
        //simple list ben sadece metin göstereceğim demek
        //listView

        listView.setAdapter((arrayAdapter));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent intent=new Intent(MatActivity.this,fonksiyonlarActivity.class);
                    startActivity(intent);
                }

                if(position == 1){
                    Intent intent = new Intent(MatActivity.this,FaktoriyelActivity.class);
                    startActivity(intent);
                }
                if(position==2){
                    startActivity(new Intent(getApplicationContext(),IntegralActivity.class));
                }
                if(position==3){
                    startActivity(new Intent(getApplicationContext(),TurevActivity.class));
                }
                if(position == 4){
                    Intent intent = new Intent(MatActivity.this,logaritmaActivity.class);
                    startActivity(intent);
                }




            }
        });
    }

}
