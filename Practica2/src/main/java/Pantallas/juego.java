
package Pantallas;

import static Pantallas.Pantallas.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Toolkit;


public class juego {
    /*
    public juego(){
        Initialize();
    }*/
    
    public void Initialize() {
        //Frame---------------------------------------------------------------
        JFrame frame = new JFrame();
        frame.setTitle("Torres de Hanoi - Game");
        frame.setSize(800,600);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        //Labels---------------------------------------------------------------
        JLabel lblDiscos = new JLabel("Tiempo");
        lblDiscos.setBounds(600,10,230,40);
        frame.add(lblDiscos);
        
        JLabel lblMovimiento= new JLabel("Movimiento");
        lblMovimiento.setBounds(655,10,230,40);
        frame.add(lblMovimiento);
        
        //LabelDeValor---------------------------------------------------------
        
        JLabel lblValorTiempo = new JLabel("V000");
        lblValorTiempo.setBounds(600,40,230,40);
        frame.add(lblValorTiempo);
        
        JLabel lblValorMovimiento= new JLabel("V001");
        lblValorMovimiento.setBounds(655,40,230,40);
        frame.add(lblValorMovimiento);
        
        //Elementos---------------------------------------------------------------
        JLabel Base1 = new JLabel("New label");
       
        Base1.setBounds(286, 301, 56, 39);
        
        System.out.print( getClass().getResource("/city.jpg"));
        
        try{
           

            
            ImageIcon icoBase = new ImageIcon(getClass().getResource("/imags/base.png"));
            ImageIcon imagBase = new ImageIcon(icoBase.getImage().getScaledInstance(Base1.getWidth(), Base1.getHeight(), Image.SCALE_SMOOTH));
            Base1.setIcon(imagBase);
        }catch (Exception  e){ System.out.print("\nIMAGEN\n");}
             
        
        frame.add(Base1);

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
    

}
