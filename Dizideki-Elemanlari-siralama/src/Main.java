import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int k;
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Dizi Boyutunu Giriniz : ");
        k=input.nextInt();
        int[]array=new int[k];
        System.out.println("Dizinin Elemanlarını Giriniz : ");

        for (int i=0; i<array.length;i++) {
            System.out.println((i + 1) + ".Elemanı :");
            n = input.nextInt();
            array[i] = n;
        }
        System.out.println("Oluşturduğunuz Dizi : ");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Dizinin Sıralaması : "+Arrays.toString(array));
<<<<<<< HEAD
    }
}
=======
        }
    }
>>>>>>> 5854830597fd500da1ad3eaf3b64cd8d2af607ef
