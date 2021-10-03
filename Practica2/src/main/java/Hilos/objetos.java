
package Hilos;
 //Elemntos de otras clases
import static Pantallas.juego.frame;
import Pantallas.Pantallas;

 //Elemntos de java
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class objetos extends Thread {
    
    public boolean clickeado = false;
    JButton imagen;
    
    //Crear el objeto y agregarlo al frame
    public void objeto () {
        try{
            imagen = new JButton();
            imagen.setBounds(10, -100, 50, 50);
            imagen.setBackground(Color.black);
            imagen.setOpaque(true);
            imagen.setVisible(true);


            ImageIcon img = new ImageIcon("clockG.png");
            Image nuevo = img.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon render = new ImageIcon(nuevo);
            imagen.setIcon(render);
            frame.add(imagen);
        }catch(Exception e){}
    }
    
    int modulador =2;
    
    //Hilo del objeto
    public void run(){
        try{
            //Inicializa iconos
            ImageIcon imgG = new ImageIcon("clockG.png");
            Image nuevoG = imgG.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            ImageIcon renderG = new ImageIcon(nuevoG); 

            ImageIcon imgR = new ImageIcon("clockR.png");
            Image nuevoR = imgR.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            ImageIcon renderR = new ImageIcon(nuevoR); 



            int posy = imagen.getY();
            int contador =0;
            clickeado = false;

            while(true){
                contador +=100;
                sleep(100);               
                posy += 10;
                imagen.setLocation(10, posy);
                
                //Intercala iconos
                if(contador >= 1000){
                    if(modulador %2 ==0){
                        imagen.setIcon(renderG);
                        modulador =3;
                   }else{
                       imagen.setIcon(renderR);
                       modulador =2;
                   }
                   contador=0;
                }
                
                //Verifica si se preciono el boton
                imagen.addActionListener(new ActionListener()
                {public void actionPerformed(ActionEvent e) { 
                    
                    //aumento y disminucion de tiempo
                    if (clickeado == false){
                    if(modulador %2 ==0){
                        clickeado = true;
                        Pantallas.Tiempo-=10;
                        System.out.println("-10");
                   }else{
                       clickeado = true;
                       Pantallas.Tiempo+=10;
                       System.out.println("+10");
                   }}
                }});

             

                
                
                if(posy >= frame.getHeight()-50 || clickeado){
                    frame.remove(imagen);   
                    
                    stop();
                }

            }
        }catch(Exception e){}
    }
}
