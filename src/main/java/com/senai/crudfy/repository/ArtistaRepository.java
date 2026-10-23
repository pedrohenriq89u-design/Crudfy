package com.senai.crudfy.repository;

import com.senai.crudfy.entity.Artista;
import com.senai.crudfy.entity.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artista,Integer> {
}
