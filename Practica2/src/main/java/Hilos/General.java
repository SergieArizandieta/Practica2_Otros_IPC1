
package Hilos;
import Pantallas.Pantallas;
import static Pantallas.juego.GameOver;
import static Pantallas.juego.frame;
import static Pantallas.juego.lblValorMovimiento;
import static Pantallas.juego.lblValorTiempo;
import javax.swing.JLabel;

public class General extends Thread {
    public void run() {
        while (GameOver) {
            
            frame.invalidate();
            frame.validate();
            frame.repaint();
            
            lblValorTiempo.setText(String.valueOf(Pantallas.Tiempo));
            lblValorMovimiento.setText(String.valueOf(Pantallas.Cantidad_Discos));
            
            
            
            System.out.println("Hola");
        }
       
    }
}
