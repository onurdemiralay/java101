import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, toplam = 0;
        boolean tekMi = false;

        while(!tekMi){
            System.out.print("Say� giriniz: ");
            sayi = input.nextInt();

            if (sayi % 2 == 1){
                tekMi = true;
            }
            else{
                if (sayi % 2 == 0 && sayi % 4 == 0){
                    toplam += sayi;
                }
            }
        }
        System.out.println("�ift ve 4'�n Kat� Olan Say�lar�n Toplam: " + toplam);
    }
}