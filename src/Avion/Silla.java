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
public class Silla {
    private char pocision;
    private int tipo;
    private int numero;
    private Cliente pasajero;

    public Silla(char pos, int tipo, int num) {
        this.pocision = pos;
        this.tipo = tipo;
        this.numero = num;
        this.pasajero=null;
    }
    
    public boolean asignarPocision(Cliente p)
    {
        boolean disponible=true;
        if(pasajero!=null)
        {
            disponible=false;
        }
        else
        {
            disponible=true;
            this.pasajero=p;
        }        
        return disponible;
    }
    
    public void liberar()
    {
        this.pasajero = null; 
    }

    public char getPocision() {
        return pocision;
    }

    public int getTipo() {
        return tipo;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getPasajero() {
        return pasajero;
    }
    
    
    
}
