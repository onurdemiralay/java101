import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.println("S�cakl�k: ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.print("Kayak yapabilirsiniz.");
        }
        else if (heat >= 5 && heat < 15) {
            System.out.print("Sinemaya gidebilirsiniz.");
        }
        else if (heat >= 15 && heat < 25) {
            System.out.print("Piknik yapabilirsiniz.");
        }
        else {
            System.out.print("Y�zmeye gidebilirsiniz.");
        }
    }
}