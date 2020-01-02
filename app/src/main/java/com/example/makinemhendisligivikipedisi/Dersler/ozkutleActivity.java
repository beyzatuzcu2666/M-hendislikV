package com.example.makinemhendisligivikipedisi.Dersler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.makinemhendisligivikipedisi.R;

public class ozkutleActivity extends AppCompatActivity {

    EditText kütleText;
    EditText agırlıkText;
    EditText hacimBirText;
    EditText hacimİkiText;
    TextView sonucbir;
    TextView sonuciki;

    float çözüm3;
    float çözüm4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ozkutle);
        kütleText=findViewById(R.id.kütleText);
        hacimBirText=findViewById(R.id.hacimBirText);
        hacimİkiText=findViewById(R.id.hacimİki);
        agırlıkText=findViewById(R.id.agırlıkText);

        sonucbir=findViewById(R.id.sonucbir);
        sonuciki=findViewById(R.id.sonuciki);

    }


    public void hesaplaBir(View view) {
        int a = Integer.valueOf(kütleText.getText().toString());
        int z = Integer.valueOf((hacimBirText.getText().toString()));
        çözüm3 = a/z;
        sonucbir.setText(String.valueOf(çözüm3));


    }

    public void hesaplaİki(View view) {
        int y = Integer.valueOf(agırlıkText.getText().toString());
        int s = Integer.valueOf((hacimİkiText.getText().toString()));
        çözüm4 = y / s;
        sonuciki.setText(String.valueOf(çözüm4));
    }
}