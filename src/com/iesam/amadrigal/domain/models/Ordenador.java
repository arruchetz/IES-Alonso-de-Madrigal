package com.iesam.amadrigal.domain.models;

public class Ordenador extends Aula{
    private Integer numOrdenadores;
    private String tipoOrdenador;

    public Integer getNumOrdenadores() {
        return numOrdenadores;
    }

    public void setNumOrdenadores(Integer numOrdenadores) {
        this.numOrdenadores = numOrdenadores;
    }

    public String getTipoOrdenador() {
        return tipoOrdenador;
    }

    public void setTipoOrdenador(String tipoOrdenador) {
        this.tipoOrdenador = tipoOrdenador;
    }
}
