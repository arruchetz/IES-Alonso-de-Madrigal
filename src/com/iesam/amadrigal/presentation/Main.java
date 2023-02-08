package com.iesam.amadrigal.presentation;

import com.iesam.amadrigal.domain.models.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Alumno
       Alumno alumno = new Alumno();
       alumno.setId(1);
       alumno.setNombre("Luis");
       alumno.setApellidos("González Jiménez");
       alumno.setMadre("Tamara");
       alumno.setPadre("Fernando");
       alumno.setDireccion("C/Cervantes nº1");
       alumno.setDni("47462764S");
       alumno.setEmail("luis.gonjim.1@educa.jcyl.es");

       //Profesor

        Profesor profesor = new Profesor();
        profesor.setId(21);
        profesor.setTituloAcademico("Cincias Biológicas");
        profesor.setNombre("Laura");
        profesor.setApellidos("Sánchez Gómez");
        profesor.setDireccion("C/Prado nº11");
        profesor.setFechaAlta("21-01-2022");
        profesor.setDni("37893276H");

        //Asignatura

        Asignatura asignatura = new Asignatura();
        asignatura.setNombre("Lengua y Literatura");
        asignatura.setId(3);

        //Aula ordenadores
        Ordenador ordenador = new Ordenador();
        ordenador.setId(2);
        ordenador.setNumOrdenadores(23);
        ordenador.setTipoOrdenador("Sobremesa");
        ordenador.setCapacidad("24");
        ordenador.setPlanta("Tercer Planta");

        //Aula docencia
        Docencia docencia = new Docencia();
        docencia.setId(5);
        docencia.setTipoPizarra("Pizarra");
        docencia.setCapacidad("23");
        docencia.setSillas("24");
        docencia.setPlanta("Tercera Planta");

        //Matricula
        Matricula matricula = new Matricula();
        matricula.setId(212);
        matricula.setCurso("2ºESO");

        //Curso
        Curso curso = new Curso();
        curso.setNombre("1ºBachillerato");
        curso.setId(1);
        curso.setDescripcion("1º curso de estudios no obligatorios");


    }
}