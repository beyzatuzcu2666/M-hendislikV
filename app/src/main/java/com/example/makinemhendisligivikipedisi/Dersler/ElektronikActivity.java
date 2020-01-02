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

public class ElektronikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elektronik);

        ListView listView = findViewById(R.id.elektroniklist);

        ArrayList<String> konuelektronik =new ArrayList<>();
        konuelektronik.add("Basit Devreler");
        konuelektronik.add("Alternatif Akım");
        konuelektronik.add("Elektrik Enerjisi");
        konuelektronik.add("Elektrikte İş");
        konuelektronik.add("Elektrikte Güç");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,konuelektronik);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){

                    Intent intent= new Intent(ElektronikActivity.this,BasitDevrelerActivity.class);
                    startActivity(intent);
                }
                if(position == 1){

                    Intent intent = new Intent(ElektronikActivity.this,AlternatifAkimActivity.class);
                    startActivity(intent);
                }
                if(position == 2){

                    Intent intent = new Intent(ElektronikActivity.this,ElektrikEnerjisiActivity.class);
                    startActivity(intent);
                }
                if(position == 3){

                    Intent intent = new Intent(ElektronikActivity.this,ElektrikteİsActivity.class);
                    startActivity(intent);
                }
                if(position == 4){

                    Intent intent = new Intent(ElektronikActivity.this,ElektrikteGucActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}
