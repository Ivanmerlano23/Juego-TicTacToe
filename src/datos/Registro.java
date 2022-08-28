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
public class Registro implements Serializable{
    private int codigo;
    private Player player;

    public Registro(int codigo, Player player) {
        this.codigo = codigo;
        this.player = player;
    }
    

    @Override
    public String toString() {
        return "Registro{" + "codigo=" + codigo + ", player=" + player + '}';
    }

 

    public String forma(){
        return player.forma();//POLIMORFISMO
    }
    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    
}