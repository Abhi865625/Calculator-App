package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView title,text1,text2, result;
    EditText num1,num2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnPer;
    double x,y, final_result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.title);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        result = findViewById(R.id.result);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnPer = findViewById(R.id.btnPer);



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 x = Double.parseDouble(num1.getText().toString());
                 y = Double.parseDouble(num2.getText().toString());
                result.setText(""+add(x,y));
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = Double.parseDouble(num1.getText().toString());
                y = Double.parseDouble(num2.getText().toString());
                result.setText(""+sub(x,y));
            }
        });


        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = Double.parseDouble(num1.getText().toString());
                y = Double.parseDouble(num2.getText().toString());
                result.setText(""+mul(x,y));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    x = Double.parseDouble(num1.getText().toString());
                    y = Double.parseDouble(num2.getText().toString());

                    if (y == 0) {
                        result.setText("Cannot be divided by 0");
                    } else {
                        double divisionResult = div(x, y);
                        result.setText(String.valueOf(divisionResult));
                    }
                } catch (NumberFormatException e) {
                    result.setText("Error: Invalid input. Please enter valid numbers.");
                }
            }
        });

        btnPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    x = Double.parseDouble(num1.getText().toString());
                    y = Double.parseDouble(num2.getText().toString());

                    if (y == 0) {
                        result.setText("0");
                    } else {
                        double divisionResult = per(x, y);
                        result.setText(String.valueOf(divisionResult));
                    }
                } catch (NumberFormatException e) {
                    result.setText("Error: Invalid input. Please enter valid numbers.");
                }
            }
        });
    }
    public double add(double a, double b){
        final_result = a+b;
        return final_result;
    }
    public double sub(double a, double b){
        final_result = a-b;
        return final_result;
    }

    public double mul(double a, double b){
        final_result = a*b;
        return final_result;
    }
    public double div(double a, double b){
        final_result = a/b;
        return final_result;
    }

    public double per(double a, double b){
        final_result = a%b;
        return final_result;
    }

}