import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Doğduğunuz ay: ");
        int ay=input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        int gun= input.nextInt();

        if (ay == 1) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 21) {
                    System.out.print("Oğlak burcu.");
                } else {
                    System.out.print("Kova burcu.");
                }
            } else {
                System.out.print("1.ay 31 gündür. Daha büyük olamaz.");
            }

        } else if (ay == 2) {
            if (gun >= 1 && gun <= 28) {
                if (gun <= 19) {
                    System.out.print("Kova burcu");
                } else {
                    System.out.print("Balık burcu.");
                }
            } else {
                System.out.print("Şubat 28 gündür. Daha büyük olamaz.");
            }

        } else if (ay == 3) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 20) {
                    System.out.print("Balık burcu.");
                } else {
                    System.out.print("Koç burcu.");
                }
            } else {
                System.out.print("3.ay 31 gündür. Daha büyük olamaz.");
            }

        } else if (ay == 4) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 20) {
                    System.out.print("Koç burcu.");
                } else {
                    System.out.print("Boğa burcu.");
                }
            } else {
                System.out.print("4.ay 30 gündür. Daha büyük olamaz.");
            }

        } else if (ay == 5) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 21) {
                    System.out.print("Boğa burcu.");
                } else {
                    System.out.print("İkizler burcu.");
                }
            } else {
                System.out.print("5.ay 31 gündür. Daha büyük olamaz.");
            }

        } else if (ay == 6) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 22) {
                    System.out.print("İkizler burcu.");
                } else {
                    System.out.print("Yengeç burcu.");
                }
            } else {
                System.out.print("6.ay 30 gündür. Daha büyük olamaz.");
            }

        } else if (ay == 7) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 22) {
                    System.out.print("Yengeç burcu.");
                } else {
                    System.out.print("Aslan burcu.");
                }
            } else {
                System.out.print("7.ay 31 gündür. Daha büyük olamaz.");
            }

        } else if (ay == 8) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 22) {
                    System.out.print("Aslan burcu.");
                } else {
                    System.out.print("Başak burcu.");
                }
            } else {
                System.out.print("8.ay 31 gündür. Daha büyük olamaz.");
            }

        } else if (ay == 9) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 22) {
                    System.out.print("Başak burcu.");
                } else {
                    System.out.print("Terazi burcu.");
                }
            } else {
                System.out.print("9.ay 30 gündür. Daha büyük olamaz.");
            }

        } else if (ay == 10) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 22) {
                    System.out.print("Terazi burcu.");
                } else {
                    System.out.print("Akrep burcu.");
                }
            } else {
                System.out.print("10.ay 31 gündür. Daha büyük olamaz.");
            }

        } else if (ay == 11) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 21) {
                    System.out.print("Akrep burcu.");
                } else {
                    System.out.print("Yay burcu.");
                }
            } else {
                System.out.print("11.ay 30 gündür. Daha büyük olamaz.");
            }

        } else if (ay == 12) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 21) {
                    System.out.print("Yay burcu");
                } else {
                    System.out.print("Oğlak burcu.");
                }
            } else {
                System.out.print("12.ay 31 gündür. Daha büyük olamaz.");
            }
        }
        else {
            System.out.print("Ay 1'den küçük 12'den büyük olamaz.");
        }
    }
}