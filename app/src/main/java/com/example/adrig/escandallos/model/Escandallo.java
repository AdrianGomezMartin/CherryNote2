package com.example.adrig.escandallos.model;

import java.util.ArrayList;

public class Escandallo{
    private String codigo;
    private Almacen almacen;
    private Parcela parcela;
    private Float kg30,kg28,kg26,kg24,kg22;
    private Precios precios;
    /**
     * Constructor por defecto
     */
    public Escandallo(){

    }
    /**
     * Constructor con todos los calibres y su precio
     * @param _codigo
     * @param _parcela
     * @param _kg30
     * @param _kg28
     * @param _kg26
     * @param _kg24
     * @param _kg22
     *
     */
    public Escandallo(String _codigo, Parcela _parcela,Almacen _almacen
                      ,float _kg30,float _kg28, float _kg26, float _kg24, float _kg22){
        this.codigo = _codigo;
        this.almacen = _almacen;
        this.parcela = _parcela;
        this.kg30 = _kg30;
        this.kg28 = _kg28;
        this.kg26 = _kg26;
        this.kg24 = _kg24;
        this.kg26 = _kg22;

    }
    /**
     * Constructor que crea un Escandallo a partir de 3 listas con las referencias [codigo,almacen,parcela] los pesos y los precios (ordenados de mayor calibre a menor)
     * @param _referencias
     * @param _pesosCalibre
     * @param _preciosCalibre
     */
    public Escandallo(Object _referencias[], ArrayList<Float> _pesosCalibre, ArrayList<Float> _preciosCalibre){
        if (_referencias.length == 3 && (_pesosCalibre.size() == _preciosCalibre.size())){
            this.codigo = (String) _referencias[0];
            this.almacen = (Almacen) _referencias[1];
            this.parcela = (Parcela)_referencias[2];
            for (int i = 0; i < _pesosCalibre.size(); i++){
                switch (i){
                    case 0 :
                        this.kg30 = _pesosCalibre.get(i);
                        this.precios.setPrecio30(_preciosCalibre.get(i));
                        break;
                    case 1 :
                        this.kg28 = _pesosCalibre.get(i);
                        this.precios.setPrecio28(_preciosCalibre.get(i));
                        break;
                    case 2 :
                        this.kg26 = _pesosCalibre.get(i);
                        this.precios.setPrecio26(_preciosCalibre.get(i));
                        break;
                    case 3 :
                        this.kg24 = _pesosCalibre.get(i);
                        this.precios.setPrecio24(_preciosCalibre.get(i));
                        break;
                    case 4 :
                        this.kg22 = _pesosCalibre.get(i);
                        this.precios.setPrecio22(_preciosCalibre.get(i));
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

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Parcela getParcela() {
        return parcela;
    }

    public void setParcela(Parcela parcela) {
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


    /**
     * Metodo que devuelve el total del escandallo
     * @return total
     */
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
                ", almacen='" + almacen.getNombre() + '\'' +
                ", parcela='" + parcela.getNombre() + '\'' +
                ", kg30=" + kg30 +
                ", kg28=" + kg28 +
                ", kg26=" + kg26 +
                ", kg24=" + kg24 +
                ", kg22=" + kg22 +
                precios.mostrarPrecios()+
                '}':
                "Escandallo{" +
                "codigo='" + codigo + '\'' +
                ", almacen='" + almacen.getNombre() + '\'' +
                ", parcela='" + parcela.getNombre() + '\'' +
                ", kg30=" + kg30 +
                ", kg28=" + kg28 +
                ", kg26=" + kg26 +
                ", kg24=" + kg24 +
                precios.mostrarPrecios()+
                '}');
    }

    public void setPrecios(Precios precios) {
        this.precios = precios;
    }
}
