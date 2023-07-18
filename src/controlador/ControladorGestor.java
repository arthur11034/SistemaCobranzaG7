/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import registrocobranza.Gestor;

import vista.FrmOpcion;
import vista.frmGestor;
   

public class ControladorGestor {
    Gestor registrocobranza;
    frmGestor vista;
    
    public ControladorGestor(Gestor registrocobranza, frmGestor vista){
        this.registrocobranza=registrocobranza;
        this.vista=vista;
        
        this.vista.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        this.vista.btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Gestor g = registrocobranza.validar(vista.txtGestor.getText() );
                
                if (g != null){

                    frmGestor vistaP = new frmGestor();
                    ControladorGestor controladorGestor = 
                            new ControladorGestor(g, vistaP);
                    controladorGestor.iniciar();
                    vista.dispose();
                    
                    
                } else {
                    JOptionPane.showMessageDialog( vista, "Credenciales invalidas" );
                }
                limpiarControles();
            }
        });
    }
    
    
    
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        limpiarControles();
        this.vista.setVisible(true);
    }
    
    public void limpiarControles(){
        vista.txtGestor.setText("");
    }
}
