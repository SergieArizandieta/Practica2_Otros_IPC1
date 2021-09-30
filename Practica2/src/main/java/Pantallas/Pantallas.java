package Pantallas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class Pantallas {
    
    public static void Menu() {
        //Frame---------------------------------------------------------------
        JFrame recovery = new JFrame();
        recovery.setTitle("Torres de Hanoi");
        recovery.setSize(400,400);
        recovery.setLayout(null);
        recovery.setLocationRelativeTo(null);
        
        //Label---------------------------------------------------------------
        JLabel lbl = new JLabel("Torres de Hanoi");
        lbl.setBounds(150,10,130,40);
        recovery.add(lbl);
        
        //Botones---------------------------------------------------------------
        JButton NewGame = new JButton("Nuevo Juego");
        NewGame.setBounds(100,100,200,20);
        NewGame.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {  System.out.println("1"); }});
        recovery.add(NewGame);
        
        JButton AutoGame = new JButton("Juego Automatico");
        AutoGame.setBounds(100,150,200,20);
        AutoGame.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {  System.out.println("2"); }});
        recovery.add(AutoGame);
        
        JButton Records = new JButton("Top 5");
        Records.setBounds(100,200,200,20);
        Records.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {  System.out.println("3"); }});
        recovery.add(Records);
        
        JButton Configuration = new JButton("Configuración");
        Configuration.setBounds(100,250,200,20);
        Configuration.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {  System.out.println("4"); }});
        recovery.add(Configuration);
        
        JButton Out = new JButton("Salir");
        Out.setBounds(200,300,100,20);
        Out.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {  System.out.println("gracias por jugar"); System.exit(0); }});
        recovery.add(Out);
        
        //Mostrar//
        recovery.setVisible(true);
    }
    
    //pantalla de configuraciones
     public static void Settings() {
        //Frame---------------------------------------------------------------
        JFrame recovery = new JFrame();
        recovery.setTitle("Torres de Hanoy - Config");
        recovery.setSize(900,400);
        recovery.setLayout(null);
        recovery.setLocationRelativeTo(null);

        //Labels---------------------------------------------------------------
        JLabel lbl = new JLabel("Configuración");
        lbl.setBounds(400,10,130,40);
        recovery.add(lbl);
        
        JLabel lblNo = new JLabel("Cantidad de discos");
        lblNo.setBounds(200,60,130,40);
        recovery.add(lblNo);
        
        JLabel lbltime = new JLabel("Tiempo de partida");
        lbltime.setBounds(600,60,130,40);
        recovery.add(lbltime);
        
        //TextField---------------------------------------------------------------
        JTextField TextTime = new JTextField();
        TextTime.setBounds(550,100,200,20);
        recovery.add(TextTime);
        
        //Combobox---------------------------------------------------------------
        JComboBox combo = new JComboBox();
        combo.setBounds(150,100,200,20);
        combo.addItem(3);
        combo.addItem(4);
        combo.addItem(5);
        combo.addItem(6);
        combo.addItem(7);
        recovery.add(combo);
        
        //Botones---------------------------------------------------------------
        JButton Save = new JButton("Guardar");
        Save.setBounds(350,200,200,20);
        Save.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {  System.out.println("1"); }});
        recovery.add(Save);

        JButton Out = new JButton("Salir");
        Out.setBounds(750,300,100,20);
        Out.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {  System.out.println("gracias por jugar"); System.exit(0); }});
        recovery.add(Out);
        
        //Mostrar//
        recovery.setVisible(true);
    }

}
