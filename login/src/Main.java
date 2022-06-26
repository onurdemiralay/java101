import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword, defaultPassword = "java101";
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullan�c� ad�: ");
        userName = input.nextLine();
        System.out.print("Parola: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals(defaultPassword)){
            System.out.println("Giri� yap�ld�.");
        }
        else if(!userName.equals("patika")){
            System.out.println("Kullan�c� ad� hatal�.");
        }
        else{
            System.out.println("Hatal� �ifre girdiniz. �ifreyi s�f�rlamak istiyor musunuz?\n1- Evet\n0- Hay�r");
            select = input.nextInt();
            if (select == 1){
                Scanner inp = new Scanner(System.in);
                System.out.print("Yeni �ifre: ");
                newPassword = inp.nextLine();
                if (newPassword.equals(password) || newPassword.equals(defaultPassword)){
                    System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
                }
                else{
                    System.out.print("�ifre olu�turuldu.");
                }
            }
            else if(select == 0){
                System.out.println("��lem iptal edildi.");
            }
            else{
                System.out.println("Hatal� giri�.");
            }
        }
    }
}