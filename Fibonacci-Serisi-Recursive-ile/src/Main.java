import java.util.Scanner;
public class Main {
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        // //Kullanıcıdan veri girişi isteyelim
        System.out.print("Lütfen yazdırmak istediğiniz seriyi giriniz :");
        n = input.nextInt();
        System.out.println(fib(n));

    }
}