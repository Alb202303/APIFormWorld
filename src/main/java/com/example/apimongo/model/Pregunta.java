package com.example.apimongo.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "preguntas")
public class Pregunta{
    @Id
    private String _id;
    private String titulo;
    private String descripcion;

    private Secciones seccion;

    public Pregunta() {
    }

    public Pregunta(String _id, String titulo, String descripcion, Secciones seccion) {
        this._id = _id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.seccion=seccion;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Secciones getSeccion() {
        return seccion;
    }

    public void setSeccion(Secciones seccion) {
        this.seccion = seccion;
    }
}
