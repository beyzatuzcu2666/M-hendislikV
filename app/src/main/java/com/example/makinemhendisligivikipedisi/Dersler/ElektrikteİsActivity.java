package com.example.makinemhendisligivikipedisi.Dersler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.makinemhendisligivikipedisi.R;

public class ElektrikteİsActivity extends AppCompatActivity {
    EditText zamanText;
    EditText gücText;

    TextView sonucText;
    int sonuc1=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elektrikte_is);
        zamanText=findViewById(R.id.zamanText);
        gücText=findViewById(R.id.gücText);
        sonucText=findViewById(R.id.sonucText);

    }

    public void hesaplaButton(View view) {

        int z = Integer.valueOf(zamanText.getText().toString());
        int g = Integer.valueOf(gücText.getText().toString());

        sonuc1 = z * g;
        sonucText.setText(String.valueOf(sonuc1));
    }


}
