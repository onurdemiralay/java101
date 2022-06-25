import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float fiyat = 0.0f, kdvliFiyat = 0.0f, kdvTutari = 0.0f, kdvOrani = 0.0f;

        Scanner input = new Scanner(System.in);

        System.out.print("Fiyat giriniz: ");
        fiyat = input.nextFloat();

        float kdv = (fiyat >= 0.0f && fiyat <= 1000.0f) ? (kdvOrani = 0.18f):(kdvOrani = 0.8f);

        kdvTutari = fiyat * kdvOrani;

        kdvliFiyat = fiyat + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + fiyat);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV Tutarı: " + kdvTutari);
    }
}