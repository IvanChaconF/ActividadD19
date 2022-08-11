package com.example.actividadd19.entidades;

public class libros {
    private Integer id;
    private String titulo;
    private String autor;
    private String editorial;
    private String anio;
    private String img;

    public libros(Integer id, String titulo, String autor, String editorial, String anio, String img) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anio = anio;
        this.img=img;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getImg(byte[] string) {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
