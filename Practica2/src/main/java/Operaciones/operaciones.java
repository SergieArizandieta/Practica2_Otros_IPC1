
package Operaciones;
import static Pantallas.juego.Disco1;
import static Pantallas.juego.Disco2;
import static Pantallas.juego.Disco3;
import static Pantallas.juego.Disco4;
import static Pantallas.juego.Disco5;
import static Pantallas.juego.Disco6;
import static Pantallas.juego.Disco7;
import static Pantallas.juego.T1;
import static Pantallas.juego.T2;
import static Pantallas.juego.T3;
public class operaciones {
  
    //Mover disco de Torre 1 a Torre 2
    public  static void NextT1(){
        int T1auxDisc = 0;
        int T1Large = 0;
        int T1posiX = 0;
        int auxPosicion = 0;
            
        for (int i=0;i<7;i++){
            if (T1[i].getDisco() !=0){     
                T1auxDisc = T1[i].getDisco();   
                T1Large = T1[i].getLargo();
                T1posiX = T1[i].getPosicionx()+300;
                auxPosicion = i;
                break;
            } 
        }
        
        for (int i=6;i>=0;i--){
            if (T2[i].getDisco() ==0){
                if (i != 6){
                    if(T2[i+1].getDisco()> T1auxDisc){
                        T1aT2( i, T1posiX, T1auxDisc, T1Large, auxPosicion);
                    }
                }else if(i==6){
                   T1aT2( i, T1posiX, T1auxDisc, T1Large, auxPosicion);
                }
                break; 
            } 
        }
    } 
    
    public static void T1aT2(int i,int T1posiX,int T1auxDisc,int T1Large,int auxPosicion){
        T2[i].setPosicionx(T1posiX);
        T2[i].setDisco(T1auxDisc);
        T2[i].setLargo(T1Large);

        T1[auxPosicion].setDisco(0);
        T1[auxPosicion].setLargo(0);
        T1[auxPosicion].setPosicionx(0);
        
        System.out.println("Toree1");
        for (i=6;i>=0;i--){
            if (T1[i].getDisco() !=0){
                System.out.println( T1[i].getDisco() + " enx:" + T1[i].getPosicionx() + " Eny:" + T1[i].getPosiciony() + " largo: " + T1[i].getLargo());
            }
        } 
        System.out.println("Toree2");
        for (i=6;i>=0;i--){
            if (T2[i].getDisco() !=0){
                System.out.println( T2[i].getDisco() + " enx:" + T2[i].getPosicionx() + " Eny:" + T2[i].getPosiciony() + " largo: " + T2[i].getLargo());
            }
        }  
        
    }
    
    //Mover disco de Torre 2 a Torre 3
    public  static void NextT2(){
        int T2auxDisc = 0;
        int T2Large = 0;
        int T2posiX = 0;
        int auxPosicion = 0;
            
        for (int i=0;i<7;i++){
            if (T2[i].getDisco() !=0){     
                T2auxDisc = T2[i].getDisco();   
                T2Large = T2[i].getLargo();
                T2posiX = T2[i].getPosicionx()+300;
                auxPosicion = i;
                break;
            } 
        }
        
        for (int i=6;i>=0;i--){
            if (T3[i].getDisco() ==0){
                if (i != 6){
                    if(T3[i+1].getDisco()> T2auxDisc){
                        T2aT3( i, T2posiX, T2auxDisc, T2Large, auxPosicion);
                    }
                }else if(i==6){
                   T2aT3( i, T2posiX, T2auxDisc, T2Large, auxPosicion);
                }
                break; 
            } 
        }
    } 
    
    public static void T2aT3(int i,int T2posiX,int T2auxDisc,int T2Large,int auxPosicion){
        T3[i].setPosicionx(T2posiX);
        T3[i].setDisco(T2auxDisc);
        T3[i].setLargo(T2Large);

        T2[auxPosicion].setDisco(0);
        T2[auxPosicion].setLargo(0);
        T2[auxPosicion].setPosicionx(0);
        
        System.out.println("Toree2");
        for (i=6;i>=0;i--){
            if (T2[i].getDisco() !=0){
                System.out.println( T2[i].getDisco() + " enx:" + T2[i].getPosicionx() + " Eny:" + T2[i].getPosiciony() + " largo: " + T2[i].getLargo());
            }
        } 
        System.out.println("Torre3");
        for (i=6;i>=0;i--){
            if (T3[i].getDisco() !=0){
                System.out.println( T3[i].getDisco() + " enx:" + T3[i].getPosicionx() + " Eny:" + T3[i].getPosiciony() + " largo: " + T3[i].getLargo());
            }
        }  
        
    }
    
