package com.example.makinemhendisligivikipedisi.Dersler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.makinemhendisligivikipedisi.R;

public class BasitDevrelerActivity extends AppCompatActivity {
    Button hesapButton;
    EditText akimText;
    EditText direncText;
    TextView sonucVolt;
    EditText volt2Text;
    EditText direnc2Text;
    TextView sonucAkim;

    float cozumVolt;
    float cozumAkim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basit_devreler);
        hesapButton = findViewById(R.id.hesapButton);
        akimText = findViewById(R.id.akimText);
        direncText = findViewById(R.id.direncText);
        sonucVolt = findViewById(R.id.sonucVolt);
        volt2Text = findViewById(R.id.volt2Text);
        direnc2Text = findViewById(R.id.direnc2Text);
        sonucAkim = findViewById(R.id.sonucAkim);

    }
    public void hesapVolt(View view){

        int ı = Integer.valueOf(akimText.getText().toString());
        int r = Integer.valueOf(direncText.getText().toString());

        cozumVolt = ı*r;
        sonucVolt.setText(String.valueOf(cozumVolt));
    }
    public void hesapAkim(View view){

        int v2 = Integer.valueOf(volt2Text.getText().toString());
        int r2 = Integer.valueOf(direnc2Text.getText().toString());

        cozumAkim = v2 / r2;
        sonucAkim.setText(String.valueOf(cozumAkim));
    }
}
