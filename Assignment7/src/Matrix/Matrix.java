package Matrix;

import java.util.Arrays;

public class Matrix {
    public int[][] matrix;
    boolean filled;
    private int counter;
    public Matrix(int n){
        this.matrix = new int[n][n];
        filled = false;
        this.counter =0 ;
    }

    public void setFilled(){
        this.filled = true;
    }

    public void fillMatrix(int a, int i, int j){
        if(!(i < 0 || i >= this.matrix.length || j < 0 || j <= this.matrix.length)){
            this.matrix[i][j] = a;
        }
        System.out.println(Arrays.toString(matrix));
        counter++;
        if(counter == this.matrix.length * this.matrix.length){
            this.setFilled();
        }
    }

    public boolean checkFilled(){
        return this.filled;
    }

    public int sumRow(int row){
    int sum = 0;
    if(row < 0 || row > this.matrix.length - 1){
        System.out.println("Ingresaste una fila no valida");
    }else{
        for(int i = 0; i < this.matrix.length; i++){
            sum = sum + this.matrix[row][i];
        }
    }
    return sum;
}
    public int sumCol(int col){
        int sum = 0;
        if(col < 0 || col > this.matrix.length - 1){
            System.out.println("Ingresaste una columna no valida");
        }else {
            for (int i = 0; i < this.matrix.length; i++) {
                sum = sum + this.matrix[i][col];
            }
        }
            return sum;
    }
    public int sumDiagonal(){
        int suma = 0;
        for(int i = 0; i < this.matrix.length; i++){
            for(int j=0; j< this.matrix[0].length; j++){
                if(i == j){
                    suma = suma + this.matrix[i][j];
                }
            }
        }
        return suma;
    }
    public int sumInverseDiagonal(){
        int sum = 0;
        int cols = this.matrix.length - 1;
        int rows = 0;
        for(int i=0; i< this.matrix.length; i++){
            sum = sum + this.matrix[rows][cols];
            rows++;
            cols--;
        }
        return sum;
    }

    public int average(){
        int media = 0;
        for(int i = 0; i < this.matrix.length; i++){
            for(int j = 0; j < this.matrix.length;j++){
                media = media + this.matrix[i][j];
            }
        }
        media = media / this.matrix.length;
        return media;
    }
    public String toString(){
        String str = "";
        for(int i=0; i< this.matrix.length; i++){
            for(int j= 0; j< this.matrix[0].length;j++){
                str = str +this.matrix[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }
}
