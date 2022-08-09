package com.example.advcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    TextView tv1,tv2,tv3;
    Button b1,b2,b3,b4,b5,b6,b7,b8, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        clear = findViewById(R.id.clear);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText("");
                tv3.setText("");
                Toast.makeText(MainActivity.this,"Cleared.",Toast.LENGTH_SHORT).show();
            }
        });

        //Even or Odd
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = et1.getText().toString();
                int num = Integer.parseInt(s);
                if ( num%2 == 0) {
                    tv3.setText("Even ✓.");
                } else {
                    tv3.setText("Odd ✓.");
                }
            }
        });

        //Square
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = et1.getText().toString();
                int num = Integer.parseInt(s);
                num = num*num;
                String square = String.valueOf(num);
                tv3.setText(square+".");
            }
        });

        //Factorial
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = et1.getText().toString();
                int num = Integer.parseInt(s);
                int fact = 1;
                for (int i = 1; i <= num; i++) {
                    fact = fact*i;
                }
                String factorial = String.valueOf(fact);
                tv3.setText(factorial+".");
            }
        });

        // Positive Or Negative
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = et1.getText().toString();
                int num = Integer.parseInt(s);
                if (num > 0) {
                    tv3.setText("Positive (+) ✓.");
                } else if (num < 0) {
                    tv3.setText("Negative (-) ✓.");
                } else {
                    tv3.setText("Zero (0) ✓.");
                }
            }
        });

        //Prime
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = et1.getText().toString();
                int num = Integer.parseInt(s);
                int a = 0, flag = 0;
                a = num / 2;
                if (num == 0 || num == 1) {
                    tv3.setText("Not Prime !");
                } else for (int i = 2; i <= a; i++) {
                    if (num % i == 0) {
                        tv3.setText("Not Prime !");
                        flag = 1;
                        break;
                    }
                }
                if(flag==0) {
                    tv3.setText("Prime ✓.");
                }
            }
        });

        //Cube
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = et1.getText().toString();
                int num = Integer.parseInt(s);
                num = num*num*num;
                String cube = String.valueOf(num);
                tv3.setText(cube+".");
            }
        });

        //Sum of Digits
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = et1.getText().toString();
                int num = Integer.parseInt(s);
                int digit, sum = 0;
                while (num > 0) {
                    digit = num % 10;
                    sum = sum + digit;
                    num = num / 10;
                }
                String sod = String.valueOf(sum);
                tv3.setText("Sum of digits is : " + sod +"." );
            }
        });

        //Square Root
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = et1.getText().toString();
                int num = Integer.parseInt(s);
                double r = Math.sqrt(num);
                String sqrt = String.valueOf(r);
                tv3.setText(sqrt+".");
            }
        });
    }
}