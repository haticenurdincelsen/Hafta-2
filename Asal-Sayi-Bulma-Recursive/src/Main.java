import java.util.Scanner;
public class Main {
    static boolean asal(int sayi,int i){
        //En Küçük Asal Sayı 2 olduğundan sayılar 2 den küçük olursa asal değildir.
        if (sayi<2) {
            return false;
        }
            if (i==1){
                return true;
            }
            //Sınır değerine kalansız bölünüyorsa asal değildir.
            if (sayi%i==0){
                return false;
            }
            return asal(sayi,i-1);
        }
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
            System.out.print("Sayı giriniz : ");
            int sayi=input.nextInt();
            if (asal(sayi,sayi-1)==true){
                System.out.print(sayi+" Sayısı asaldır.");
            }else {
                System.out.println(sayi+" Sayısı asal değildir .");
            }
        }
    }