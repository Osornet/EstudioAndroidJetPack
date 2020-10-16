package com.osornet.estudioandroidjetpack;

public class Nota {

    private String nota;
    private String contenido;
    private boolean favorita;
    private int color;

    public Nota(String nota, String contenido, boolean favorita, int color) {
        this.nota = nota;
        this.contenido = contenido;
        this.favorita = favorita;
        this.color = color;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
