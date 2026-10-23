package com.senai.crudfy.entity;

import jakarta.persistence.*;

@Entity
public class Musica {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100, unique = true)
    private String título;
    private String artista;
    private String album;
    private Genero genero;
    private String duracao;
    private String capa;

    public Musica() {}

    public Musica(int id, String título, String artista, String album, Genero genero, String duracao, String capa) {
        this.id = id;
        this.título = título;
        this.artista = artista;
        this.album = album;
        this.genero = genero;
        this.duracao = duracao;
        this.capa = capa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }
}
