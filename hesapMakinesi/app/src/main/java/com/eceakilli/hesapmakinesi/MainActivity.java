package com.eceakilli.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numbertext1;
    EditText numbertext2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         numbertext1=findViewById(R.id.numberText1);
         numbertext2=findViewById(R.id.numberText2);
         resultText=findViewById(R.id.resultText);

    }



    public void topla(View view){
        if (numbertext1.getText().toString().matches("")||numbertext2.getText().toString().matches("")){
            resultText.setText("Please enter number!");
        }
        else{
            int number1= Integer.parseInt(numbertext1.getText().toString());
            int number2=Integer.parseInt(numbertext2.getText().toString());

            int result=number1+number2;
            resultText.setText("Result:"+result);

        }


    }
    public void cikart(View view){
        int number1= Integer.parseInt(numbertext1.getText().toString());
        int number2=Integer.parseInt(numbertext2.getText().toString());

        int result=number1- number2;
        resultText.setText("Result:"+result);

    }
    public void carp(View view){
        int number1= Integer.parseInt(numbertext1.getText().toString());
        int number2=Integer.parseInt(numbertext2.getText().toString());

        int result=number1*number2;
        resultText.setText("Result:"+result);

    }
    public void bol(View view){
        int number1= Integer.parseInt(numbertext1.getText().toString());
        int number2=Integer.parseInt(numbertext2.getText().toString());

        int result=number1/number2;
        resultText.setText("Result:"+result);

    }
}