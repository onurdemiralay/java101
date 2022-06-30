import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    static int a, b;
    static int sum(int a, int b){
        return a + b;
    }
    static int minus(int a, int b){
        return a - b;
    }
    static int times(int a, int b){
        return a * b;
    }
    static double divide(double a, double b){
        return a / b;
    }
    static int exponantion(int a, int b){
        int result = 1;

        for (int i = 1; i <= b; i++){
            result *= a;
        }

        return result;
    }
    static int factorial(int a){
        int result = 1;

        for (int i = 1; i <= a; i++){
            result *= i;
        }
        return result;
    }
    static int mode(int a, int b){
        return a % b;
    }
    static void calculate(int a, int b){
        int circum = 1, field = 1;
        circum = 2 * (a + b);
        field = a * b;
        System.out.println("Çevre : " + circum + "\n" + "Alan : " + field);
    }
    public static void main(String[] args) {
        int select;
        String menu = """
                1 - Toplama İşlemi
                2 - Çıkarma İşlemi
                3 - Çarpma İşlemi
                4 - Bölme İşlemi
                5 - Üslü Sayı Hesaplama
                6 - Faktöriyel Hesaplama
                7 - Mod Alma
                8 - Dikdörtgen Alan ve Çevre Hesabı
                0 - Çıkış
                """;
        System.out.print(menu);

        do {
            System.out.print("Lütfen Bir İşlem Seçiniz : ");
            select = input.nextInt();

            switch (select){
                case 1:
                    System.out.print("1. Sayı : ");
                    a = input.nextInt();
                    System.out.print("2. Sayı : ");
                    b = input.nextInt();

                    System.out.println("Sonuç : " + sum(a, b));
                    break;
                case 2:
                    System.out.print("1. Sayı : ");
                    a = input.nextInt();
                    System.out.print("2. Sayı : ");
                    b = input.nextInt();

                    System.out.println("Sonuç : " + minus(a, b));
                    break;
                case 3:
                    System.out.print("1. Sayı : ");
                    a = input.nextInt();
                    System.out.print("2. Sayı : ");
                    b = input.nextInt();

                    System.out.println("Sonuç : " + times(a, b));
                    break;
                case 4:
                    System.out.print("1. Sayı : ");
                    a = input.nextInt();
                    System.out.print("2. Sayı : ");
                    b = input.nextInt();

                    if (b == 0){
                        System.out.println("0'a Bölünemez!");
                    }
                    else {
                        System.out.println("Sonuç : " + String.format("%.2f", divide(a, b)));
                    }
                    break;
                case 5:
                    System.out.print("Taban : ");
                    a = input.nextInt();
                    System.out.print("Üs : ");
                    b = input.nextInt();

                    System.out.println("Sonuç : " + exponantion(a, b));
                    break;
                case 6:
                    System.out.print("Sayı : ");
                    a = input.nextInt();

                    System.out.println("Sonuç : " + factorial(a));
                    break;

                case 7:
                    System.out.print("Sayı : ");
                    a = input.nextInt();
                    System.out.print("Mod : ");
                    b = input.nextInt();

                    System.out.println("Sonuç : " + mode(a, b));
                    break;
                case 8:
                    System.out.print("Kısa kenar : ");
                    a = input.nextInt();
                    System.out.print("Uzun kenar : ");
                    b = input.nextInt();

                    calculate(a, b);
                    break;
                default:
                    break;
            }
        }while(select != 0);
        System.out.println("Çıkış yapıldı!");
    }
}