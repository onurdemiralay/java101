import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month , day;

        System.out.print("Ka��nc� ayda do�dunuz: ");
        month = input.nextInt();
        System.out.print("Ka��nc� g�nde do�dunuz: ");
        day = input.nextInt();

        if (month == 1){
            if (day >= 1 && day <= 31){
                if (day < 22){
                    System.out.println("O�lak Burcu");
                }
                else{
                    System.out.println("Kova Burcu");
                }
            }
            else{
                System.out.println("Ge�ersiz bir g�n girdiniz.");
            }
        }
        else if (month == 2) {
            if (day >= 1 && day <= 28){
                if (day < 20){
                    System.out.println("Kova Burcu");
                }
                else{
                    System.out.println("Bal�k Burcu");
                }
            }
            else{
                System.out.println("Ge�ersiz bir g�n girdiniz.");
            }
        }
        else if (month == 3) {
            if (day >= 1 && day <= 31){
                if (day < 20){
                    System.out.println("Bal�k Burcu");
                }
                else{
                    System.out.println("Ko� Burcu");
                }
            }
            else{
                System.out.println("Ge�ersiz bir g�n girdiniz.");
            }
        }
        else if (month == 4) {
            if (day >= 1 && day <= 31){
                if (day < 20){
                    System.out.println("Ko� Burcu");
                }
                else{
                    System.out.println("Bo�a Burcu");
                }
            }
            else{
                System.out.println("Ge�ersiz bir g�n girdiniz.");
            }
        }
        else if (month == 5) {
            if (day >= 1 && day <= 31){
                if (day < 20){
                    System.out.println("Bo�a Burcu");
                }
                else{
                    System.out.println("�kizler Burcu");
                }
            }
            else{
                System.out.println("Ge�ersiz bir g�n girdiniz.");
            }
        }
        else if (month == 6) {
            if (day >= 1 && day <= 31){
                if (day < 20){
                    System.out.println("�kizler Burcu");
                }
                else{
                    System.out.println("Yenge� Burcu");
                }
            }
            else{
                System.out.println("Ge�ersiz bir g�n girdiniz.");
            }
        }
        else if (month == 7) {
            if (day >= 1 && day <= 31){
                if (day < 20){
                    System.out.println("Yenge� Burcu");
                }
                else{
                    System.out.println("Aslan Burcu");
                }
            }
            else{
                System.out.println("Ge�ersiz bir g�n girdiniz.");
            }
        }
        else if (month == 8) {
            if (day >= 1 && day <= 31){
                if (day < 20){
                    System.out.println("Aslan Burcu");
                }
                else{
                    System.out.println("Ba�ak Burcu");
                }
            }
            else{
                System.out.println("Ge�ersiz bir g�n girdiniz.");
            }
        }
        else if (month == 9) {
            if (day >= 1 && day <= 31){
                if (day < 20){
                    System.out.println("Ba�ak Burcu");
                }
                else{
                    System.out.println("Terazi Burcu");
                }
            }
            else{
                System.out.println("Ge�ersiz bir g�n girdiniz.");
            }
        }
        else if (month == 10) {
            if (day >= 1 && day <= 31){
                if (day < 20){
                    System.out.println("Terazi Burcu");
                }
                else{
                    System.out.println("Akrep Burcu");
                }
            }
            else{
                System.out.println("Ge�ersiz bir g�n girdiniz.");
            }
        }
        else if (month == 11) {
            if (day >= 1 && day <= 31){
                if (day < 20){
                    System.out.println("Akrep Burcu");
                }
                else{
                    System.out.println("Yay Burcu");
                }
            }
            else{
                System.out.println("Ge�ersiz bir g�n girdiniz.");
            }
        }
        else if (month == 12) {
            if (day >= 1 && day <= 31){
                if (day < 20){
                    System.out.println("Yay Burcu");
                }
                else{
                    System.out.println("O�lak Burcu");
                }
            }
            else{
                System.out.println("Ge�ersiz bir g�n girdiniz.");
            }
        }
        else{
            System.out.println("Ge�ersiz bir ay girdiniz.");
        }
    }
}