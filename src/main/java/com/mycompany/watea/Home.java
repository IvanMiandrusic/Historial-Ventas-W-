/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.watea;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mycompany.watea.classes.MyPair;
import com.mycompany.watea.classes.Product;
import com.mycompany.watea.classes.Vendedor;
import com.mycompany.watea.classes.Venta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Ivan
 */
public class Home extends javax.swing.JFrame {

    File ficheroEmpleados = new File("datos\\vendedores.json");
    File ficheroProductos = new File("datos\\productos.json");
    protected static LinkedList<Product> list_productos = new LinkedList(); //Es una variable estatica para poder ecceder a ella desde otras clases.
    protected static LinkedList<Vendedor> list_vendedor = new LinkedList();
    protected static LinkedList<Venta> list_ventas = new LinkedList();

    public Home() {
        initComponents();
        cargarDatosDeVendedores();
        cargarDatosProd();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void cargarDatosDeVendedores(){
        try {
            
            //Lee los vendedores desde el JSON y los carga en el sistema
            if (this.ficheroEmpleados.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(this.ficheroEmpleados));
                Gson gson = new GsonBuilder().create();
                Vendedor[] ve;
                ve = gson.fromJson(reader, Vendedor[].class);

               for (int i = 0; ve[i] != null; i++) {
                    Vendedor vend = ve[i];
                    this.list_vendedor.add(vend);
                    //Carga la lista de ventas general a partir de los vendedores
                    cargarVentas(vend.getList_ventas());
                    }
                 reader.close();
                } else {
                    
                }
                   } catch (Exception e) {
        }
        
    }
    
    private void cargarDatosProd(){
        try {
            //Lee los productos desde el JSON y los carga en el sistema
            if (this.ficheroProductos.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(this.ficheroProductos));
                Gson gson = new GsonBuilder().create();
                Product[] p;
                p = gson.fromJson(reader, Product[].class);

               for (int i = 0; p[i] != null; i++) {
                    Product prod = p[i];
                    this.list_productos.add(prod);
                    }
               reader.close();
                
                } else {
                    
                }

        } catch (Exception e) {
        }
    }
            
 
    
    
    private void cargarVentas(LinkedList<Venta> ventList){
        Iterator<Venta> it = ventList.iterator();
        Venta vent;
        while (it.hasNext()) {
            vent = it.next();
            this.list_ventas.add(vent);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVenta = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Bienvenido"));

        btnVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVenta.setText("NUEVA VENTA");
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConsultar.setText("ESTADISTICAS");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
            .addComponent(btnConsultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        NuevaVenta nv = new NuevaVenta();
        nv.setVisible(true);
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        Estadisticas v = new Estadisticas();
        v.setVisible(true);
    }//GEN-LAST:event_btnConsultarActionPerformed

    
/*public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnVenta;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
