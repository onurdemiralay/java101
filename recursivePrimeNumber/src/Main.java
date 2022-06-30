import java.util.Scanner;

public class Main {
    static boolean isPrimeNumber(int number, int x){
        if (number <= x){
            return number == 2;
        }
        if (number % x == 0){
            return false;
        }

        return isPrimeNumber(number, x + 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı : ");
        int number = input.nextInt();
        if(isPrimeNumber(number, 2)){
            System.out.println("Asal");
        }
        else{
            System.out.println("Asal Değil");
        }
    }
}