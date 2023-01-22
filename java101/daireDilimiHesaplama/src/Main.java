import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double pi=3.14;

        System.out.print("Dairenin yarıçapını giriniz: ");
        int r=input.nextInt();

        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        int merkez= input.nextInt();

        double alan=pi*r*r;
        double cevre=2*pi*r;
        double dilim=(pi*(r*r)*merkez)/360;
        System.out.println("Dairenin dilimi: "+dilim);
        System.out.println("Dairenin alanı: "+alan);
        System.out.print("Dairenin çevresi: "+cevre);
    }
}