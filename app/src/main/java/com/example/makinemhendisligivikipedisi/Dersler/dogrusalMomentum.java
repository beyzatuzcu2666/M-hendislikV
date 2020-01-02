package com.example.makinemhendisligivikipedisi.Dersler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.makinemhendisligivikipedisi.R;


public class dogrusalMomentum extends AppCompatActivity {

    EditText mtext;
    EditText hızText;
    EditText yerVektörütext;
    EditText lineerMomentumText;

    float sonucbir;
    float sonuciki;



    TextView sonuc1;
    TextView sonuc2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogrusal_momentum);
        mtext = findViewById(R.id.mtext);
        hızText = findViewById(R.id.hızText);
        yerVektörütext = findViewById(R.id.yerVektörüText);
        lineerMomentumText = findViewById(R.id.lineerMomentumText);
        sonuc1=findViewById(R.id.sonucBirText);
        sonuc2=findViewById(R.id.sonucİkiText);



    }

    public void buttonBir(View view) {
        int m = Integer.valueOf(mtext.getText().toString());
        int v= Integer.valueOf((hızText.getText().toString()));
        sonucbir=m*v;
        sonuc1.setText(String.valueOf(sonucbir));



    }

    public void buttonİki(View view) {
        int y=Integer.valueOf(yerVektörütext.getText().toString());
        int l=Integer.valueOf(lineerMomentumText.getText().toString());

        sonuciki=y*l;
        sonuc2.setText(String.valueOf(sonuciki));


    }
}