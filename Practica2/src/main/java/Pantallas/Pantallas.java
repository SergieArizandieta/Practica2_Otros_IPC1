package Pantallas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;


public class Pantallas {
        
    public static int Cantidad_Discos=3;
    public static int Tiempo=120;
    
    public static juego hanoi = new juego();
    
    //pantalla de menu
    public static void Menu() {
        //Frame---------------------------------------------------------------
        JFrame frame = new JFrame();
        frame.setTitle("Torres de Hanoi");
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        
        //Label---------------------------------------------------------------
        JLabel lbl = new JLabel("Torres de Hanoi");
        lbl.setBounds(150,10,130,40);
        frame.add(lbl);
        
        //Botones---------------------------------------------------------------
        JButton NewGame = new JButton("Nuevo Juego");
        NewGame.setBounds(100,100,200,20);
        NewGame.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {frame.dispose();hanoi.InitializeTowers(); hanoi.Initialize(); }});
        frame.add(NewGame);
        
        JButton AutoGame = new JButton("Juego Automatico");
        AutoGame.setBounds(100,150,200,20);
        AutoGame.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {  frame.dispose(); AutoGame(); }});
        frame.add(AutoGame);
        
        JButton Records = new JButton("Top 5");
        Records.setBounds(100,200,200,20);
        Records.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {  frame.dispose(); Records(); }});
        frame.add(Records);
        
        JButton Configuration = new JButton("Configuración");
        Configuration.setBounds(100,250,200,20);
        Configuration.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) { frame.dispose(); Settings();  }});
        frame.add(Configuration);
        
        JButton Out = new JButton("Salir");
        Out.setBounds(200,300,100,20);
        Out.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {  System.out.println("gracias por jugar"); System.exit(0); }});
        frame.add(Out);
        
        //Mostrar//
        frame.setVisible(true);
    }
    
    //pantalla de configuraciones
    public static void Settings() {
        //Frame---------------------------------------------------------------
        JFrame frame = new JFrame();
        frame.setTitle("Torres de Hanoy - Config");
        frame.setSize(900,400);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        //Labels---------------------------------------------------------------
        JLabel lbl = new JLabel("Configuración");
        lbl.setBounds(400,10,130,40);
        frame.add(lbl);
        
        JLabel lblNo = new JLabel("Cantidad de discos");
        lblNo.setBounds(200,60,130,40);
        frame.add(lblNo);
        
        JLabel lbltime = new JLabel("Tiempo de partida");
        lbltime.setBounds(600,60,130,40);
        frame.add(lbltime);
        
        //TextField---------------------------------------------------------------
        JTextField TextTime = new JTextField();
        TextTime.setBounds(550,100,200,20);
        frame.add(TextTime);
        
        //Combobox---------------------------------------------------------------
        JComboBox combo = new JComboBox();
        combo.setBounds(150,100,200,20);
        combo.addItem(3);
        combo.addItem(4);
        combo.addItem(5);
        combo.addItem(6);
        combo.addItem(7);
        frame.add(combo);
        
        //Botones---------------------------------------------------------------
        JButton back = new JButton("Regresar");
        back.setBounds(50,300,100,20);
        back.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) { frame.dispose(); Menu(); }});
        frame.add(back);
        
        JButton Save = new JButton("Guardar");
        Save.setBounds(350,200,200,20);
        Save.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {
            
            try {
                Tiempo = Integer.valueOf(TextTime.getText()); 
                Cantidad_Discos= Integer.valueOf(combo.getSelectedItem().toString());
            }catch (Exception a) {
               JOptionPane.showMessageDialog(null, "Ingrese un numero ", " Ingreso erroneo " , JOptionPane.INFORMATION_MESSAGE);
            }

            if (Tiempo <=0){
                JOptionPane.showMessageDialog(null, "Ingrese un numero mayor a 0", " Ingreso erroneo " , JOptionPane.INFORMATION_MESSAGE);
            }
            
            JOptionPane.showMessageDialog(null, "Configuracion asignada", " Save"  , JOptionPane.INFORMATION_MESSAGE);
            System.out.println(Cantidad_Discos + "Dsicos");
            System.out.println(Tiempo+ "Timepo" );
        }});
        frame.add(Save);

        JButton Out = new JButton("Salir");
        Out.setBounds(750,300,100,20);
        Out.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {  System.out.println("gracias por jugar"); System.exit(0); }});
        frame.add(Out);
        
        //Mostrar//
        frame.setVisible(true);
    }
    
    //pantalla de configuraciones
    public static void Records() {
        //Frame---------------------------------------------------------------
        JFrame frame = new JFrame();
        frame.setTitle("Torres de Hanoi - Records");
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        //Labels---------------------------------------------------------------
        JLabel lbl = new JLabel("Los top 5 mejores jugadores");
        lbl.setBounds(120,10,230,40);
        frame.add(lbl);
        
        //JTable---------------------------------------------------------------
        String data[][]={ {"1","Sergie","2"},    
                           {"2","Gabriela","2"},    
                           {"3","Sachin","2"},
                            {"4","Jai","2"},
                            {"5","Noe","2"}};    
        String column[]={"No.","Nombre","Movimientos"};         
        JTable Table = new JTable(data, column);   
  
        JScrollPane Scroll = new JScrollPane(Table);  
        Scroll.setBounds(75,50,250,200);        
        frame.add(Scroll);

        //Botones---------------------------------------------------------------
        JButton back = new JButton("Regresar");
        back.setBounds(50,300,100,20);
        back.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) { frame.dispose(); Menu(); }});
        frame.add(back);

        JButton Out = new JButton("Salir");
        Out.setBounds(250,300,100,20);
        Out.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {  System.out.println("gracias por jugar"); System.exit(0); }});
        frame.add(Out);
        
        //Mostrar//
        frame.setVisible(true);
    }
    
    //pantalla de juego automatico
    public static void AutoGame() {
        //Frame---------------------------------------------------------------
        JFrame frame = new JFrame();
        frame.setTitle("Torres de Hanoi - AutoGame");
        frame.setSize(800,600);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        //Labels---------------------------------------------------------------
        
        JLabel lblTitulo = new JLabel("Juego Automático");
        lblTitulo.setBounds(350,10,230,40);
        frame.add(lblTitulo);
        
        JLabel lblDiscos = new JLabel("Discos");
        lblDiscos.setBounds(100,80,230,40);
        frame.add(lblDiscos);
        
        JLabel lblMovimiento= new JLabel("Movimiento");
        lblMovimiento.setBounds(175,80,230,40);
        frame.add(lblMovimiento);
        
        //LabelDeValor---------------------------------------------------------
        
        JLabel lblValorDiscos = new JLabel("V000");
        lblValorDiscos.setBounds(100,110,230,40);
        frame.add(lblValorDiscos);
        
        JLabel lblValorMovimiento= new JLabel("V001");
        lblValorMovimiento.setBounds(175,110,230,40);
        frame.add(lblValorMovimiento);
        
        //TextField---------------------------------------------------------------
        String nombres[] = { "Cristian", "Julian", "Milena"};
        JList ListRecord = new JList(nombres);
        ListRecord.setBounds(100,175,600,200);
        frame.add(ListRecord);

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
