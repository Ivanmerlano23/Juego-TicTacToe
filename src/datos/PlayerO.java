/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.Serializable;

/**
 *
 * @author Ivan Merlano
 */
public class PlayerO  extends Player implements Serializable{

    public PlayerO(String nombre, String tiposigno) throws VacioException {
        super(nombre, tiposigno);
    }

    
    @Override
    public String toString (){
        return super.toString()+"PlayerO{" + '}';
    }
    
    public String signo(){
        if(tiposigno.equals("O")){
            return tiposigno;
        }else if(tiposigno.equals("X")){
            return tiposigno;
        }
        return null;    
    }
    
     @Override
    public String forma() {
        return signo(); 
        
    }
}    