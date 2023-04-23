/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author asus-vivobook
 */
public class Nino {
    private Integer numeroRegistroCivil;
    private String nombre;
    private int edad;
    private float talla;
    private float peso;
    private Representante representante;
    private Municipio municipio;

    public Nino(Integer numeroRegistroCivil, String nombre, int edad, float talla, float peso, Representante representante, Municipio municipio) {
        this.numeroRegistroCivil = numeroRegistroCivil;
        this.nombre = nombre;
        this.edad = edad;
        this.talla = talla;
        this.peso = peso;
        this.representante = representante;
        this.municipio = municipio;
    }

    public Nino() {
        this.numeroRegistroCivil=0;
       this.nombre = "";
        this.edad = 0;
        this.talla = 0;
        this.peso = 0;
        this.representante = new Representante();
        this.municipio = new Municipio();
    }

    public Integer getNumeroRegistroCivil() {
        return numeroRegistroCivil;
    }

    public void setNumeroRegistroCivil(Integer numeroRegistroCivil) {
        this.numeroRegistroCivil = numeroRegistroCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getTalla() {
        return talla;
    }

    public void setTalla(float talla) {
        this.talla = talla;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return "numeroRegistroCivil=" + numeroRegistroCivil + ", nombre=" + nombre + ", edad=" + edad + ", talla=" + talla + ", peso=" + peso + ", representante=" + representante + ", municipio=" + municipio;
    }

    
    
    
    
}
