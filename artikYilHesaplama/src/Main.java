import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yil;

        System.out.print("Y�l Giriniz: ");
        yil = input.nextInt();

        if (yil % 100 == 0){
            if (yil % 400 == 0) {
                System.out.println(yil + " bir art�k y�ld�r!");
            }
            else{
                System.out.println(yil + " bir art�k y�l de�ildir!");
            }
        }
        else {
            if (yil % 4 == 0) {
                System.out.println(yil + " bir art�k y�ld�r!");
            }
            else {
                System.out.println(yil + " bir art�k y�l de�ildir!");
            }
        }
    }
}