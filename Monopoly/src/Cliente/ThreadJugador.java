/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Servidor.Paquete;
import Servidor.Servidor;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diemo
 */
public class ThreadJugador extends Thread{
    
    private Socket socketRef;
    private ObjectInput reader;
    ObjectOutput writer;
    private String nombre;
    private boolean running = true;
    Servidor server;
    Paquete paquete;
    private PantallaJugador refPantalla;

    public ThreadJugador(Socket socketRef, PantallaJugador refPantalla) throws IOException {
        this.socketRef = socketRef;
        this.refPantalla = refPantalla;
    }
    
    public void run (){
        
        while (running){
            try {
                paquete = (Paquete) reader.readObject(); // esperar hasta que reciba un entero
                
                if(paquete.iniciar){
                    
                }
                else if(paquete.comprar){
                    
                }
                else if(paquete.hipotecar){
                    
                }
                else if(paquete.pasarSalida){
                    
                }
                else if(paquete.tirar){
                    
                }
                
            } catch (IOException ex) {
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ThreadJugador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
