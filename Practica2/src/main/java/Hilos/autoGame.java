/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import  Operaciones.operaciones;
import static Operaciones.operaciones.movimintosAuto;
import static Pantallas.Pantallas.Autoframe;
import static Pantallas.Pantallas.lblMovimeintosAuto;
import static Pantallas.Pantallas.pasosAuto;
import static Pantallas.Pantallas.showAuto;


public class autoGame extends Thread {
    //Hilo del juego automatico
    public void run() {

            while (true) { 
                System.out.println("Actulizar");
                try{ 
                    sleep(1000);
                   
                    if(operaciones.jugarAuto){
                        
                        automaticGame(operaciones.disco,"Torre 1","Torre 2","Torre 3");
                        operaciones.jugarAuto = false;                   
                    }
                   
                   
                    showAuto.setListData(pasosAuto);
                    Autoframe.invalidate();
                    Autoframe.validate();
                    Autoframe.repaint();   
                    lblMovimeintosAuto.setText(String.valueOf(movimintosAuto));
                    

                }catch(Exception e){
                    //System.out.println(e);
                }  
            }
    }
    
    //Metodo recursivo para las torres
    public static void automaticGame(int Disco, String inicio, String medio, String fin){
        
        if (Disco != 0){
            movimintosAuto +=1;
            String PasoGuardado;
            automaticGame(Disco-1, inicio, fin, medio);
            PasoGuardado = ("Se movio el Disco #" + Disco + " del poste #" + inicio + " al posete #" + fin);
            pasosAuto[movimintosAuto-1] = PasoGuardado;
            automaticGame(Disco-1, medio, inicio, fin);
        }else{
           return;
        }

    }
}
