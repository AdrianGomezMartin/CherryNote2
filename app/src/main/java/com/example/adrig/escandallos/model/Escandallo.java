package com.example.adrig.escandallos.model;

import java.util.ArrayList;

public class Escandallo{
    private String codigo,almacen,parcela;
    private Float kg30,kg28,kg26,kg24,kg22;
    private Precios precios;    /**
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
     * @param _precios
     */
    public Escandallo(String _codigo, String _almacen, String _parcela,
                      float _kg30,float _kg28, float _kg26, float _kg24, float _kg22,
                      Precios _precios){
        this.codigo = _codigo;
        this.almacen = _almacen;
        this.parcela = _parcela;
        this.kg30 = _kg30;
        this.kg28 = _kg28;
        this.kg26 = _kg26;
        this.kg24 = _kg24;
        this.kg26 = _kg22;
        this.precios = _precios;
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
                        this.precios.setPrecio30(preciosCalibre.get(i));
                        break;
                    case 1 :
                        this.kg28 = pesosCalibre.get(i);
                        this.precios.setPrecio28(preciosCalibre.get(i));
                        break;
                    case 2 :
                        this.kg26 = pesosCalibre.get(i);
                        this.precios.setPrecio26(preciosCalibre.get(i));
                        break;
                    case 3 :
                        this.kg24 = pesosCalibre.get(i);
                        this.precios.setPrecio24(preciosCalibre.get(i));
                        break;
                    case 4 :
                        this.kg22 = pesosCalibre.get(i);
                        this.precios.setPrecio22(preciosCalibre.get(i));
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



    public float obtenerTotal(){
        float euros30 = precios.getPrecio30() * kg30,
                euros28 = precios.getPrecio28() * kg28,
                euros26 = precios.getPrecio26()* kg26,
                euros24 = precios.getPrecio24() * kg24,
                euros22 = ( precios.getPrecio22() != 0 && kg22 != null ? precios.getPrecio22() * kg22 : 0 );
        return new Float(euros30 + euros28 + euros26 + euros24 + euros22 );
    }

    @Override
    public String toString() {
        return ( precios.getPrecio22() != 0 && kg22 != null ?
                "Escandallo{" +
                "codigo='" + codigo + '\'' +
                ", almacen='" + almacen + '\'' +
                ", parcela='" + parcela + '\'' +
                ", kg30=" + kg30 +
                ", kg28=" + kg28 +
                ", kg26=" + kg26 +
                ", kg24=" + kg24 +
                ", kg22=" + kg22 +
                precios.mostrarPrecios()+
                '}':
                "Escandallo{" +
                "codigo='" + codigo + '\'' +
                ", almacen='" + almacen + '\'' +
                ", parcela='" + parcela + '\'' +
                ", kg30=" + kg30 +
                ", kg28=" + kg28 +
                ", kg26=" + kg26 +
                ", kg24=" + kg24 +
                precios.mostrarPrecios()+
                '}');
    }
}
