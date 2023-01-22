import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double pi=3.14;

        System.out.print("Lütfen boyunuzu(metre cinsinden) giriniz : ");
        double boy=input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        int kg= input.nextInt();
        double vKitIndeksi=kg/(boy*boy);
        System.out.print("Vücut Kitle İndeksiniz : "+vKitIndeksi);
    }
}