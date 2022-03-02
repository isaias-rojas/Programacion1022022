package ThreeInRow;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TicTacToe tic = new TicTacToe();
        Scanner in = new Scanner(System.in);

        while(tic.getPlayStatus()){
            int row, col;
            System.out.println(tic.toString());
            int player = (tic.turno) ?1 : 2;
            System.out.println("\nPlayer "+ player + ":\n Row number ");
            row = in.nextInt();
            System.out.println("\nCol number: ");
            col = in.nextInt();
            if(tic.moveValidator(row, col)){
                boolean aux  = tic.play(row, col);
                if(!aux){
                    System.out.println("Try again, the position you entered is already filled");
                }else{
                    //System.out.println(tic.);
                }
            }else{
                System.out.println("Please, provide a valid position");
            }

            if(tic.checkHit(!tic.turno)){
                tic.setStatusGame();
                System.out.println("The player "+ (player) +" has been the wiinner");
            }else{
                if(tic.allFilled()){
                    System.out.println("No one have winned");
                }
            }
            System.out.println(tic.toString());

        }
    }
}
