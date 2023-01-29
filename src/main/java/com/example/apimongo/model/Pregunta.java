package com.example.apimongo.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "preguntas")
public class Pregunta{
    @Id
    private String _id;
    private String titulo;

    public Pregunta(){

    }
    public Pregunta(String _id, String titulo) {
        super();
        this._id = _id;
        this.titulo = titulo;
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
}
