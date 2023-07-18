
package registrocobranza;

import java.util.ArrayList;
import java.util.List;

public class ListaDeudores {
    private Deudor[] deudores;
    private int indice;
    
    public ListaDeudores(int tamano) {
        this.deudores = new Deudor[tamano];
        this.indice = 0;
    }
    
    public void agregar(Deudor deudor){
        this.deudores[this.indice] = deudor;
        this.indice++;
    }

}
