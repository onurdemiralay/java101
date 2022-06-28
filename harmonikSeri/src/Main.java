import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        double result = 0.0;

        System.out.print("Harmonik Seri Ýçin Sayý Giriniz : ");
        number = input.nextInt();

        for (double i = 1; i <= number; i++){
            result += (1.0/i);
        }

        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("Harmonik serinin toplamý: " + formatter.format(result));
    }
}