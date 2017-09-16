package com.Ricardo.evaluacionuno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DatosEstudianteActivity extends AppCompatActivity {

    EditText txtNombre,txtMateria,txtCodigo,txtParcial1,txtParcial2,txtParcial3;
    Button btnGuardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_estudiante);

        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtMateria = (EditText) findViewById(R.id.txtMateria);
        txtCodigo = (EditText) findViewById(R.id.txtCodigo);
        txtParcial1 = (EditText) findViewById(R.id.txtParcial1);
        txtParcial2 = (EditText) findViewById(R.id.txtParcial2);
        txtParcial3 = (EditText) findViewById(R.id.txtParcial3);

        btnGuardar = (Button) findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            private class Estudiante extends MainActivity.Estudiante {
                public Estudiante(String s, String s1, String s2, double v, double v1, double v2) {
                    super();
                }
            }

            @Override
            public void onClick(View v) {
                MainActivity.lista.add(new Estudiante(txtNombre.getText().toString(),txtCodigo.getText().toString(),txtMateria.getText().toString(),Double.parseDouble(txtParcial1.getText().toString())
                ,Double.parseDouble(txtParcial2.getText().toString()),Double.parseDouble(txtParcial3.getText().toString())));
                finish();
            }
        });


    }
}
