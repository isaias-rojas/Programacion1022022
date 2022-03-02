package ThreeInRow;

public class TicTacToe {
    char[][] heel;
    final char[] MOVS = {'X', 'O'};
    public boolean turno;
    private boolean playing;
    private int moves;
    private int n;
    private int counterHit;

    public TicTacToe() {
        this.heel = new char[3][3];
        this.beginTicTacToe();
        this.n = 3;
        turno = true;
        this.playing = true;
        this.moves = 0;
        this.counterHit = 0;
    }

    private void beginTicTacToe() {
        for (int i = 0; i < this.heel.length; i++) {
            for (int j = 0; j < this.heel.length; j++) {
                heel[i][j] = '-';
            }
        }
    }

    public boolean getPlayStatus() {
        return this.playing;
    }

    public boolean play(int i, int j) {
        if (!isFree(i, j)) {
            this.heel[i][j] = this.MOVS[turno ? 0 : 1];
            turno = !turno;
            this.moves += 1;
            return true;
        }
        return false;
    }

    public boolean moveValidator(int i, int j) {
        if (i < 0 || j < 0 || i > this.heel.length - 1 || j > this.heel.length - 1) {
            return false;
        }
        return true;
    }

    public boolean allFilled() {
        boolean all = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (heel[i][j] != '-') {
                    all = true && all;
                } else {
                    all = false;
                }
            }
        }
        return all;
    }

    private boolean isFree(int i, int j) {
        if (this.heel[i][j] != '-') {
            return true;
        }
        return false;
    }

    private boolean checkRows(boolean b) {
        boolean hit = false;
        for (int i = 0; i < this.heel.length; i++) {
            hit = checkRow(i,b ) || hit;
        }
        return hit;
    }
    private boolean checkRow(int i, boolean b){
        boolean res = true;
        int p = getPlayer(b);
        for(int j = 0; j < this.heel.length - 2; j++){
            if((this.heel[i][j] == MOVS[p]) && (this.heel[i][j+1] == MOVS[p])){
                res = true && res;
            }else{
                res = false;
                break;
            }
        }
        return res;
    }

    private boolean checkCols(boolean b) {
        boolean hit = false;
        for (int i = 0; i < this.heel.length; i++) {
            hit = checkCol(i,b ) || hit;
        }
        return hit;
    }
    private boolean checkCol(int i, boolean b){
        boolean res = true;
        int p = getPlayer(b);
        for(int j = 0; j < this.heel.length-2; j++){
            if(this.heel[j][i] == MOVS[p] && this.heel[j+1][i] == MOVS[p]){
                res = res && true;
            }
            else{
                res = false;
                break;
            }
        }
        return res;
    }

    private boolean checkDiagonal(boolean b) {

        boolean hit = true;
        int p = getPlayer(b);
        int row = 0; int col = 0;
        int counter = 0;
        while(true){
            if(this.heel[row][col] == MOVS[getPlayer(b)] && this.heel[row+1][col+1] == MOVS[getPlayer(b)] ){
                hit = true && hit;
                counter += 1;
            }else{
                hit = false;
                break;
            }
            row += 1;
            col += 1;
            if(counter == this.heel.length - 1){
                break;
            }
        }
        return hit;
    }

    private boolean checkInverseDiagonal(boolean b) {

        boolean hit = true;
        int p = getPlayer(b);
        int row = 0; int col = this.heel.length-1;
        int counter = 0;
        while(true){
            if(this.heel[row][col] == MOVS[getPlayer(b)] && this.heel[row+1][col-1] == MOVS[getPlayer(b)] ){
                hit = true && hit;
                counter += 1;
            }else{
                hit = false;
                break;
            }
            row += 1;
            col -= 1;
            if(counter == this.heel.length - 1){
                break;
            }
        }
        return hit;
    }
    public int getPlayer(boolean b){
        return b ? 0: 1;
    }
    public void setStatusGame() {
        this.playing = false;
    }

    public boolean checkHit(boolean b) {
        return (checkCols(b) || checkRows(b) || checkDiagonal(b) || checkInverseDiagonal(b)) && this.moves > 3;
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < this.heel.length; i++) {
            for (int j = 0; j < this.heel.length; j++) {
                res = res + this.heel[i][j]+ " ";
            }
            res += "\n";
        }
        return res;
    }
}