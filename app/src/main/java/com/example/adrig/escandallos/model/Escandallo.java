package com.example.adrig.escandallos.model;

import java.util.ArrayList;

public class Escandallo{
    private String codigo,almacen,parcela;
    private Float kg30,kg28,kg26,kg24,kg22;
    private Float  precio30,precio28,precio26,precio24,precio22;
    /**
     * Constructor por defecto
      */
    public Escandallo(){

    }
    /**
     * Constructor con todos los calibres y su precio
     * @param _codigo
     * @param _almacen
     * @param _parcela
     * @param _kg30
     * @param _kg28
     * @param _kg26
     * @param _kg24
     * @param _kg22
     * @param _precio30
     * @param _precio28
     * @param _precio26
     * @param _precio24
     * @param _precio22
     */
    public Escandallo(String _codigo, String _almacen, String _parcela,
                      float _kg30,float _kg28, float _kg26, float _kg24, float _kg22,
                      float _precio30, float _precio28, float _precio26, float _precio24, float _precio22){
        this.codigo = _codigo;
        this.almacen = _almacen;
        this.parcela = _parcela;
        this.kg30 = _kg30;
        this.kg28 = _kg28;
        this.kg26 = _kg26;
        this.kg24 = _kg24;
        this.kg26 = _kg22;
        this.precio30 = _precio30;
        this.precio28 = _precio28;
        this.precio26 = _precio26;
        this.precio24 = _precio24;
        this.precio22 = _precio22;
    }
    /**
     * Constructor con los precios y los calibres del 30 al 24
     * @param _codigo
     * @param _almacen
     * @param _parcela
     * @param _kg30
     * @param _kg28
     * @param _kg26
     * @param _kg24
     * @param _precio30
     * @param _precio28
     * @param _precio26
     * @param _precio24
     */
    public Escandallo(String _codigo, String _almacen, String _parcela,
                      float _kg30,float _kg28, float _kg26, float _kg24,
                      float _precio30, float _precio28, float _precio26, float _precio24){
        this.codigo = _codigo;

        this.almacen = _almacen;
        this.parcela = _parcela;
        this.kg30 = _kg30;
        this.kg28 = _kg28;
        this.kg26 = _kg26;
        this.kg24 = _kg24;
        this.precio30 = _precio30;
        this.precio28 = _precio28;
        this.precio26 = _precio26;
        this.precio24 = _precio24;
    }

    /**
     * Constructor que crea un Escandallo a partir de 3 listas con las referencias [codigo,almacen,parcela] los pesos y los precios (ordenados de mayor calibre a menor)
     * @param referencias
     * @param pesosCalibre
     * @param preciosCalibre
     */
    public  Escandallo(String referencias[], ArrayList<Float> pesosCalibre, ArrayList<Float> preciosCalibre){
        if (referencias.length == 3 && (pesosCalibre.size() == preciosCalibre.size())){
            this.codigo = referencias[0];
            this.almacen = referencias[1];
            this.parcela = referencias[2];
            for (int i = 0; i < pesosCalibre.size(); i++){
                switch (i){
                    case 0 :
                        this.kg30 = pesosCalibre.get(i);
                        this.precio30 = preciosCalibre.get(i);
                        break;
                    case 1 :
                        this.kg28 = pesosCalibre.get(i);
                        this.precio28 = preciosCalibre.get(i);
                        break;
                    case 2 :
                        this.kg26 = pesosCalibre.get(i);
                        this.precio26 = preciosCalibre.get(i);
                        break;
                    case 3 :
                        this.kg24 = pesosCalibre.get(i);
                        this.precio24 = preciosCalibre.get(i);
                        break;
                    case 4 :
                        this.kg22 = pesosCalibre.get(i);
                        this.precio22 = preciosCalibre.get(i);
                        break;
                }
            }
            return;
        }
        System.err.println("No se pudo crear el objeto");
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAlmacen() {
        return almacen;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }

    public String getParcela() {
        return parcela;
    }

    public void setParcela(String parcela) {
        this.parcela = parcela;
    }

    public float getKg30() {
        return kg30;
    }

    public void setKg30(float kg30) {
        this.kg30 = kg30;
    }

    public float getKg28() {
        return kg28;
    }

    public void setKg28(float kg28) {
        this.kg28 = kg28;
    }

    public float getKg26() {
        return kg26;
    }

    public void setKg26(float kg26) {
        this.kg26 = kg26;
    }

    public float getKg24() {
        return kg24;
    }

    public void setKg24(float kg24) {
        this.kg24 = kg24;
    }

    public float getKg22() {
        return kg22;
    }

    public void setKg22(float kg22) {
        this.kg22 = kg22;
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

    public float obtenerTotal(){
        float euros30 = precio30 * kg30,
                euros28 = precio28 * kg28,
                euros26 = precio26 * kg26,
                euros24 = precio24 * kg24,
                euros22 = ( precio22 != null && kg22 != null ? precio22 * kg22 : 0 );
        return new Float(euros30 + euros28 + euros26 + euros24 + euros22 );
    }
    
    @Override
    public String toString() {
        return ( precio22 != null && kg22 != null ?
                "Escandallo{" +
                "codigo='" + codigo + '\'' +
                ", almacen='" + almacen + '\'' +
                ", parcela='" + parcela + '\'' +
                ", kg30=" + kg30 +
                ", kg28=" + kg28 +
                ", kg26=" + kg26 +
                ", kg24=" + kg24 +
                ", kg22=" + kg22 +
                ", precio30=" + precio30 +
                ", precio28=" + precio28 +
                ", precio26=" + precio26 +
                ", precio24=" + precio24 +
                ", precio22=" + precio22 +
                '}':
                "Escandallo{" +
                "codigo='" + codigo + '\'' +
                ", almacen='" + almacen + '\'' +
                ", parcela='" + parcela + '\'' +
                ", kg30=" + kg30 +
                ", kg28=" + kg28 +
                ", kg26=" + kg26 +
                ", kg24=" + kg24 +
                ", precio30=" + precio30 +
                ", precio28=" + precio28 +
                ", precio26=" + precio26 +
                ", precio24=" + precio24 +
                '}');
    }
}
