import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        int select, right = 3;
        double balance = 1500.0;

        Scanner input = new Scanner(System.in);

        while (right > 0){
            System.out.print("Kullan�c� Ad� : ");
            userName = input.nextLine();
            System.out.print("Parola : ");
            password = input.nextLine();

            if (Objects.equals(userName, "patika") && Objects.equals(password, "dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankas�'na Ho�geldiniz!");

                do {
                    System.out.println("""
                        1- Para Yat�rma
                        2- Para �ekme
                        3- Bakiye Sorgulama
                        4- ��k�� Yap""");

                    System.out.print("L�tfen yapmak istedi�iniz i�lemi se�iniz : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1 :
                            System.out.print("Para Miktar� : ");
                            double price = input.nextDouble();
                            balance += price;
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 2 :
                            System.out.print("Para Miktar� : ");
                            price = input.nextDouble();
                            if (price > balance) {
                                System.out.println("Bakiye Yetersiz!");
                            }
                            else {
                                balance -= price;
                                System.out.println("Bakiyeniz : " + balance);
                                break;
                            }
                        case 3 : System.out.println("Bakiyeniz : " + balance);
                        break;
                        case 4: System.out.println("Tekrar g�r��mek �zere.");
                        break;
                    }
                }while (select != 4);

            }else{
                right--;
                System.out.println("Hatal� kullan�c� ad� veya �ifre. L�tfen Tekrar Deneyiniz.");
                if (right == 0){
                    System.out.println("Hesab�n�z bloke olmu�tur. L�tfen banka ile ileti�ime ge�iniz.");
                }else{
                    System.out.println("Kalan Hakk�n�z : " + right);
                }
            }
        }
    }
}