    //Mover disco de Torre 2 a Torre 1
    public  static void Back2(){
        int T2auxDisc = 0;
        int T2Large = 0;
        int T2posiX = 0;
        int auxPosicion = 0;

        for (int i=0;i<7;i++){
            if (T2[i].getDisco() !=0){     
                T2auxDisc = T2[i].getDisco();   
                T2Large = T2[i].getLargo();
                T2posiX = T2[i].getPosicionx()-300;
                auxPosicion = i;
                break;
            } 
        }

        for (int i=6;i>=0;i--){
            if (T1[i].getDisco() ==0){
                if (i != 6){
                    System.out.println("aaaa "+T1[i-1].getDisco());
                    System.out.println("bbbb "+T2auxDisc);
                    if(T1[i+1].getDisco()> T2auxDisc){
                        T2aT1( i, T2posiX, T2auxDisc, T2Large, auxPosicion);
                    }
                }else if(i==6){
                   T2aT1( i, T2posiX, T2auxDisc, T2Large, auxPosicion);
                }
                break; 
            } 
        }
    } 

    public static void T2aT1(int i,int T2posiX,int T2auxDisc,int T2Large,int auxPosicion){
        T1[i].setPosicionx(T2posiX);
        T1[i].setDisco(T2auxDisc);
        T1[i].setLargo(T2Large);

        T2[auxPosicion].setDisco(0);
        T2[auxPosicion].setLargo(0);
        T2[auxPosicion].setPosicionx(0);

        System.out.println("Toree1");
        for (i=6;i>=0;i--){
            if (T1[i].getDisco() !=0){
                System.out.println( T1[i].getDisco() + " enx:" + T1[i].getPosicionx() + " Eny:" + T1[i].getPosiciony() + " largo: " + T1[i].getLargo());
            }
        }  

        System.out.println("Torre2");
         for (i=6;i>=0;i--){
            if (T2[i].getDisco() !=0){
                System.out.println( T2[i].getDisco() + " enx:" + T2[i].getPosicionx() + " Eny:" + T2[i].getPosiciony() + " largo: " + T2[i].getLargo());
            }
        }    
    }
       
    
    //Mover disco de Torre 3 a Torre 2
    public  static void Back3(){
        int T3auxDisc = 0;
        int T3Large = 0;
        int T3posiX = 0;
        int auxPosicion = 0;

        for (int i=0;i<7;i++){
            if (T3[i].getDisco() !=0){     
                T3auxDisc = T3[i].getDisco();   
                T3Large = T3[i].getLargo();
                T3posiX = T3[i].getPosicionx()-300;
                auxPosicion = i;
                break;
            } 
        }

        for (int i=6;i>=0;i--){
            if (T2[i].getDisco() ==0){
                if (i != 6){             
                    if(T2[i+1].getDisco()> T3auxDisc){
                        T3aT2( i, T3posiX, T3auxDisc, T3Large, auxPosicion);
                    }
                }else if(i==6){
                   T3aT2( i, T3posiX, T3auxDisc, T3Large, auxPosicion);
                }
                break; 
            } 
        }
    } 

