package com.firts.appactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button boton1;
    Button boton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        boton1 =(Button) findViewById(R.id.gatoButton);
        boton2 = (Button) findViewById(R.id.arañaButton);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.gatoButton:
                Toast.makeText(getApplicationContext(),"¡NOOO, Era la otra respuesta!", Toast.LENGTH_SHORT).show();
                Intent objI = new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(objI);

            break;

            case R.id.arañaButton:
                Toast.makeText(getApplicationContext(),"Excelente", Toast.LENGTH_SHORT).show();
                Intent objE = new Intent(MainActivity2.this,MainActivity5.class);
                startActivity(objE);
        }




    }
}