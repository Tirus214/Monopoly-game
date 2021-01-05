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
public class PropiedadComun extends Propiedad{
    public String color;
    public int casas;
    public int hoteles;
    public int alquiler;

    public PropiedadComun(String nombre, int costo, int alquiler, String color) {
        super(nombre, costo);
        this.color = color;
        this.alquiler = alquiler;
        hoteles = 0;
        casas = 0;
    }
    
    public int cobrarAlquiler(){
        return alquiler;
    }
}
