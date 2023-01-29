package com.example.apimongo.repository;


import com.example.apimongo.model.Pregunta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface PreguntaRepository extends MongoRepository<Pregunta,String> {

}
