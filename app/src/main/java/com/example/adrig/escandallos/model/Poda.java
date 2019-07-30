package com.example.adrig.escandallos.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Poda {
    private Parcela parcela;
    private LocalDate fecha;
    private ArrayList<Maquinaria> herramientasUtilizadas;
    private float gasto;

    public Poda() {
    }

    public Poda(Parcela _parcela, LocalDate _fecha, ArrayList<Maquinaria> _herramientasUtilizadas, float _gasto) {
        this.parcela = _parcela;
        this.fecha = _fecha;
        this.herramientasUtilizadas = _herramientasUtilizadas;
        this.gasto = _gasto;
    }

    public Parcela getParcela() {
        return parcela;
    }

    public void setParcela(Parcela _parcela) {
        this.parcela = _parcela;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate _fecha) {
        this.fecha = _fecha;
    }

    public ArrayList<Maquinaria> getHerramientasUtilizadas() {
        return herramientasUtilizadas;
    }

    public void setHerramientasUtilizadas(ArrayList<Maquinaria> _herramientasUtilizadas) {
        this.herramientasUtilizadas = _herramientasUtilizadas;
    }

    public float getGasto() {
        return gasto;
    }

    public void setGasto(float gasto) {
        this.gasto = gasto;
    }

    @Override
    public String toString() {
        return "Poda{" +
                "parcela=" + parcela +
                ", fecha=" + fecha +
                ", herramientasUtilizadas=" + herramientasUtilizadas +
                ", gasto=" + gasto +
                '}';
    }
}
