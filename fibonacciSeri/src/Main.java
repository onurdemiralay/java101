import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Eleman Sayýsý Giriniz: ");
        int elemanSayisi = input.nextInt();
        int sayi1 = 0, sayi2 = 1, toplam;
        System.out.print(sayi1 + " " + sayi2);

        for (int i = 2; i < elemanSayisi; i++){
            toplam = sayi1 + sayi2;
            System.out.print(" " + toplam);
            sayi1 = sayi2;
            sayi2 = toplam;
        }
    }
}