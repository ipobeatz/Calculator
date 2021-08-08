package com.wonk.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    public EditText number1Text;
    TextView resultText;

    Double result = 0.0;
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
                Double number1 = Double.parseDouble(number1Text.getText().toString());
                result = number1 + result;
                result = Double.parseDouble(new DecimalFormat("##.###").format(result));

                resultText.setText("Result:" + result);
            } else {
                Double manuelResultValue = Double.parseDouble(manuelResultEditText.getText().toString());

                result = Double.valueOf(manuelResultValue);

                result = Double.parseDouble(new DecimalFormat("##.###").format(result));

                resultText.setText("Result: " + result);
            }
        }
    }

    public void deduct(View view) {
        if (number1Text.getText().toString().matches(""))
            resultText.setText("Enter Number!");
        else {

            if (manuelResultEditText.getText().toString().isEmpty()) {
                Double number1 = Double.parseDouble(number1Text.getText().toString());

                result = result - number1;

                result = round(result, 2);

                resultText.setText("Result:" + result);

            } else {
                Double manuelResultValue = Double.parseDouble(manuelResultEditText.getText().toString());

                result = Double.valueOf(manuelResultValue);

                result = round(result, 2);

                resultText.setText("Result: " + result);


            }
        }
    }

    public void multiply(View view) {

        if (number1Text.getText().toString().matches(""))
            resultText.setText("Enter number");

        else {
            if (manuelResultEditText.getText().toString().isEmpty()) {
                Double number1 = Double.parseDouble(number1Text.getText().toString());

                result = number1 * result;
                result = round(result, 2);

                resultText.setText("Result:" + result);

            } else {
                Double manuelResultValue = Double.parseDouble(manuelResultEditText.getText().toString());

                result = Double.valueOf(manuelResultValue);
                result = round(result, 2);

                resultText.setText("Result: " + result);
            }
        }
    }


    public void divide(View view) {
        if (number1Text.getText().toString().matches(""))

            resultText.setText("Enter Number!");

        else {
            if (manuelResultEditText.getText().toString().isEmpty()) {
                Double number1 = Double.parseDouble(number1Text.getText().toString());
                result = result / number1;
                result = Double.parseDouble(new DecimalFormat("##.###").format(result));

                resultText.setText("Result: " + result);

            } else {
                Double manuelResultValue = Double.parseDouble(manuelResultEditText.getText().toString());

                result = Double.valueOf(manuelResultValue);
                result = Double.parseDouble(new DecimalFormat("##.###").format(result));
                resultText.setText("Result: " + result);
            }

        }
    }
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}




