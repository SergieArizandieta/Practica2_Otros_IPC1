
package Objetos;


public class torre3 {
    private int[][] Discos = new  int[7][7];
    
    public torre3(int[][] Discos){
        this.Discos =Discos;
    }

    public int[][] getDiscos() {
        return Discos;
    }

    public void setDiscos(int[][] Discos) {
        this.Discos = Discos;
    }
    
    
}
