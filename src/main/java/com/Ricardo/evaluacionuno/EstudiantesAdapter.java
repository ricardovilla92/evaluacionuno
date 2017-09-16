package com.Ricardo.evaluacionuno;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;



public class EstudiantesAdapter extends ArrayAdapter<Estudiante> {

    public EstudiantesAdapter(@NonNull Context context,@NonNull List<Estudiante> objects) {
        super(context, 0 ,objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Estudiante e = getItem(position);
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_lista,parent,false);
        }

        TextView tvNomnbre = (TextView) convertView.findViewById(R.id.tvNombre);
        TextView tvCodigo = (TextView) convertView.findViewById(R.id.tvCodigo);
        TextView tvMateria = (TextView) convertView.findViewById(R.id.tvtMateria);
        TextView tvNumero = (TextView) convertView.findViewById(R.id.tvNumero);
        TextView tvPromedio = (TextView) convertView.findViewById(R.id.tvPromedio);

        tvNomnbre.setText(e.getNombre());
        tvMateria.setText(e.getMateria());
        tvCodigo.setText(e.getCodigo());
        tvNumero.setText(String.valueOf(position+1));
        tvPromedio.setText("  "+e.getPromedio().toString());

        return convertView;
    }
}
