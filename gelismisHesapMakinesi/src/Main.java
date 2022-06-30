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
        System.out.println("�evre : " + circum + "\n" + "Alan : " + field);
    }
    public static void main(String[] args) {
        int select;
        String menu = """
                1 - Toplama ��lemi
                2 - ��karma ��lemi
                3 - �arpma ��lemi
                4 - B�lme ��lemi
                5 - �sl� Say� Hesaplama
                6 - Fakt�riyel Hesaplama
                7 - Mod Alma
                8 - Dikd�rtgen Alan ve �evre Hesab�
                0 - ��k��
                """;
        System.out.print(menu);

        do {
            System.out.print("L�tfen Bir ��lem Se�iniz : ");
            select = input.nextInt();

            switch (select){
                case 1:
                    System.out.print("1. Say� : ");
                    a = input.nextInt();
                    System.out.print("2. Say� : ");
                    b = input.nextInt();

                    System.out.println("Sonu� : " + sum(a, b));
                    break;
                case 2:
                    System.out.print("1. Say� : ");
                    a = input.nextInt();
                    System.out.print("2. Say� : ");
                    b = input.nextInt();

                    System.out.println("Sonu� : " + minus(a, b));
                    break;
                case 3:
                    System.out.print("1. Say� : ");
                    a = input.nextInt();
                    System.out.print("2. Say� : ");
                    b = input.nextInt();

                    System.out.println("Sonu� : " + times(a, b));
                    break;
                case 4:
                    System.out.print("1. Say� : ");
                    a = input.nextInt();
                    System.out.print("2. Say� : ");
                    b = input.nextInt();

                    if (b == 0){
                        System.out.println("0'a B�l�nemez!");
                    }
                    else {
                        System.out.println("Sonu� : " + String.format("%.2f", divide(a, b)));
                    }
                    break;
                case 5:
                    System.out.print("Taban : ");
                    a = input.nextInt();
                    System.out.print("�s : ");
                    b = input.nextInt();

                    System.out.println("Sonu� : " + exponantion(a, b));
                    break;
                case 6:
                    System.out.print("Say� : ");
                    a = input.nextInt();

                    System.out.println("Sonu� : " + factorial(a));
                    break;

                case 7:
                    System.out.print("Say� : ");
                    a = input.nextInt();
                    System.out.print("Mod : ");
                    b = input.nextInt();

                    System.out.println("Sonu� : " + mode(a, b));
                    break;
                case 8:
                    System.out.print("K�sa kenar : ");
                    a = input.nextInt();
                    System.out.print("Uzun kenar : ");
                    b = input.nextInt();

                    calculate(a, b);
                    break;
                default:
                    break;
            }
        }while(select != 0);
        System.out.println("��k�� yap�ld�!");
    }
}