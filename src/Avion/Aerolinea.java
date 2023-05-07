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
public class Aerolinea {
    private Silla Pasajeros[];
    
    public Aerolinea(int n) 
    {
        Pasajeros=new Silla[n];
        
        Pasajeros [0]=new Silla('V',1,1);     
        Pasajeros [1]=new Silla('P',1,2);
        Pasajeros [2]=new Silla('P',1,3);
        Pasajeros [3]=new Silla('V',1,4);
        Pasajeros [4]=new Silla('V',1,5);
        Pasajeros [5]=new Silla('P',1,6);
        Pasajeros [6]=new Silla('P',1,7);
        Pasajeros [7]=new Silla('V',1,8);
        
        for (int i=0;i<(n-8)/6;i++)
        {
        Pasajeros [8+(6*i)]=new Silla('V',2,(9+(6*i)));     
        Pasajeros [9+(6*i)]=new Silla('C',2,(10+(6*i)));
        Pasajeros [10+(6*i)]=new Silla('P',2,(11+(6*i)));
        Pasajeros [11+(6*i)]=new Silla('P',2,(12+(6*i)));
        Pasajeros [12+(6*i)]=new Silla('C',2,(13+(6*i)));
        Pasajeros [13+(6*i)]=new Silla('V',2,(14+(6*i)));
        }          
    }
    
    
    public boolean asignar(Cliente p, char pos, int tipo)
    {
        int tamaño=Pasajeros.length;
        boolean disponible=false;
        for(int i=0;i<tamaño;i++)
        {
            if(Pasajeros[i].getPocision()==pos && Pasajeros[i].getTipo()==tipo)
            {
                if(Pasajeros[i].asignarPocision(p))
                {
                disponible=true; 
                i=tamaño;
                }
            }
            else
            {
                disponible=false;
            }
        }
        return disponible;
    }
    
    public void liberar(int ced)
    {
        Pasajeros[ced-1].liberar();
    }
    
    public int libre()
    {
        int tamaño=Pasajeros.length;
        int contador=0;
        
        for(int i=0;i<tamaño;i++)
        {
            if (Pasajeros[i].getPasajero()==null)
            {
                contador++;
            }
        }
        return contador;
    }
    
    public int ocupados()
    {
        int tamaño=Pasajeros.length;
        int contador=0;
        
        for(int i=0;i<tamaño;i++)
        {
            if (Pasajeros[i].getPasajero()!=null)
            {
                contador++;
            }
        }
        return contador;
    }
            
    public int libres(int tipo)
    {
        int tamaño=Pasajeros.length;
        int contador=0;
        
        for(int i=0;i<tamaño;i++)
        {
            if (Pasajeros[i].getPasajero()==null && Pasajeros[i].getTipo()==tipo)
            {
                contador++;
            }
        }
        return contador;
    }
    
    public int libres2(char pos)
    {
        int tamaño=Pasajeros.length;
        int contador=0;
        
        for(int i=0;i<tamaño;i++)
        {
            if (Pasajeros[i].getPasajero()==null && Pasajeros[i].getPocision()==pos)
            {
                contador++;
            }
        }
        return contador;
    }
       
}
