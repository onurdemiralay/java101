import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Say�: ");
        number1 = input.nextInt();
        System.out.print("2. Say�: ");
        number2 = input.nextInt();
        System.out.print("3. Say�: ");
        number3 = input.nextInt();
        if (number1 > number2 && number2 > number3){
            System.out.println("1. Say� > 2. Say� > 3. Say�");
        }
        else if (number1 > number3 && number3 > number2) {
            System.out.println("1. Say� > 3. Say� > 2. Say�");
        }
        else if (number1 > number2 && number2 == number3) {
            System.out.println("1. Say� > 2. Say� = 3. Say�");
        }
        else if (number2 > number1 && number1 > number3) {
            System.out.println("2. Say� > 1. Say� > 3. Say�");
        }
        else if (number2 > number3 && number3 > number1) {
            System.out.println("2. Say� > 3. Say� > 1. Say�");
        }
        else if (number2 > number1 && number1 == number3) {
            System.out.println("2. Say� > 1. Say� = 3. Say�");
        }
        else if (number3 > number1 && number1 > number2) {
            System.out.println("3. Say� > 1. Say� > 2. Say�");
        }
        else if (number3 > number2 && number2 > number1) {
            System.out.println("3. Say� > 2. Say� > 1. Say�");
        }
        else if (number3 > number2 && number2 == number1) {
            System.out.println("3. Say� > 2. Say� = 1. Say�");
        }
        else{
            System.out.println("Say�lar e�ittir.");
        }
    }
}