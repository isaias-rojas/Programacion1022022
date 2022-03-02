package MagicSquare;

public class MagicBox {
    int[][] square;
    private int magicConstant;
    private int dimension;

    public MagicBox(int dimension){
        if(dimension % 2 == 0){
            dimension+=1;
        }
        this.square = new int[dimension][dimension];
        this.magicConstant = (dimension *(dimension *dimension + 1))/2;
        this.dimension = dimension;
    }
    public String toString(){
        String str = "";
        for(int i=0; i< this.square.length; i++){
            for(int j = 0;j< this.square[0].length; j++){
                str += this.square[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }
    public void generateMagicSquare(){
        int row = dimension-1;
        int col = dimension /2;
        square[row][col] = 1;
        for(int i = 2; i<= dimension*dimension; i++){
            if(square[(row+1) %dimension][(col+1)%dimension] == 0){
                row = (row + 1)% dimension;
                col = (col+1) % dimension;
            }else{
                row = (row - 1 + dimension) % dimension;
            }
            square[row][col] = i;
        }
    }



}
