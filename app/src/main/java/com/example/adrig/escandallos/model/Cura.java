package com.example.adrig.escandallos.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cura {
    private LocalDate fecha;
    private int numeroMaquinas;
    private String lote;
    private ArrayList<Fitosanitario> productosUtilizados;
    private Maquinaria maquinaCurar;
    private Parcela parcela;

    public Cura() {
    }

    public Cura(LocalDate _fecha, int _numeroMaquinas, String _lote, ArrayList<Fitosanitario> _productosUtilizados, Maquinaria _maquinaCurar, Parcela _parcela) {
        this.fecha = _fecha;
        this.numeroMaquinas = _numeroMaquinas;
        this.lote = _lote;
        this.productosUtilizados = _productosUtilizados;
        this.maquinaCurar = _maquinaCurar;
        this.parcela = _parcela;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate _fecha) {
        this.fecha = _fecha;
    }

    public int getNumeroMaquinas() {
        return numeroMaquinas;
    }

    public void setNumeroMaquinas(int _numeroMaquinas) {
        this.numeroMaquinas = _numeroMaquinas;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String _lote) {
        this.lote = lote;
    }

    public ArrayList<Fitosanitario> getProductosUtilizados() {
        return productosUtilizados;
    }

    public void setProductosUtilizados(ArrayList<Fitosanitario> _productosUtilizados) {
        this.productosUtilizados = _productosUtilizados;
    }

    public Maquinaria getMaquinaCurar() {
        return maquinaCurar;
    }

    public void setMaquinaCurar(Maquinaria _maquinaCurar) {
        this.maquinaCurar = _maquinaCurar;
    }

    @Override
    public String toString() {
        return "Cura{" +
                "fecha=" + fecha +
                ", numeroMaquinas=" + numeroMaquinas +
                ", lote='" + lote + '\'' +
                ", productosUtilizados=" + productosUtilizados +
                ", maquinaCurar=" + maquinaCurar +
                ", parcela="+ parcela +
                '}';
    }
}
