
package Hilos;
 //Elemntos de otras clases
import static Operaciones.operaciones.RefreshAll;
import Pantallas.Pantallas;
import static Pantallas.juego.frame;
import static Pantallas.Pantallas.Menu;
import static Pantallas.juego.GameOver;

 //Elemntos de java
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class Tiempo extends Thread {

   public static ThreadLocalRandom tlr = ThreadLocalRandom.current();
   
   //Hilo Tiempo en segundos 
   public void run() {
        
       
       int num =0;
        while (GameOver) {
            try {

                sleep(1000);
                num += 1000;
                Pantallas.Tiempo -=1;
                
                //Genrara objeto cada 4seg 
                if(num == 4000){
                    num = 0;
                    objetos Obj = new objetos();
                    Obj.objeto();
                    Obj.start();
                }
                
                
                //Se termino el juego
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
