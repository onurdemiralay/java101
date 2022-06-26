import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matematik, fizik, turkce, kimya, muzik, toplam = 0;
        double ortalama = 0;

        System.out.print("Matematik notu: ");
        matematik = input.nextInt();
        System.out.print("Fizik notu: ");
        fizik = input.nextInt();
        System.out.print("T�rk�e notu: ");
        turkce = input.nextInt();
        System.out.print("Kimya notu: ");
        kimya = input.nextInt();
        System.out.print("M�zik notu: ");
        muzik = input.nextInt();

        if (matematik >= 0 && matematik<= 100){
            toplam += matematik;
        }
        else{
            System.out.println("Matematik notu 0-100 aras�nda olmad��� i�in ortalama kat�lmad�.");
        }
        if (fizik >= 0 && fizik<= 100){
            toplam += fizik;
        }
        else{
            System.out.println("Fizik notu 0-100 aras�nda olmad��� i�in ortalama kat�lmad�.");
        }
        if (turkce >= 0 && turkce<= 100){
            toplam += turkce;
        }
        else{
            System.out.println("T�rk�e notu 0-100 aras�nda olmad��� i�in ortalama kat�lmad�.");
        }
        if (kimya >= 0 && kimya<= 100){
            toplam += kimya;
        }
        else{
            System.out.println("Kimya notu 0-100 aras�nda olmad��� i�in ortalama kat�lmad�.");
        }
        if (muzik >= 0 && muzik<= 100){
            toplam += muzik;
        }
        else{
            System.out.println("M�zik notu 0-100 aras�nda olmad��� i�in ortalama kat�lmad�.");
        }

        ortalama = toplam/5;

        if (ortalama < 55){
            System.out.println("Kald�n�z!\nOrtalaman�z: " + ortalama);
        }
        else{
            System.out.println("Ge�tiniz!\nOrtalaman�z: " + ortalama);
        }
    }
}