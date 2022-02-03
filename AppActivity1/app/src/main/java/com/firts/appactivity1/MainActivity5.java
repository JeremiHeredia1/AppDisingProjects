package com.firts.appactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity implements View.OnClickListener {

    Button boton1;
    Button boton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        boton1 =(Button) findViewById(R.id.polloButton);
        boton2 = (Button) findViewById(R.id.pezButton);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.polloButton:
                Toast.makeText(getApplicationContext(), "Excelente", Toast.LENGTH_SHORT).show();
                Intent objI = new Intent(MainActivity5.this, MainActivity7.class);
                startActivity(objI);

                break;

            case R.id.pezButton:
                Toast.makeText(getApplicationContext(), "¡NOOO, Era la otra respuesta!", Toast.LENGTH_SHORT).show();

                Intent objE = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(objE);
        }
    }
}

