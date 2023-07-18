
package registrocobranza;

import java.util.Date;

public class Llamada {
    Date fechaLlamada;
    boolean respuesta;
    int numLlamadasTotal;
    String motivo;

    public Llamada(Date fechaLlamada, boolean respuesta, int numLlamadasTotal, String motivo) {
        this.fechaLlamada = fechaLlamada;
        this.respuesta = respuesta;
        this.numLlamadasTotal = numLlamadasTotal;
        this.motivo = motivo;
    }

    public Date getFechaLlamada() {
        return fechaLlamada;
    }

    public boolean getRespuesta() {
        return respuesta;
    }

    public int getNumLlamadasTotal() {
        return numLlamadasTotal;
    }

    public String getMotivo() {
        return motivo;
    }

    public String registrarLlamada() {
        return "Llamada registrada";
    }

    public boolean validarRespuesta() {
        return respuesta;
    }    
}