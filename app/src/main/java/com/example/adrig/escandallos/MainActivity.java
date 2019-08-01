package com.example.adrig.escandallos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtPaswd,edtEmail;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtEmail = findViewById(R.id.edtEmail);
        edtPaswd = findViewById(R.id.edtPswd);
        btnLogin = findViewById(R.id.btnLogin);
       /* btnLogin.setOnClickListener((e)->{
            if (comprobarCamposLlenos()){
                String  user = "" , password = "";
                user =  edtEmail.getText().toString();
                password = edtPaswd.getText().toString();
                String userAdmin = "admin",passwdAdmin="root";
                if (user.equalsIgnoreCase(userAdmin) && password.equalsIgnoreCase(passwdAdmin)){
                    startActivity(new Intent(this,ActividadMenu.class));
                }else
                    Toast.makeText(this, "ERROR "+user+"  "+" "+password, Toast.LENGTH_SHORT).show();
            }
        });
        */
    }
    private  boolean comprobarCamposLlenos(){
        return edtEmail.getText().toString() != null && edtPaswd.getText().toString() != null;
    }
}
