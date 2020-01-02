package com.example.makinemhendisligivikipedisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView676);
    }

    public void girisButon(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
    public void textView01(View view){
        textView.setText("Beyza TUZCU - 1621012040/n  Merve KAŞ - 1621012072 /n Rıdvan KABAK - 1621012019");
    }





}