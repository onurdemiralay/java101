import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mesafe, yas, yolculukTipi;
        double normalTutar = 0.0, indirimliTutar = 0.0, toplamTutar = 0.0, yasIndirimi, biletIndirimi;

        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Yaþýnýzý giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiþ Dönüþ): ");
        yolculukTipi = input.nextInt();

        normalTutar = mesafe * 0.10;

        if (yolculukTipi <= 0 && yolculukTipi > 2){
            System.out.println("Hatalý yolculuk tipi girdiniz!");
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
                System.out.println("Hatalý yaþ girdiniz.");
            }
            else{
                System.out.println("Yaþ indiriminiz bulunmamaktadýr.");
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
            System.out.println("Hatalý mesafe verisi girdiniz!");
        }
    }
}