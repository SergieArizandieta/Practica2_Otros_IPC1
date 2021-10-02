
package Hilos;

import static Operaciones.operaciones.RefreshAll;
import Pantallas.Pantallas;
import static Pantallas.juego.frame;
import static Pantallas.Pantallas.Menu;
import static Pantallas.juego.GameOver;
import javax.swing.JOptionPane;

public class Tiempo extends Thread {
   public void run() {
      // int a = 0;
        while (GameOver) {
            try {
                //a+=1;
                //System.out.println("adios" + a);
                sleep(1000);
                Pantallas.Tiempo -=1;
                if (Pantallas.Tiempo==0){
                 
                    frame.dispose(); 
                    JOptionPane.showMessageDialog(null, "Se te ha acabado el tiempo, Perdiste  ", " Has perdido " , JOptionPane.INFORMATION_MESSAGE);
                    Menu();
                    sleep(1000);
                    RefreshAll();
                    
                    
                }
            }catch(Exception e){}
           
        } 
    }  
}
