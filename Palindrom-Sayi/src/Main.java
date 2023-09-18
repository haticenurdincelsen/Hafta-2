import java.util.Scanner;
public class Main {
    static boolean ispalindrom(int number){
        //Değişkenleri tanımladık
        int temp=number,reverseNumber=0,lastNumber;
        //Döngüyü oluşturduk.
        while(temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }
        //Koşulları belirterek sonucu yazdırdık
        if (number==reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        //Kullanıcıdan veri girişi isteyelim
        int number;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        number=input.nextInt();
        System.out.println(ispalindrom(number));
    }
}