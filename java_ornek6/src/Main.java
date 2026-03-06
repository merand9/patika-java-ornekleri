import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        double indeks=0;
        System.out.print("Lütfen boyunuzu giriniz (örn: 1.76 m): ");
        double boy=input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz (örn: 57.8 kg): ");
        double kilo=input.nextDouble();

        indeks=kilo/(boy*boy);
        System.out.print("Vücut kilo indeksiniz: "+indeks);



    }
}