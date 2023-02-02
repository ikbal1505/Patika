import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ortalama = 0, toplam = 0, sayac = 0;

        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if (i != 0 && i % 12 == 0) {
                toplam += i;
                sayac++;
            }
        }
        ortalama = toplam / sayac;
        System.out.println("ortalama: " + ortalama);
    }
}
