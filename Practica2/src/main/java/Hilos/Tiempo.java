
package Hilos;
 //Elemntos de otras clases
import static Operaciones.operaciones.RefreshAll;
import Pantallas.Pantallas;
import static Pantallas.juego.frame;
import static Pantallas.Pantallas.Menu;
import static Pantallas.juego.GameOver;
import static Pantallas.juego.Htimepo;
import Pantallas.juego;

 //Elemntos de java
import javax.swing.JOptionPane;



public class Tiempo extends Thread {

  
   //Hilo Tiempo en segundos
   public void run() {
        int num =0;
        while (GameOver) {
            try {
                
                if(juego.HiloTime == false){
                
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
                if (Pantallas.Tiempo<=0){
                       juego.HiloTime = true;
                       perdio();
                       
                   }  
                }
                
            }catch(Exception e){
             //System.out.println(e);
            }
           
        } 
    } 
   
   
   //metodo cuando pierda
   public void perdio(){
       
        frame.dispose(); 
        JOptionPane.showMessageDialog(null, "Se te ha acabado el tiempo, Perdiste  ", " Has perdido " , JOptionPane.INFORMATION_MESSAGE);
        Menu();
      
        RefreshAll();
        Htimepo.suspend(); 
   }
}
