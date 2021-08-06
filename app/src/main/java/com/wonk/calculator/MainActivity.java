package com.wonk.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    public EditText number1Text;
    EditText number2Text;
    TextView resultText;

    int result = 0;
    public EditText manuelResultEditText;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text = findViewById(R.id.number1Text);
        resultText = findViewById(R.id.resultText);
        manuelResultEditText = findViewById(R.id.manuelResultEditText);


    }


    public void sum(View view) {
        if (number1Text.getText().toString().matches(""))
            resultText.setText("Enter Number!");
        else {


            if (manuelResultEditText.getText().toString().isEmpty()) {
                int number1 = Integer.parseInt(number1Text.getText().toString());

                result = number1 + result;


                resultText.setText("Result:" + result);


            } else {
                int manuelResultValue = Integer.parseInt(manuelResultEditText.getText().toString());

                result = manuelResultValue;

                resultText.setText("Result: " + result);

            }
        }
    }


    public void deduct(View view) {
        if (number1Text.getText().toString().matches(""))
            resultText.setText("Enter Number!");
        else {

            if (manuelResultEditText.getText().toString().isEmpty()) {
                int number1 = Integer.parseInt(number1Text.getText().toString());

                result = result - number1;

                resultText.setText("Result:" + result);

            } else {
                int manuelResultValue = Integer.parseInt(manuelResultEditText.getText().toString());

                result = manuelResultValue;

                resultText.setText("Result: " + result);


            }
        }
    }

    public void multiply(View view) {

        if (number1Text.getText().toString().matches(""))
            resultText.setText("Enter number");

        else {
            if (manuelResultEditText.getText().toString().isEmpty()) {
                int number1 = Integer.parseInt(number1Text.getText().toString());

                result = number1 * result;

                resultText.setText("Result:" + result);

            } else {
                int manuelResultValue = Integer.parseInt(manuelResultEditText.getText().toString());

                result = manuelResultValue;

                resultText.setText("Result: " + result);
                // mcmc
            }
        }
    }


    public void divide(View view) {


        if (number1Text.getText().toString().matches(""))

            resultText.setText("Enter Number!");

        else {
            if (manuelResultEditText.getText().toString().isEmpty()) {
                int number1 = Integer.parseInt(number1Text.getText().toString());


                result = result / number1;

                resultText.setText("Result: " + result);

            } else {
                int manuelResultValue = Integer.parseInt(manuelResultEditText.getText().toString());

                result = manuelResultValue;

                resultText.setText("Result: " + result);
            }

        }
    }


    public void result1(View view) {

        if (manuelResultEditText.getText().toString().matches(""))

            resultText.setText("Enter Number!");

        else {
            int manuelResultValue = Integer.parseInt(manuelResultEditText.getText().toString());

            result = manuelResultValue;

            resultText.setText("Result: " + result);


        }
    }
}




