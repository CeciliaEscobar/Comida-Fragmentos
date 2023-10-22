package com.cecilia.comidas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    Button desayunoFragmento, almuerzoFragmento, cenaFragmento;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        desayunoFragmento = (Button) findViewById(R.id.btndesayuno);
        almuerzoFragmento = (Button) findViewById(R.id.btnalmuerzo);
        cenaFragmento = (Button) findViewById(R.id.btncena);

        desayunoFragmento.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                cargarFragmento(new DesayunoFragmento());
            }
        });
        almuerzoFragmento.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                cargarFragmento(new AlmuerzoFragmento());
            }
        });
        cenaFragmento.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                cargarFragmento(new CenaFragmento());
            }
        });


    }

    private void cargarFragmento(Fragment fragmento){
        FragmentManager manager = this.getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.frameLayout, fragmento).commit();

    }
}

