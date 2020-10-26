package com.example.mascotas;

public class DatosMascota {
    private String nombre;
    private int foto;
    private int fav;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getFav() {
        return fav;
    }

    public void setFav(int fav) {
        this.fav = fav;
    }

    public DatosMascota(String nombre, int foto) {
        this.nombre = nombre;
        this.foto = foto;
    }

}
