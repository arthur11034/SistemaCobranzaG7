
package registrocobranza;

public class Persona {
    String nombre;
    String direccion;
    String dni;
    String telefono;
    
    public Persona(String nombre, String direccion, String dni, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public String getDni() {
        return dni;
    }
    
    public String getTelefono() {
        return telefono;
    }
}