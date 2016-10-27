/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.watea.classes;

import java.util.LinkedList;

/* Los vendedores cuentan con un nombre que los diferencia y con una lista propia de las ventas que hayan realizado */

public class Vendedor {
    
    protected String name;
    protected LinkedList<Venta> list_ventas = new LinkedList();
    
    public Vendedor(String n){
       
        this.name = n;
    }
    
    
    public void setVenta(Venta v){
        this.list_ventas.add(v);
    }
    
    
    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Venta> getList_ventas() {
        return list_ventas;
    }

    public void setList_ventas(LinkedList<Venta> list_ventas) {
        this.list_ventas = list_ventas;
    }
    
    
    
}
