package com.kelvin.atlteasrestapi.service;

import com.kelvin.atlteasrestapi.domain.Atleta;
import com.kelvin.atlteasrestapi.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AtletaService {
    @Autowired
    AtletaRepository atletasRepository;

    public void testAtletas(){
        Atleta atleta1 = new Atleta(1,"Kelvin","Lee","Malasya", LocalDate.of(1996,1,27));
        atletasRepository.save(atleta1);
        Atleta atleta2 = new Atleta(2,"Pablo","Escobar","España", LocalDate.of(1996,10,2));
        atletasRepository.save(atleta2);

        System.out.println("=========================================================================================");
        System.out.println("");
        System.out.println("Lista de todos los atletas");
        System.out.println(atletasRepository.findAll());
        System.out.println("");
        System.out.println("Atletas por nacionalidad");
        System.out.println(atletasRepository.findByNationality("Malasya"));
    }
}
