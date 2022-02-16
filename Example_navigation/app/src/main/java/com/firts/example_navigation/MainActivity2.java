package com.firts.example_navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    //TextView textView;
    Button boton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        boton1=(Button) findViewById(R.id.polButton);
        //editText=(EditText) findViewById(R.id.editText);
        boton1.setOnClickListener(this);
        //textView =(TextView) findViewById(R.id.texto);
        
        //Intent intent = getIntent();
        //Bundle bundle=intent.getExtras();

        //if(bundle!=null){
        //    String cadena=(String) bundle.get("Dato");
        //    textView.setText(cadena);
        //}
    }
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        //String dato = editText.getText().toString();
        //intent.putExtra("Dato", dato);
        startActivity(intent);

    }
}