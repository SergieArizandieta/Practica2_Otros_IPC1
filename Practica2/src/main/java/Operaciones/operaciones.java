
package Operaciones;
import static Pantallas.juego.T1;
import static Pantallas.juego.T2;
import static Pantallas.juego.T3;
public class operaciones {
  
    //Mover disco de Torre 1 a Torre 2
    public  static void NextT1(){
        int T1auxDisc = 0;
        int T1posiX = 0;
        int T1posiY = 0;
        int T1Large = 0;
            
        for (int i=6;i>=0;i--){
            if (T1[i].getDisco() !=0){     
                T1auxDisc = T1[i].getDisco();
                T1posiX = T1[i].getPosicionx();
                T1posiY = T1[i].getPosiciony();
                T1Large = T1[i].getLargo();
                
                T1[i].setDisco(0);
                T1[i].setPosicionx(0);
                T1[i].setPosiciony(0);
                T1[i].setLargo(0);
                break;
            } 
        }
        
        for (int i=0;i<7;i++){
            if (T2[i].getDisco() ==0){
                T2[i].setDisco(T1auxDisc);
                T2[i].setPosicionx(T1posiX);
                T2[i].setPosiciony(T1posiY);
                T2[i].setLargo(T1Large);
                break; 
            } 
        }
          
        System.out.println("Toree1");
        for (int i=6;i>=0;i--){
            if (T1[i].getDisco() !=0){
                System.out.println( T1[i].getDisco() + " enx:" + T1[i].getPosicionx() + " Eny:" + T1[i].getPosiciony() + " largo: " + T1[i].getLargo());
            }
        } 
        System.out.println("Toree2");
        for (int i=6;i>=0;i--){
            if (T2[i].getDisco() !=0){
                System.out.println( T2[i].getDisco() + " enx:" + T2[i].getPosicionx() + " Eny:" + T2[i].getPosiciony() + " largo: " + T2[i].getLargo());
            }
        }  
        
       
    } 
    
    //Mover disco de Torre 2 a Torre 3
    public static void NextT2(){
        int T2auxDisc = 0;
        int T2posiX = 0;
        int T2posiY = 0;
        int T2Large = 0;
            
        for (int i=6;i>=0;i--){
            if (T2[i].getDisco() !=0){     
                T2auxDisc = T2[i].getDisco();
                T2posiX = T2[i].getPosicionx();
                T2posiY = T2[i].getPosiciony();
                T2Large = T2[i].getLargo();
                
                T2[i].setDisco(0);
                T2[i].setPosicionx(0);
                T2[i].setPosiciony(0);
                T2[i].setLargo(0);
                break;
            } 
        }
        
        for (int i=0;i<7;i++){
            if (T3[i].getDisco() ==0){
                T3[i].setDisco(T2auxDisc);
                T3[i].setPosicionx(T2posiX);
                T3[i].setPosiciony(T2posiY);
                T3[i].setLargo(T2Large);
                break;
            } 
        }
          
        
        System.out.println("Torre2");
        for (int i=6;i>=0;i--){
            if (T2[i].getDisco() !=0){
                System.out.println( T2[i].getDisco() + " enx:" + T2[i].getPosicionx() + " Eny:" + T2[i].getPosiciony() + " largo: " + T2[i].getLargo());
            }
        } 
        System.out.println("Torre3");
        for (int i=6;i>=0;i--){
            if (T3[i].getDisco() !=0){
                System.out.println( T3[i].getDisco() + " enx:" + T3[i].getPosicionx() + " Eny:" + T3[i].getPosiciony() + " largo: " + T3[i].getLargo());
            }
        }  
        
       
    } 
    
    
    //Mover disco de Torre 2 a Torre 1
    public static void Back2(){
        int T2auxDisc = 0;
        int T2posiX = 0;
        int T2posiY = 0;
        int T2Large = 0;
            
        for (int i=6;i>=0;i--){
            if (T2[i].getDisco() !=0){     
                T2auxDisc = T2[i].getDisco();
                T2posiX = T2[i].getPosicionx();
                T2posiY = T2[i].getPosiciony();
                T2Large = T2[i].getLargo();
                
                T2[i].setDisco(0);
                T2[i].setPosicionx(0);
                T2[i].setPosiciony(0);
                T2[i].setLargo(0);
                break;
            } 
        }
        
        for (int i=0;i<7;i++){
            if (T1[i].getDisco() ==0){
                T1[i].setDisco(T2auxDisc);
                T1[i].setPosicionx(T2posiX);
                T1[i].setPosiciony(T2posiY);
                T1[i].setLargo(T2Large);
                break;
            } 
        }
          
        System.out.println("Torre1");
        for (int i=6;i>=0;i--){
            if (T1[i].getDisco() !=0){
                System.out.println( T1[i].getDisco() + " enx:" + T1[i].getPosicionx() + " Eny:" + T1[i].getPosiciony() + " largo: " + T1[i].getLargo());
            }
        }  
        
        System.out.println("Torre2");
        for (int i=6;i>=0;i--){
            if (T2[i].getDisco() !=0){
                System.out.println( T2[i].getDisco() + " enx:" + T2[i].getPosicionx() + " Eny:" + T2[i].getPosiciony() + " largo: " + T2[i].getLargo());
            }
        } 
    } 
    
    //Mover disco de Torre 3 a Torre 2
    public static void Back3(){
        int T3auxDisc = 0;
        int T3posiX = 0;
        int T3posiY = 0;
        int T3Large = 0;
            
        for (int i=6;i>=0;i--){
            if (T3[i].getDisco() !=0){     
                T3auxDisc = T3[i].getDisco();
                T3posiX = T3[i].getPosicionx();
                T3posiY = T3[i].getPosiciony();
                T3Large = T3[i].getLargo();
                
                T3[i].setDisco(0);
                T3[i].setPosicionx(0);
                T3[i].setPosiciony(0);
                T3[i].setLargo(0);
                break;
            } 
        }
        
        for (int i=0;i<7;i++){
            if (T2[i].getDisco() ==0){
                T2[i].setDisco(T3auxDisc);
                T2[i].setPosicionx(T3posiX);
                T2[i].setPosiciony(T3posiY);
                T2[i].setLargo(T3Large);
                break;
            } 
        }
          
        System.out.println("Torre2");
        for (int i=6;i>=0;i--){
            if (T2[i].getDisco() !=0){
                System.out.println( T2[i].getDisco() + " enx:" + T2[i].getPosicionx() + " Eny:" + T2[i].getPosiciony() + " largo: " + T2[i].getLargo());
            }
        }  
        
        System.out.println("Torre3");
        for (int i=6;i>=0;i--){
            if (T3[i].getDisco() !=0){
                System.out.println( T3[i].getDisco() + " enx:" + T3[i].getPosicionx() + " Eny:" + T3[i].getPosiciony() + " largo: " + T3[i].getLargo());
            }
        } 
    } 
}
