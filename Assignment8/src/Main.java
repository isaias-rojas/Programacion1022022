import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String input = scanner.nextLine();*/
        String input = "Según un estudio de una universidad inglesa, no importa el orden en el que las letras están escritas, la única cosa importante es que la primera y última letra estén escritas en la posición correcta. El resto pueden estar totalmente mal y aún podrás leerlo sin problemas. Esto es porque no leemos cada letra por sí misma. sino la palabra como un todo. Personalmente me parece increíble";
        Assignment8 assignment8 = new Assignment8(input);
        System.out.println(assignment8);

/*
        String caca = "la caca mola demasiado";
        String[] split = caca.split(" ");
        for(int i = 0; i < split.length; i++){
            System.out.println(split[i]);
        }*/
    }
}
