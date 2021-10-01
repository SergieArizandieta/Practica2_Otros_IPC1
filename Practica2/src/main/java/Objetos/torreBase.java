
package Objetos;


public class torreBase {

    /**
     * @return the largo
     */
    public int getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }

    /**
     * @return the Disco
     */
    public int getDisco() {
        return Disco;
    }

    /**
     * @param Disco the Disco to set
     */
    public void setDisco(int Disco) {
        this.Disco = Disco;
    }

    /**
     * @return the Posicionx
     */
    public int getPosicionx() {
        return Posicionx;
    }

    /**
     * @param Posicionx the Posicionx to set
     */
    public void setPosicionx(int Posicionx) {
        this.Posicionx = Posicionx;
    }

    /**
     * @return the Posiciony
     */
    public int getPosiciony() {
        return Posiciony;
    }

    /**
     * @param Posiciony the Posiciony to set
     */
    public void setPosiciony(int Posiciony) {
        this.Posiciony = Posiciony;
    }

  
   
    private int Disco ;
    private int Posicionx ;
    private int Posiciony ;
    private int largo;
    
    public torreBase(int Disco,int Posicionx,int Posiciony,int largo){
        this.Disco =Disco;
        this.Posicionx=Posicionx;
        this.Posiciony=Posiciony;
        this.largo=largo;
    }


    
    
}
