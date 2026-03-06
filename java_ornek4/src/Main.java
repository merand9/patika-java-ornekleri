import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);  //sayıyı noktalı kabul etmesi için "2.3" gibi

        double km,tutar,birimTutar=2.20;
        double acilisUcreti=10.0;
        System.out.print("Kaç km yol gittiğinizi giriniz:");
        km=input.nextDouble();

        tutar=(km*birimTutar)+acilisUcreti;

        tutar=(tutar<=20.0) ? 20.0: tutar;
        System.out.print("Toplam tutarınız: "+tutar);

    }
}