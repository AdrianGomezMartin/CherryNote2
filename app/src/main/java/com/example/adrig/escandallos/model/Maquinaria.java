package com.example.adrig.escandallos.model;

public class Maquinaria {
    private String nombre,descripcion;
    private float capacidad,precio;
    private Usuario propietario;

    public Maquinaria() {
    }

    public Maquinaria(String _nombre, String _descripcion, Usuario _propietario, float _capacidad, float _precio) {
        this.nombre = _nombre;
        this.descripcion = _descripcion;
        this.propietario = _propietario;
        this.capacidad = _capacidad;
        this.precio = _precio;
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

    public Usuario getPropietario() {
        return propietario;
    }

    public void setPropietario(Usuario _propietario) {
        this.propietario = _propietario;
    }
    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float _capacidad) {
        this.capacidad = _capacidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float _precio) {
        this.precio = _precio;
    }

    @Override
    public String toString() {
        return "Maquinaria{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", capacidad=" + capacidad +
                ", precio=" + precio +
                ", propietario="+ propietario.getAlias()+
                '}';
    }
}
