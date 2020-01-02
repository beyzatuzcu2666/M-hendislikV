package com.example.makinemhendisligivikipedisi.Dersler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.makinemhendisligivikipedisi.R;

public class fizikOlcmeAcitivity extends AppCompatActivity {


        EditText kütleText;
        EditText hacimText;
        TextView SonucText;
        Button hesaplaButton;
        int sonuc=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fizik_olcme);



            kütleText = findViewById(R.id.kütleText);
            hacimText = findViewById(R.id.hacimText);
            SonucText = findViewById(R.id.SonucText);
            hesaplaButton = findViewById(R.id.hesaplaButton);
        }

        public void yogunlukHesapla(View view){

            int kütle = Integer.valueOf(kütleText.getText().toString());
            int hacim = Integer.valueOf(hacimText.getText().toString());

            sonuc=kütle/hacim;
            SonucText.setText(String.valueOf(sonuc));
        }
    }



