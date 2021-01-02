/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

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
class ThreadServidor extends Thread{
    
    private Socket socketRef;
    private ObjectInput reader;
    private ObjectOutput writer;
    private String nombre;
    private boolean running = true;
    Servidor server;
    Paquete paqueteLectura;
    Paquete paqueteEscritura;

    public ThreadServidor(Socket socketRef, Servidor server) throws IOException {
        this.socketRef = socketRef;
        this.server = server;
        paqueteLectura = new Paquete();
        paqueteEscritura = new Paquete();
    }
    
    public void run (){
        
        while (running){
            try {
                paqueteLectura = (Paquete) reader.readObject(); // esperar hasta que reciba un entero
                
                if(paqueteLectura.iniciarPartida){
                    
                }
                else if(paqueteLectura.comprar){
                    
                }
                else if(paqueteLectura.hipotecar){
                    
                }
                else if(paqueteLectura.pasarSalida){
                    
                }
                else if(paqueteLectura.tirar){
                    
                }
                
            } catch (IOException ex) {
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ThreadServidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
