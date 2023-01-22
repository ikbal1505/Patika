import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        double m= input.nextDouble();

        System.out.print("İkinci sayıyı giriniz : ");
        double n= input.nextDouble();

        System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
        System.out.print("Seçim yapınız : ");
        int secim= input.nextInt();

        switch (secim){
            case 1: System.out.print("Toplam : "+ (m+n)); break;
            case 2: System.out.print("Çıkarma : "+(m-n)); break;
            case 3: System.out.print("Çarpma : "+(m*n)); break;
            case 4: System.out.print("Bölme : "+(m/n)); break;
            default: System.out.print("Yanlış seçim yaptınız. 1-4 arası sayı giriniz."); break;
        }
    }
}