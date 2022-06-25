import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        double area;

        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin 1. kenarý: ");
        a = input.nextInt();
        System.out.print("Üçgenin 2. kenarý: ");
        b = input.nextInt();
        System.out.print("Üçgenin 3. kenarý: ");
        c = input.nextInt();

        int perimeter = a + b +c; // üçgenin çevresi
        double u = perimeter / 2;
        area = Math.sqrt(u * (u - a) * (u - b) * (u - c)); // alan

        System.out.print("Alan: " + area);
    }
}