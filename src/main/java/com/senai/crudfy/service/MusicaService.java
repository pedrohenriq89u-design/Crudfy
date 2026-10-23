package com.senai.crudfy.service;

import com.senai.crudfy.entity.Musica;
import com.senai.crudfy.repository.MusicaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicaService {

    private final MusicaRepository musicaRepository;

    public MusicaService(MusicaRepository musicaRepository) {
        this.musicaRepository = musicaRepository;
    }

    public List<Musica> mostrarMusica(){
        List<Musica> lista = new ArrayList<>();
        lista = musicaRepository.findAll();
        return lista;
    }
}
