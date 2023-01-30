package com.example.apimongo.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class Secciones {

//    @Id
//    private String _id;
    private String pregunta;
    private ArrayList<String> opciones=new ArrayList<String>();

    public Secciones() {
    }

    public Secciones( String pregunta, ArrayList<String> opciones) {
        this.pregunta = pregunta;
        this.opciones = opciones;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public ArrayList<String> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<String> opciones) {
        this.opciones = opciones;
    }
}
