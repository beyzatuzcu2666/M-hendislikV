package com.example.makinemhendisligivikipedisi.Dersler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.makinemhendisligivikipedisi.R;

public class boyuttaHareket extends AppCompatActivity {

    EditText süratText;
    EditText hızText;
    EditText zamanText;
    EditText süreText;
    TextView sonucBir;
    TextView sonucİki;

    float çözüm1;
    float çözüm2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boyutta_hareket);
        süratText=findViewById(R.id.süratText);
        hızText=findViewById(R.id.hızText);
        zamanText=findViewById(R.id.zamanText);
        süreText=findViewById(R.id.süreText);
        sonucBir=findViewById(R.id.sonucBir);
        sonucİki=findViewById(R.id.sonucİki);


    }

    public void hesaplaBir(View view){
        int a = Integer.valueOf(süratText.getText().toString());
        int z= Integer.valueOf((zamanText.getText().toString()));
        çözüm1=a/z;
        sonucBir.setText(String.valueOf(çözüm1));




    }

    public void hesaplaİki(View view){
        int y = Integer.valueOf(hızText.getText().toString());
        int s= Integer.valueOf((süreText.getText().toString()));
        çözüm2=y/s;
        sonucİki.setText(String.valueOf(çözüm2));


    }
}
