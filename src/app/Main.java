package app;

import modelos.ListaDoble;
import modelos.Municipio;
import modelos.Nino;
import modelos.Representante;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Municipio Lorica = new Municipio("Lorica");
        Municipio monteria = new Municipio("Monteria");
        Municipio sahagun = new Municipio("sahagun");
        
      
        Nino jose = new Nino(1, "Jose", 4, 1.3f, 12.3f, null, Lorica);
        Nino maria = new Nino(2, "Maria", 4, 1.3f, 12.3f, null, Lorica);
        Nino carlos = new Nino(3, "Carlos", 4, 1.3f, 12.3f, null, monteria);
        
        Representante representante1= new Representante(1, "Miguel", "Padre");
        representante1.agregarHijo(jose);
        representante1.agregarHijo(maria);
        
        Representante representante2 = new Representante(1, "Maria", "Madre");
        representante2.agregarHijo(carlos);
        
        
        ListaDoble lista = new ListaDoble();
        
        lista.agregarRegistroAlInicio(jose);
        lista.agregarRegistroAlInicio(maria);
        lista.agregarRegistroAlInicio(carlos);
      
    
        System.out.println("");
        System.out.println("");
        System.out.println("Niño por municio (Lorica) ");
        System.out.println(""+lista.reportarNinosPorMunicipio("Lorica"));
        System.out.println("Total"+lista.totalizarNinosPorMunicipio("Lorica"));
    }
    
}
