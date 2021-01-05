/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

/**
 *
 * @author Jean Paul
 */
public class Propiedad extends Casilla{
    public int costo;
    public boolean libre;
    public String owner;
    
    public Propiedad(String nombre, int costo){
        super(nombre);
        this.nombre = nombre;
        this.costo = costo;
        this.libre = true;
        this.owner = "";
    }
    
    public void comprar(String owner){
        this.owner = owner;
        this.libre = false;
    }
    
    public void hipotecar(){
        this.owner = "Banco";
    }

}
