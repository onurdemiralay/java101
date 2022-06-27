import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, r, c, faktoriyeln = 1, faktoriyelr = 1, faktoriyelnr = 1;

        System.out.print("C(n,r) deðeri için n: ");
        n = input.nextInt();
        System.out.print("C(n,r) deðeri için r: ");
        r = input.nextInt();

        for(int i = 1; i <= n; i++){
            faktoriyeln *= i;
        }

        for(int i = 1; i <= r; i++){
            faktoriyelr *= i;
        }

        for(int i = 1; i <= (n - r); i++){
            faktoriyelnr *= i;
        }

        c = faktoriyeln / (faktoriyelr * faktoriyelnr);

        System.out.println("C(n,r): " + c);
    }
}