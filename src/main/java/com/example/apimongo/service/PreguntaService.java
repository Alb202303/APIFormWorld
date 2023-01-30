package com.example.apimongo.service;

import com.example.apimongo.general.GenericService;
import com.example.apimongo.model.Pregunta;
import com.example.apimongo.repository.PreguntaRepository;

public interface PreguntaService extends GenericService<Pregunta, String> {
    PreguntaRepository getDao();
}
