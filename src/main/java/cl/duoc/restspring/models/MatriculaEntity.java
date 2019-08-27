/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.restspring.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "matricula")
public class MatriculaEntity implements Serializable {

    @Id
    private int nummat;

    @Column(name = "rut")
    private String rut;

    @Column(name = "dv")
    private String dv;

    @Column(name = "paterno")
    private String paterno;

    @Column(name = "materno")
    private String materno;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "email")
    private String email;

    @Column(name = "numtaller")
    private int numtaller;

    public int getNummat() {
        return nummat;
    }

    public void setNummat(int nummat) {
        this.nummat = nummat;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumtaller() {
        return numtaller;
    }

    public void setNumtaller(int numtaller) {
        this.numtaller = numtaller;
    }

    public MatriculaEntity() {
    }

    public MatriculaEntity(int nummat, String rut, String dv, String paterno, String materno, String nombre, String email, int numtaller) {
        this.nummat = nummat;
        this.rut = rut;
        this.dv = dv;
        this.paterno = paterno;
        this.materno = materno;
        this.nombre = nombre;
        this.email = email;
        this.numtaller = numtaller;
    }
}
