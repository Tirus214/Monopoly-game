/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.util.ArrayList;

/**
 *
 * @author Jean Paul
 */
public class Banco {
    int dinero;
    ArrayList<Propiedad> propiedades;
    
    public Banco(){
        dinero = 100000;
        propiedades = new ArrayList<Propiedad>();
    }
}
