package com.example.makinemhendisligivikipedisi.Dersler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.makinemhendisligivikipedisi.R;

import org.w3c.dom.Text;

public class FaktoriyelActivity extends AppCompatActivity {

    TextView faktText;
    EditText sayiText;
    TextView sonucText;
    Button hesapButton;
    int factoriyel = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faktoriyel);

        sayiText = findViewById(R.id.sayiText);
        faktText = findViewById(R.id.faktText);
        sonucText = findViewById(R.id.sonucText);
        hesapButton = findViewById(R.id.hesapButton);

    }
    public void hesapla(View view){

       int sayi = Integer.valueOf(sayiText.getText().toString());

       for(int i=1; i<=sayi; i++){
           factoriyel *= i;
       }
       sonucText.setText(String.valueOf(factoriyel));
       factoriyel=1;
    }
}
