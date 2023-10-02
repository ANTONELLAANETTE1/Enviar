package com.example.enviar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button btn2;
    private TextView tv_nombre, tv_sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn2 = (Button) findViewById(R.id.btn2);
        tv_nombre = (TextView) findViewById (R.id.tv_nombre);
        tv_sexo = (TextView) findViewById(R.id.tv_sexo);

        // Con esto sacabamos los datos directamente desde las textView --------------------------

        /*Intent i = getIntent();
        String nombre = i.getExtras().getString("nombre");
        String sexo = i.getExtras().getString("sexo");
        tv_nombre.setText(nombre);
        tv_sexo.setText(sexo);*/

        Volver();

        //Con esto lo sacamos desde la clase persona ----------------------------------------------
        Intent i = getIntent();
        Persona p = i.getParcelableExtra("Persona");

        tv_nombre.setText("Tu nombre es:" + p.getNombre());
        tv_sexo.setText("Tu sexo es:" + p.getSexo());


    }

    public void Volver() {
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}