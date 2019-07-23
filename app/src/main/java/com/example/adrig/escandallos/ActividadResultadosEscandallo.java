package com.example.adrig.escandallos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ActividadResultadosEscandallo extends AppCompatActivity {
    EditText res30,res28,res26,res24,edtTotal;
    TextView txtTituloEscandallo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_resultados_escandallo);
        txtTituloEscandallo = findViewById(R.id.txtTituloEscandallo);
        res30 = findViewById(R.id.res30);
        res28 = findViewById(R.id.res28);
        res26 = findViewById(R.id.res26);
        res24 = findViewById(R.id.res24);
        edtTotal = findViewById(R.id.edtTotal);
        calcularEscandallo();
        res30.setEnabled(false);
        res28.setEnabled(false);
        res26.setEnabled(false);
        res24.setEnabled(false);
        edtTotal.setEnabled(false);
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        txtTituloEscandallo.setText(txtTituloEscandallo.getText()+" "+date);
    }

    private void calcularEscandallo() {
        float   valor30 = getIntent().getExtras().getFloat("valor30"),
                valor28 = getIntent().getExtras().getFloat("valor28"),
                valor26 = getIntent().getExtras().getFloat("valor26"),
                valor24 = getIntent().getExtras().getFloat("valor24");
        valor30 *= 2.40f;
        valor28 *= 2.00f;
        valor26 *= 1.65f;
        valor24 *= 1.20f;
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(2);
        res30.setText(decimalFormat.format(valor30)+"€");
        res28.setText(decimalFormat.format(valor28)+"€");
        res26.setText(decimalFormat.format(valor26)+"€");
        res24.setText(decimalFormat.format(valor24)+"€");
        edtTotal.setText(decimalFormat.format(valor30 + valor28 + valor26 + valor24)+"€");
    }
}
