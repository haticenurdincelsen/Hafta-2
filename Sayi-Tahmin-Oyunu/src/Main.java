import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int girilenSayi;
        int[] Wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
       // System.out.println(number);

        while (right < 5) {
            System.out.println("Lütfen Tahmininizi Giriniz : ");
            girilenSayi = input.nextInt();
            if (girilenSayi < 0 || girilenSayi > 100) {
                System.out.println("0 İle 100 Arasında Sayı Girişi Yapınız !!");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız! Kalan Hakkınız : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı giriş yaparsanız kalan hakkınızdan düşülecektir.");
                }
                continue;
            }
            if (girilenSayi == number) {
                System.out.println("Tebrikler Gizli Sayıyı Buldunuzz : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir tahmin yaptınız");
            }
            if (girilenSayi > number) {
                System.out.println(girilenSayi + " sayısı gizli sayıdan büyüktür.");
            } else {
                System.out.println(girilenSayi + " sayısı gizli sayıdan küçüktür.");
            }
            Wrong[right++] = girilenSayi;
            System.out.println("Kalan Hakkınız : " + (5 - right));
        }
        if (!isWin) {
            System.out.println("Kaybettiniz .Gizli Sayıyı Bulamadınız !");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(Wrong));
                System.out.println("Gizli Sayı : "+number);
            }
        }
    }
}