import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double alan,pi=3.14;
        System.out.print("Dairenin yarıçapını giriniz: ");
        double r=input.nextDouble();
        System.out.print("Dairenin merkez açı ölçüsünü derece cinsinden giriniz: ");
        double a =input.nextDouble();

        alan=(pi*(r*r)*a)/360;
        System.out.print("Dairenin alanı: "+alan);




    }
}