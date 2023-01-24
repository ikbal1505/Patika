import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int a=input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int b=input.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        int c=input.nextInt();

        //3 sayıyı büyükten küçüğe sıralayan blok.
        if(a>b && a>c){
            if(b>c){
                System.out.println("a>b>c");
            }
            else if(c>b) {
                System.out.println("a>c>b");
            }
        }
        else if (b>a && b>c){
            if (a>c){
                System.out.println("b>a>c");
            }
            else if(c>a) {
                System.out.println("b>c>a");
            }
        } else if (c>a && c>b) {
            if (a>b){
                System.out.println("c>a>b");
            }
            else if(b>a) {
                System.out.println("c>b>a");
            }
        }
        //İki sayı eşit olduğunda yapılacaklar.
        if (a==b){
            if(b<c){
                System.out.println("A ve B sayısı eşit, C sayısı büyüktür.");
            }
            else if(c<b) {
                 //else kullanınca 3 sayı eşit olduğunda bu blok çalıyor.
                System.out.println("A ve B sayısı eşit, C sayısı küçüktür.");
            }
        }
        if (c==b){
            if(c<a){
                System.out.println("C ve B sayısı eşit, A sayısı büyüktür.");
            }
            else if(c>a){
                //else kullanınca 3 sayı eşit olduğunda bu blok çalışıyor.
                System.out.println("C ve B sayısı eşit, A sayısı küçüktür.");
            }
        }
        else if(c==a){
            if(b>a){
                System.out.println("C ve A sayısı eşit, B sayısı büyüktür.");
            }
            else if(a>b) {
                //else kullanınca 3 sayı eşit olduğunda bu blok çalışıyor.
                System.out.println("C ve A sayısı eşit, B sayısı küçüktür.");
            }
        }
        //Sayıların hepsi birbirine eşitse bu blok çalışacak.
        if(a==b && a==c && c==b){
            System.out.println("Sayılar eşittir.");
        }
            }
}