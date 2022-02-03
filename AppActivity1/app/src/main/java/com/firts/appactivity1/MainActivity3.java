package com.firts.appactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    Button boton0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        boton0 = (Button) findViewById(R.id.anteriorButton);

        boton0.setOnClickListener(this);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.anteriorButton:
                Toast.makeText(getApplicationContext(), "Regresando...",Toast.LENGTH_SHORT).show();

                Intent objr = new Intent(MainActivity3.this, MainActivity6.class);
                startActivity(objr);

        }
    }
}