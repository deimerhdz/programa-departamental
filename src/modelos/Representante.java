/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author asus-vivobook
 */
public class Representante {
    private Integer identificador;
    private String nombre;
    private String parentesco;
    private Nino hijos[];
    private int posicion;

    public Representante(Integer identificador, String nombre, String parentesco) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.parentesco = parentesco;
         this.hijos = new Nino[2];
        
    }

    public Representante() {
        this.identificador = 0;
        this.nombre = "";
        this.parentesco = "";
        this.hijos = new Nino[2];
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Nino[] getHijos() {
        return hijos;
    }

    public void agregarHijo(Nino hijo) {
        if(posicion<2){
           
             this.hijos[posicion] = hijo;
              hijo.setRepresentante(this);
             posicion++;
        }
    }

    @Override
    public String toString() {
        return  "identificador=" + identificador + ", nombre=" + nombre + ", parentesco=" + parentesco + ", posicion=" + posicion ;
    }
    
    
    
    
    
    
}
