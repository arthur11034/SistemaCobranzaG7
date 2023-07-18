/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import registrocobranza.Gestor;
import registrocobranza.Deudor;

import vista.frmInforme;
import vista.FrmOpcion;
import vista.frmGestor;

public class ControladorInforme {
    Gestor registrocobranza;
    frmInforme vista;
    
    public ControladorInforme(Gestor registrocobranza, frmInforme vista) {
        this.registrocobranza = registrocobranza;
        this.vista = vista;
        vista.lblTitulo.setText(registrocobranza.generarInformes());
        
        this.vista.btnCancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmInforme fInforme = new frmInforme();
                ControladorOpcion controlador = 
                        new ControladorOpcion(configuracion.Datos.usuarios, fInforme);
                controlador.iniciar();
                
                vista.dispose();
            }
        });
    }
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
