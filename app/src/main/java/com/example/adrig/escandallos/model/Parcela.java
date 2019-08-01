package com.example.adrig.escandallos.model;

public class Parcela {
    private Usuario propietario;
    private String nombre;
    private double latitud,longitud;
    private int m2;

    public Parcela() {
    }

    public Parcela(String nombre) {
        this.nombre = nombre;
    }

    public Parcela(Usuario _propietario, String _nombre, double _latitud, double _longitud, int _m2) {
        this.propietario = _propietario;
        this.nombre = _nombre;
        this.latitud = _latitud;
        this.longitud = _longitud;
        this.m2 = _m2;
    }

    public Usuario getPropietario() {
        return propietario;
    }

    public void setPropietario(Usuario _propietario) {
        this.propietario = _propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _nombre) {
        this.nombre = _nombre;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double _latitud) {
        this.latitud = _latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double _longitud) {
        this.longitud = _longitud;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int _m2) {
        this.m2 = _m2;
    }

    @Override
    public String toString() {
        return "Parcela{" +
                "propietario=" + propietario.getAlias() +
                ", nombre='" + nombre + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", m2=" + m2 +
                '}';
    }
}
