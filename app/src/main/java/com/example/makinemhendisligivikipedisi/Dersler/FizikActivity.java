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

public class FizikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fizik);


        ListView listView =findViewById(R.id.fizikList);



        final ArrayList<String> konular  = new ArrayList<>();
        konular.add("Fizik ve Ölçme");
        konular.add("Dairesel Hareket");
        konular.add("Doğrusal Momentum Çarpışmalar");
        konular.add("Madde ve Özellikleri");
        konular.add("Bir Boyutta Hareket");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,konular);
        //simple list ben sadece metin göstereceğim demek


        //listView

        listView.setAdapter((arrayAdapter));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(FizikActivity.this, fizikOlcmeAcitivity.class);
                    startActivity(intent);

                }
                if (position == 1) {
                    Intent intent1 = new Intent(FizikActivity.this, daireselHareket.class);
                    startActivity(intent1);

                }
                if (position == 2) {
                    Intent intent1 = new Intent(FizikActivity.this, dogrusalMomentum.class);
                    startActivity(intent1);
                }
                if (position == 3) {
                    Intent intent1 = new Intent(FizikActivity.this, ozkutleActivity.class);
                    startActivity(intent1);
                }


                if (position == 4) {
                    Intent intent1 = new Intent(FizikActivity.this, boyuttaHareket.class);
                    startActivity(intent1);
                }

            }

        });

         }
}

