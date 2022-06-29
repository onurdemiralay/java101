import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        int select, right = 3;
        double balance = 1500.0;

        Scanner input = new Scanner(System.in);

        while (right > 0){
            System.out.print("Kullanýcý Adý : ");
            userName = input.nextLine();
            System.out.print("Parola : ");
            password = input.nextLine();

            if (Objects.equals(userName, "patika") && Objects.equals(password, "dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasý'na Hoþgeldiniz!");

                do {
                    System.out.println("""
                        1- Para Yatýrma
                        2- Para Çekme
                        3- Bakiye Sorgulama
                        4- Çýkýþ Yap""");

                    System.out.print("Lütfen yapmak istediðiniz iþlemi seçiniz : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1 :
                            System.out.print("Para Miktarý : ");
                            double price = input.nextDouble();
                            balance += price;
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 2 :
                            System.out.print("Para Miktarý : ");
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
                        case 4: System.out.println("Tekrar görüþmek üzere.");
                        break;
                    }
                }while (select != 4);

            }else{
                right--;
                System.out.println("Hatalý kullanýcý adý veya þifre. Lütfen Tekrar Deneyiniz.");
                if (right == 0){
                    System.out.println("Hesabýnýz bloke olmuþtur. Lütfen banka ile iletiþime geçiniz.");
                }else{
                    System.out.println("Kalan Hakkýnýz : " + right);
                }
            }
        }
    }
}