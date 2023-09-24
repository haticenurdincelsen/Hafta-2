import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan veri alalım
        Scanner info=new Scanner(System.in);
        System.out.print("Matrisin satır sayısını giriniz : ");
        int i=info.nextInt();
        System.out.print("Matrisin sütun sayısını giriniz : ");
        int j= info.nextInt();
        int [][]matris=new int[i][j];

        for (i=0;i< matris.length;i++){
            int a=1;
            for (j=0; j<matris[i].length; j++){
                System.out.print(a+" . elamanı giriniz : ");
                a++;
                matris[i][j]= info.nextInt();
            }
        }
        //Matrisi Ekrana bastırdık
        System.out.println("Matris;");
        for (int[] row: matris){
            for (int col:row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
        //Matirisin satır sutun bilgilerini ters olarak işleyelim
        int k=j , l=i;
        int [][] transpoz=new int[k][l];

        for (i = 0; i < matris.length; i++) {
            for (j = 0; j < matris[i].length; j++) {
                if (i == j) {
                    transpoz[i][j] = matris[i][j];
                } else {
                    transpoz[j][i] = matris[i][j];
                }
            }
        }
        System.out.println("Matrisin Transpozu;");
        for (int[] row:transpoz){
            for (int col: row){
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
}