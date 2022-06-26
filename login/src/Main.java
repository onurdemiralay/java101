import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword, defaultPassword = "java101";
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanýcý adý: ");
        userName = input.nextLine();
        System.out.print("Parola: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals(defaultPassword)){
            System.out.println("Giriþ yapýldý.");
        }
        else if(!userName.equals("patika")){
            System.out.println("Kullanýcý adý hatalý.");
        }
        else{
            System.out.println("Hatalý þifre girdiniz. Þifreyi sýfýrlamak istiyor musunuz?\n1- Evet\n0- Hayýr");
            select = input.nextInt();
            if (select == 1){
                Scanner inp = new Scanner(System.in);
                System.out.print("Yeni Þifre: ");
                newPassword = inp.nextLine();
                if (newPassword.equals(password) || newPassword.equals(defaultPassword)){
                    System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
                }
                else{
                    System.out.print("Þifre oluþturuldu.");
                }
            }
            else if(select == 0){
                System.out.println("Ýþlem iptal edildi.");
            }
            else{
                System.out.println("Hatalý giriþ.");
            }
        }
    }
}