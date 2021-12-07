package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity
{

    Button bplus,bminus,bdivide,bmulti;
    EditText ed1,ed2;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bplus=findViewById(R.id.bplus);
        bminus=findViewById(R.id.bminus);
        bdivide=findViewById(R.id.bdivide);
        bmulti=findViewById(R.id.bmulti);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);



        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int n1=Integer.parseInt(ed1.getText().toString());
                int n2=Integer.parseInt(ed2.getText().toString());

                Toast.makeText(getApplicationContext(), "ADDITION : "+(n1+n2), Toast.LENGTH_LONG).show();

                int c=n1+n2;

                Intent i1=new Intent(getApplicationContext(), OutputScreen.class);
                i1.putExtra("myans",""+c);
                startActivity(i1);



            }
        });

        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int n1=Integer.parseInt(ed1.getText().toString());
                int n2=Integer.parseInt(ed2.getText().toString());

                Toast.makeText(getApplicationContext(), "SUBTRACTION : "+(n1-n2), Toast.LENGTH_LONG).show();
                int c=n1-n2;

                Intent i1=new Intent(getApplicationContext(), OutputScreen.class);
                i1.putExtra("myans",""+c);
                startActivity(i1);

            }
        });

        bmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int n1=Integer.parseInt(ed1.getText().toString());
                int n2=Integer.parseInt(ed2.getText().toString());

                Toast.makeText(getApplicationContext(), "MULTIPLICATION : "+(n1*n2), Toast.LENGTH_LONG).show();
                int c=n1*n2;

                Intent i1=new Intent(getApplicationContext(), OutputScreen.class);
                i1.putExtra("myans",""+c);
                startActivity(i1);

            }
        });

        bdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int n1=Integer.parseInt(ed1.getText().toString());
                int n2=Integer.parseInt(ed2.getText().toString());

                Toast.makeText(getApplicationContext(), "DIVISION : "+(n1/n2), Toast.LENGTH_LONG).show();
                int c=n1/n2;

                Intent i1=new Intent(getApplicationContext(), OutputScreen.class);
                i1.putExtra("myans",""+c);
                startActivity(i1);

            }
        });



    }
}
