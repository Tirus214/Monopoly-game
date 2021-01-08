/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Servidor.Paquete;
import Servidor.Servidor;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.M;

/**
 *
 * @author diemo
 */
public class ThreadJugador extends Thread{
    
    //tranferencia de datos
    private Socket socketRef;
    private ObjectInputStream reader;
    private ObjectOutputStream writer;
    Paquete paqueteLectura;
    Paquete paqueteEscritura;

    //referencias a las pantallas
    private PantallaJugador refPantalla;
    private PantallaEspera refPantalla2;
    
    //datos del cliente
    public boolean admin;
    public String imagen;
    public String nombre;
    
    private boolean running = true;

    
    
    public ThreadJugador(Socket socketRef, PantallaJugador refPantalla, PantallaEspera refPantalla2) throws IOException {
        this.socketRef = socketRef;
        this.refPantalla = refPantalla;
        this.refPantalla2 = refPantalla2;
        paqueteLectura = new Paquete();
        paqueteEscritura = new Paquete();
        nombre = "";
        imagen = "";
        admin = false;
        writer = new ObjectOutputStream(socketRef.getOutputStream());
        reader = new ObjectInputStream(socketRef.getInputStream());
    }
    
    public void run (){ 
        sendData();  //envia la info del cliente y la coloca en la pantalla
        
        while (running){
            try {
                paqueteLectura = (Paquete) reader.readObject(); // espera hasta recibir un paquete de datos
                
                if(paqueteLectura.iniciarTodos){
                    refPantalla2.setVisible(false);
                    refPantalla.setVisible(true);
                }
                else if(paqueteLectura.admin){
                    //refPantalla2
                }
                else if(paqueteLectura.hipotecar){
                    
                }
                else if(paqueteLectura.pasarSalida){
                    
                }
                else if(paqueteLectura.tirar){
                    
                }
                
            } catch (IOException ex) {
                System.out.println("Error-1");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error-2");
                Logger.getLogger(ThreadJugador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            paqueteEscritura.clear();
            paqueteLectura.clear();
        }
    }
    
    
    public void sendData(){
        //coloca los datos en el paquete
        paqueteEscritura.imagen = imagen;
        paqueteEscritura.nombre = nombre;
        paqueteEscritura.iniciarJudador = true;
        
        try {
            writer.writeObject(paqueteEscritura);  //envía los datos al server
            refPantalla.setImagenFicha(imagen);
            refPantalla.setNombreJugador(nombre);
            
        } catch (IOException ex) {
            //Logger.getLogger(ThreadJugador.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Se cayó en sendData");
        }
        
        paqueteEscritura.clear(); //limpia el paquete para en siguiente envío de datos
    }
    
    
    public void iniciarPartida(){
        if(admin){
            paqueteEscritura.iniciarPartida = true;
            escribir();
        }
    }
    
    
    public void tirarDados(){
        paqueteEscritura.tirar = true;
        paqueteEscritura.numero = (int) Math.floor(Math.random()*(12-2+1)+2);
        paqueteEscritura.nombre = nombre;
        escribir();
    }
    
    
    public void escribir(){
        try {
                writer.writeObject(paqueteEscritura);
            } catch (IOException ex) {
                Logger.getLogger(ThreadJugador.class.getName()).log(Level.SEVERE, null, ex);
            }
            paqueteEscritura.clear();
    }
    
}
