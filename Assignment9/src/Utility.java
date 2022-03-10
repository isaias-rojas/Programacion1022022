import java.util.Arrays;

public class Utility {
    public static void main(String[] args) {

        final String[] c = Utility.Repeated("This is a repeated word test this is a A");

        System.out.println(Arrays.toString(c));//Should print [a, 3]

        final String[] c1 = Utility.Repeated("This is a repeated word test this this this this this this");

        System.out.println(Arrays.toString(c1));//Should print [this, 7]

        final String[] c2 = Utility.Repeated("This is a repeated word test this word word word");

        System.out.println(Arrays.toString(c2));//Should print [word, 4]

    }

    private static String[] Repeated(String repeated){
        String rep[] = repeated.toLowerCase().split(" ");
        int counter = 0;
        int auxCounter = 0;
        String mostRepeatedWord = "";
        for(int j = 0; j < rep.length; j++) {
            for (int i = 0; i < rep.length; i++) {
                if (rep[j].equals(rep[i])) {
                    auxCounter = auxCounter + 1;
                }
            }
            if(auxCounter > counter){
                counter = auxCounter;
                mostRepeatedWord = rep[j];
            }
            auxCounter = 0;
        }
        return new String[]{mostRepeatedWord, String.valueOf(counter)};
    }
}