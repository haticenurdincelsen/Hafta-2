import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin:");
        //kullanıcıdan veri alındı.
        int n = scanner.nextInt();
        //alınan veri argüman olarak metoda atandı ve metot çağırıldı.
        recursiveMetod(n);
    }

    public static void recursiveMetod(int n)// parametre olarak girilen sayı alındı
    {
        if (n <= 0) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        recursiveMetod(n - 5);
        System.out.println(n);// kalan kısım burası
    }
}