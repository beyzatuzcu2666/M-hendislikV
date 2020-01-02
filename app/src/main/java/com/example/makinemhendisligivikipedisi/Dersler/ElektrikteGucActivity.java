package com.example.makinemhendisligivikipedisi.Dersler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.makinemhendisligivikipedisi.R;

public class ElektrikteGucActivity extends AppCompatActivity {
    EditText gerilimText;
    EditText akımText;


    TextView sonucBir;
    int sonuc1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elektrikte_guc);
        gerilimText = findViewById(R.id.gerilimText);
        akımText = findViewById(R.id.akimText);
        sonucBir = findViewById(R.id.sonucBir);
    }

    public void hesaplaButton(View view) {

        int g = Integer.valueOf(gerilimText.getText().toString());
        int a = Integer.valueOf(akımText.getText().toString());

        sonuc1 = a * g;
        sonucBir.setText(String.valueOf(sonuc1));
    }
}