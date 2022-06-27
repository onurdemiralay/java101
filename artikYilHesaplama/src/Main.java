import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yil;

        System.out.print("Yýl Giriniz: ");
        yil = input.nextInt();

        if (yil % 100 == 0){
            if (yil % 400 == 0) {
                System.out.println(yil + " bir artýk yýldýr!");
            }
            else{
                System.out.println(yil + " bir artýk yýl deðildir!");
            }
        }
        else {
            if (yil % 4 == 0) {
                System.out.println(yil + " bir artýk yýldýr!");
            }
            else {
                System.out.println(yil + " bir artýk yýl deðildir!");
            }
        }
    }
}