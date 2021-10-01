
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




public class juego {
    public static JLabel Disco1,Disco2,Disco3,Disco4,Disco5,Disco6,Disco7;
    public static int[][] Base = new int[7][2];
    public static torreBase T1[] = new torreBase[7];
    public static torreBase T2[] = new torreBase[7];
    public static torreBase T3[] = new torreBase[7];


    public void Initialize() {
        
        System.out.println(Pantallas.Cantidad_Discos);
        System.out.println(Pantallas.Tiempo);
        //Frame---------------------------------------------------------------
        JFrame frame = new JFrame();
        frame.setTitle("Torres de Hanoi - Game");
        frame.setSize(1000,600);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setLocationRelativeTo(null);
        
        //Labes Discos 
        Disco1 = new JLabel("Disco1", SwingConstants.CENTER);
	Disco1.setBounds(160, 295, 80, 15); /*(+10,-15,-20,0)*/
	Disco1.setBackground(Color.pink);
	Disco1.setOpaque(true);
	frame.add(Disco1);

	Disco2 = new JLabel("Disco2", SwingConstants.CENTER);
	Disco2.setBounds(150, 310, 100, 15); /*(+10,-15,-20,0)*/
	Disco2.setBackground(Color.MAGENTA);
	Disco2.setOpaque(true);
	frame.add(Disco2);

	Disco3 = new JLabel("Disco3", SwingConstants.CENTER);
	Disco3.setBounds(140, 325, 120, 15); /*(+10,-15,-20,0)*/
	Disco3.setBackground(Color.CYAN);
	Disco3.setOpaque(true);
	frame.add(Disco3);

	Disco4 = new JLabel("Disco4", SwingConstants.CENTER);
	Disco4.setBounds(130, 340, 140, 15); /*(+10,-15,-20,0)*/
	Disco4.setBackground(Color.green);
	Disco4.setOpaque(true);
	frame.add(Disco4);

	Disco5 = new JLabel("Disco5", SwingConstants.CENTER);
	Disco5.setBounds(120, 355, 160, 15); /*(+10,0,-20,0)*/
	Disco5.setBackground(Color.yellow);
	Disco5.setOpaque(true);
	frame.add(Disco5);

	Disco6 = new JLabel("Disco6", SwingConstants.CENTER);
	Disco6.setBounds(110, 370, 180, 15); /*(+10,0,-20,0)*/
	Disco6.setBackground(Color.orange);
	Disco6.setOpaque(true);
	frame.add(Disco6);

	Disco7 = new JLabel("Disco7", SwingConstants.CENTER);
	Disco7.setBounds(100, 385, 200, 15);  /*(+10,0,-20,0)*/
	Disco7.setBackground(Color.red);
	Disco7.setOpaque(true);
	frame.add(Disco7);
        

        //Labels---------------------------------------------------------------
        JLabel lblDiscos = new JLabel("Tiempo");
        lblDiscos.setBounds(600,10,230,40);
        frame.add(lblDiscos);
        
        JLabel lblMovimiento= new JLabel("Movimiento");
        lblMovimiento.setBounds(655,10,230,40);
        frame.add(lblMovimiento);
        
        //LabelDeValor---------------------------------------------------------
        
        JLabel lblValorTiempo = new JLabel(String.valueOf(Pantallas.Tiempo));
        lblValorTiempo.setBounds(600,40,230,40);
        frame.add(lblValorTiempo);
        
        JLabel lblValorMovimiento= new JLabel(String.valueOf(Pantallas.Cantidad_Discos));
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
        {public void actionPerformed(ActionEvent e) {  System.out.println("gracias por jugar"); System.exit(0); }});
        frame.add(Out);
        
        //Mostrar//
        frame.setVisible(true);
    }
    
    public void InitializeTowers(){
        
        int posicionx = 100;
        int posiciony = 385;
        int largo = 200;
        int auxcontadot =1;
        //Cambio +10 x , -15 y , -20 largo
        posicionx += (Pantallas.Cantidad_Discos-1) * 10;
        posiciony -= (Pantallas.Cantidad_Discos-1) * 15;
        largo -= (Pantallas.Cantidad_Discos-1) * 20;
       
        
        for (int i=0;i<7;i++){
            
            if (Pantallas.Cantidad_Discos>=auxcontadot){
                T1[i] = new torreBase(auxcontadot,posicionx,posiciony,largo);
                posicionx -= 10;
                posiciony += 15;   
                largo += 20;
            }else{
                 T1[i] = new torreBase(0,0,0,0);
            }
            auxcontadot+=1;
        }
        
        for (int i=6;i>=0;i--){
            if (T1[i].getDisco() !=0){
                 System.out.println( T1[i].getDisco() + " enx:" + T1[i].getPosicionx() + " Eny:" + T1[i].getPosiciony() + " largo: " + T1[i].getLargo());
            } 
        }
    }
}
