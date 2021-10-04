package Pantallas;
 //Elemntos de otras clases
import Hilos.autoGame;
import  Operaciones.operaciones;
import static Operaciones.operaciones.NombreJugador;
import static Operaciones.operaciones.disco;
import static Operaciones.operaciones.movimintosAuto;
import static Pantallas.juego.MoviemintosTotales;

 //Elemntos de java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
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
    
    //-----------------------------------------------------------------------------------------
        //data del juego automatico
        public static String[] pasosAuto = new String[500];
        //Ventana del juego automatico
        public static JFrame Autoframe;
        //lista del juego automatico
        public static JList showAuto;

        //Label que muestra la cofig
        public static JLabel lblEstado = new JLabel("Config: Predeterminada");
        public static JLabel lblMovimeintosAuto ;

        //Creado torres
        public static String[][] Table = new String[5][3];   
        public static int Cantidad_Discos=3;
        public static int Tiempo=120;

        //Instanciar juego
        public static juego hanoi = new juego();

        //Instanciar Hilo de juego automatico
        public static autoGame HAuto = new autoGame();
        
        //Controlar hilo
        public static boolean Fistimec= true;
    //-----------------------------------------------------------------------------------------
    
    
    //Inicalizar la tabla
    public static void initializeTable(){
        
        for (int i=0;i<5;i++){
            Table[i][0] =String.valueOf(i+1);
            Table[i][1] ="0";
            Table[i][2] ="0";
        }
        
        /* ver tabla
        for (int i=0;i<5;i++){
            System.out.println(Table[i][0]+" -- " +Table[i][1] + " -- " + Table[i][2] );
          
        }*/
    }
    
    //Actulizar la tabla para juego
    public static void refresTable(){
       if (Cantidad_Discos==3){
            String[][] AuxTable = new String[6][2];   

            //LLenar la tabla aux con los datos actuales
            for (int i=0;i<5;i++){
                if(Integer.valueOf(Table[i][2])==0){
                     AuxTable[i][1] =String.valueOf(999999999);
                }else{
                    AuxTable[i][1] =Table[i][2];
                }
                AuxTable[i][0] = Table[i][1];

            }

            //asignar el dato mas reciente al ultimo lugar
            AuxTable[5][0] = NombreJugador;
            AuxTable[5][1] = String.valueOf(MoviemintosTotales);

            //Metodo borbuja
            boolean band = false;
            while (band == false){
                band = true;
                for(int i = 0; i < 5; i++){

                      if (Integer.valueOf(AuxTable[i][1]) > Integer.valueOf(AuxTable[i+1][1])){

                        String auxNum = AuxTable[i][1];
                        AuxTable[i][1]= AuxTable[i+1][1];
                        AuxTable[i+1][1] = auxNum;

                        String auxNombre=AuxTable[i][0];
                        AuxTable[i][0] = AuxTable[i+1][0];
                        AuxTable[i+1][0] = auxNombre;
                        band = false;
                      }  
                }
            }



            /* ver tabla aux
            for (int i=0;i<6;i++){
                System.out.println(AuxTable[i][0] + " -- " + AuxTable[i][1]);
            }*/

            //Asignando solo los primeros 5
            for (int i=0;i<5;i++){
                if(AuxTable[i][1].equals(String.valueOf(999999999))){
                     Table[i][2] = "0" ;
                }else{
                    Table[i][2] =AuxTable[i][1];
                }
                Table[i][1] = AuxTable[i][0];

            }
        }
    }

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
        
       
        lblEstado.setBounds(20,300,150,40);
        frame.add(lblEstado);
        //Botones---------------------------------------------------------------
        JButton NewGame = new JButton("Nuevo Juego");
        NewGame.setBounds(100,100,200,20);
        NewGame.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {frame.dispose();hanoi.InitializeTowers(); hanoi.startgame(); }});
        frame.add(NewGame);
        
        JButton AutoGame = new JButton("Juego Automatico");
        AutoGame.setBounds(100,150,200,20);
        AutoGame.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {  frame.dispose();  AutoGame(); }});
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
        
        JLabel lbltime = new JLabel("Tiempo de partida en segundos");
        lbltime.setBounds(550,60,200,40);
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
            boolean validacion = true;

            try {
                if(validacion){
                    Tiempo = Integer.valueOf(TextTime.getText()); 
                    Cantidad_Discos= Integer.valueOf(combo.getSelectedItem().toString());
                }
            }catch (Exception a) {
               validacion = false;
               JOptionPane.showMessageDialog(null, "Ingrese un numero ", " Ingreso erroneo " , JOptionPane.INFORMATION_MESSAGE);
            }
            
            if (Tiempo <=0){
                JOptionPane.showMessageDialog(null, "Ingrese un numero mayor a 0", " Ingreso erroneo " , JOptionPane.INFORMATION_MESSAGE);
                validacion = false;
            }
            
            
            if (validacion){
                lblEstado.setText("Config: Personalizada");
                Tiempo = Integer.valueOf(TextTime.getText()); 
                Cantidad_Discos= Integer.valueOf(combo.getSelectedItem().toString());
                JOptionPane.showMessageDialog(null, "Configuracion asignada", " Save"  , JOptionPane.INFORMATION_MESSAGE);
            }else{
                Tiempo = 120; 
                Cantidad_Discos= 3;
            }
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
        JLabel lbl = new JLabel("Los top 5 mejores jugadores de 3 discos");
        lbl.setBounds(90,10,230,40);
        frame.add(lbl);
        
        //JTable---------------------------------------------------------------
        String data[][]= Table; 
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
        Autoframe = new JFrame();
        Autoframe.setTitle("Torres de Hanoi - AutoGame");
        Autoframe.setSize(800,600);
        Autoframe.setLayout(null);
        Autoframe.setLocationRelativeTo(null);

        //Labels---------------------------------------------------------------
        
        JLabel lblTitulo = new JLabel("Juego Automático");
        lblTitulo.setBounds(350,10,230,40);
        Autoframe.add(lblTitulo);
        
        JLabel lblDiscos = new JLabel("Discos");
        lblDiscos.setBounds(100,80,230,40);
        Autoframe.add(lblDiscos);
        
        JLabel lblMovimiento= new JLabel("Movimiento");
        lblMovimiento.setBounds(175,80,230,40);
        Autoframe.add(lblMovimiento);
        
        //LabelDeValor---------------------------------------------------------
        
        JLabel lblValorDiscos = new JLabel(String.valueOf(Cantidad_Discos));
        lblValorDiscos.setBounds(100,110,230,40);
        Autoframe.add(lblValorDiscos);
        
        lblMovimeintosAuto= new JLabel(String.valueOf(movimintosAuto));
        lblMovimeintosAuto.setBounds(175,110,230,40);
        Autoframe.add(lblMovimeintosAuto);
        
        //TextField---------------------------------------------------------------
        String nombres[] = { "Inicie el juego automatico"};
        showAuto = new JList(nombres);
       
        JScrollPane Scroll = new JScrollPane(showAuto);  
        Scroll.setBounds(100,175,600,200);      
        Autoframe.add(Scroll);

        //Botones---------------------------------------------------------------
        JButton back = new JButton("Regresar");
        back.setBounds(50,500,100,20);
        back.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) { 
            movimintosAuto = 0;
            disco = 0;
            
            Autoframe.dispose(); 
            Menu();
            HAuto.suspend();
            lblEstado.setText("Config: Predeterminada");
            Tiempo = 120; 
            Cantidad_Discos= 3;
            MoviemintosTotales = 0;
        }});
        Autoframe.add(back);
        
        JButton start = new JButton("Inicio");
        start.setBounds(450,500,100,20);
        start.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {movimintosAuto = 0; startAuto(); operaciones.automaticGame(); }});
        Autoframe.add(start);
        
        
        JButton Out = new JButton("Salir");
        Out.setBounds(600,500,100,20);
        Out.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) {  System.out.println("gracias por jugar"); System.exit(0); }});
        Autoframe.add(Out);
        
        //Mostrar//
        Autoframe.setVisible(true);
    }
    
    //Comenzar hilo de juego auamtico
    public static void startAuto(){
        DefaultListModel listmodel=new DefaultListModel();
        showAuto.setModel(listmodel);
       
        if (Fistimec){
           
            HAuto.start();
            Fistimec= false;
        }else{
            HAuto.resume();
        }
    }


}
