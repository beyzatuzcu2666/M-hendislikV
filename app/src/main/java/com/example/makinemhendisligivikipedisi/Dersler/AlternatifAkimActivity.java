package com.example.makinemhendisligivikipedisi.Dersler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.makinemhendisligivikipedisi.R;

public class AlternatifAkimActivity extends AppCompatActivity {

    EditText frekansText;
    TextView sonucTText;
    Button hesapTButton;
    EditText periyot2Text;
    TextView sonucFText;
    Button hesapFButton;


    float cozumT;
    float cozumF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alternatif_akim);

        frekansText = findViewById(R.id.frekansText);
        sonucTText = findViewById(R.id.sonucTText);
        hesapTButton = findViewById(R.id.hesapTButton);
        periyot2Text =findViewById(R.id.periyot2Text);
        sonucFText = findViewById(R.id.sonucFText);
        hesapFButton = findViewById(R.id.hesapFButton);
    }
    public void periyothesap(View view){

        float f = Float.parseFloat(frekansText.getText().toString());
        cozumT = (float) 1 / f;

        sonucTText.setText(String.valueOf(cozumT));
    }
    public void frekanshesap(View view){

        float T = Float.parseFloat(periyot2Text.getText().toString());
        cozumF = (float) 1 / T;

        sonucFText.setText(String.valueOf(cozumF));
    }

}
