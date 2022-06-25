import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km = 0;
        float tutar = 10.0f;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = input.nextInt();

        tutar += km * 2.20f;

        float kosul = tutar < 20 ? tutar = 20 : tutar;

        System.out.println("Tutar: " + tutar);
    }
}