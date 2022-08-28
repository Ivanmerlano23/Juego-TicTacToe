/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ivan Merlano
 */
public class JuegoTicTacToe implements Serializable{
    ArrayList<Player>p=new ArrayList<>();
    ArrayList<Registro>r=new ArrayList<>();
    ArrayList<Partida>pa=new ArrayList<>();
    
     public JuegoTicTacToe() {
    }


    
    public void addPlayer(Player pla){
        p.add(pla);
    }
    
    public void addRegistro(Registro reg){
        r.add(reg);
    }
    public void addPartida(Partida par){
        pa.add(par);
    }
    
    public String listadoPartida(){
        String lis="";
        for (int i = 0; i < pa.size(); i++) {
            Partida parti = pa.get(i);
            lis+=""+parti.toString()+"\n";
        }
        return lis;
    }
    
    public String listadoPlayer(){
        String lis="";
        for (int i = 0; i < p.size(); i++) {
            Player pe= p.get(i);
            lis+=""+pe.toString()+"\n";
        }return lis;
    }
    
    public String listadoRegistro(){
        String lis="";
        for (int i = 0; i < r.size(); i++) {
            Registro res = r.get(i);
            lis+=""+res.toString()+"\n";
        }return lis;
    }
    
}
