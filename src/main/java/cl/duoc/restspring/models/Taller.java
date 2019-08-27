/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.restspring.models;

/**
 *
 * @author hells
 */
public class Taller {
    
    private int numtaller;
    private String nombre;
    private String detalle;
    private int numhoras;
    private int cupos;

    public int getNumtaller() {
        return numtaller;
    }

    public void setNumtaller(int numtaller) {
        this.numtaller = numtaller;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getNumhoras() {
        return numhoras;
    }

    public void setNumhoras(int numhoras) {
        this.numhoras = numhoras;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public Taller() {
    }

    public Taller(int numtaller,String nombre, String detalle, int numhoras, int cupos) {
        this.numtaller = numtaller;
        this.nombre = nombre;
        this.detalle = detalle;
        this.numhoras = numhoras;
        this.cupos = cupos;
    }
    
    
    
}
