
package Operaciones;
import static Pantallas.juego.T1;
import static Pantallas.juego.T2;
import static Pantallas.juego.T3;
public class operaciones {
  
    
    public  static void NextT1(){
        
        for (int i=0;i<7;i++){
            if (T1[i].getDisco() !=0){
                 System.out.println( T1[i].getDisco() + " enx:" + T1[i].getPosicionx() + " Eny:" + T1[i].getPosiciony() + " largo: " + T1[i].getLargo());
            } 
        }
        
        for (int i=0;i<7;i++){
            if (T2[i].getDisco() !=0){
                 System.out.println( T2[i].getDisco() + " enx:" + T2[i].getPosicionx() + " Eny:" + T2[i].getPosiciony() + " largo: " + T2[i].getLargo());
            } 
        }
        
    } 
    
    
}
