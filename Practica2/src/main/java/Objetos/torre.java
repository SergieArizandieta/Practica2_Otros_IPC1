
package Objetos;


public class torre {

  
    public int[][] getDiscos() {
        return Discos;
    }

   
    public void setDiscos(int[][] Discos) {
        this.Discos = Discos;
    }
    private int[][] Discos ;
    
    public torre(int[][] Discos){
        this.Discos =Discos;
    }


    
    
}
