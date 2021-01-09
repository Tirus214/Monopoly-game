/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import com.sun.webkit.ThemeClient;
import static java.lang.Thread.sleep;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author diemo
 */
public class Servidor{
    
    public ArrayList<ThreadServidor> conexiones;
    public boolean running;
    private ServerSocket srv;

    public Servidor() {
        running = true;
        conexiones = new ArrayList<ThreadServidor>();
    }
    
    public void stopserver(){
        running = false;
    }
    
    public void aceptarConexiones(){
        int contadorDeConexiones = 0;
        try{
            srv = new ServerSocket(35577);
            while (running && contadorDeConexiones < 6){
                Socket nuevaConexion = srv.accept();
                contadorDeConexiones++;
                
                // nuevo thread
                ThreadServidor newThread = new ThreadServidor(nuevaConexion, this);
                conexiones.add(newThread);
                newThread.start();
                
                //indica que el primer jugador es el admin
                if (contadorDeConexiones == 2){
                    conexiones.get(0).paqueteEscritura.admin = true;
                    conexiones.get(0).escribir();
                }
                
            } //end running
            iniciarJuego();  //envia la señal para que se inicie el juego en todos los clientes
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    
    public void iniciarJuego(){
        for(int i = 0; i < conexiones.size(); i++){
            conexiones.get(i).paqueteEscritura.iniciarPartida = true;
            conexiones.get(i).escribir();
        }
    }
    
    
    
}
