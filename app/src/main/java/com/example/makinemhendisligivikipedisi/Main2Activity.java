package com.example.makinemhendisligivikipedisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.makinemhendisligivikipedisi.Dersler.ElektronikActivity;
import com.example.makinemhendisligivikipedisi.Dersler.FizikActivity;
import com.example.makinemhendisligivikipedisi.Dersler.MatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button fizikButon=findViewById(R.id.fizikButon);
        Button elektronik = findViewById(R.id.elektronikButon);
        Button matButon = findViewById(R.id.matButon);
    }

    public void fizikTikla(View view) {
        Intent intent = new Intent(Main2Activity.this, FizikActivity.class);
        startActivity(intent);
    }

    public void matTikla(View view) {
        Intent intent = new Intent(Main2Activity.this, MatActivity.class);
        startActivity(intent);
    }




    public void elektronikTikla(View view) {
        Intent intent = new Intent(Main2Activity.this, ElektronikActivity.class);
        startActivity(intent);
    }

}
