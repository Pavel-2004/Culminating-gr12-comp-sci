package com.example.roman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView text;
    EditText textTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.start_button);
        text = (TextView)findViewById(R.id.title_text);
        textTwo = (EditText) findViewById(R.id.name);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculations test = new Calculations(String.valueOf(textTwo.getText()));

                text.setText(String.valueOf(test.stringToInt()));
            }
        });
    }

}