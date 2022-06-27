import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mesafe, yas, yolculukTipi;
        double normalTutar = 0.0, indirimliTutar = 0.0, toplamTutar = 0.0, yasIndirimi, biletIndirimi;

        System.out.print("Mesafeyi km t�r�nden giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Ya��n�z� giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Y�n, 2 => Gidi� D�n��): ");
        yolculukTipi = input.nextInt();

        normalTutar = mesafe * 0.10;

        if (yolculukTipi <= 0 && yolculukTipi > 2){
            System.out.println("Hatal� yolculuk tipi girdiniz!");
        }
        if (mesafe >= 0){
            if (yas >= 0 && yas < 12){
                if (yolculukTipi == 2) {
                    yasIndirimi = normalTutar * 0.50;
                    indirimliTutar = normalTutar - yasIndirimi;
                    biletIndirimi = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - biletIndirimi) * 2;
                    System.out.println("Toplam Tutar= " + toplamTutar);
                }
                else{
                    yasIndirimi = normalTutar * 0.50;
                    indirimliTutar = normalTutar - yasIndirimi;
                    System.out.println("Toplam Tutar= " + indirimliTutar);
                }
            }
            else if (yas >= 12 && yas < 24) {
                if (yolculukTipi == 2) {
                    yasIndirimi = normalTutar * 0.10;
                    indirimliTutar = normalTutar - yasIndirimi;
                    biletIndirimi = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - biletIndirimi) * 2;
                    System.out.println("Toplam Tutar= " + toplamTutar);
                }
                else{
                    yasIndirimi = normalTutar * 0.10;
                    indirimliTutar = normalTutar - yasIndirimi;
                    System.out.println("Toplam Tutar= " + indirimliTutar);
                }
            }
            else if (yas > 65) {
                if (yolculukTipi == 2) {
                    yasIndirimi = normalTutar * 0.30;
                    indirimliTutar = normalTutar - yasIndirimi;
                    biletIndirimi = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - biletIndirimi) * 2;
                    System.out.println("Toplam Tutar= " + toplamTutar);
                }
                else{
                    yasIndirimi = normalTutar * 0.30;
                    indirimliTutar = normalTutar - yasIndirimi;
                    System.out.println("Toplam Tutar= " + indirimliTutar);
                }
            }
            else if(yas < 0){
                System.out.println("Hatal� ya� girdiniz.");
            }
            else{
                System.out.println("Ya� indiriminiz bulunmamaktad�r.");
                if (yolculukTipi == 2) {
                    biletIndirimi = normalTutar * 0.20;
                    toplamTutar = (normalTutar - biletIndirimi) * 2;
                    System.out.println("Toplam Tutar= " + toplamTutar);
                }
                else{
                    System.out.println("Toplam Tutar= " + normalTutar);
                }

            }
        }
        else{
            System.out.println("Hatal� mesafe verisi girdiniz!");
        }
    }
}