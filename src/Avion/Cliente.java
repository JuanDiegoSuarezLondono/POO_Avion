/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Avion;

/**
 *
 * @author suare
 */
public class Cliente {
    private String Nombre;
    private int Cedula;

    public Cliente(String Nombre, int Cedula) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
    }
    
    
    
    public String getNombre() {
        return Nombre;
    }

    public int getCedula() {
        return Cedula;
    }
    
    
    
}
