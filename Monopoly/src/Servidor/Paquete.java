/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.io.Serializable;

/**
 *
 * @author Jean Paul
 */
public class Paquete implements Serializable{
    public String nombre1;
    public String nombre2;
    public String imagen;
    public String mensaje;
    public boolean sms;
    public boolean iniciarJugador;
    public boolean iniciarPartida;
    public boolean iniciarTodos;
    public boolean tirar;
    public boolean comprar;
    public boolean hipotecar;
    public boolean pasarSalida;
    public boolean admin;
    public int numero;
    //******SI AGREGAN ALGO MÁS, LO AGREGAN DE AQUI PARA ABAJO*****
    //******PARA QUE ESTE ORDENADO CON RESPECTO A LO QUE YA INICIALIZAMOS EN EL CONSTRUCTOR
    public boolean activarBotonIniciar;
    public boolean pagarAlquiler;
    public boolean salida;
    public boolean colocarCasa;
    public boolean salirCarcel;
    
    public Paquete(){
        clear();
    }
    
    public void clear(){
        nombre1 = "";
        nombre2 = "";
        imagen = "";
        mensaje = "";
        sms = false;
        iniciarJugador = false;
        iniciarPartida = false;
        iniciarTodos = false;
        tirar = false;
        comprar = false;
        hipotecar = false;
        pasarSalida = false;
        admin = false;
        numero = 0;
        //******SI AGREGAN ALGO MÁS, LO AGREGAN DE AQUI PARA ABAJO*****
        activarBotonIniciar = false;
        pagarAlquiler = false;
        salida = false;
        colocarCasa = false;
        salirCarcel = false;
    }
}
