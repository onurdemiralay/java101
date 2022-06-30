import java.util.Scanner;

public class Main {
    static boolean pattern(int number, int tempNumber){
        System.out.print(tempNumber + " ");
        if (tempNumber > 0){
            tempNumber -= 5;
        }
        else if (tempNumber <= 0){
            while(number != tempNumber){
                tempNumber += 5;
                System.out.print(tempNumber + " ");
            }
            return true;
        }
        return pattern(number, tempNumber);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayý giriniz : ");
        int number = input.nextInt();

        pattern(number, number);
    }
}