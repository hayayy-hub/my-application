package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e;
    TextView t;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.Hbutton);
        e = (EditText) findViewById(R.id.editTextName);
        t = (TextView) findViewById(R.id.textName);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st = e.getText().toString();
                t.setText("Hello " + st);
            }
        });
    }
}