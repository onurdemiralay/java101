import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float boy = 0.0f, kilo = 0.0f, vucutKitleIndeksi = 0.0f;

        Scanner input = new Scanner(System.in);

        System.out.print("L�tfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextFloat();
        System.out.print("L�tfen kilonuz giriniz: ");
        kilo = input.nextFloat();

        vucutKitleIndeksi = kilo / (boy * boy);

        System.out.print("V�cut Kitle �ndeksiniz: " + vucutKitleIndeksi);
    }
}