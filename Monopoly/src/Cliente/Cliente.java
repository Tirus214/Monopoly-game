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
    PantallaEspera refPantalla2;
    public ThreadJugador hiloCliente;
    private Paquete paquete;
    public String nombre;
    public String imagen;

    public Cliente(PantallaJugador refPantalla, PantallaEspera refPantalla2, String nombre, String imagen) {
        this.refPantalla = refPantalla;
        this.refPantalla2 = refPantalla2;  
        refPantalla.setRefCliente(this);
        this.imagen = imagen;
        this.nombre = nombre;
    }
    
    public void conectar(){
 
        try{
            socketRef = new Socket("localhost", 35577);
            hiloCliente = new ThreadJugador(socketRef, refPantalla, refPantalla2);
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
