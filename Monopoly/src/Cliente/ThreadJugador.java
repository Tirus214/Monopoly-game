/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Servidor.Paquete;
import Servidor.Servidor;
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
public class ThreadJugador extends Thread{
    
    private Socket socketRef;
    private ObjectInputStream reader;
    private ObjectOutputStream writer;
    String nombre;
    private boolean running = true;
    Servidor server;
    Paquete paqueteLectura;
    Paquete paqueteEscritura;
    private PantallaJugador refPantalla;
    private PantallaEspera refPantalla2;
    public boolean admin;
    String imagen;

    public ThreadJugador(Socket socketRef, PantallaJugador refPantalla, PantallaEspera refPantalla2) throws IOException {
        this.socketRef = socketRef;
        this.refPantalla = refPantalla;
        this.refPantalla2 = refPantalla2;
        paqueteLectura = new Paquete();
        paqueteEscritura = new Paquete();
        nombre = "";
        imagen = "";
        reader = new ObjectInputStream(socketRef.getInputStream());
        writer = new ObjectOutputStream(socketRef.getOutputStream());
    }
    
    public void run (){
        paqueteEscritura.imagen = imagen;
        paqueteEscritura.nombre = nombre;
        paqueteEscritura.iniciarJudador = true;
        try {
            writer.writeObject(paqueteEscritura);
        } catch (IOException ex) {
            Logger.getLogger(ThreadJugador.class.getName()).log(Level.SEVERE, null, ex);
        }

        while (running){
            try {
                paqueteLectura = (Paquete) reader.readObject(); // esperar hasta que reciba un entero
                
                if(paqueteLectura.iniciarTodos){
                    refPantalla2.setVisible(false);
                    refPantalla.setVisible(true);
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
                Logger.getLogger(ThreadJugador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
