package com.senai.crudfy.conttoller;

import com.senai.crudfy.entity.Musica;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.senai.crudfy.service.MusicaService;

import java.util.List;

@RestController
@RequestMapping("musicas")
public class MusicaController {

    private final MusicaService musicaService;

    public MusicaController(MusicaService musicaService) {
        this.musicaService = musicaService;
    }


    @GetMapping
    public List<Musica> mostrar() {
        return musicaService.mostrarMusica();
    }

}
