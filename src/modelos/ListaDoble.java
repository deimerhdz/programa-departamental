package modelos;

import javax.swing.JOptionPane;

public class ListaDoble {

    private Nodo inicio ,fin;

    //se crea la lista vacia
    public ListaDoble() {
        inicio = fin= null;
    }
    

    //metodo para saber cuando la lista esta vacia
    public boolean estaVacia() {
        return inicio == null;
    }
    
    

    //metodo para agregar registro al final
    public void agregarRegistroAlFinal(Nino nino) {
        if (!estaVacia()) {
            Nodo aux = getBuscarNodoPorCod(nino.getNumeroRegistroCivil());

            if (aux != null) {
                JOptionPane.showMessageDialog(null, "Ya existe un numero de registro para el niño ingresado");
            } else {
                Nodo nuevo =  new Nodo(nino, null, getFin());
                setFin(nuevo);
                
                fin .getAnterior().setSiguiente(getFin());
                
            }

        } else {
            inicio = fin =new Nodo(nino);
        }
    }
     //metodo para agregar registro al final
    public void agregarRegistroAlInicio(Nino nino) {
        if (!estaVacia()) {
            Nodo aux = getBuscarNodoPorCod(nino.getNumeroRegistroCivil());

            if (aux != null) {
                JOptionPane.showMessageDialog(null, "Ya existe un numero de registro para el niño ingresado");
            } else {
                Nodo nuevo =  new Nodo(nino, getInicio(),null);
                setInicio(nuevo);
                
                inicio .getSiguiente().setAnterior(getFin());
                
            }

        } else {
            inicio = fin =new Nodo(nino);
        }
    }

     public int cantidad ()
    {
        int cant = 0;
        Nodo reco = inicio;
        while (reco != null) {
            reco = reco.getSiguiente();
            cant++;
        }
        return cant;
    }
     
    public void agregarRegistroEntreNodo( Nino nino, int pos) {
       if (pos <= cantidad () + 1)    {
            Nodo nuevo = new Nodo (nino);
            if (pos == 1){
                nuevo.setSiguiente(inicio);
                if (getInicio()!=null)
                    getInicio().setAnterior(nuevo);
                setInicio(nuevo);
            } else
                if (pos == cantidad () + 1)    {
                    Nodo reco = getInicio();
                    while (reco.getSiguiente() != null) {
                        reco = reco.getSiguiente();
                    }
                    reco.setSiguiente(nuevo);
                    nuevo.setAnterior(reco);
                    nuevo.setSiguiente(null);
                } else {
                    Nodo reco = getInicio();
                    for (int f = 1 ; f <= pos - 2 ; f++)
                        reco = reco.getSiguiente();
                    Nodo siguiente = reco.getSiguiente();
                    reco.setSiguiente(nuevo);
                    nuevo.setAnterior(reco);
                    nuevo.setSiguiente(siguiente);
                    siguiente.setAnterior(nuevo);
                }
        }
    }

    public Nodo getBuscarNodoPorCod(Integer numeroDeRegistro) {
        if (inicio == null) {
            return null;
        } else {
            Nodo nodo = inicio;
            while (nodo != null) {
                if ((nodo.getNino().getNumeroRegistroCivil()).equals(numeroDeRegistro)) {
                    return nodo;
                } else {
                    nodo = nodo.getSiguiente();  //Avanza un posición en la lista
                }
            }
            return null;
        }
    }

    public String buscarRegistro(Integer numeroDeRegistro) {
        String resultado = "";
        if (!estaVacia()) {
            Nodo aux = getInicio();
            while (aux != null) {
                Nodo dato = getBuscarNodoPorCod(numeroDeRegistro);
                if (dato != null) {
                  
                    resultado += "Talla:" + dato.getNino().getTalla() + "\n"
                            + "Peso: " + dato.getNino().getPeso();
                    break;
                }
                aux = aux.getAnterior();
            }
        }
        return resultado;
    }

