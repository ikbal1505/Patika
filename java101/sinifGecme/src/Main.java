import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input = new Scanner(System.in);
        int dersSayi=0;
        int ortalama=0;

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();
        if(mat>0 && mat<=100){
            ortalama+=mat;
            dersSayi++;
        }

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();
        if(fizik>0 && fizik<=100){
            ortalama+=fizik;
            dersSayi++;
        }

        System.out.print("Kimya Notunuzu Gİriniz: ");
        kimya = input.nextInt();
        if(kimya>0 && kimya<=100){
            ortalama+=
            dersSayi++;
        }

        System.out.print("Turkce Notunuzu Giriniz: ");
        turkce = input.nextInt();
        if(turkce>0 && turkce<=100){
            ortalama+=turkce;
            dersSayi++;
        }

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih = input.nextInt();
        if(tarih>0 && tarih<=100){
            ortalama+=tarih;
            dersSayi++;
        }

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = input.nextInt();
        if(muzik>0 && muzik<=100){
            ortalama+=muzik;
            dersSayi++;
        }

        ortalama = ortalama/dersSayi;
        if(ortalama<=55){
            System.out.println("Kaldın.");
            System.out.println("ortalaman: "+ortalama);
        }
        else {
            System.out.println("tebrikler geçtin: "+ortalama);

        }
    }
}