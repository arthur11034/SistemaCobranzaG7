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

import vista.FrmOpcion;
import vista.frmGestor;

public class ControladorOpcion {
    Gestor registrocobranza;
    FrmOpcion vista;
    
    public ControladorOpcion(Gestor registrocobranza, FrmOpcion vista){
        this.registrocobranza = registrocobranza;
        this.vista = vista;
        vista.lblGestor.setText("ID Gestor:"+ registrocobranza.getIdGestor());
        
        this.vista.btnSalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmGestor fGestor = new frmGestor();
                ControladorGestor controlador = new ControladorGestor(
                        registrocobranza.Datos.deudores, fIngreso);
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