    public void eliminarRegistro(Integer numeroRegistro) {
        if (!estaVacia()) {
            Nodo p, q;
            p = getBuscarNodoPorCod(numeroRegistro);
            if (p == null) {
                JOptionPane.showMessageDialog(null,
                        "El código buscado para eliminar NO"
                        + " se encuentra registrado!");
            } else {
                if ((p == inicio) && (inicio.getSiguiente() == null)) {
                    inicio = null;
                    JOptionPane.showMessageDialog(null,
                            "Elemento eliminado, la lista esta vacía!");
                } else if ((p == inicio) && (inicio.getSiguiente() != null)) {
                    setInicio(inicio.getSiguiente());
                    inicio.setAnterior(null);
                    p.setSiguiente(null);
                    p = null;
                    JOptionPane.showMessageDialog(null,
                            "Elemento eliminado, en el inicio de la"
                            + " lista!");
                } else if (p.getSiguiente() == null) {
                    q = inicio;
                    while (q.getSiguiente() != p) {
                        q = q.getSiguiente();
                    }
                    q.setSiguiente(null);
                    p.setAnterior(null);
                    p = null;
                    JOptionPane.showMessageDialog(null,
                            "Elemento eliminado, al final de la"
                            + " lista!");
                } else {
                    p.getAnterior().setSiguiente(p.getSiguiente());
                    p.getSiguiente().setAnterior(p.getAnterior());
                    p.setSiguiente(null);
                    p.setAnterior(null);
                    p = null;
                    JOptionPane.showMessageDialog(null,
                            "Elemento eliminado!");
                }
            }
        }
    }

    public int reportarNinosDeBajaEstatura(String municipio) {
        int cantidad = 0;
        if (!estaVacia()) {
            Nodo aux = getInicio();
            while (aux != null) {
                if (municipio.equals(aux.getNino().getMunicipio().getNombreMunicipio())) {
                    if (aux.getNino().getEdad() >= 4 && aux.getNino().getEdad() <= 6 && aux.getNino().getTalla() < 1) {
                        cantidad++;
                    }
                }
                aux = aux.getSiguiente();
            }
        }
        return cantidad;
    }

    public String reportarNinosDeBajoPeso() {
        String datos = "";
        if (!estaVacia()) {
            Nodo aux = getInicio();
            while (aux != null) {
                if (aux.getNino().getEdad() >= 2 && aux.getNino().getEdad() <= 3 && aux.getNino().getPeso() < 15f) {
                    datos += "Numero de registro: " + aux.getNino().getNumeroRegistroCivil() + "\n"
                            + "Nombre: " + aux.getNino().getNombre() + "\n"
                            + "Edad:" + aux.getNino().getEdad() + "\n"
                            + "Talla: " + aux.getNino().getTalla() + "\n"
                            + "Peso: " + aux.getNino().getPeso() + "\n"
                            + "Representante: " + aux.getNino().getRepresentante().getNombre() + "\n\n";
                }
                aux = aux.getSiguiente();
            }
        }
        return datos;
    }

    public int totalizarNinosDeBajoPeso(String municipio) {
        int cantidad = 0;
        if (!estaVacia()) {
            Nodo aux = getInicio();
            while (aux != null) {
                if (municipio.endsWith(aux.getNino().getMunicipio().getNombreMunicipio())) {
                    if (aux.getNino().getEdad() >= 2 && aux.getNino().getEdad() <= 3 && aux.getNino().getPeso() < 15f) {
                        cantidad++;
                    }
                }
                aux = aux.getSiguiente();
            }
        }
        return cantidad;
    }

    public String reportarNinosPorMunicipio(String municipio) {
        String datos = "";
        if (!estaVacia()) {
            Nodo aux = getInicio();
            while (aux != null) {
                if (aux.getNino().getMunicipio().getNombreMunicipio().equals(municipio)) {
                    datos = datos + "[" + aux.getNino() + "]<=>\n";
                }
                aux = aux.getSiguiente();
            }
        }
        return datos;
    }

    public int totalizarNinosPorMunicipio(String municipio) {
        int count = 0;
        if (!estaVacia()) {
            Nodo aux = getInicio();
            while (aux != null) {
                if (aux.getNino().getMunicipio().getNombreMunicipio().equals(municipio)) {
                    count++;
                }
                aux = aux.getSiguiente();
            }
        }

        return count;
    }

   
    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

   

}
