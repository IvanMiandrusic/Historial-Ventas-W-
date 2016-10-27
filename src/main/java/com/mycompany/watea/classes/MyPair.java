
package com.mycompany.watea.classes;

public class MyPair {
    
    /* Esta clase existe por el hecho de poder tener una lista de los productos que se vendieron en una unica "Venta",
       de esta manera puedo asociar los productos con la cantidad entregada. Funciona como si fueran Duplas / Tuplas*/
    
    protected int cantidad;
    protected Product prod;
    
    public MyPair(Product p, int cant){
        
        this.prod = p;
        this.cantidad = cant;
        
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Product getProd() {
        return prod;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }
    
    
    
}
