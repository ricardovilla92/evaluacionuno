package com.Ricardo.evaluacionuno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListaEstudiantesActivity extends AppCompatActivity {

    ListView listEstudiates;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estudiantes);

        listEstudiates = (ListView) findViewById(R.id.listEstudiantes);

        listEstudiates.setAdapter(new EstudiantesAdapter(this,MainActivity.lista));

    }
}
