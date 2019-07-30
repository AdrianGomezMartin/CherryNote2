package com.example.adrig.escandallos.model;

import java.time.LocalDate;

public class Precios {
    private String almacen;
    private LocalDate fecha;
    private float precio30, precio28, precio26, precio24, precio22;

    public Precios() {
    }

    /**
     * Contructor Precios 30 a 22
     * @param almacen
     * @param fecha
     * @param precio30
     * @param precio28
     * @param precio26
     * @param precio24
     * @param precio22
     */
    public Precios(String almacen, LocalDate fecha, float precio30, float precio28, float precio26, float precio24, float precio22) {
        this.almacen = almacen;
        this.fecha = fecha;
        this.precio30 = precio30;
        this.precio28 = precio28;
        this.precio26 = precio26;
        this.precio24 = precio24;
        this.precio22 = precio22;
    }

    /**
     * Constructor precios 30 a 24
     * @param almacen
     * @param fecha
     * @param precio30
     * @param precio28
     * @param precio26
     * @param precio24
     */
    public Precios(String almacen, LocalDate fecha, float precio30, float precio28, float precio26, float precio24) {
        this.almacen = almacen;
        this.fecha = fecha;
        this.precio30 = precio30;
        this.precio28 = precio28;
        this.precio26 = precio26;
        this.precio24 = precio24;
    }

    public String getAlmacen() {
        return almacen;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public float getPrecio30() {
        return precio30;
    }

    public void setPrecio30(float precio30) {
        this.precio30 = precio30;
    }

    public float getPrecio28() {
        return precio28;
    }

    public void setPrecio28(float precio28) {
        this.precio28 = precio28;
    }

    public float getPrecio26() {
        return precio26;
    }

    public void setPrecio26(float precio26) {
        this.precio26 = precio26;
    }

    public float getPrecio24() {
        return precio24;
    }

    public void setPrecio24(float precio24) {
        this.precio24 = precio24;
    }

    public float getPrecio22() {
        return precio22;
    }

    public void setPrecio22(float precio22) {
        this.precio22 = precio22;
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
