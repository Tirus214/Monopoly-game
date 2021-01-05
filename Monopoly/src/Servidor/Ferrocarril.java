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
public class Ferrocarril extends Propiedad{
    int cantFerrocarriles;
    int alquiler;
    
    public Ferrocarril(String nombre, int costo, int alquiler) {
        super(nombre, costo);
        cantFerrocarriles = 1;
    }
    
    public int cobrarAlquiler(){
        return alquiler*cantFerrocarriles;
    }
    
}
