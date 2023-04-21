package obligatorio1;

public class Colcha {
    
    private Gato [][] colcha;
    
    //Constructor
    public Colcha() {
        this.colcha = new Gato[6][6];
        for (int i = 0; i < 6 ; i++) {
            for (int j = 0; j < 6; j++) {
                colcha[i][j] = null; 
            }
        }
    }
    public void addGatoColcha (int fila, int col, Gato unGato){
        colcha[fila][col] = unGato;
    }
    
    public void removeGatoColcha (int fila, int col){
        colcha[fila][col] = null;
    }
    
    public void saltoGato (int fila, int col){
        //metodo de saltos
    }
    public Gato getGatoColcha (int fila, int col){
        return colcha[fila][col];
    }
    
   
}

    
    //Metodos para agregar y sacar gatos de colcha
   

