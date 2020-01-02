package com.example.makinemhendisligivikipedisi.Dersler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.makinemhendisligivikipedisi.R;

public class IntegralActivity extends AppCompatActivity {
    public static final double INCREMENT = 1E-4;
    EditText editTextMin,editTextMax,editTextDenklem;
    Button buttonHesapla;
    TextView textViewIn;
    Fonksiyon fonksiyon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integral);

        editTextMin = findViewById(R.id.editTextMin);
        editTextMax = findViewById(R.id.editTextMax);
        editTextDenklem= findViewById(R.id.editTextDenklem);
        buttonHesapla = findViewById(R.id.buttonHesaplaIn);
        textViewIn = findViewById(R.id.textViewSonucin);

        buttonHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double min = Double.valueOf(editTextMin.getText().toString());
                double max = Double.valueOf(editTextMax.getText().toString());
                String ayrim = editTextDenklem.getText().toString();
                System.out.println(ayrim);
                String []dizi=new String[2];

                if(ayrim.contains("^")){
                    int once = ayrim.indexOf("^")-1;
                    dizi[0]=ayrim.substring(0,once);
                    System.out.println(dizi[0]);
                    int sonra=ayrim.indexOf("^")+1;
                    dizi[1]=ayrim.substring(sonra);
                    System.out.println(dizi[1]);
                }else{
                    return ;
                }

               // final double y = Double.valueOf(dizi[0]);
               // final double power = Double.valueOf(dizi[1]);
               // double kare = Math.pow(y, power);



                textViewIn.setText(String.valueOf(integrall(min, max, new Fonksiyon() {
                    @Override
                    public double f(double x) {
                        return Math.pow(x,2);
                    }
                })));
            }
        });





    }
    public static double integrall (double a,double b,Fonksiyon fonksiyon) {
        double area = 0;
        double modifier = 1;
        if(a > b) {
            double tempA = a;
            a = b;
            b = tempA;
            modifier = -1;
        }
        for(double i = a + INCREMENT; i < b; i += INCREMENT) {
            double dFromA = i - a;
            area += (INCREMENT / 2) * (fonksiyon.f(a + dFromA) + fonksiyon.f(a + dFromA - INCREMENT));
        }
        return (Math.round(area * 1000.0) / 1000.0) * modifier;

    }
}
