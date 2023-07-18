
package registrocobranza;

import java.util.Date;

public class Pago {
    private Deudor deudor;
    private Gestor gestor;
    private Deuda deuda;
    private int codigoPago;
    private double montoPagado;
    private Date fechaPago;

    public Pago(int codigoPago, double montoPagado, Date fechaPago) {
        this.codigoPago = codigoPago;
        this.montoPagado = montoPagado;
        this.fechaPago = fechaPago;
    }

    public int getCodigoPago() {
        return codigoPago;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    
    public boolean comprobarPago() {
        return montoPagado > 0;
    }

    public String emitirComprobante() {
        return "Comprobante de pago emitido";
    }
    
    public double calcularMontoPagado(){
        double montoPagado = 0;
            montoPagado = montoPagado - deuda.getMonto();
        return montoPagado;
    }
  
}