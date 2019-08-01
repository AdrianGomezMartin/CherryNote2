package com.example.adrig.escandallos;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.adrig.escandallos.model.Almacen;
import com.example.adrig.escandallos.model.Parcela;
import com.example.adrig.escandallos.model.Precios;

import java.time.LocalDate;

//iepa gente
public class ActividadPrecios extends AppCompatActivity {
    EditText edt30 ,edt28 ,edt26 , edt24, edt22;
    Button btnIngresar;
    @android.support.annotation.RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_precios);
        edt30 = findViewById(R.id.edt30);
        edt28 = findViewById(R.id.edt28);
        edt26 = findViewById(R.id.edt26);
        edt24 = findViewById(R.id.edt24);
        edt22 = findViewById(R.id.edt22);
        btnIngresar = findViewById(R.id.btnIngresar);
        Float     precio30 = (edt30.getText().toString() != null ? Float.parseFloat(edt30.getText().toString()) : 0f)
                , precio28 = (edt28.getText().toString() != null ?  Float.parseFloat(edt28.getText().toString()) : 0f)
                , precio26 = (edt26.getText().toString() != null ? Float.parseFloat(edt26.getText().toString()) : 0f)
                , precio24 = (edt24.getText().toString() != null ? Float.parseFloat(edt24.getText().toString()) : 0f)
                , precio22 = (edt22.getText().toString() != null ? Float.parseFloat(edt22.getText().toString()) : 0f);
        Almacen almacen = new Almacen("GRUPO ALBA");
        Precios precioNuevo = new Precios(almacen, LocalDate.now(),precio30,precio28,precio26,precio24,precio22);
        Toast.makeText(this, (CharSequence) precioNuevo, Toast.LENGTH_SHORT).show();
    }
}
