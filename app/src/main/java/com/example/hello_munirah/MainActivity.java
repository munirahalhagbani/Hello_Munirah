package com.example.hello_munirah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button B;
    EditText T;
    TextView TV ;
    String S;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    B = (Button)findViewById(R.id.HB);
    T = (EditText) findViewById(R.id.Ename);
    TV = (TextView) findViewById(R.id.Hello);


        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                S = T.getText().toString();
                sentData(S);

            }
        });


    }
    private void sentData(String w) {
        TV.setText("Hello, "+w);
    }
}