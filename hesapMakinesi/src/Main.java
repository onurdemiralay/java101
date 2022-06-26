import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Ilk Sayiyi Giriniz: ");
        n1 = input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplam\n2-Çikarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çikarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma: " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0){
                    System.out.println("0'a bölme hatasi");
                }
                else{
                    System.out.println("Bölme: " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Hatalý giriþ.");
                break;
        }
    }
}
