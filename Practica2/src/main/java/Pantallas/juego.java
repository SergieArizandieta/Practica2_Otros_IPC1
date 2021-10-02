
package Pantallas;

import Objetos.torreBase;
import static Pantallas.Pantallas.Menu;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import Operaciones.operaciones;
import Hilos.General;
import Hilos.Tiempo;


public class juego {
    public static boolean GameOver = true;
    public static JFrame frame;
    public static JLabel Disco1,Disco2,Disco3,Disco4,Disco5,Disco6,Disco7;
    public static JLabel lblValorTiempo,lblValorMovimiento;
    
    
    public static int[][] Base = new int[7][2];
    public static torreBase T1[] = new torreBase[7];
    public static torreBase T2[] = new torreBase[7];
    public static torreBase T3[] = new torreBase[7];
    public static General Hgeneral = new General();
    public static Tiempo Htimepo = new Tiempo();
    
    public void startgame(){
        Initialize();
        Htimepo.start();
        Hgeneral.start();
        
    }

    public void Initialize() {
        
        System.out.println(Pantallas.Cantidad_Discos);
        System.out.println(Pantallas.Tiempo);
        //Frame---------------------------------------------------------------
        frame = new JFrame();
        frame.setTitle("Torres de Hanoi - Game");
        frame.setSize(1000,600);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setLocationRelativeTo(null);
        
        
        for (int i=0;i<7;i++){
            if (T1[i].getDisco() !=0){
                if(T1[i].getDisco()==1){
                    Disco1 = new JLabel("Disco" + T1[i].getDisco(), SwingConstants.CENTER);
                    Disco1.setBounds(T1[i].getPosicionx(), T1[i].getPosiciony(), T1[i].getLargo(), 15);
                    Disco1.setBackground(Color.pink);
                    Disco1.setOpaque(true);
                    frame.add(Disco1);
                }else if(T1[i].getDisco() ==2){
                    Disco2 = new JLabel("Disco" + T1[i].getDisco(), SwingConstants.CENTER);
                    Disco2.setBounds(T1[i].getPosicionx(), T1[i].getPosiciony(), T1[i].getLargo(), 15);
                    Disco2.setBackground(Color.MAGENTA);
                    Disco2.setOpaque(true);
                    frame.add(Disco2);
                }else if(T1[i].getDisco() ==3){
                    Disco3 = new JLabel("Disco" + T1[i].getDisco(), SwingConstants.CENTER);
                    Disco3.setBounds(T1[i].getPosicionx(), T1[i].getPosiciony(), T1[i].getLargo(), 15);
                    Disco3.setBackground(Color.CYAN);
                    Disco3.setOpaque(true);
                    frame.add(Disco3);
                }else if(T1[i].getDisco() ==4){
                    Disco4 = new JLabel("Disco" + T1[i].getDisco(), SwingConstants.CENTER);
                    Disco4.setBounds(T1[i].getPosicionx(), T1[i].getPosiciony(), T1[i].getLargo(), 15);
                    Disco4.setBackground(Color.green);
                    Disco4.setOpaque(true);
                    frame.add(Disco4);
                }else if(T1[i].getDisco() ==5){
                    Disco5 = new JLabel("Disco" + T1[i].getDisco(), SwingConstants.CENTER);
                    Disco5.setBounds(T1[i].getPosicionx(), T1[i].getPosiciony(), T1[i].getLargo(), 15);
                    Disco5.setBackground(Color.yellow);
                    Disco5.setOpaque(true);
                    frame.add(Disco5);
                }else if(T1[i].getDisco() ==6){
                    Disco6 = new JLabel("Disco" + T1[i].getDisco(), SwingConstants.CENTER);
                    Disco6.setBounds(T1[i].getPosicionx(), T1[i].getPosiciony(), T1[i].getLargo(), 15);
                    Disco6.setBackground(Color.orange);
                    Disco6.setOpaque(true);
                    frame.add(Disco6);
                }else if(T1[i].getDisco() ==7){
                    Disco7 = new JLabel("Disco" + T1[i].getDisco(), SwingConstants.CENTER);
                    Disco7.setBounds(T1[i].getPosicionx(), T1[i].getPosiciony(), T1[i].getLargo(), 15);
                    Disco7.setBackground(Color.red);
                    Disco7.setOpaque(true);
                    frame.add(Disco7);
                }  
            } 
        }
        

        //Labels---------------------------------------------------------------
        JLabel lblDiscos = new JLabel("Tiempo");
        lblDiscos.setBounds(600,10,230,40);
        frame.add(lblDiscos);
        
        JLabel lblMovimiento= new JLabel("Movimiento");
        lblMovimiento.setBounds(655,10,230,40);
        frame.add(lblMovimiento);
        
        //LabelDeValor---------------------------------------------------------
        
        lblValorTiempo = new JLabel(String.valueOf(Pantallas.Tiempo));
        lblValorTiempo.setBounds(600,40,230,40);
        frame.add(lblValorTiempo);
        
        lblValorMovimiento= new JLabel(String.valueOf(Pantallas.Cantidad_Discos));
        lblValorMovimiento.setBounds(655,40,230,40);
        frame.add(lblValorMovimiento);
        
        //Label Bases---------------------------------------------------------------
        
        //Base1
        JLabel Base1 = new JLabel();
        Base1.setBounds(90, 400, 220, 15);
        Base1.setBackground(Color.black);
        Base1.setOpaque(true);
        
        JLabel Palo1 = new JLabel();
        Palo1.setBounds(190, 200, 15, 200);
        Palo1.setBackground(Color.gray);
        Palo1.setOpaque(true);

        frame.add(Palo1);
        frame.add(Base1);
        
        //Base2
        JLabel Base2 = new JLabel();
        Base2.setBounds(390, 400, 220, 15);
        Base2.setBackground(Color.black);
        Base2.setOpaque(true);
        
        JLabel Palo2 = new JLabel();
        Palo2.setBounds(490, 200, 15, 200);
        Palo2.setBackground(Color.gray);
        Palo2.setOpaque(true);

        frame.add(Palo2);
        frame.add(Base2);
        
        //Base3
        JLabel Base3 = new JLabel();
        Base3.setBounds(690, 400, 220, 15);
        Base3.setBackground(Color.black);
        Base3.setOpaque(true);
        
        JLabel Palo3 = new JLabel();
        Palo3.setBounds(790, 200, 15, 200);
        Palo3.setBackground(Color.gray);
        Palo3.setOpaque(true);

        frame.add(Palo3);
        frame.add(Base3);

        //Botones---------------------------------------------------------------
        JButton back = new JButton("Regresar");
        back.setBounds(50,500,100,20);
        back.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) { frame.dispose(); Menu(); }});
        frame.add(back);

        JButton Out = new JButton("Salir");
        Out.setBounds(600,500,100,20);
        Out.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {  System.exit(0); }});
        frame.add(Out);
        
        JButton Next1 = new JButton(">");
        Next1.setBounds(250,425,50,20);
        Next1.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {   operaciones.NextT1();  }});
        frame.add(Next1);
        
        JButton DoubleNext1 = new JButton(">>");
        DoubleNext1.setBounds(250,450,50,20);
        DoubleNext1.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {   operaciones.DoubleNextT1(); }});
        frame.add(DoubleNext1);
        
        
        JButton Next2 = new JButton(">");
        Next2.setBounds(550,425,50,20);
        Next2.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) { operaciones.NextT2();  }});
        frame.add(Next2);
        
        JButton Back2 = new JButton("<");
        Back2.setBounds(400,425,50,20);
        Back2.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {  operaciones.Back2(); }});
        frame.add(Back2);
        
        
        JButton Back3 = new JButton("<");
        Back3.setBounds(700,425,50,20);
        Back3.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {    operaciones.Back3();}});
        frame.add(Back3);
        
        JButton DoubleBack3 = new JButton("<<");
        DoubleBack3.setBounds(700,450,50,20);
        DoubleBack3.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {   operaciones.DoubleBack3();   }});
        frame.add(DoubleBack3);
        
        //Mostrar//
        frame.setVisible(true);
    }
    
    public void InitializeTowers(){

        int posiciony = 295;
        for (int i=0;i<7;i++){
            T1[i] = new torreBase(i+1,0,posiciony,0,0);
            T2[i] = new torreBase(i+1,0,posiciony,0,0);
            T3[i] = new torreBase(i+1,0,posiciony,0,0);
           
            posiciony += 15;        
        }
        
        int largo = 80;
        int posicionx = 160;
        int auxcontador =1;
        int auxAsignarDisco =Pantallas.Cantidad_Discos;
        
        largo += (Pantallas.Cantidad_Discos-1)*20;
        posicionx -= (Pantallas.Cantidad_Discos-1)*10;
        
        for (int i=6;i>=0;i--){
            if (T1[i].getDisco() ==0){
                if (Pantallas.Cantidad_Discos >= auxcontador){
                    T1[i].setDisco(auxAsignarDisco);
                    auxAsignarDisco -=1;
                    T1[i].setLargo(largo);
                    largo-=20;
                    T1[i].setPosicionx(posicionx);
                    posicionx += 10;
                    
                    auxcontador +=1;
                }
            }        
        } 
       
        for (int i=0;i<7;i++){
            System.out.println( " Correlativo " +T1[i].getNo()  + " Disco "+ T1[i].getDisco() + " enx:" + T1[i].getPosicionx() + " Eny:" + T1[i].getPosiciony() + " largo: " + T1[i].getLargo());
        }
        /*
        for (int i=0;i<7;i++){
            System.out.println( " Correlativo " +T2[i].getNo()  + " Disco "+ T2[i].getDisco() + " enx:" + T2[i].getPosicionx() + " Eny:" + T2[i].getPosiciony() + " largo: " + T2[i].getLargo());
        }
        
        for (int i=0;i<7;i++){
            System.out.println( " Correlativo " +T3[i].getNo()  + " Disco "+ T3[i].getDisco() + " enx:" + T3[i].getPosicionx() + " Eny:" + T3[i].getPosiciony() + " largo: " + T3[i].getLargo());
        }*/
        
    }
}
