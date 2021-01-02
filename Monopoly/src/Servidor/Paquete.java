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
public class Paquete {
    public String mensaje;
    public boolean sms;
    public boolean iniciarPartida;
    public boolean iniciarTodos;
    public boolean tirar;
    public boolean comprar;
    public boolean hipotecar;
    public boolean pasarSalida;
    
    public Paquete(){
        mensaje = "";
        sms = false;
        iniciarPartida = false;
        iniciarTodos = false;
        comprar = false;
        hipotecar = false;
        pasarSalida = false;
    }
    
    public void clear(){
        mensaje = "";
        sms = false;
        iniciarPartida = false;
        iniciarTodos = false;
        comprar = false;
        hipotecar = false;
        pasarSalida = false;
    }
}
