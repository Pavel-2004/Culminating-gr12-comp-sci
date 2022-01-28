package com.example.roman;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.InputDevice;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    Button button;
    InputMethodManager imm;
    TextView text;
    EditText textTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonC = (Button)findViewById(R.id.C);
        Button buttonD = (Button)findViewById(R.id.D);
        Button buttonM = (Button)findViewById(R.id.M);
        Button buttonL = (Button)findViewById(R.id.L);
        Button buttonX = (Button)findViewById(R.id.X);
        Button buttonV = (Button)findViewById(R.id.V);
        Button buttonI = (Button)findViewById(R.id.V);
        Button buttonPlus = (Button)findViewById(R.id.plus);
        Button buttonMinus = (Button)findViewById(R.id.minus);

        Button clear = (Button)findViewById(R.id.clear);



        text = (TextView)findViewById(R.id.title_text);
        TextView answer = (TextView)findViewById(R.id.answer);
        Calculations addN = new Calculations("V+V");
        Log.i("answer", String.valueOf(addN.add("V+V+V")));


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("");
                answer.setText("0");

            }
        });




        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add C
                text.setText(String.valueOf(text.getText()) + "C");
                answer.setText(String.valueOf( addN.add(String.valueOf(text.getText()))));
            }
        });


        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add D
                text.setText(String.valueOf(text.getText()) + "D");
                answer.setText(String.valueOf( addN.add(String.valueOf(text.getText()))));
            }
        });


        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add M
                text.setText(String.valueOf(text.getText()) + "M");
                answer.setText(String.valueOf( addN.add(String.valueOf(text.getText()))));
            }
        });

        buttonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add L
                text.setText(String.valueOf(text.getText()) + "L");
                answer.setText(String.valueOf( addN.add(String.valueOf(text.getText()))));
            }
        });

        buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add X
                text.setText(String.valueOf(text.getText()) + "X");
                answer.setText(String.valueOf( addN.add(String.valueOf(text.getText()))));
            }
        });

        buttonV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add V

                text.setText(String.valueOf(text.getText()) + "V");
                answer.setText(String.valueOf( addN.add(String.valueOf(text.getText()))));
            }
        });

        buttonI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(String.valueOf(text.getText()) + "I");
                answer.setText(String.valueOf( addN.add(String.valueOf(text.getText()))));
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add plus
                text.setText(String.valueOf(text.getText()) + "+");
                answer.setText(String.valueOf( addN.add(String.valueOf(text.getText()))));
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add minus
                text.setText(String.valueOf(text.getText()) + "-");
                answer.setText(String.valueOf( addN.add(String.valueOf(text.getText()))));
            }
        });
        /*



        button = (Button)findViewById(R.id.start_button);

         */

        //textTwo = (EditText) findViewById(R.id.name);

        /*
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculations test = new Calculations(String.valueOf(textTwo.getText()));

                text.setText(String.valueOf(test.stringToInt(String.valueOf(textTwo.getText()))));
                imm = (InputMethodManager)getSystemService(Activity.INPUT_METHOD_SERVICE);
                imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
            }
        });


         */


    }

}