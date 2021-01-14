/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.util.ArrayList;

/**
 *
 * @author Jean Paul
 */
abstract public class Casilla {
    public String nombreCasilla;
    public ArrayList<String> jugadores;
    
    public Casilla(String nombre){
        this.nombreCasilla = nombre;
        jugadores = new ArrayList<String>();
    }
}
