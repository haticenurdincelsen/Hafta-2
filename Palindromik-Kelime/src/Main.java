import java.util.Scanner;
public class Main {
    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Bir kelime giriniz : ");
        String word=input.nextLine();
            System.out.println(isPalindrome(word));
        }
}
