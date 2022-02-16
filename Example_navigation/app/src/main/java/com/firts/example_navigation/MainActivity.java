package com.firts.example_navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //EditText editText;
    Button boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton=(Button) findViewById(R.id.ejemplo);
        //editText=(EditText) findViewById(R.id.editText);
        boton.setOnClickListener(this);

    }
    public void onClick(View view){

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            //String dato = editText.getText().toString();
            //intent.putExtra("Dato", dato);
            startActivity(intent);

    }
}