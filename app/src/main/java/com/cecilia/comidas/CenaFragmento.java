package com.cecilia.comidas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class CenaFragmento extends Fragment {

    View view;
    Button tercerBoton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

        view = inflater.inflate(R.layout.fragmento_desayuno, container, false);

        tercerBoton = (Button) view.findViewById(R.id.btntexto1);
        tercerBoton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getActivity(), "descargando...", Toast.LENGTH_LONG).show();



            }

        });
        return view;
    }
}
