package com.example.makinemhendisligivikipedisi.Dersler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.makinemhendisligivikipedisi.R;

import java.util.StringTokenizer;

import io.github.kexanie.library.MathView;

public class TurevActivity extends AppCompatActivity {
    EditText editTextGirdi;
    Button buttonHesaplax;
    MathView mathView;
    String output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turev);

        editTextGirdi = findViewById(R.id.editTextGirdi);
        buttonHesaplax = findViewById(R.id.buttonHesaplax);
        mathView = findViewById(R.id.mathView);

        buttonHesaplax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                String girdi = editTextGirdi.getText().toString();
                StringTokenizer st = new StringTokenizer(girdi);

                boolean firstToken = true;
                output = "";

                System.out.println("while girmeden önce");
                while(st.hasMoreTokens()) {
                    System.out.println("while içinde");
                    boolean isPositive;
                    int power;
                    int coefficient;
                    String input = st.nextToken();
                    int endOfCoefficient = 0;
                    if(firstToken) {
                        if(input.charAt(0)=='-') {
                            isPositive=false;
                        }
                        else {
                            isPositive=true;
                        }
                    }else {
                        if(input.charAt(0)=='+') {
                            isPositive=true;
                            System.out.println("pozitif");
                        }
                        else {
                            isPositive=false;
                        }
                    }
                    for(int i = ((isPositive && firstToken) ? (0):(1)); i < input.length(); i++) {
                        if(input.charAt(i)>'9' || input.charAt(i)<'0') {
                            endOfCoefficient = i - 1;
                            System.out.println("parçalama");
                            break;
                        }
                    }
                    if(endOfCoefficient != -1) {
                        System.out.println("-1 olmadığında");
                        System.out.println(endOfCoefficient);
                        coefficient = Integer.parseInt(input.substring(((isPositive && firstToken) ? (0):(1)),endOfCoefficient + 1));
                        power = Integer.parseInt(input.substring(endOfCoefficient + 3));
                    }
                    else {
                        coefficient = 1;
                        power = Integer.parseInt(input.substring(endOfCoefficient + 3));
                    }

                    if(firstToken)
                        firstToken = false;
                    output+= differentiateTerm(coefficient,power,isPositive);
                }
                onResume();

            }catch(Exception e) {
                System.out.println("IO: General");
            }
            }
        });


    }

    private String differentiateTerm(int coefficient, int power, boolean isPositive) {
        return (((isPositive && power > 0) ? ("+") : (power < 0 && !isPositive) ? ("+") : ("-")) + ((coefficient * power < 0) ?
                (coefficient * power * -1) : (coefficient * power)) + "x^" + (power - 1) + " ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        mathView.setText("\\("+output+"\\)");
        
    }
}
