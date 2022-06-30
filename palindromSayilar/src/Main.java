import  java.util.Scanner;

public class Main {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastDigit;

        while (temp != 0){
            lastDigit = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temp /= 10;
        }

        return reverseNumber == number;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Say� Giriniz : ");
        int number = input.nextInt();

        if (isPalindrom(number)){
            System.out.println("Girdi�iniz say� palindromdur.");
        }
        else{
            System.out.println("Girdi�iniz say� palindrom de�ildir.");
        }
    }
}