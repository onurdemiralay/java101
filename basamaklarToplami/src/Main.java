import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, value, tempNumber, total = 0;

        System.out.print("Say� giriniz: ");
        number = input.nextInt();

        tempNumber = number;

        while(tempNumber !=0){
            value = tempNumber % 10;
            total += value;
            tempNumber /= 10;
        }
        System.out.println(number + " say�s�n�n basamaklar�n�n toplam�: " + total);
    }
}