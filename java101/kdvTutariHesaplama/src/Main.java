import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Ürünün değerini giriniz: ");
        Scanner input = new Scanner(System.in);
        double deger=input.nextDouble();

        double kdv,toplam;
        String kdvOran;

        if(deger>=0 && deger<=1000){
            kdvOran="%18";
            kdv=deger*0.18;
            toplam=kdv+deger;
            System.out.print("Ürünün fiyatı: "+deger + " kdv oranı: "+kdvOran+ " Toplam fiyatı: "+toplam);
        }
        else if (deger>1000)
        {
            kdvOran="%8";
            kdv=deger*0.08;
            toplam=kdv+deger;
            System.out.print("Ürünün fiyatı: "+deger + " kdv oranı: "+kdvOran+ " Toplam fiyatı: "+toplam);
        }
        else {
            System.out.println("Sıfırdan küçük değer girilemez: "+deger);
        }


    }
}