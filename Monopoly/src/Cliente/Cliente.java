  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.io.IOException;
import java.net.Socket;
import javax.swing.JOptionPane;
import Servidor.Enumerable;

/**
 *
 * @author diemo
 */
public class Cliente {
    
    Socket socketRef;
    PantallaJugador refPantalla;
    public ThreadJugador hiloCliente;

    public Cliente(PantallaJugador refPantalla) {
        this.refPantalla = refPantalla;
        refPantalla.setRefCliente(this);
    }
    
    public void conectar(){
 
        try{
        
            socketRef = new Socket("localhost", 35577);
            hiloCliente = new ThreadJugador(socketRef, refPantalla);
            hiloCliente.start();
            System.out.println("start");
            String nombre = JOptionPane.showInputDialog("Introduzca su nombre:");
            hiloCliente.writer.writeInt(1); //instruccion para el switch del thraed servidor
            hiloCliente.writer.writeUTF(nombre); //instruccion para el switch del thraed servidor
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
       
        
    }
    
}
