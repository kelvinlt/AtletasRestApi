package com.kelvin.atlteasrestapi.repository;

import com.kelvin.atlteasrestapi.domain.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AtletaRepository extends JpaRepository<Atleta,Long> {
    List<Atleta> findByName(String name);
    List<Atleta> findByNationality(String nationality);
}
