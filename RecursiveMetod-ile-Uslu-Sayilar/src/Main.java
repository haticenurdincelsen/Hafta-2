import java.util.Scanner;
public class Main {
    static int fib(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        //Değerleri Tanımlayalım
        int a, b;
        //Kullanıcıdan veri girmesini isteyelim.
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Sayısını Giriniz : ");
        a = input.nextInt();
        System.out.print("Üs Sayısını Giriniz : ");
        b = input.nextInt();
        //Çıktıyı ekrana bastıralım
        System.out.println("Sonuç : " + fib(a, b));
    }
}