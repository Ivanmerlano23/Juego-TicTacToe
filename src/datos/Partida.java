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
public class Partida implements Serializable{
    private final Player px;
    private final Player po;
    
    public Partida(Player px, Player po) {
        this.px = px;
        this.po = po;
    }

    @Override
    public String toString() {
        return "Partida{" + px + " VS " + po +'}';
    }
    

    /**
     * @return the px
     */
    public Player getPx() {
        return px;
    }

    /**
     * @return the po
     */
    public Player getPo() {
        return po;
    }

    
    
}
