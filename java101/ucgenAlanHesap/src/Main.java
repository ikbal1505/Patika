import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("A kenarının değerini giriniz: ");
        int a = input.nextInt();

        System.out.print("B kenarının değerini giriniz: ");
        int b = input.nextInt();

        System.out.print("C kenarının değerini giriniz: ");
        int c = input.nextInt();

        double u=(a+b+c)/2;
        double cevre=2*u;
        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin çevresi: "+cevre);
        System.out.print("Üçgenin alanı: "+alan);
    }
}