package com.example.adrig.escandallos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ActividadEscandallos extends AppCompatActivity {
    EditText nmb30,nmb28,nmb26,nmb24;
    Button btnCalcularEscandallo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_escandallos);
        nmb30 = findViewById(R.id.nmb30);
        nmb28 = findViewById(R.id.nmb28);
        nmb26 = findViewById(R.id.nmb26);
        nmb24 = findViewById(R.id.nmb24);
        btnCalcularEscandallo = findViewById(R.id.btnCalcularEscandallo);
        rellenarCamposNulos();
        /*btnCalcularEscandallo.setOnClickListener((e)->{
            float valor30 = nmb30.getText().toString() != null ? Float.parseFloat(nmb30.getText().toString()) : 0f;
            float valor28 = nmb28.getText().toString() != null ? Float.parseFloat(nmb28.getText().toString()) : 0f;
            float valor26 = nmb26.getText().toString() != null ? Float.parseFloat(nmb26.getText().toString()) : 0f;
            float valor24 = nmb24.getText().toString() != null ? Float.parseFloat(nmb24.getText().toString()) : 0f;
            System.out.println(valor30+" "+valor28+" "+valor26+" "+valor24);
            Intent intentResultado = new Intent( this,ActividadResultadosEscandallo.class);
            intentResultado.putExtra("valor30",valor30);
            intentResultado.putExtra("valor28",valor28);
            intentResultado.putExtra("valor26",valor26);
            intentResultado.putExtra("valor24",valor24);
            startActivity(intentResultado);
        });*/
    }

    private void rellenarCamposNulos(){
        nmb30.setText("0");
        nmb28.setText("0");
        nmb26.setText("0");
        nmb24.setText("0");
    }
}
