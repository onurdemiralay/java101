import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Say� Giriniz : ");
        int sayi = input.nextInt();
        int toplam = 0;

        for (int i = 1; i < sayi; i++){
            if (sayi % i == 0){
                toplam += i;
            }
        }
        if (sayi == toplam){
            System.out.println(sayi + " m�kemmel say�d�r.");
        }
        else{
            System.out.println(sayi + " m�kemmel sayi de�ildir.");
        }
    }
}