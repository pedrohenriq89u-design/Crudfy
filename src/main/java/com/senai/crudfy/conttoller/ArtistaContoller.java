package com.senai.crudfy.conttoller;

import com.senai.crudfy.entity.Artista;
import com.senai.crudfy.entity.Musica;
import com.senai.crudfy.service.ArtistaService;
import com.senai.crudfy.service.MusicaService;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArtistaContoller {

    private final ArtistaService ArtistaService;

    public ArtistaContoller(ArtistaService artistaService) {
        ArtistaService = artistaService;
    }
        @GetMapping
                public List<Artista> mostrar(){
            return artistaService.mo;

    }
}

