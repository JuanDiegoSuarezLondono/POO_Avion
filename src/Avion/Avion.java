/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Avion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author suare
 */
public class Avion {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Aerolinea A1=new Aerolinea(50);
    Cliente C[]=new Cliente[10];    
    int seleccionar;    
    boolean salir=false;
    int contCliente=0;
    do
    {
        System.out.println("____________________________________________________");
        System.out.println("Bienvenido a aerolineas J&D");
        System.out.println("1) Ingrese cliente y asignar puesto");
        System.out.println("2) Liberar silla");
        System.out.println("3) Consultar libres");
        System.out.println("4) Consultar ocupados");
        System.out.println("5) Libres de un tipo");
        System.out.println("6) Libres posicion");
        System.out.println("");
        seleccionar=Integer.parseInt(br.readLine());
        switch(seleccionar)
        {
            case 1:
                System.out.println(" Nombre y cedula: ");
                C[contCliente]=new Cliente(br.readLine(),Integer.parseInt(br.readLine()));
                System.out.println(" La posicion y el tipo de silla: ");
                System.out.println(A1.asignar(C[contCliente], br.readLine().charAt(0),Integer.parseInt(br.readLine())));
                contCliente++;
                System.out.println("");
            break;
            
            case 2:
                System.out.println(" Que silla quiere liberar?: ");
                A1.liberar(Integer.parseInt(br.readLine()));
                System.out.println("");
            break;
            
            case 3:
                System.out.println(" Hay "+A1.libre()+" sillas libres");
                System.out.println("");
            break;
            
            case 4:
                System.out.println(" Hay "+A1.ocupados()+" sillas ocupadas");
                System.out.println("");
            break;
            
            case 5:
                System.out.println(" Tipo: ");
                System.out.println(" Hay "+A1.libres(Integer.parseInt(br.readLine()))+" libres");
                System.out.println("");
            break;
            
            case 6:
                System.out.println(" Posicion: ");
                System.out.println(" Hay "+A1.libres2(br.readLine().charAt(0))+" libres");
                System.out.println("");
            break;
            
            default:                
            break;
        }
        
    }
    while(salir==false);      
        
        // TODO code application logic here
    }
    
}
