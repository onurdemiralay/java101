import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dogumYili, kalan;

        System.out.print("Do�um y�l�n�z� giriniz: ");
        dogumYili = input.nextInt();
        kalan = dogumYili % 12;

        switch (kalan) {
            case 0 -> System.out.println("�in Zodya�� Burcunuz: Maymun");
            case 1 -> System.out.println("�in Zodya�� Burcunuz: Horoz");
            case 2 -> System.out.println("�in Zodya�� Burcunuz: K�pek");
            case 3 -> System.out.println("�in Zodya�� Burcunuz: Domuz");
            case 4 -> System.out.println("�in Zodya�� Burcunuz: Fare");
            case 5 -> System.out.println("�in Zodya�� Burcunuz: �k�z");
            case 6 -> System.out.println("�in Zodya�� Burcunuz: Kaplan");
            case 7 -> System.out.println("�in Zodya�� Burcunuz: Tav�an");
            case 8 -> System.out.println("�in Zodya�� Burcunuz: Ejderha");
            case 9 -> System.out.println("�in Zodya�� Burcunuz: Y�lan");
            case 10 -> System.out.println("�in Zodya�� Burcunuz: At");
            case 11 -> System.out.println("�in Zodya�� Burcunuz: Koyun");
            default -> System.out.println("Hata!");
        }
    }
}