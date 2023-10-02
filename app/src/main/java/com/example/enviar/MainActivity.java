package com.example.enviar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private TextView tv1;
    private RadioButton rb1, rb2, rb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        tv1 = (TextView) findViewById(R.id.tv1);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);

        Capturar();
    }
    public void Capturar (){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv1.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "El campo nombre está vacio :(", Toast.LENGTH_SHORT).show();
                }else{
                    String nombre = "";
                    String sexo = "";
                    nombre = tv1.getText().toString();
                    if (rb1.isChecked()){
                        sexo= rb1.getText().toString();
                    }
                    if (rb2.isChecked()){
                        sexo= rb2.getText().toString();
                    }
                    if (rb3.isChecked()){
                        sexo= rb3.getText().toString();
                    }
                    Intent i = new Intent (MainActivity.this, MainActivity2.class );
                    Persona p = new Persona (nombre, sexo);
                    i.putExtra("Persona", p);
                    startActivity(i);

                }
            }
        });
    }
}