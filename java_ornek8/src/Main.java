import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sonuc=0;
        int n1=0,n2=0;
        System.out.print("----Hesap Makinesi Uygulamamıza Hoşgeldiniz----\n 1-Topalam İşlemi \n 2-Çıkarma İşlemi" +
                "\n 3-Çarpma İşlemi\n 4-Bölme İşlemi \n İşlem seçiniz:");
        int islem=input.nextInt();
        switch (islem){
            case 1:
                System.out.print("Toplama işlemi yapmak istediğiniz 1.sayıyı giriniz:");
                n1=input.nextInt();
                System.out.print("Toplama işlemi yapmak istediğiniz 2.sayıyı giriniz:");
                n2=input.nextInt();
                sonuc=n1+n2;
                System.out.print("Sonuç: "+ sonuc);
                break;
            case 2:
                System.out.print("ÇIkarma işlemi yapmak istediğiniz 1.sayıyı giriniz:");
                n1=input.nextInt();
                System.out.print("Çıkarma işlemi yapmak istediğiniz 2.sayıyı giriniz:");
                n2=input.nextInt();
                sonuc=n1-n2;
                System.out.print("Sonuç: "+ sonuc);
                break;
            case 3:
                System.out.print("Çarpms işlemi yapmak istediğiniz 1.sayıyı giriniz:");
                n1=input.nextInt();
                System.out.print("Çarpma işlemi yapmak istediğiniz 2.sayıyı giriniz:");
                n2=input.nextInt();
                sonuc=n1*n2;
                System.out.print("Sonuç: "+ sonuc);
                break;
            case 4:
                System.out.print("Bölme işlemi yapmak istediğiniz 1.sayıyı giriniz:");
                n1=input.nextInt();
                System.out.print("Bölme işlemi yapmak istediğiniz 2.sayıyı giriniz:");
                n2=input.nextInt();
                sonuc=n1/n2;
                System.out.print("Sonuç: "+ sonuc);
                break;
            default:
                System.out.print("Geçersiz işlem!");
                break;
        }
    }
}