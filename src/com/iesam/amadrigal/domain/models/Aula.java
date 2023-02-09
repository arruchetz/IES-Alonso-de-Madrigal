package com.iesam.amadrigal.domain.models;

public class Aula extends Instituto{
    private String planta;
    private String capacidad;

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
}
