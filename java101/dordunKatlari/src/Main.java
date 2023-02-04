import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int total=0;
       int n;
       do{
           System.out.print("Sayı giriniz: ");
           n=input.nextInt();
           if(n%4==0){ //4'ün katı olan tüm sayılar çifttir.
               total+=n;
           }
           else if(n%2==1) { //tek sayı kontrolü.
               break;        //tek sayıysa döngüyü bitirmeli.
           }
       }
       while (n%2==0); //Çift sayıları alması için. n%4 yapınca 4'ün katı değilse döngü bitiyor.
        System.out.print("Toplam: " +total);
    }
}