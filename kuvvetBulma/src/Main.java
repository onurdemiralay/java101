import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;

        System.out.print("Say� giriniz: ");
        sayi = input.nextInt();

        System.out.println(sayi + " say�s�ndan k���k 4'�n kuvvetleri:");
        for (int i = 1;i <= sayi;i *= 4){
            System.out.print(i + "   ");
        }

        System.out.println();

        System.out.println(sayi + " say�s�ndan k���k 5'in kuvvetleri:");
        for (int i = 1;i <= sayi;i *= 5){
            System.out.print(i + "   ");
        }

    }
}