package com.iesam.amadrigal.domain.models;

public class Docencia extends Aula{
    private String sillas;
    private String tipoPizarra;

    public String getSillas() {
        return sillas;
    }

    public void setSillas(String sillas) {
        this.sillas = sillas;
    }

    public String getTipoPizarra() {
        return tipoPizarra;
    }

    public void setTipoPizarra(String tipoPizarra) {
        this.tipoPizarra = tipoPizarra;
    }
}
