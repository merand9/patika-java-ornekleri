import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double alan = 0;
        double u = 0;

        System.out.print("Üçgenin 1.kenarını giriniz: ");
        double a = input.nextDouble();

        System.out.print("Üçgenin 2.kenarını giriniz: ");
        double b = input.nextDouble();

        System.out.print("Üçgenin 3.kenarını giriniz: ");
        double c = input.nextDouble();

        boolean kosul = (a * a) + (b * b) == (c * c);

        if (kosul) {
            u = (a + b + c) / 2;
            alan = Math.sqrt((u * (u-a) * (u-b) *(u-c)));
            System.out.println("Üçgenin alanı: " + alan);
        } else {
            System.out.println("Hata: Girdiğiniz kenarlar bir üçgen oluşturmuyor.");

        }
    }
}