import java.util.Scanner;

public class Main {
    static int result = 1;
    static int exponantion(int base, int exp){
        if (exp == 0){
            return 1;
        }
        result *= base;
        exponantion(base, exp - 1);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban : ");
        int base = input.nextInt();
        System.out.print("Üs : ");
        int exp = input.nextInt();

        System.out.println("Sonuç : " + exponantion(base, exp));
    }
}