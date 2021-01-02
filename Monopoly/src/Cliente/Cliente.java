  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.io.IOException;
import java.net.Socket;
import javax.swing.JOptionPane;
import Servidor.Paquete;

/**
 *
 * @author diemo
 */
public class Cliente {
    
    Socket socketRef;
    PantallaJugador refPantalla;
    public ThreadJugador hiloCliente;
    private Paquete paquete;
    public String nombre;
    public String imagen;
    boolean admin;

    public Cliente(PantallaJugador refPantalla, String nombre, String imagen) {
        this.refPantalla = refPantalla;
        refPantalla.setRefCliente(this);
        this.imagen = imagen;
        this.nombre = nombre;
    }
    
    public void conectar(){
 
        try{
        
            socketRef = new Socket("localhost", 35577);
            hiloCliente = new ThreadJugador(socketRef, refPantalla);
            hiloCliente.nombre = nombre;
            hiloCliente.imagen = imagen;
            hiloCliente.start();
            System.out.println("start");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
       
        
    }
    
}
