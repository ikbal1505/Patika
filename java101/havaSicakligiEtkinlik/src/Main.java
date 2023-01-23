import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz: ");
        int heat=input.nextInt();

        if(heat>25){
            System.out.println("Yüzebilirsiniz. "+heat);
        }
        else if (heat>=15 && heat<=25){
            System.out.println("Piknik yapabilirsiniz. "+heat);
        } else if (heat>4 && heat<=14) {
            System.out.println("Sinemaya gidebilirsiniz. ");
        }
        else {
            System.out.println("Kayak yapabilirsiniz. ");
        }
    }
}