package com.example.adrig.escandallos.model;

import java.util.ArrayList;

public class Almacen {
    private String nombre;
    private ArrayList<Precios> precios;

    public Almacen() {
    }

    public Almacen(String _nombre) {
        this.nombre = _nombre;
    }

    public Almacen(String _nombre, ArrayList<Precios> _precios) {
        this.nombre = _nombre;
        this.precios = _precios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _nombre) {
        this.nombre = _nombre;
    }

    public ArrayList<Precios> getPrecios() {
        return precios;
    }

    public void setPrecios(ArrayList<Precios> _precios) {
        this.precios = _precios;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "nombre='" + nombre + '\'' +
                ", precios=" + precios +
                '}';
    }
}
