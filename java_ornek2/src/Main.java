//KDV Hesaplama
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        double tutar,kdvTutari=0,yeniTutar=0;

        System.out.print("Tutar giriniz:");
        tutar=input.nextDouble();
        if(tutar<=1000 && tutar>=0){
            kdvTutari=(tutar*18)/100;
        }
        else if(tutar>1000){
            kdvTutari=(tutar*8)/100;
        }
        else{
            System.out.print("Gecersiz tutar!!!");
        }
        yeniTutar=(tutar+kdvTutari);

        System.out.println("KDV tutari:"+kdvTutari);
        System.out.println("KDV'li fiyat:"+yeniTutar);
    }
}