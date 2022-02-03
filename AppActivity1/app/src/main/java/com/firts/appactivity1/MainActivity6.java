package com.firts.appactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity implements View.OnClickListener {

    Button boton00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        boton00 = (Button) findViewById(R.id.anteriorButton2);

        boton00.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.anteriorButton2:
                Toast.makeText(getApplicationContext(), "Regresando...", Toast.LENGTH_SHORT).show();

                Intent objp = new Intent(MainActivity6.this, MainActivity5.class);
                startActivity(objp);

        }
    }
}