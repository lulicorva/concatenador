package com.example.ejercicio3concatenador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText texto1;
    private EditText texto2;
    private TextView visualizacion;
    private Button botonConcatenar;
    private String nuevoTexto1;
    private String nuevoTexto2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto1 = findViewById(R.id.mainActivityTexto1);
        texto2 = findViewById(R.id.mainActivityTexto2);
        visualizacion = findViewById(R.id.mainActivityVisualizacion);
        botonConcatenar = findViewById(R.id.mainActivityBotonConcatenar);


        botonConcatenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nuevoTexto1 = texto1.getText().toString();
                nuevoTexto2 = texto2.getText().toString();

                visualizacion.setText(nuevoTexto1+ " " +nuevoTexto2);

            }
        });


    }
}
