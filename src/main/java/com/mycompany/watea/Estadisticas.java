/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.watea;

import com.mycompany.watea.classes.Product;
import com.mycompany.watea.classes.Vendedor;
import com.mycompany.watea.classes.Venta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ivan
 */
public class Estadisticas extends javax.swing.JFrame {

    private DefaultTableModel tbVentas_mod;

    public Estadisticas() {
        initComponents();
        cargarElementos();
        generarEstadisticas();
        inicializarActionListenersCB();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbEmpleados = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lbCantVentas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbTotalRecaudado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbMasVendido = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVentas = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Estadisticas"));

        cbEmpleados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jLabel1.setText("Cantidad de Ventas: ");

        jLabel2.setText("Total Recaudado: ");

        jLabel3.setText("Prod. mas Vendido: ");

        tbVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vendedor", "Total Venta"
            }
        ));
        jScrollPane1.setViewportView(tbVentas);

        btnSalir.setText("Volver");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCantVentas)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTotalRecaudado)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMasVendido)
                        .addGap(97, 97, 97))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(cbEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(cbEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbCantVentas)
                    .addComponent(jLabel2)
                    .addComponent(lbTotalRecaudado)
                    .addComponent(jLabel3)
                    .addComponent(lbMasVendido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(18, 18, 18))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    
    public void cargarElementos() {

        this.cbEmpleados.addItem("General");

        Iterator<Vendedor> it = Home.list_vendedor.iterator();
        Vendedor vend;
        while (it.hasNext()) {
            vend = it.next();
            this.cbEmpleados.addItem(vend.getName());
        }

        this.tbVentas_mod = (DefaultTableModel) this.tbVentas.getModel();
    }

    
    public void generarEstadisticas() {
        String it = this.cbEmpleados.getSelectedItem().toString();
        switch (it) {
            case "General":
                this.lbTotalRecaudado.setText(this.calcularTotalVentas() + "");
                this.lbCantVentas.setText(Home.list_ventas.size() + "");
                this.lbMasVendido.setText(prodMasVendido());
                break;

            default:
                Vendedor v = getVendedorByName(it);
                this.lbTotalRecaudado.setText(totalRecaudadoPorVendedor(v) + "");
                this.lbCantVentas.setText(cantVentasPorVendedor(v)+"");
                break;
        }
    }
    
    private int cantVentasPorVendedor(Vendedor v){
        return (v.getList_ventas().size());
    }
    
    private double totalRecaudadoPorVendedor(Vendedor v){
        double total = 0.0;
        Iterator<Venta> it = v.getList_ventas().iterator();
        Venta vent;
        while (it.hasNext()) {
            vent = it.next();
            total = total + vent.getTotalVenta();
        }
        return total;
    } 

    public String prodMasVendido() {
        Iterator<Product> it = Home.list_productos.iterator();
        Product prod;
        int auxCant = 0;
        String desc = null;
        while (it.hasNext()) {
            prod = it.next();
            if (auxCant < prod.getCantVentas()) {
                auxCant = prod.getCantVentas();
                desc = prod.getDescripcion();
            }
        }
        return desc;
    }

    public double calcularTotalVentas() {
        double total = 0.0;
        Iterator<Venta> it = Home.list_ventas.iterator();
        Venta vent;
        while (it.hasNext()) {
            vent = it.next();
            total = total + vent.getTotalVenta();
        }
        return total;
    }

    /* Es uno de los metodos mas importantes de la vista, es quien se encarga de cargar los datos de esta en base a lo seleccionado en el combo box por medio de un listener */
    private void inicializarActionListenersCB() {
        this.cbEmpleados.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                resetearTabla();
                JComboBox comboBox = (JComboBox) event.getSource();
                Object selected = comboBox.getSelectedItem();
                generarEstadisticas();
                if (selected.toString().equals("General")) {
                    cargarTablaVentasGeneral();
                } else {
                    Vendedor vend = getVendedorByName(selected.toString());
                    cargarTablaVentas(vend.getList_ventas(), vend.getName());
                }

            }

        });
    }

    private Vendedor getVendedorByName(String name) {

        Vendedor v = null;
        Iterator<Vendedor> it = Home.list_vendedor.iterator();
        while (it.hasNext()) {
            v = it.next();
            if (v.getName().equals(name)) {
                break;
            };
        }

        return v;
    }

    //Metodo especifico para las ventas de la empresa en Gral.
    public void cargarTablaVentasGeneral(){
            Vendedor v = null;
                    Iterator<Vendedor> it = Home.list_vendedor.iterator();
                    while (it.hasNext()) {
                        v = it.next();
                        cargarTablaVentas(v.getList_ventas(), v.getName());  
                    }
    }
    
    //Metodo para cargar las ventas particulares de los vendedores.
    public void cargarTablaVentas(LinkedList<Venta> listVentas, String vend) {
        for (Venta v : listVentas) {
            String[] fila = new String[2];
            fila[0] = vend;
            fila[1] = v.getTotalVenta() + "";
            this.tbVentas_mod.addRow(fila);
        }

    }

    private void resetearTabla() {
        int size = (tbVentas_mod.getRowCount()) - 1;
        for (int i = 0; i <= size; i++) {
            tbVentas_mod.removeRow(0);

        }
    }

   /* public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadisticas().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbEmpleados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCantVentas;
    private javax.swing.JLabel lbMasVendido;
    private javax.swing.JLabel lbTotalRecaudado;
    private javax.swing.JTable tbVentas;
    // End of variables declaration//GEN-END:variables
}