    public static void T3aT2(int i,int T3posiX,int T3auxDisc,int T3Large,int auxPosicion){
        T2[i].setPosicionx(T3posiX);
        T2[i].setDisco(T3auxDisc);
        T2[i].setLargo(T3Large);

        T3[auxPosicion].setDisco(0);
        T3[auxPosicion].setLargo(0);
        T3[auxPosicion].setPosicionx(0);

        System.out.println("Torre2");
         for (i=6;i>=0;i--){
            if (T2[i].getDisco() !=0){
                System.out.println( T2[i].getDisco() + " enx:" + T2[i].getPosicionx() + " Eny:" + T2[i].getPosiciony() + " largo: " + T2[i].getLargo());
            }
        }  
        System.out.println("Toree3");
        for (i=6;i>=0;i--){
            if (T3[i].getDisco() !=0){
                System.out.println( T3[i].getDisco() + " enx:" + T3[i].getPosicionx() + " Eny:" + T3[i].getPosiciony() + " largo: " + T3[i].getLargo());
            }
        }  

         
    }
    
    public static void RefreshTowers(){
        
        //Torre1----------------------------------------------------------------
        for (int i=6;i>=0;i--){
            if (T1[i].getDisco() !=0){
                if(T1[i].getDisco()==1){
                    Disco1.setLocation(T1[i].getPosicionx(), T1[i].getPosiciony());
                }else if(T1[i].getDisco() ==2){
                    Disco2.setLocation(T1[i].getPosicionx(), T1[i].getPosiciony());
                }else if(T1[i].getDisco() ==3){
                    Disco3.setLocation(T1[i].getPosicionx(), T1[i].getPosiciony());
                }else if(T1[i].getDisco() ==4){
                    Disco4.setLocation(T1[i].getPosicionx(), T1[i].getPosiciony());
                }else if(T1[i].getDisco() ==5){
                    Disco5.setLocation(T1[i].getPosicionx(), T1[i].getPosiciony());
                }else if(T1[i].getDisco() ==6){
                    Disco6.setLocation(T1[i].getPosicionx(), T1[i].getPosiciony());
                }else if(T1[i].getDisco() ==7){
                    Disco7.setLocation(T1[i].getPosicionx(), T1[i].getPosiciony());
                }  
            } 
        }
        
        //Torre2----------------------------------------------------------------
        for (int i=6;i>=0;i--){
            if (T2[i].getDisco() !=0){
                if(T2[i].getDisco()==1){
                    Disco1.setLocation(T2[i].getPosicionx(), T2[i].getPosiciony());
                }else if(T2[i].getDisco() ==2){
                    Disco2.setLocation(T2[i].getPosicionx(), T2[i].getPosiciony());
                }else if(T2[i].getDisco() ==3){
                    Disco3.setLocation(T2[i].getPosicionx(), T2[i].getPosiciony());
                }else if(T2[i].getDisco() ==4){
                    Disco4.setLocation(T2[i].getPosicionx(), T2[i].getPosiciony());
                }else if(T2[i].getDisco() ==5){
                    Disco5.setLocation(T2[i].getPosicionx(), T2[i].getPosiciony());
                }else if(T2[i].getDisco() ==6){
                    Disco6.setLocation(T2[i].getPosicionx(), T2[i].getPosiciony());
                }else if(T2[i].getDisco() ==7){
                    Disco7.setLocation(T2[i].getPosicionx(), T2[i].getPosiciony());
                }  
            }         
       }

        //Torre3----------------------------------------------------------------
        for (int i=6;i>=0;i--){
            if (T3[i].getDisco() !=0){
                if(T3[i].getDisco()==1){
                    Disco1.setLocation(T3[i].getPosicionx(), T3[i].getPosiciony());
                }else if(T3[i].getDisco() ==2){
                    Disco2.setLocation(T3[i].getPosicionx(), T3[i].getPosiciony());
                }else if(T3[i].getDisco() ==3){
                    Disco3.setLocation(T3[i].getPosicionx(), T3[i].getPosiciony());
                }else if(T3[i].getDisco() ==4){
                    Disco4.setLocation(T3[i].getPosicionx(), T3[i].getPosiciony());
                }else if(T3[i].getDisco() ==5){
                    Disco5.setLocation(T3[i].getPosicionx(), T3[i].getPosiciony());
                }else if(T3[i].getDisco() ==6){
                    Disco6.setLocation(T3[i].getPosicionx(), T3[i].getPosiciony());
                }else if(T3[i].getDisco() ==7){
                    Disco7.setLocation(T3[i].getPosicionx(), T3[i].getPosiciony());
                }  
            } 
        }
    }
}
