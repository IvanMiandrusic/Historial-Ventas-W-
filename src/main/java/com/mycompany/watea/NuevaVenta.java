package com.mycompany.watea;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mycompany.watea.classes.MyPair;
import com.mycompany.watea.classes.Product;
import com.mycompany.watea.classes.Vendedor;
import com.mycompany.watea.classes.Venta;
import com.oracle.jrockit.jfr.Producer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/* Vista encargada de la incorporacion de nuevas ventas */
public class NuevaVenta extends javax.swing.JFrame {

    // Variables
    File ficheroVentas = new File("datos\\productos.json");
    File ficheroVendedores = new File("datos\\vendedores.json");

    private DefaultTableModel tbProd;
    protected LinkedList<Product> list_productos = new LinkedList();
    protected LinkedList<Vendedor> list_vendedor = new LinkedList();
    private LinkedList<String> prodEnLista = new LinkedList();
    private LinkedList<Integer> list_cantidades = new LinkedList();
    protected double totalVenta = 0.0;
    protected double totalVentaConDesc = 0.0;
    protected double descuento = 0.0;
    private Vendedor vendedor;

    //Constructor de clase
    public NuevaVenta() {
        initComponents();
        cargarDatos();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    //Como su nombre lo indica es el metodo encargado de la carga de los datos que se lleva a cabo al iniciar el JFrame
    private void cargarDatos() {

        this.list_productos = Home.list_productos;
        this.list_vendedor = Home.list_vendedor;

        Product prd;
        Iterator<Product> it = this.list_productos.iterator();
        while (it.hasNext()) {
            prd = it.next();
            this.cbProducts.addItem(prd.getDescripcion());
        }

        Iterator<Vendedor> it2 = this.list_vendedor.iterator();
        Vendedor vend;
        while (it2.hasNext()) {
            vend = it2.next();
            this.cbEmpleados.addItem(vend.getName());
        }

        this.tbProd = (DefaultTableModel) this.tbVentasProd.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbEmpleados = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbProducts = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVentasProd = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        spCantidad = new javax.swing.JSpinner();
        btnReset = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbTotalVenta = new javax.swing.JLabel();
        lbDescuento = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva Venta"));

        cbEmpleados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cbEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmpleadosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Empleado:");

        jLabel2.setText("Agregar Producto:");

        cbProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        cbProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProductsActionPerformed(evt);
            }
        });

        tbVentasProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripcion", "Cantidad", "Precio Unitario", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(tbVentasProd);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setText("Cantidad:");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel4.setText("Total Venta:");

        jLabel5.setText("Descuento: ");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(61, 61, 61)
                        .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbTotalVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbEmpleados, 0, 150, Short.MAX_VALUE)
                        .addComponent(cbProducts, 0, 150, Short.MAX_VALUE))
                    .addContainerGap(255, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbTotalVenta))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lbDescuento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnEliminar))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cbProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(299, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        this.resetear();

    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        /* Este boton, es el encargado de ir agregando los diferentes productos que conforman una venta, estos se cargan en una tabla hasta ser "Guardados" */
        if (cbProducts.getSelectedIndex() == 0 || cbEmpleados.getSelectedIndex() == 0 || spCantidad.getValue().equals(0)) {
            Launcher.lanzarAlerta("Debe completar todos los campos para poder asignar un producto a la venta");
        } else {
            try {
                this.cbEmpleados.setEnabled(false);
                this.vendedor = this.getVendedorByName(this.cbEmpleados.getSelectedItem().toString());
                Product prod = this.getProductByDesc(this.cbProducts.getSelectedItem().toString());
                if (this.prodEnLista.contains(prod.getDescripcion())) {
                    Launcher.lanzarAlerta("El producto ya se encuentra añadido.");
                } else {
                    String[] fila = new String[4];
                    fila[0] = prod.getDescripcion();
                    fila[1] = spCantidad.getValue().toString() + " unidades";
                    fila[2] = "$ " + prod.getPrecio_unit() + "";
                    fila[3] = "$ " + (Integer.parseInt(spCantidad.getValue().toString()) * prod.getPrecio_unit()) + "";
                    this.tbProd.addRow(fila);
                    this.totalVenta = this.totalVenta + (Integer.parseInt(spCantidad.getValue().toString()) * prod.getPrecio_unit());
                    this.calcularDescuento();
                    this.lbDescuento.setText(this.descuento + "");
                    if (this.descuento > 0) {
                        this.lbTotalVenta.setText(this.totalVentaConDesc + "");
                    } else {
                        this.lbTotalVenta.setText(this.totalVenta + "");
                    }

                    this.prodEnLista.add(prod.getDescripcion());
                    this.list_cantidades.add(Integer.parseInt(spCantidad.getValue().toString()));
                }

            } catch (Exception e) {
                Launcher.lanzarAlerta("Se produjo un error al agregar un producto.");
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    public void guardar() {

        try {
            BufferedWriter bwVent;//Instancia de BW 
            bwVent = new BufferedWriter(new FileWriter(this.ficheroVentas));//Inicialización de "BW" con "FW" como parámetro con "fichero" como parámetro
            if (Home.list_productos == null) {

            } else {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String s = gson.toJson(Home.list_productos);
                bwVent.write(s);
                bwVent.close();
            }

            BufferedWriter bwEmp;//Instancia de BW 
            bwEmp = new BufferedWriter(new FileWriter(this.ficheroVendedores));//Inicialización de "BW" con "FW" como parámetro con "fichero" como parámetro
            if (Home.list_vendedor == null) {

            } else {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String s = gson.toJson(Home.list_vendedor);
                bwEmp.write(s);
                bwEmp.close();
            }

        } catch (Exception e) {
            Launcher.lanzarAlerta("No se pudieron guardar los datos!n" + e.getMessage());
        }

    }

    /* Los descuentos se calculan en base al total de la venta */
    public void calcularDescuento() {
        double dsc = 0;
        if (this.totalVenta > 100) {
            if (this.totalVenta > 200) {
                dsc = ((int) ((0.15 * this.totalVenta) * 100)) / 100;
                this.totalVentaConDesc = this.totalVenta - dsc;
            } else {
                dsc = ((int) (0.10 * this.totalVenta));
                this.totalVentaConDesc = this.totalVenta - dsc;
            }
        }
        this.descuento = dsc;
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Launcher.lanzarAlerta("Los Cambios no guardados se perderan");
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cbProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProductsActionPerformed

    }//GEN-LAST:event_cbProductsActionPerformed

    private void cbEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmpleadosActionPerformed

    }//GEN-LAST:event_cbEmpleadosActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (tbProd.getRowCount() > 0) {
            /* Encargado de confirmar una venta, "Crea la venta como tal (el Objeto)" */
            LinkedList<MyPair> list = new LinkedList();

            for (int i = 0; i <= (tbProd.getRowCount() - 1); i++) {
                int cant = this.list_cantidades.get(i);
                String desc = tbProd.getValueAt(i, 0).toString();
                Product prod = this.getProductByDesc(desc);
                prod.agregarCantVendida(cant);
                MyPair pair = new MyPair(prod, cant);
                list.add(pair);
            }
            Venta venta;
            if (this.descuento > 0) {
                venta = new Venta(list, this.totalVentaConDesc);
            } else {
                venta = new Venta(list, this.totalVenta);
            }
            this.vendedor.setVenta(venta);
            Home.list_ventas.add(venta);
            this.guardar();
            this.resetear();
            Launcher.lanzarAlerta("Se ah guardado exitosamente la venta");
        } else {
            Launcher.lanzarAlerta("No hay productos que generen una venta.");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    public void removeItem(String desc) {
        this.prodEnLista.removeIf(p -> p.equals(desc));
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (this.tbVentasProd.getSelectedRow() == -1) {
            Launcher.lanzarAlerta("Debe seleccionar un item para eliminar");
        } else {
            int selectedRow = tbVentasProd.getSelectedRow();
            String desc = tbVentasProd.getValueAt(selectedRow, 0).toString();
            this.removeItem(desc);
            this.tbProd.removeRow(selectedRow);
            this.actualizarTabla(desc);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    

    public void actualizarTabla(String desc) {
        for (int i = 0; i <= (this.tbVentasProd.getRowCount() - 1); i++) {
            if (this.tbVentasProd.getValueAt(i, 0).equals(desc)) {
                this.tbProd.removeRow(i);
            } else {

            }
        }

    }

    // Vuelve todos los elementos de la vista a su estado por Default
    private void resetear() {
        cbEmpleados.setEnabled(true);
        int size = (tbProd.getRowCount()) - 1;
        for (int i = 0; i <= size; i++) {
            tbProd.removeRow(0);
            this.prodEnLista.clear();
            spCantidad.setValue(0);
            cbEmpleados.setSelectedIndex(0);
            cbProducts.setSelectedIndex(0);
            this.totalVenta = 0.0;
            this.descuento = 0.0;
            lbDescuento.setText(" ");
            lbTotalVenta.setText(" ");
        }
    }

    public Vendedor getVendedorByName(String name) {

        Vendedor v = null;
        Iterator<Vendedor> it = this.list_vendedor.iterator();
        while (it.hasNext()) {
            v = it.next();
            if (v.getName().equals(name)) {
                break;
            };
        }

        return v;

    }

    private Product getProductByDesc(String desc) {

        Product prd = null;
        Iterator<Product> it = this.list_productos.iterator();
        while (it.hasNext()) {
            prd = it.next();
            if (prd.getDescripcion().equals(desc)) {
                break;
            };
        }

        return prd;

    }

    /**
     * @param args the command line arguments
     */
    /*  public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaVenta().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbEmpleados;
    private javax.swing.JComboBox<String> cbProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDescuento;
    private javax.swing.JLabel lbTotalVenta;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JTable tbVentasProd;
    // End of variables declaration//GEN-END:variables
}
