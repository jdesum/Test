package com.example.yoso.todo01;

/**
 * Created by yoso on 11/09/15.
 */
public class Tarea {

    private String nombre;
    private String hora;
    private int categoria;

    // Constructor
    public Tarea(String nombre, String hora, int categoria){

        this.nombre = nombre;
        this.hora = hora;
        this.categoria = categoria;
    }

    // Métodos set y get
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setHora(String hora){
        this.hora = hora;
    }

    public void setCategoria(int categoria){
        this.categoria = categoria;
    }

    public String getNombre(){
        return nombre;
    }

    public String getHora(){
        return  hora;
    }

    public int getCategoria(){
        return categoria;
    }

    // Método toString() de Tarea que construimos
    public String toString(){
        return nombre+" , "+hora;
    }
}
