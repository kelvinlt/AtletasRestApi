package com.kelvin.atlteasrestapi.controller;

import com.kelvin.atlteasrestapi.domain.Atleta;
import com.kelvin.atlteasrestapi.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atletas")
public class AtletaController {

    @Autowired
    private AtletaRepository atletaRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Atleta createAtleta(@RequestBody Atleta atleta){
        return atletaRepository.save(atleta);
    }

    @PutMapping
    public Atleta updateAtleta(@RequestBody Atleta atleta){
        return atletaRepository.save(atleta);
    }

    @GetMapping
    public List<Atleta> findAll(){
        return atletaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Atleta findById(@PathVariable Long id){
        Atleta atleta = atletaRepository.findOne(id);
        return atleta;
    }

    @DeleteMapping("/{id}")
    public void deleteAtleta(@PathVariable Long id){
        atletaRepository.delete(id);
    }
}
