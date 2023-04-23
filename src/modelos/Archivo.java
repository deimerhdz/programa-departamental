
package modelos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {
    File archivo;
    
    FileWriter escribir;
    
    PrintWriter linea;
    
    public Archivo(){
        archivo= new File("datos.txt");//preparando el archivo
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo,true);
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public void generarArchivo(ListaDoble lista) throws IOException{
        String datos="";
         if(!lista.estaVacia()){
            Nodo aux = lista.getInicio();
            while(aux!=null){
                linea = new PrintWriter(escribir);
                datos=aux.getNino().getNumeroRegistroCivil()+","+
                        aux.getNino().getNombre()+","
                        +aux.getNino().getEdad()+","
                        +aux.getNino().getTalla()+","
                        +aux.getNino().getPeso()+","
                        +aux.getNino().getRepresentante().getNombre();
                linea.println(datos);
               aux = aux.getSiguiente();
            }
            linea.close();
            escribir.close();
        }

    }
    
    public String getPath(){
        return archivo.getAbsolutePath();
    }
}
