package com.example.apimongo.service;

import com.example.apimongo.general.GenericServiceImpl;
import com.example.apimongo.model.Pregunta;
import com.example.apimongo.repository.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PreguntaServiceImpl extends GenericServiceImpl<Pregunta, String> implements PreguntaService{

    @Autowired
    private PreguntaRepository preguntaRepository;

    @Override
    public PreguntaRepository getDao(){
        return preguntaRepository;
    }

}

