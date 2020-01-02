package com.example.makinemhendisligivikipedisi.Dersler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.makinemhendisligivikipedisi.R;

public class fonksiyonlarActivity extends AppCompatActivity {

    EditText aText;
    EditText bText;
    EditText cText;
    TextView sin;
    TextView cos;
    TextView tan;
    TextView cot;
    double sonuc1=0;
    double sonuc2=0;
    double sonuc3=0;
    double sonuc4=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fonksiyonlar);

        aText=findViewById(R.id.aText);
        bText=findViewById(R.id.bText);
        cText=findViewById(R.id.cText);
        sin=findViewById(R.id.sin);
        cos=findViewById(R.id.cos);
        cot=findViewById(R.id.cot);
        tan=findViewById(R.id.tan);



    }

    public void hesapla(View view){
        double a=Integer.valueOf(aText.getText().toString());
        double b=Integer.valueOf(bText.getText().toString());
        double c=Integer.valueOf(cText.getText().toString());

        sonuc1=b/c;
        sin.setText("sin  " + String.valueOf(sonuc1));

        sonuc2=a/c;
        cos.setText("cos  " + String.valueOf(sonuc2));

        sonuc3=b/a;
        tan.setText("tan  " +String.valueOf(sonuc3));

        sonuc4=a/c;
        cot.setText("cot  "+ String.valueOf(sonuc4));

    }
}
