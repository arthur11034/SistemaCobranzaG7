
package registrocobranza;

import java.util.Date;

public class Gestor extends Persona {
    String idGestor;
    int deudasRecuperadas;
    
    public Gestor(String nombre, String direccion, String dni, String telefono, String idGestor) {
        super(nombre, direccion, dni, telefono);
        this.idGestor = idGestor;
        this.deudasRecuperadas = 0;
    }
    
    public String getIdGestor() {
        return idGestor;
    }
    
    public int getDeudasRecuperadas() {
        return deudasRecuperadas;
    }
    
    public String generarInformes() {
        return "Informe generado";
    }

    public boolean validar(String idGestor){
        boolean resultado = false;
        if(this.idGestor.equalsIgnoreCase(idGestor)){
            resultado = true;
        }
        return resultado;
    }
    
}
