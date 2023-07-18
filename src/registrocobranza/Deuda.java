
package registrocobranza;

import java.util.Date;

public class Deuda {
    String idDeuda;
    Date fechaInicio;
    double monto;
    boolean pagada;

    public Deuda(String idDeuda, Date fechaInicio, double monto) {
        this.idDeuda = idDeuda;
        this.fechaInicio = fechaInicio;
        this.monto = monto;
        this.pagada = false;
    }

    public String getIdDeuda() {
        return idDeuda;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public double getMonto() {
        return monto;
    }

}