import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, toplam = 0, sayac = 0;
        double ortalama;

        System.out.print("Say� giriniz: ");
        sayi = input.nextInt();

        for (int i = 0; i < sayi; i++){
            if (i % 3 == 0 && i % 4 == 0){
                System.out.println("3'e ve 4'e B�l�nebilen Say�: " + i);
                toplam += i;
                sayac++;
            }
        }
        ortalama = toplam / sayac;
        System.out.println("Ortalama: " + ortalama);

    }
}