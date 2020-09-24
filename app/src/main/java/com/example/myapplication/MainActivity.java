package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int redZ, zeroRes = 0;
    int blueZ =  0;
    Button btn_r, btn_b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    private void getValue() {
        btn_r = findViewById(R.id.red_btn);
        btn_b = findViewById(R.id.blue_btn);
    }



    public void redButton(View view) {
        redZ = redZ +1;
        displayRed(redZ);
    }

    public void blueButton(View view) {
        blueZ = blueZ + 1;
        displayBlue(blueZ);
    }

    public void resetButton(View view) {
        redZ = 0;
        blueZ = 0;
        displayRed(redZ);
        displayBlue(blueZ);
    }

    public void displayRed(int redPoint){
        getValue();
        btn_r.setText(String.valueOf(redPoint));
    }



    public void displayBlue(int bluePoint){
        getValue();
        btn_b.setText(String.valueOf(bluePoint));
    }

}