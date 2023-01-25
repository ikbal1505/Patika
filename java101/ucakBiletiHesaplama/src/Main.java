import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafeKm, age, ucusTipi;
        double mesafeUcreti = 0.10, indirim12 = 0.5, indirim12_24 = 0.10,
                indirim65 = 0.3, normalBiletUcreti = 0;
        boolean hata = false;

        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafeKm = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş : ");
        ucusTipi = input.nextInt();

        if (mesafeKm > 0 && age > 0 && (ucusTipi == 1||ucusTipi==2)) {
            normalBiletUcreti = mesafeUcreti * mesafeKm;

            if (age < 12) {
                normalBiletUcreti =normalBiletUcreti-normalBiletUcreti* indirim12;
            } else if (age < 24) {
                normalBiletUcreti =normalBiletUcreti-normalBiletUcreti* indirim12_24;
            } else if (age > 65) {
                normalBiletUcreti =normalBiletUcreti-normalBiletUcreti* indirim65;
            }
            if(ucusTipi==2){
                normalBiletUcreti=normalBiletUcreti-normalBiletUcreti*0.2;
                normalBiletUcreti*=2;
        }
        }
        else {
            hata=true;
        }
        if (hata){
            System.out.println("Hatalı veri");
        }
        else {
            System.out.println("Toplam fiyat: "+normalBiletUcreti+" Tl");
        }
    }
}