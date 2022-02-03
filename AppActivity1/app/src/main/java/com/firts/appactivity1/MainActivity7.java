package com.firts.appactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity implements View.OnClickListener {

    Button  boton3;
    Button boton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        boton3 =(Button) findViewById(R.id.superButton);
        boton4 = (Button) findViewById(R.id.polButton);

        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.superButton:
                Toast.makeText(getApplicationContext(), "Inicio", Toast.LENGTH_SHORT).show();

                Intent objk = new Intent(MainActivity7.this, MainActivity.class);
                startActivity(objk);
           break;

            case R.id.polButton:
                Toast.makeText(getApplicationContext(), "¡Comenzemos de nuevo!", Toast.LENGTH_SHORT).show();

                Intent objm = new Intent(MainActivity7.this, MainActivity2.class);
                startActivity(objm);
        }
    }

}