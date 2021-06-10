/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Leche.LecheDeslactosada;
import Leche.LecheDescremada;
import Leche.LecheEntera;
import Postres.*;

/**
 *
 * @author Pedro Mendoza
 */
public class ManejadorDeLeche {
    LecheEntera leche;
   
    
    public ManejadorDeLeche(LecheEntera leche) {
        this.leche = leche;
    }
    public void cambiarTipoLeche(Postre postre){
        // Cambiar tipo de leche en la preparación de los postres, usar leche deslactosada
        System.out.println(postre.getClass());
        System.out.println(Pastel.class);
        LecheDeslactosada leche2 = new LecheDeslactosada();
        
        if(postre.getClass() == Pastel.class){
            try{
                leche2.usarPastel();
            }catch (Exception e){
                System.out.println("No se puede usar leche deslactosada en el pastel");
                leche.usarPastel();
            }
        }else{
            leche.usarHelado();
        }
    }
    
    
    
    
}
