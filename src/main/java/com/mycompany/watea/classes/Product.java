
package com.mycompany.watea.classes;

public class Product {
    
    /*Los Productos cuentan con una descripcion, un precio por unidad y una variable "cantVendidos" que es utilizada para gestionar estadisticas como "Producto mas Vendido"  */
    
    protected String descripcion;
    protected double precio_unit;
    protected int cantVendidos;
    
    public Product(String desc, double prec){
        
        this.descripcion = desc;
        this.precio_unit = prec;
        
    }
    
    public void agregarCantVendida(int cant){
        this.cantVendidos = this.cantVendidos + cant;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio_unit() {
        return precio_unit;
    }

    public void setPrecio_unit(double precio_unit) {
        this.precio_unit = precio_unit;
    }

    public int getCantVentas() {
        return cantVendidos;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVendidos = cantVentas;
    }
    
    
    
    
    
}
