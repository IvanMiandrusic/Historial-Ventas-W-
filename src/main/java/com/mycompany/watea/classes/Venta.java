/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.watea.classes;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import javafx.util.Pair;

/**
 *
 * @author Ivan
 */
public class Venta {
    
    /* Los Objetos Venta se componene de uno o varios productos (estos se mantienen en la lista "vendidos"), 
       ademas se encuentra la var "totalVenta" que es utilizada para generar estadisticas, 
       es la suma de las cantidades de los componentes menos el descuento total (de ser aplicado)*/
    
    private LinkedList<MyPair> vendidos = new LinkedList();
    private double totalVenta;
    
    public Venta(LinkedList<MyPair> list, double total){
        
        vendidos = list;
        totalVenta = total;
        
    }

    public LinkedList<MyPair> getVendidos() {
        return vendidos;
    }

    public void setVendidos(LinkedList<MyPair> vendidos) {
        this.vendidos = vendidos;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }
    
    
    
}
