import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final float armutFiyat = 2.14f, elmaFiyat = 3.67f, domatesFiyat = 1.11f, muzFiyat = 0.95f, patlicanFiyat = 5.00f;
        int armutKilo = 0, elmaKilo = 0, domatesKilo = 0, muzKilo = 0, patlicanKilo = 0;
        float toplamTutar = 0.0f;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo?: ");
        armutKilo = input.nextInt();
        System.out.print("Elma Kaç Kilo?: ");
        elmaKilo = input.nextInt();
        System.out.print("Domates Kaç Kilo?: ");
        domatesKilo = input.nextInt();
        System.out.print("Muz Kaç Kilo?: ");
        muzKilo = input.nextInt();
        System.out.print("Patlýcan Kaç Kilo?: ");
        patlicanKilo = input.nextInt();

        toplamTutar = ((armutKilo * armutFiyat) + (elmaKilo * elmaFiyat) + (domatesKilo * domatesFiyat) + (muzKilo * muzFiyat) + (patlicanKilo * patlicanFiyat));

        System.out.println("Toplam Tutar: " + String.format("%.2f", toplamTutar) + "TL");
    }
}