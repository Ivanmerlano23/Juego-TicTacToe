/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;
import datos.JuegoTicTacToe;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author Ivan Merlano
 */
public class ArchiJuego {
    public void guardar(JuegoTicTacToe j) throws FileNotFoundException, IOException{
        ObjectOutputStream salida= new ObjectOutputStream(new FileOutputStream("juego.obj"));
        salida.writeObject(j);
        salida.close();
    }
    
    public JuegoTicTacToe recuperar() throws FileNotFoundException, IOException, ClassNotFoundException{
       ObjectInputStream entrada= new ObjectInputStream(new FileInputStream("juego.obj"));
       JuegoTicTacToe juego= (JuegoTicTacToe) entrada.readObject();
               entrada.close();
               return juego;
    }
    
    
}
