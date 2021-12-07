package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OutputScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output_screen);

        TextView tv;

        tv=findViewById(R.id.tv);

        Intent i1=getIntent();

        String ans=i1.getStringExtra("myans");

        tv.setText("RESULT = "+ans);




    }
}
