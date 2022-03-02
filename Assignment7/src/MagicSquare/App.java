package MagicSquare;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the dimensions of the magic square ( n x n).\n Must be odd: ");
        int n = in.nextInt();
        MagicBox magicBox = new MagicBox(n);
        magicBox.generateMagicSquare();

        System.out.println(magicBox.toString());
    }
}
