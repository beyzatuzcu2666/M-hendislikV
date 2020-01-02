package com.example.makinemhendisligivikipedisi.Dersler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.makinemhendisligivikipedisi.R;

public class ElektrikEnerjisiActivity extends AppCompatActivity {

    EditText uzunlukText;
    EditText kesitText;
    EditText ozdirencText;


    TextView sonucBir;
    int sonuc1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elektrik_enerjisi);
        uzunlukText=findViewById(R.id.uzunlukText);
        kesitText=findViewById(R.id.kesitText);
        ozdirencText=findViewById(R.id.özdirencText);
        sonucBir=findViewById(R.id.sonucBir);

    }

    public void hesaplaButton(View view){
        int u=Integer.valueOf(uzunlukText.getText().toString());
        int k=Integer.valueOf(kesitText.getText().toString());
        int o=Integer.valueOf(ozdirencText.getText().toString());

        sonuc1=(u/k)*o;
        sonucBir.setText(String.valueOf(sonuc1));


    }
}
