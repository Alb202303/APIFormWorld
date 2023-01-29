package com.example.apimongo.controller;

import com.example.apimongo.model.Pregunta;
import com.example.apimongo.repository.PreguntaRepository;
import com.example.apimongo.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/pregunta")
@CrossOrigin("*")
public class PreguntaController {

    @Autowired
    private PreguntaService preguntaService;

  @GetMapping("/all")
    public List<Pregunta> getAll(){
      return preguntaService.getAll();
  }

  @GetMapping("/find/{id}")
    public Pregunta find(@PathVariable String _id){
      return preguntaService.get(_id);
  }

  @PostMapping("/save")
    public ResponseEntity<Pregunta> save(@RequestBody Pregunta pregunta){
      Pregunta obj=preguntaService.save(pregunta);
      return new ResponseEntity<>(obj, HttpStatus.OK);

  }

  @GetMapping("/value/{id}")
    public ResponseEntity<Pregunta> delete(@PathVariable String _id){
      Pregunta pregunta=preguntaService.get(_id);
      if(pregunta !=null) {
          preguntaService.delete(_id);
      }else{
          return new ResponseEntity<Pregunta>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<Pregunta>(pregunta, HttpStatus.OK);


  }


}
