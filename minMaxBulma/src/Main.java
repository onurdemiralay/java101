import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ka� tane say� gireceksiniz : ");
        int count = input.nextInt();
        int number, minNumber = 0, maxNumber = 0;


        for (int i = 1; i <= count; i++){
            System.out.print(i + ". Say�y� Giriniz : ");
            number = input.nextInt();
            if (i == 1){
                minNumber = number;
                maxNumber = number;
            }
            if (number > maxNumber){
                maxNumber = number;
            }
            else if (number < minNumber) {
                minNumber = number;
            }

        }
        System.out.println("En B�y�k Say� : " + maxNumber);
        System.out.println("En K���k Say� : " + minNumber);
    }
}