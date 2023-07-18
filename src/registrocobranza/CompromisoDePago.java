
package registrocobranza;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class CompromisoDePago {
    boolean distintosPlazos;
    List<Date> fechasCompromiso;

    public CompromisoDePago(boolean distintosPlazos) {
        this.distintosPlazos = distintosPlazos;
        this.fechasCompromiso = new ArrayList<>();
    }

    public boolean isDistintosPlazos() {
        return distintosPlazos;
    }

    public List<Date> getFechasCompromiso() {
        return fechasCompromiso;
    }

    public void registrarFechas(Date fecha) {
        fechasCompromiso.add(fecha);
    }

    public void imprimirFechasCompromiso() {
        System.out.println("Fechas de compromiso:");
        for (Date fecha : fechasCompromiso) {
            System.out.println(fecha);
        }
    }
    
}
