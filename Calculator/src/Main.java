import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double choice = 0;

        Scanner scan = new Scanner(System.in);

        while(choice != 7) {
            System.out.print("1 - Toplama\n" +
                    "2 - Çıkarma\n" +
                    "3 - Çarpma\n" +
                    "4 - Bölme\n" +
                    "5 - Karekök alma\n" +
                    "6 - Üstünü alma\n" +
                    "7 - Çıkış\n" +
                    "Yapmak istediğiniz işlemi seçiniz: ");
            choice = scan.nextDouble();

                if (choice == 1) {
                    System.out.print("1. Sayıyı giriniz: ");
                    double number1 = scan.nextDouble();
                    System.out.print("2. Sayıyı giriniz: ");
                    double number2 = scan.nextDouble();
                    System.out.println("Sonuç: " + (number1 + number2));
                }
                if (choice == 2) {
                    System.out.print("1. Sayıyı giriniz: ");
                    double number1 = scan.nextDouble();
                    System.out.print("2. Sayıyı giriniz: ");
                    double number2 = scan.nextDouble();
                    System.out.println("Sonuç: " + (number1 - number2));
                }
                if (choice == 3) {
                    System.out.print("1. Sayıyı giriniz: ");
                    double number1 = scan.nextDouble();
                    System.out.print("2. Sayıyı giriniz: ");
                    double number2 = scan.nextDouble();
                    System.out.println("Sonuç: " + (number1 * number2));
                }
                if (choice == 4) {
                    System.out.print("Bölmek istediğiniz sayıyı giriniz: ");
                    double number1 = scan.nextDouble();
                    System.out.print("Kaça bölmek istediğinizi giriniz: ");
                    double number2 = scan.nextDouble();
                    if (number2 == 0) {
                        System.out.println("Bölen sayı 0 olamaz!!!");
                    } else
                        System.out.println("Sonuç: " + (number1 / number2));
                }
                if (choice == 5) {
                    System.out.print("Karekökünü almak istediğiniz sayıyı giriniz: ");
                    double number1 = scan.nextDouble();
                    System.out.println("Sonuç: " + (Math.sqrt(number1)));
                }
                if (choice == 6) {
                    System.out.print("Üstünü almak istediğiniz sayıyı giriniz: ");
                    double number1 = scan.nextDouble();
                    System.out.print("Üstü giriniz: ");
                    double number2 = scan.nextDouble();
                    System.out.println("Sonuç: " + (Math.pow(number1, number2)));
                }
                if(choice == 7){
                    System.out.println("Çıkış yapılıyor...");
                }
                else if (choice > 7 || choice < 1||choice % 1 != 0) {
                    System.out.println("Geçersiz bir sayı girdiniz!!!");
                }


            }

        }


    }
