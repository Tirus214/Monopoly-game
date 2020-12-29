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
public class Propiedad {
    public String nombre;
    public String color;
    public int costo;
    public int alquiler;
    public boolean libre;
    public String owner;
    public int casas;
    public int hoteles;
    
    public Propiedad(String nombre, String color, int costo, int alquiler){
        this.nombre = nombre;
        this.color = color;
        this.costo = costo;
        this.alquiler = alquiler;
        this.libre = true;
        this.owner = "";
        this.casas = 0;
        this.hoteles = 0;
    }
    
    public void comprar(String owner){
        this.owner = owner;
        this.libre = false;
    }
    
    public void hipotecar(){
        this.owner = "Banco";
    }
}
