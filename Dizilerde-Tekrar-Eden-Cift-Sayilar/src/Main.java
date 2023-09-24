import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        int[]sayı={1,89,74,587,785,475,457,12,78,658,21,11,25,45,25,54,87,54,96,68,96,11,21,22,22,54};
        int[] duplicate=new int [sayı.length];
        int startIndex=0;
        for(int i=0;i<sayı.length;i++) {
            for (int j = 0; j < sayı.length; j++) {
                if (sayı[j] % 2 == 0 && i != j && sayı[i] == sayı[j]) {
                    if (!isFind(duplicate, sayı[i])) {
                        duplicate[startIndex++] = sayı[i];
                    }
                }
            }
        }

            for (int i : duplicate) {
                if (i!=0) {
                    System.out.println(i);
                }
            }
        }
        static boolean isFind(int []array,int value){
        for (int i:array){
            if (i==value){
                return true;
                        }
                    }
        return false;
                }
            }
