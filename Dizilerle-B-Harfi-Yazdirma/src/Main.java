import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    String[][] list=new String[5][3];
        for (int i=0;i< list.length;i++) {
            for (int j = 0; j < list[i].length; j++) {
              if (i==2&&j==2) {
                  list[i][j] = "   ";
              } else if (i== 2|| j==2) {
                  list[i][j] = " * ";
              }else if (i==0 || j==0|| i==4) {
                  list[i][j]=" * ";
              } else {
                  list[i][j] = "   ";

              }
            }
            }
        for (String[]row:list){
            for (String col:row){
                System.out.print(col);

              }
            System.out.println();
            }
    }
}