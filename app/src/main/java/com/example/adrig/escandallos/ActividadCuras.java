package com.example.adrig.escandallos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActividadCuras extends AppCompatActivity implements View.OnClickListener{
    ImageButton imgCuras,imgAbonos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_curas);
        imgCuras = findViewById(R.id.imgFito2);
        imgAbonos = findViewById(R.id.imaAbono);
        imgCuras.setOnClickListener(this);
        imgAbonos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgFito2:
                break;
            case R.id.imaAbono:
                break;
        }
    }
}
