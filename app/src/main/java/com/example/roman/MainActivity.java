package com.example.roman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    //to see how this works as it is almost identical see MainActivity2.java
    Button button;
    InputMethodManager imm;
    TextView text;
    EditText textTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonC = (Button)findViewById(R.id.one);
        Button buttonD = (Button)findViewById(R.id.two);
        Button buttonM = (Button)findViewById(R.id.three);
        Button buttonL = (Button)findViewById(R.id.six);
        Button buttonX = (Button)findViewById(R.id.five);
        Button buttonV = (Button)findViewById(R.id.four);
        Button buttonI = (Button)findViewById(R.id.nine);
        Button buttonPlus = (Button)findViewById(R.id.seven);
        Button buttonMinus = (Button)findViewById(R.id.eight);
        Button activityTwo = (Button)findViewById(R.id.activityTwo);

        Button clear = (Button)findViewById(R.id.clear);



        text = (TextView)findViewById(R.id.title_text);
        TextView answer = (TextView)findViewById(R.id.answer);
        Calculations addN = new Calculations("V+V");
        Log.i("answer", String.valueOf(addN.add("V+V+V")));

        activityTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });


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