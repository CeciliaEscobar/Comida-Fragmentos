package com.cecilia.comidas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class DesayunoFragmento extends Fragment {

    View view;
    Button primerBoton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

        view = inflater.inflate(R.layout.fragmento_desayuno, container, false);

        primerBoton = (Button) view.findViewById(R.id.btntexto1);
        primerBoton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getActivity(), "descargando...", Toast.LENGTH_LONG).show();



            }

        });
        return view;
    }
}


