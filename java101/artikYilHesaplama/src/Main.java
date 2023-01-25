import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        int yil = input.nextInt();

        if (yil % 400 == 0) {
            System.out.print("Artik yıl. "+yil);
        }
        else if (yil%100!=0 && yil%4==0){
            System.out.print("Artık yıl. "+yil);
        }
        else {
            System.out.print("Değildir. "+yil);
        }
    }
}