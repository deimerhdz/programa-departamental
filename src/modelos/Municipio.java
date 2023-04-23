/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author asus-vivobook
 */
public class Municipio {
    
    private String nombreMunicipio;

    public Municipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public Municipio() {
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    @Override
    public String toString() {
        return  nombreMunicipio ;
    }
    
    
    
}
