/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import Cliente.ThreadJugador;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diemo
 */
class ThreadServidor extends Thread{
    
    private Socket socketRef;
    private ObjectInputStream reader;
    private ObjectOutputStream writer;
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
        reader = new ObjectInputStream(socketRef.getInputStream());
        writer = new ObjectOutputStream(socketRef.getOutputStream());
    }
    
    public void run (){
        
        while (running){
            try {
                paqueteLectura = (Paquete) reader.readObject(); // esperar hasta que reciba un entero
                
                if(paqueteLectura.iniciarJudador){
                    System.out.println(paqueteLectura.nombre + "    " + paqueteLectura.imagen);
                }
                
                if(paqueteLectura.iniciarPartida){
                    server.running = false;
                    
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
            
            paqueteEscritura.clear();
            paqueteLectura.clear();
        }
    }
    
    
    
    
    public void escribir(){
        try {
            writer.writeObject(paqueteEscritura);
        } catch (IOException ex) {
            Logger.getLogger(ThreadJugador.class.getName()).log(Level.SEVERE, null, ex);
        }
        paqueteEscritura.clear();
    }
    
    
    
    
    public void iniciarTodos(){
        paqueteLectura.iniciarTodos = true;
        try {
            writer.writeObject(paqueteLectura);
        } catch (IOException ex) {
            Logger.getLogger(ThreadServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        paqueteLectura.clear();
    }

}
