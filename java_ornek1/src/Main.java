import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double ortalama=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:");
        int mat=input.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        int fizik=input.nextInt();
        System.out.print("Kimya notunuzu giriniz:");
        int kimya=input.nextInt();
        System.out.print("Turkce notunuzu giriniz:");
        int turkce=input.nextInt();
        System.out.print("Tarih notunuzu giriniz:");
        int tarih=input.nextInt();
        System.out.print("Muzik notunuzu giriniz:");
        int muzik=input.nextInt();

        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        ortalama=toplam/6;


        String mesaj=(ortalama>=60) ? ("Tebrikler geçtiniz.") : ("Kaldınız.");
        System.out.print("Ortalamaniz:"+ortalama);

    }
}