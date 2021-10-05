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
import java.util.concurrent.TimeUnit;

public class autoGame extends Thread {
    //-----------------------------------------------------------------------------
    
    //guarda la info de los movimientos
    public static String dataaux = "";
    
    //valida que no se pueda salir si no terminado el proceso
    public static boolean RegresarValidacion =true ;
    
    //-------------------------------------------------------------------------------
    //Hilo del juego automatico
    public void run() {

            while (true) { 
               
                try{ 
                    sleep(100);
                   
                    if(operaciones.jugarAuto){
                        RegresarValidacion = false;
                        automaticGame("Torre 1","Torre 2",operaciones.disco,"Torre 3");
                        dataaux ="";
                        RegresarValidacion = true;
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
    public static void automaticGame( String inicio, String medio,int Disco, String fin){
        try {
            if (Disco != 0){
              
                                
                automaticGame( inicio, fin,Disco-1, medio);
              
                String PasoGuardado = ("Se movio el Disco #" + Disco + " del poste #" + inicio + " al posete #" + fin);
                //----Actuliza frame
                movimintosAuto+=1;
                dataaux += PasoGuardado + "~";
                pasosAuto = dataaux.split("~");
                showAuto.setListData(pasosAuto);
                Autoframe.invalidate();
                Autoframe.validate();
                Autoframe.repaint();   
                lblMovimeintosAuto.setText(String.valueOf(movimintosAuto));
                TimeUnit.SECONDS.sleep(1); // delay few seconds (1)
                //--
                
            
                automaticGame( medio, inicio,Disco-1, fin);
            }else{
               return;
            }

        } catch (InterruptedException e) {
         //Sytem.out.print(e);
        }
    }
}
