package com.example.makinemhendisligivikipedisi.Dersler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.makinemhendisligivikipedisi.R;

public class daireselHareket extends AppCompatActivity {

    EditText cizgiselPeriyotText;
    EditText acisalPeriyotText;
    EditText yaricapText;
    TextView sonucBirText;
    TextView sonucikiText;
    float sonuc1;
    float sonuc2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairesel_hareket);

        cizgiselPeriyotText = findViewById(R.id.cizgiselPeriyotText);
        acisalPeriyotText = findViewById(R.id.acisalPeriyotText);
        yaricapText = findViewById(R.id.yaricapText);
        sonucBirText = findViewById(R.id.sonucBirText);
        sonucikiText = findViewById(R.id.sonucikiText);

    }

    public void cizgiselHesapla(View view) {
        int periyot1 = Integer.valueOf(cizgiselPeriyotText.getText().toString());

        int yarıcap = Integer.valueOf(yaricapText.getText().toString());
        sonuc1 = (2 * yarıcap * 3) / periyot1;
        sonucBirText.setText(String.valueOf(sonuc1));


    }

    public void acısalHesapla(View view) {

        int periyot2 = Integer.valueOf(acisalPeriyotText.getText().toString());
        sonuc2 = (2 * 3) / periyot2;
        sonucikiText.setText(String.valueOf(sonuc2));


    }
}