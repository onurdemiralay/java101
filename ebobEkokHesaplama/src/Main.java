import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, ebob = 1, ekok = 1;

        System.out.print("n1 : ");
        n1 = input.nextInt();
        System.out.print("n2 : ");
        n2 = input.nextInt();

        if (n1 <= n2){
            int i = n1;
            while (i >= 1){
                if (n1 % i == 0 && n2 % i == 0){
                    ebob = i;
                    break;
                }
                i--;
            }

        }else {
            int i = n2;
            while (i >= 1){
                if (n1 % i == 0 && n2 % i == 0){
                    ebob = i;
                    break;
                }
                i--;
            }
        }

        int i = 1;
        while (i <= (n1 * n2)){

            if (i % n1 == 0 && i % n2 == 0){
                ekok = i;
                break;
            }
            i++;
        }
        // ekok = (n1 * n2) / ebob;

        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);
    }
}