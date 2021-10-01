/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Pantallas.Pantallas ;
import Objetos.torre1;

public class main {

    public static void main(String[] args) {
        int[] Base = new int[7];
        int[] Vacio = new int[7];
        Base = First(Base);
        Vacio = Clean(Vacio);
      
        torre1 T1 = new torre1(Base);
        torre1 T2 = new torre1(Vacio);
        torre1 T3 = new torre1(Vacio);
        
        
        for(int i=0; i<7;i++){
            System.out.println(T1.getDiscos()[i]);
        }
	Pantallas.Menu();	
        
    }
    
    public static int[] Clean(int[] array){
        for(int i=0; i<7;i++){
            array[i] = 0; 
        }

        return array;
    }
    
    public static int[] First(int[] array){
        for(int i=0; i<7;i++){
            array[i] = i+1; 
        }

        return array;
    }

    
}


