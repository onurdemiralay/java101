import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayı: ");
        number1 = input.nextInt();
        System.out.print("2. Sayı: ");
        number2 = input.nextInt();
        System.out.print("3. Sayı: ");
        number3 = input.nextInt();
        if (number1 > number2 && number2 > number3){
            System.out.println("1. Sayı > 2. Sayı > 3. Sayı");
        }
        else if (number1 > number3 && number3 > number2) {
            System.out.println("1. Sayı > 3. Sayı > 2. Sayı");
        }
        else if (number1 > number2 && number2 == number3) {
            System.out.println("1. Sayı > 2. Sayı = 3. Sayı");
        }
        else if (number2 > number1 && number1 > number3) {
            System.out.println("2. Sayı > 1. Sayı > 3. Sayı");
        }
        else if (number2 > number3 && number3 > number1) {
            System.out.println("2. Sayı > 3. Sayı > 1. Sayı");
        }
        else if (number2 > number1 && number1 == number3) {
            System.out.println("2. Sayı > 1. Sayı = 3. Sayı");
        }
        else if (number3 > number1 && number1 > number2) {
            System.out.println("3. Sayı > 1. Sayı > 2. Sayı");
        }
        else if (number3 > number2 && number2 > number1) {
            System.out.println("3. Sayı > 2. Sayı > 1. Sayı");
        }
        else if (number3 > number2 && number2 == number1) {
            System.out.println("3. Sayı > 2. Sayı = 1. Sayı");
        }
        else{
            System.out.println("Sayılar eşittir.");
        }
    }
}