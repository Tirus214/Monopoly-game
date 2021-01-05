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
public class ServicioPublico extends Propiedad{
    boolean todosLosServicios;
    
    public ServicioPublico(String nombre, int costo) {
        super(nombre, costo, 0);
        todosLosServicios = false;
    }
    
    public int cobrarAlquiler(int dados){
        if(todosLosServicios) return dados*10;
        return dados*4;
    }
}
