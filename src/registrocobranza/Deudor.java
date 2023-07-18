
package registrocobranza;


public class Deudor extends Persona {
    
    String idDeudor;
    String nombreDeudor;

    public Deudor(String nombre, String direccion, String dni, String telefono, String idDeudor, String nombreDeudor) {
        super(nombre, direccion, dni, telefono);
        this.idDeudor = idDeudor;
        this.nombreDeudor = nombreDeudor;
    }

    public String getIdDeudor() {
        return idDeudor;
    }

    public String getNombreDeudor() {
        return nombreDeudor;
    }
    
    boolean equalsIgnoreCase(Deudor deudor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
