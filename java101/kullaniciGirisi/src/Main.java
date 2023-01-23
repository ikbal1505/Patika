import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        String userName=input.nextLine();

        System.out.print("Şifreniz : ");
        String password=input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız.");
        }
        else if (userName.equals("patika") && !password.equals("java123")){
            System.out.print("Şifreniz yanlış. Sıfırlamak ister misiniz? : evetse e,  hayırsa h yazınız: ");
            String cevap=input.nextLine();

            if(cevap.equals("e")){
                System.out.print("Yeni şifrenizi giriniz:");
                String newPassword=input.nextLine();

                if(newPassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı. Lütfen başka şifre giriniz:");
                }
                else if(!newPassword.equals("java123")){
                    System.out.println("Şifre oluşturuldu: ");
                }
            }
            else {
                System.out.println("Giriş ekranına yönlendiriliyorsunuz...");
            }
        } else {
            System.out.println("Kullanıcı adı veya şifreniz yanlış. ");
        }
    }
    }
