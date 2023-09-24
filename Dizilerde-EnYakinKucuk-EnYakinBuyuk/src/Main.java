import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[]sayı={15,12,788,1,-1,-778,2,0};
        //Küçükten büyüğe sıralayalım
        Arrays.sort(sayı);
        //kullanıcıdan bir sayı alalım
        int n;
        System.out.println("Bir sayı giriniz : ");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        //min sayı ve maksimum sayı için tanımlama yapalım.
        int minSayı=sayı[0];
        int maxSayı=sayı[sayı.length-1];
        //for döngüsü ile en yakın sayıları bulalım
        for (int i:sayı){
            if ((i<n)&&(i>minSayı)) {
                minSayı = i;
            }
            if ((i>n)&&(i<maxSayı)){
                maxSayı=i;
            }

        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+minSayı);
        System.out.println("Girilen sayıdan büyük en büyük sayı : "+maxSayı);
    }
}