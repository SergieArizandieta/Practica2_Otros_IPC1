
package Objetos;


public class torreBase {

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
     * @return the no
     */
    public int getNo() {
        return no;
    }

    /**
     * @param no the no to set
     */
    public void setNo(int no) {
        this.no = no;
    }



    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getPosicionx() {
        return Posicionx;
    }

    public void setPosicionx(int Posicionx) {
        this.Posicionx = Posicionx;
    }

    public int getPosiciony() {
        return Posiciony;
    }

    public void setPosiciony(int Posiciony) {
        this.Posiciony = Posiciony;
    }

  
   
    private int no ;
    private int Posicionx ;
    private int Posiciony ;
    private int largo;
    private int Disco;
    
    public torreBase(int no,int Posicionx,int Posiciony,int largo,int Disco){
        this.no =no;
        this.Posicionx=Posicionx;
        this.Posiciony=Posiciony;
        this.largo=largo;
        this.Disco = Disco;
    }


    
    
}
