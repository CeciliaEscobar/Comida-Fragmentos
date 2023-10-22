package com.cecilia.comidas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class AlmuerzoFragmento extends Fragment {

    View view;
    Button segundoBoton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

        view = inflater.inflate(R.layout.fragmento_almuerzo, container, false);

        segundoBoton = (Button) view.findViewById(R.id.btntexto2);
        segundoBoton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getActivity(), "descargando...", Toast.LENGTH_LONG).show();



            }

        });
        return view;
    }
}
