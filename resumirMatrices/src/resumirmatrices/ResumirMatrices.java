package resumirmatrices;
import java.util.*;

public class ResumirMatrices {
    
    private int [][] matriz;
    private int a, b;
    //public ResumirMatrices (int a, int b) {
    public ResumirMatrices () {
        //this.matriz = new int[a][b];
    }
    public static void main(String[] args) {
        ResumirMatrices matriz = new ResumirMatrices();
        matriz.inicio();
    }
    public void inicio(){
        Scanner escaneado = new Scanner(System.in);
        boolean par = true;
        ResumirMatrices matriz = new ResumirMatrices(escaneado.nextInt(), escaneado.nextInt());
        matriz.rellenadorAleatorio(matriz.getMatriz());
       
        

//ResumirMatrices 
       // getMatrizReducida;
       // mostrarMatrices;
                try{
                    
                }
                catch(InputMismatchException e){
                    
                }
    }
    public int[][] getMatrizReducida(int [][] matriz){
        int[][] matrizReducida = new int [matriz.length/2][matriz.length/2];
        for(int i=0;i<matrizReducida.length;i++){
            for(int j=0;j<matrizReducida.length;j++){
                matrizReducida[i][j] = matriz[2 * i][2 * j]
                        * matriz[(2 * i) + 1][2 * j]
                        * matriz[2 * i][(2 * j) + 1]
                        * matriz[(2 * i) + 1][(2 * j) + 1];
            }
        }
        return matrizReducida;
    }
    public int[][] rellenadorAleatorio(int [][] matriz){
        for(int i = 0; i<matriz.length;i++){
            for(int j = 0; j<matriz.length;j++){
                matriz[i][j]=(int)Math.random()*11;
            }
        }
        return matriz;
    }
    public void mostrarMatrices(int[][] matriz){
        System.out.println();
        for(int i = 0; i<matriz.length;i++){
            System.out.print("| ");
            for(int j = 0; j<matriz.length;j++){
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void setMatrizDim(int a, int b) {
        this.matriz = new int[a][b];
    }
    public int[][] getMatriz() {
        return matriz;
    }
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
