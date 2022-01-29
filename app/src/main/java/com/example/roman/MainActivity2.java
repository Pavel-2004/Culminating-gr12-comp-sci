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
        setContentView(R.layout.activity_main2);

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

        TextView current = (TextView)findViewById(R.id.title_text);
        TextView answer = (TextView)findViewById(R.id.answer);
        answer.setMovementMethod(new ScrollingMovementMethod());



        answer.setMovementMethod(new ScrollingMovementMethod());


        Calculations addN = new Calculations("");


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current.setText(String.valueOf(current.getText() + "1"));
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
                current.setText("");
            }
        });

        switchActiviy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}