import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        double area;

        Scanner input = new Scanner(System.in);

        System.out.print("��genin 1. kenar�: ");
        a = input.nextInt();
        System.out.print("��genin 2. kenar�: ");
        b = input.nextInt();
        System.out.print("��genin 3. kenar�: ");
        c = input.nextInt();

        int perimeter = a + b +c; // ��genin �evresi
        double u = perimeter / 2;
        area = Math.sqrt(u * (u - a) * (u - b) * (u - c)); // alan

        System.out.print("Alan: " + area);
    }
}