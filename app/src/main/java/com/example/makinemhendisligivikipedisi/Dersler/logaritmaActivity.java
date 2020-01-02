package com.example.makinemhendisligivikipedisi.Dersler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.makinemhendisligivikipedisi.R;

public class logaritmaActivity extends AppCompatActivity {
    EditText xBir;
    EditText xİki;
    EditText yBir;
    EditText yİki;

    TextView sonucBir;
    TextView sonucİki;

    int sonuc1;
    int sonuc2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logaritma);

        xBir=findViewById(R.id.xBir);
        xİki=findViewById(R.id.xİki);

        yBir=findViewById(R.id.yBir);

        yİki=findViewById(R.id.yİki);
        sonucBir=findViewById(R.id.sonucBir);

        sonucİki=findViewById(R.id.sonucİki);


    }

    public void hesaplaButton(View view){
        int x=Integer.valueOf(xBir.getText().toString());
        int xi=Integer.valueOf(xİki.getText().toString());
        int y=Integer.valueOf(yBir.getText().toString());
        int yi=Integer.valueOf(yİki.getText().toString());


        sonuc1=x*y;
        sonucBir.setText(String.valueOf(sonuc1));


        sonuc2=xi/yi;
        sonucİki.setText(String.valueOf(sonuc2));


    }
}
