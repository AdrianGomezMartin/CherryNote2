package com.example.adrig.escandallos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActividadMenu extends AppCompatActivity implements View.OnClickListener{

    ImageButton imgCerezas, imgPoda, imgFitosanitarios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_menu);
        imgCerezas = findViewById(R.id.imgCerezas);
        imgFitosanitarios = findViewById(R.id.imgFito);
        imgPoda = findViewById(R.id.imgPoda);
        imgCerezas.setOnClickListener(this::onClick);
        imgPoda.setOnClickListener(this::onClick);
        imgFitosanitarios.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgCerezas:
                startActivity(new Intent(this,ActividadEscandallos.class));
                break;
            case R.id.imgPoda:
                Toast.makeText(this, "OPCION NO CONFIGURADA", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imgFito:
                Toast.makeText(this, "OPCION NO CONFIGURADA", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
