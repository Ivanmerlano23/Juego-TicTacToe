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
public class Player implements Serializable{
    protected String nombre;
    protected String tiposigno;
    

    public Player(String nombre, String tiposigno) throws VacioException {
        validarN(nombre);
        this.nombre = nombre;
        this.tiposigno = tiposigno;
    }
    
    public String forma(){
        return "";
    }
    
    @Override
    public String toString() {
        return "Player{" + "nombre=" + getNombre() + ", tiposigno=" + isTiposigno() + '}';
    }
    
   

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tiposigno
     */
    public String isTiposigno() {
        return tiposigno;
    }

    /**
     * @param tiposigno the tiposigno to set
     */
    public void setTiposigno(String tiposigno) {
        this.tiposigno = tiposigno;
    }

    private void validarN(String nombre) throws VacioException {
        if(nombre.equals("")){
            throw new VacioException("Error, Digite su nombre porfavor!");
        }   
    }
     
}
