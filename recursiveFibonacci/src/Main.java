import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    static int fibonacci(int number){
        if (number == 0 || number == 1){
            return 1;
        }
        else{
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci Uzunluðu : ");
        int number = input.nextInt();

        System.out.println("Fibonacci Deðeri : " + fibonacci(number));
    }
}