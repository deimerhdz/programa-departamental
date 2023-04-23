/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

public class Nodo {
    private Nino nino;
    private Nodo siguiente;
    private Nodo anterior;
    
    //constructor para cuando no existen nodos
    public Nodo(Nino nino,Nodo siguiente,Nodo anterior){
        this.nino=nino;
        this.siguiente=siguiente;
        this.anterior=anterior;
    }
    
    //constructor para cuando ya existen nodos
    public Nodo(Nino nino) {
        this(nino,null,null);
        
    }
    public Nino getNino() {
        return nino;
    }

    public void setNino(Nino nino) {
        this.nino = nino;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return  "nino=" + nino ;
    }

  
    
}
