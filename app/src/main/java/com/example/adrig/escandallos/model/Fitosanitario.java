package com.example.adrig.escandallos.model;

public class Fitosanitario {
    private String nombre,descripcion,lote;
    private float dosis, capacidad;
    private int diasSeguridad;

    public Fitosanitario() {
    }

    public Fitosanitario(String _nombre, String _descripcion, String _lote,float _dosis, float _capacidad, int _diasSeguridad) {
        this.nombre = _nombre;
        this.descripcion = _descripcion;
        this.lote = _lote;
        this.dosis = _dosis;
        this.capacidad = _capacidad;
        this.diasSeguridad = _diasSeguridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _nombre) {
        this.nombre = _nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String _descripcion) {
        this.descripcion = _descripcion;
    }

    public float getDosis() {
        return dosis;
    }

    public void setDosis(float _dosis) {
        this.dosis = _dosis;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float _capacidad) {
        this.capacidad = _capacidad;
    }

    public int getDiasSeguridad() {
        return diasSeguridad;
    }

    public void setDiasSeguridad(int _diasSeguridad) {
        this.diasSeguridad = _diasSeguridad;
    }

    @Override
    public String toString() {
        return "Fitosanitario{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", lote='" + lote + '\'' +
                ", dosis=" + dosis +
                ", capacidad=" + capacidad +
                ", diasSeguridad=" + diasSeguridad +
                '}';
    }
}
