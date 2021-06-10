/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Postres.Postre;

/**
 *
 * @author Bryan Segovia
 */
public class ManejadorDePrecio {   //OCP
    private double precioFinal;
    public double calcularPrecioFinal(Postre p){
        precioFinal= (p.getPrecioParcial()+(p.getPrecioParcial()*0.12) +(p.getAderezos().size()*0.50));
        
        return precioFinal;
    }
    
    public String showPrecioFinal(){
        return "El precio final es: " + precioFinal;
    }
    
    
}
