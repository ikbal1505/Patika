import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Gİriniz: ");
        kimya = input.nextInt();

        System.out.print("Turkce Notunuzu Giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = input.nextInt();

        double ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6.0;
        System.out.print("Ortalamanız: " +ortalama);
        System.out.print(ortalama >= 60? " Geçtiniz." : " Kaldınız.");


    }
}