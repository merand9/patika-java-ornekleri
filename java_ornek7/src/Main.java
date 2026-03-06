import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Meyveler ve KG Fiyatları\n" +
                "Armut : 2,14 TL\n" +
                "Elma : 3,67 TL\n" +
                "Domates : 1,11 TL\n" +
                "Muz: 0,95 TL\n" +
                "Patlıcan : 5,00 TL\n");

        System.out.print("Kaç kg armut aldığınızı giriniz: ");
        double armut=input.nextDouble();
        System.out.print("Kaç kg elma aldığınızı giriniz: ");
        double elma=input.nextDouble();
        System.out.print("Kaç kg domates aldığınızı giriniz: ");
        double domates=input.nextDouble();
        System.out.print("Kaç kg muz aldığınızı giriniz: ");
        double muz=input.nextDouble();
        System.out.print("Kaç kg patlıcan aldığınızı giriniz: ");
        double patlıcan=input.nextDouble();

        double tutar=(2.14*armut)+(3.67*elma)+(1.11*domates)+(0.95*muz)+(5.00*patlıcan);
        System.out.println("Toplam tutarınız: "+tutar);


    }
}