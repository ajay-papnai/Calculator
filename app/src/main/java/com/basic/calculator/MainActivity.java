package com.basic.calculator;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import com.basic.calculator.databinding.ActivityMainBinding;
import com.ezylang.evalex.EvaluationException;
import com.ezylang.evalex.Expression;
import com.ezylang.evalex.data.EvaluationValue;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private DecimalFormat decimalFormat = new DecimalFormat("#.##############");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        activityMainBinding = DataBindingUtil.setContentView(this , R.layout.activity_main);

        //button 1
        activityMainBinding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputText.setText(activityMainBinding.inputText.getText().toString()+"1");
            }
        });

        // 2
        activityMainBinding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputText.setText(activityMainBinding.inputText.getText().toString()+"2");
            }
        });

        //3
        activityMainBinding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputText.setText(activityMainBinding.inputText.getText().toString()+"3");
            }
        });

        //4
        activityMainBinding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputText.setText(activityMainBinding.inputText.getText().toString()+"4");
            }
        });

        //5
        activityMainBinding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputText.setText(activityMainBinding.inputText.getText().toString()+"5");
            }
        });

        //6
        activityMainBinding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputText.setText(activityMainBinding.inputText.getText().toString()+"6");
            }
        });

        //7
        activityMainBinding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputText.setText(activityMainBinding.inputText.getText().toString()+"7");
            }
        });

        //8
        activityMainBinding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputText.setText(activityMainBinding.inputText.getText().toString()+"8");
            }
        });

        //9
        activityMainBinding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputText.setText(activityMainBinding.inputText.getText().toString()+"9");
            }
        });

        //0
        activityMainBinding.button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputText.setText(activityMainBinding.inputText.getText().toString()+"0");
            }
        });

        //.
        activityMainBinding.buttonDOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputText.setText(activityMainBinding.inputText.getText().toString()+".");
            }
        });

        //00
        activityMainBinding.button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputText.setText(activityMainBinding.inputText.getText().toString()+"00");
            }
        });


        //+
        activityMainBinding.buttonADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputText.setText(activityMainBinding.inputText.getText().toString()+"+");

            }
        });

        //-
        activityMainBinding.buttonMINUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputText.setText(activityMainBinding.inputText.getText().toString()+"-");

            }
        });

        //*
        activityMainBinding.buttonMULTI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputText.setText(activityMainBinding.inputText.getText().toString()+"*");

            }
        });

        // /
        activityMainBinding.buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputText.setText(activityMainBinding.inputText.getText().toString()+"/");

            }
        });

        // (
        activityMainBinding.buttonOPEN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputText.setText(activityMainBinding.inputText.getText().toString()+"(");

            }
        });


        // )
        activityMainBinding.buttonCLOSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputText.setText(activityMainBinding.inputText.getText().toString()+")");

            }
        });

        // ac
        activityMainBinding.buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.inputText.setText("");
                activityMainBinding.secondText.setText("");

            }
        });



        // =
        activityMainBinding.buttonEQUAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = activityMainBinding.inputText.getText().toString();
                if (input != null && !input.isEmpty()) {
                    try {
                        // Create an Expression object from the input
                        Expression expression = new Expression(input);
                        // Evaluate the expression and catch EvaluationException
                        EvaluationValue result = expression.evaluate();

                        if (result != null) {
                            // Get the numeric value as a double
                            double numberValue = result.getNumberValue().doubleValue();

                            // Format the number to avoid scientific notation
                            String resultString;
                            if (numberValue == (long) numberValue) {
                                // If the number is an integer, format it without decimal points
                                resultString = String.format("%d", (long) numberValue);
                            } else {
                                // Otherwise, format it as a floating-point number
                                resultString = String.format("%s", numberValue);
                            }

                            // Update the TextViews
                            activityMainBinding.secondText.setText(input);
                            activityMainBinding.inputText.setText(resultString);
                        } else {
                            activityMainBinding.inputText.setText("Error");
                        }
                    } catch (EvaluationException e) {
                        // Handle the exception and show an error message
                        activityMainBinding.inputText.setText("Error");
                        e.printStackTrace(); // Optional: for debugging purposes
                    } catch (Exception e) {
                        // Handle any other exceptions that might occur
                        activityMainBinding.inputText.setText("Error");
                        e.printStackTrace(); // Optional: for debugging purposes
                    }
                } else {
                    activityMainBinding.inputText.setText("Error");
                }
            }
        });








    }

}