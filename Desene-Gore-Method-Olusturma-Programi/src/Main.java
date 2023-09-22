import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan değer alalım
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();
        //kullanıcıdan alınan sayıyı kaybetmemek için iki n degerinden biri tempN olarak saklanacak
        desenAzalan(n, n);
    }
    static void desenAzalan(int n,int tempN) {
        if (n >-5) {
            System.out.println((n));
            n = n - 5;
            desenAzalan(n, tempN);
        } else {
            desenArtan(n + 5, tempN);

        }
    }
    static void desenArtan(int n,int tempN){
        if (n!=tempN){
            System.out.println((n+5));
            n=n+5;
            desenArtan(n,tempN);
        }
    }
}