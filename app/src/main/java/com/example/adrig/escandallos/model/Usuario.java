package com.example.adrig.escandallos.model;

import java.util.ArrayList;

public class Usuario {
    private String alias,password;
    private ArrayList<Parcela> parcelas;

    public Usuario() {
    }

    public Usuario(String _alias, String _password) {
        this.alias = _alias;
        this.password = _password;
    }

    public Usuario(String _alias, String _password, ArrayList<Parcela> _parcelas) {
        this.alias = _alias;
        this.password = _password;
        this.parcelas = _parcelas;
    }

    public String getAlias() {
        return alias;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Parcela> getParcelas() {
        return parcelas;
    }

    public void setAlias(String _alias) {
        this.alias = _alias;
    }

    public void setPassword(String _password) {
        this.password = _password;
    }

    public void setParcelas(ArrayList<Parcela> _parcelas) {
        this.parcelas = _parcelas;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "alias='" + alias + '\'' +
                '}';
    }
}
