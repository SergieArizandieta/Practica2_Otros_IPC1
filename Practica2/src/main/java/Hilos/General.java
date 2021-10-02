
package Hilos;
import static Operaciones.operaciones.RefreshTowers;
import static Operaciones.operaciones.verification;
import Pantallas.Pantallas;
import static Pantallas.juego.GameOver;
import static Pantallas.juego.MoviemintosTotales;
import static Pantallas.juego.frame;
import static Pantallas.juego.lblValorMovimiento;
import static Pantallas.juego.lblValorTiempo;

public class General extends Thread {
    public void run() {
        int a = 0;
        while (GameOver) {           
            try{
                a+=1;
                System.out.println("Hola" + a);
                RefreshTowers();
                verification();

                frame.invalidate();
                frame.validate();
                frame.repaint();

                lblValorTiempo.setText(String.valueOf(Pantallas.Tiempo));
                lblValorMovimiento.setText(String.valueOf(MoviemintosTotales));
                sleep(100);
            }catch(Exception e){
                System.out.println(e);
            }  
        }
       
    }
}
