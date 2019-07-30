package com.example.adrig.escandallos.model;

import java.time.LocalDate;

public class Precios {
    private Almacen almacen;
    private LocalDate fecha;
    private float precio30, precio28, precio26, precio24, precio22;

    public Precios() {
    }

    /**
     * Contructor Precios 30 a 22
     * @param _almacen
     * @param _fecha
     * @param _precio30
     * @param _precio28
     * @param _precio26
     * @param _precio24
     * @param _precio22
     */
    public Precios(Almacen _almacen, LocalDate _fecha, float _precio30, float _precio28, float _precio26, float _precio24, float _precio22) {
        this.almacen = _almacen;
        this.fecha = _fecha;
        this.precio30 = _precio30;
        this.precio28 = _precio28;
        this.precio26 = _precio26;
        this.precio24 = _precio24;
        this.precio22 = _precio22;
    }

    /**
     * Constructor precios 30 a 24
     * @param _almacen
     * @param _fecha
     * @param _precio30
     * @param _precio28
     * @param _precio26
     * @param _precio24
     */
    public Precios(Almacen _almacen, LocalDate _fecha, float _precio30, float _precio28, float _precio26, float _precio24) {
        this.almacen = _almacen;
        this.fecha = _fecha;
        this.precio30 = _precio30;
        this.precio28 = _precio28;
        this.precio26 = _precio26;
        this.precio24 = _precio24;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen _almacen) {
        this.almacen = _almacen;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate _fecha) {
        this.fecha = _fecha;
    }

    public float getPrecio30() {
        return precio30;
    }

    public void setPrecio30(float _precio30) {
        this.precio30 = _precio30;
    }

    public float getPrecio28() {
        return precio28;
    }

    public void setPrecio28(float _precio28) {
        this.precio28 = _precio28;
    }

    public float getPrecio26() {
        return precio26;
    }

    public void setPrecio26(float _precio26) {
        this.precio26 = _precio26;
    }

    public float getPrecio24() {
        return precio24;
    }

    public void setPrecio24(float _precio24) {
        this.precio24 = _precio24;
    }

    public float getPrecio22() {
        return precio22;
    }

    public void setPrecio22(float _precio22) {
        this.precio22 = _precio22;
    }
    public String mostrarPrecios(){
        return (precio22 != 0 ? " precio30 = "+ precio30+" ,precio28 = "+ precio28+" , precio26 = "+ precio26+" , precio24 = "+ precio24:
                " precio30 = "+ precio30+" ,precio28 = "+ precio28+" , precio26 = "+ precio26+" , precio24 = "+ precio24+" , precio22 = "+precio22);
    }

    @Override
    public String toString() {
        return "Precios{" +
                "almacen='" + almacen + '\'' +
                ", fecha=" + fecha +
                ", precio30=" + precio30 +
                ", precio28=" + precio28 +
                ", precio26=" + precio26 +
                ", precio24=" + precio24 +
                ", precio22=" + precio22 +
                '}';
    }
}
