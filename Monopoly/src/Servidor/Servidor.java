/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import com.sun.webkit.ThemeClient;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author diemo
 */
public class Servidor{
    
    PantallaServidor refPantalla;
    public ArrayList<ThreadServidor> conexiones;
    private boolean running = true;
    private ServerSocket srv;

    public Servidor(PantallaServidor refPantalla) {
        this.refPantalla = refPantalla;
        conexiones = new ArrayList<ThreadServidor>();
        this.refPantalla.setSrv(this);
    }
    
    public void stopserver(){
        running = false;
    }
    
    public void runServer(){
        int contadorDeConexiones = 0;
        try{
            srv = new ServerSocket(35577);
            while (running){
                refPantalla.addMessage("::Esperando conexión ...");
                Socket nuevaConexion = srv.accept();
                contadorDeConexiones++;
                refPantalla.addMessage(":Conexión " + contadorDeConexiones + "aceptada");
                
                // nuevo thread
                ThreadServidor newThread = new ThreadServidor(nuevaConexion, this);
                conexiones.add(newThread);
                newThread.start();
                
                
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    
    
    
}
