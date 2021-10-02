
package Hilos;
import static Operaciones.operaciones.RefreshTowers;
import static Operaciones.operaciones.verification;
import Pantallas.Pantallas;
import static Pantallas.juego.GameOver;
import static Pantallas.juego.frame;
import static Pantallas.juego.lblValorMovimiento;
import static Pantallas.juego.lblValorTiempo;






public class General extends Thread {
    public void run() {
        while (GameOver) {
           
            RefreshTowers();
            verification();
            
            frame.invalidate();
            frame.validate();
            frame.repaint();
            
            lblValorTiempo.setText(String.valueOf(Pantallas.Tiempo));
            lblValorMovimiento.setText(String.valueOf(Pantallas.Cantidad_Discos));
        }
       
    }
}
