/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.watea;

import javax.swing.JOptionPane;


public class Launcher {
    
      
    /* Simplemente es el lanzador de la app */
    
    public static void main(String[] args) {
     
        Home h = new Home();
        h.setVisible(true);
        
    }
    
    /* Metodo que permite lanzar alertas en la app */
    public static void lanzarAlerta(String unMensaje){
        JOptionPane.showMessageDialog(null, unMensaje);
    }
    
}
