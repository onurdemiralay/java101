import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final float PI = 3.14f;
        float yaricap = 0.0f, merkezAci = 0.0f, alan = 0.0f;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarýçapý: ");
        yaricap = input.nextFloat();
        System.out.print("Dairenin Merkez Açý Ölçüsü: ");
        merkezAci = input.nextFloat();

        alan = (PI * (yaricap * yaricap) * merkezAci)/360;

        System.out.print("Dairenin alaný: " + alan);
    }
}