package Matrix;

import java.util.Scanner;

public class App {;
    static boolean playing = true;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the matrix\n What do you like to do?");

        while(playing){
            System.out.println("\n1: Fill the matrix with numbers\n2: Sum of one row of the matrix\n" +
                    " 3: Suma of one column\n4: Sum of the diagonal of the matrix" +
                    "\n5: Sum of the inverse diagonal\n6: Avergage\n7: Print Matrix\n8: Exit\n\n\n Option: ");
            int option = scanner.nextInt();
            Matrix m = new Matrix(4);
            if((option > 1 && option < 7) && m.checkFilled()){
                System.out.println("You need to fill the matrix first");
            }else{
                switch (option){
                    case 1:
                        for(int i  = 0; i < m.matrix.length; i++){
                            for(int j = 0; j < m.matrix[0].length; j++){
                                System.out.print(i + " " + j + " :");
                                m.fillMatrix(scanner.nextInt(), i, j);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("What row do you want to sum?\nRow: ");
                        int row = scanner.nextInt();
                        System.out.println(m.sumRow(row));
                        break;
                    case 3:
                        System.out.println("What colums do you want to sum?\nRow: ");
                        int column = scanner.nextInt();
                        System.out.println(m.sumCol(column));
                        break;
                    case 4:
                        System.out.println("Sum of the diagonal: "+ m.sumDiagonal());
                        break;
                    case 5:
                        System.out.println("Sum of the inverse diagonal: "+ m.sumInverseDiagonal());
                        break;
                    case 6:
                        System.out.println(m.average());
                        break;
                    case 7:
                        System.out.println(m.toString());
                        break;
                    case 8:
                        playing = false;
                        System.out.println("We hope to seeee you later. Good luck");
                    default:
                        System.out.println("Choose a correct option! ");
                }

            }


        }
    }
}
