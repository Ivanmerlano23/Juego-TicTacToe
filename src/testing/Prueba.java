/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;
import datos.JuegoTicTacToe;
import datos.Partida;
import datos.PlayerO;
import datos.PlayerX;
import datos.Registro;
import datos.VacioException;
import java.io.IOException;
import javax.swing.JOptionPane;
import persistencia.ArchiJuego;
/**
 *
 * @author Ivan Merlano
 */
public class Prueba {
     public static void main(String[] args) throws IOException, ClassNotFoundException, VacioException {
        JuegoTicTacToe ob=new JuegoTicTacToe();
        guardar(ob);
         JOptionPane.showMessageDialog(null, "Se ha guardado correctamente");
    
        JuegoTicTacToe ota=recuperar();
        JOptionPane.showMessageDialog(null,ota.listadoPlayer());
        JOptionPane.showMessageDialog(null,ota.listadoPartida());
        JOptionPane.showMessageDialog(null,ota.listadoRegistro());
        
    }
    
    private static void guardar(JuegoTicTacToe ob) throws IOException, VacioException{
        PlayerO po=new PlayerO("Melissa", "O");
        PlayerO po2=new PlayerO("Camilo", "O");
        PlayerO po3=new PlayerO("Molosso", "O");
        PlayerX px=new PlayerX("Iván", "X");
        PlayerX px2=new PlayerX("Guillermo", "X");
        PlayerX px3=new PlayerX("Folopo", "X");
        Partida p=new Partida(px, po);
        Partida p2=new Partida(px2, po2);
        Partida p3=new Partida(px3, po3);
        Registro r=new Registro(1234, po);
        Registro r2=new Registro(1758, po2);
        Registro r3=new Registro(1087, po3);
        Registro r4=new Registro(1983, px);
        Registro r5=new Registro(1830, px2);
        Registro r6=new Registro(1647, px3);
        
        ob.addPlayer(po);
        ob.addPlayer(po2);
        ob.addPlayer(po3);
        ob.addPlayer(px);
        ob.addPlayer(px2);
        ob.addPlayer(px3);
        ob.addRegistro(r);
        ob.addRegistro(r2);
        ob.addRegistro(r3);
        ob.addRegistro(r4);
        ob.addRegistro(r5);
        ob.addRegistro(r6);
        ob.addPartida(p);
        ob.addPartida(p2);
        ob.addPartida(p3);
  
        ArchiJuego per= new ArchiJuego();
        per.guardar(ob);
        JOptionPane.showMessageDialog(null,"Almacenamiento Correcto");
    }
    
    private static JuegoTicTacToe recuperar() throws IOException, ClassNotFoundException{
        ArchiJuego per= new ArchiJuego();
        return per.recuperar();
    }
    
}
