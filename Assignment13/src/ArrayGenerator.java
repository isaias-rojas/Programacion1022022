import java.util.Arrays;

public class ArrayGenerator {
    int[] arr;
    int minusRange;
    int maxRange;
    int i = 0;

    ArrayGenerator(){
        arr = new int[100];
        minusRange = 0;
        maxRange = 140;
        generateArray();
    }

    private void generateArray() {
        do{
            arr[i] = generateRandomNumber();
            i++;
        }while(i < arr.length);
    }

    //5*n2 + 4) or (5*n2 – 4) if one of both is true, is a fibonacci number
    public boolean isFiboNumber(int n){
        return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
    }

    private boolean isPerfectSquare(int n){
        int aux = (int)Math.sqrt(n);
        return aux * aux == n;
    }

    private int generateRandomNumber(){
        int number = (int)(Math.random()*maxRange) + 1;
        if(isFiboNumber(number) ){
            return generateRandomNumber();
        }
        if(checkRepeated(number, i)){
            return generateRandomNumber();
        }
        return number;
    }

    private boolean checkRepeated(int number, int counter){
        boolean res = false;
        for(int i = 0; i < counter ; i++){
            if(number == arr[i]){
                return true;
            }
        }
        return res;
    }
    @Override
    public String toString(){
        String res = "";
        for(int n: arr){
            res= n + " " + res;
        }
        return res;
    }

    public boolean checkRepeated(){
        boolean res = false;
        for(int i = 0; i < arr.length ; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return res;
    }
    public void sort(){
        Arrays.sort(arr);

    }
}
