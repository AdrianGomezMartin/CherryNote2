package com.example.adrig.escandallos.model;


import android.os.Build;

import java.time.LocalDate;
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

    /**
     * Metodo que devuelve los precios del ultimo dia del almacen
     * @return
     */
    @android.support.annotation.RequiresApi(api = Build.VERSION_CODES.O)
    public Precios verPreciosUltimoDia(){
        LocalDate ultimaFecha = LocalDate.of(0,0,0);
        Precios ultimoPrecio = null;
        for (int i = 0; i < precios.size();i++){
            if (precios.get(i).getFecha().isAfter(ultimaFecha) ){
                ultimaFecha = precios.get(i).getFecha();
            }
            ultimoPrecio = precios.get(i);
        }
        return (ultimoPrecio.getFecha() == ultimaFecha ? ultimoPrecio : null);
    }
    @Override
    public String toString() {
        return "Almacen{" +
                "nombre='" + nombre + '\'' +
                ", precios=" + precios +
                '}';
    }
}
