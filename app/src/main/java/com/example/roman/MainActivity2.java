package com.example.roman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.text.method.ScrollingMovementMethod;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set the proper layout for this action
        setContentView(R.layout.activity_main2);


        //defines all the references to the buttons
        Button switchActiviy = (Button)findViewById(R.id.activityTwo);
        Button one = (Button)findViewById(R.id.one);
        Button two = (Button)findViewById(R.id.two);
        Button three = (Button)findViewById(R.id.three);
        Button four = (Button)findViewById(R.id.four);
        Button five = (Button)findViewById(R.id.five);
        Button six = (Button)findViewById(R.id.six);
        Button seven = (Button)findViewById(R.id.seven);
        Button eight = (Button)findViewById(R.id.eight);
        Button nine = (Button)findViewById(R.id.nine);
        Button zero = (Button)findViewById(R.id.zero);
        Button clear = (Button)findViewById(R.id.clear);

        //definition of all of the text areas
        TextView current = (TextView)findViewById(R.id.title_text);
        TextView answer = (TextView)findViewById(R.id.answer);


        //allows scrolling
        answer.setMovementMethod(new ScrollingMovementMethod());


        //creates an instance of the Calculations class where all of the calculations are done
        Calculations addN = new Calculations("");




        //all of these are event listeners for every click of a button
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this sets the text plus a button
                current.setText(String.valueOf(current.getText() + "1"));

                //calculaters integer to string method by using what is already in the textbox as an argument
                answer.setText(addN.IntToString(Integer.valueOf(String.valueOf(current.getText()))));
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current.setText(String.valueOf(current.getText() + "2"));
                answer.setText(addN.IntToString(Integer.valueOf(String.valueOf(current.getText()))));
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current.setText(String.valueOf(current.getText() + "3"));
                answer.setText(addN.IntToString(Integer.valueOf(String.valueOf(current.getText()))));
            }
        });


        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current.setText(String.valueOf(current.getText() + "4"));
                answer.setText(addN.IntToString(Integer.valueOf(String.valueOf(current.getText()))));
            }
        });


        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current.setText(String.valueOf(current.getText() + "5"));
                answer.setText(addN.IntToString(Integer.valueOf(String.valueOf(current.getText()))));
            }
        });


        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current.setText(String.valueOf(current.getText() + "6"));
                answer.setText(addN.IntToString(Integer.valueOf(String.valueOf(current.getText()))));
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current.setText(String.valueOf(current.getText() + "7"));
                answer.setText(addN.IntToString(Integer.valueOf(String.valueOf(current.getText()))));
            }
        });


        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current.setText(String.valueOf(current.getText() + "8"));
                answer.setText(addN.IntToString(Integer.valueOf(String.valueOf(current.getText()))));
            }
        });


        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current.setText(String.valueOf(current.getText() + "9"));
                answer.setText(addN.IntToString(Integer.valueOf(String.valueOf(current.getText()))));
            }
        });


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current.setText(String.valueOf(current.getText() + "0"));
                answer.setText(addN.IntToString(Integer.valueOf(String.valueOf(current.getText()))));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //clears everything
                current.setText("");
                answer.setText("");
            }
        });

        switchActiviy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //this is so that you could switch the activity by creating an intent
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}