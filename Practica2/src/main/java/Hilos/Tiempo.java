
package Hilos;

import Pantallas.Pantallas;
import static Pantallas.juego.GameOver;

public class Tiempo extends Thread {
   public void run() {
        while (GameOver) {
            try {
                sleep(1000);
                Pantallas.Tiempo -=1;
               
            }catch(Exception e){}
           
        } 
    }  
}
