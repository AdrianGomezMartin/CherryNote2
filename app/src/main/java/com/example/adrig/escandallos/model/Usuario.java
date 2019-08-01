package com.example.adrig.escandallos.model;

import java.util.ArrayList;

public class Usuario {
    private String alias,password;
    private ArrayList<Parcela> parcelas;
    private boolean userPremium ;

    public Usuario() {
    }

    public Usuario(String _alias, String _password) {
        this.alias = _alias;
        this.password = _password;
    }

    public Usuario(String alias, String password, boolean userPremium) {
        this.alias = alias;
        this.password = password;
        this.userPremium = userPremium;
    }

    public Usuario(String _alias, String _password, ArrayList<Parcela> _parcelas) {
        this.alias = _alias;
        this.password = _password;
        this.parcelas = _parcelas;
    }

    public Usuario(String alias, String password, ArrayList<Parcela> parcelas, boolean userPremium) {
        this.alias = alias;
        this.password = password;
        this.parcelas = parcelas;
        this.userPremium = userPremium;
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

    public boolean isUserPremium() {
        return userPremium;
    }

    public void setUserPremium(boolean userPremium) {
        this.userPremium = userPremium;
    }
    @Override
    public String toString() {
        return "Usuario{" +
                "alias='" + alias + '\'' +
                '}';
    }
}
