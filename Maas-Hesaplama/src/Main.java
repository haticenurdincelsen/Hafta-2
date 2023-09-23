
public class Main {
    public static void main(String[] args) {
        //personelleri oluşturalım .
        //p1 ve p2 adında personel oluşturalım.
        Employee p2=new Employee("Haticenur DİNÇEL ŞEN",2000.0,55,1996);
        Employee p1=new Employee("Kemal",2000.0,45,1985);

        p1.toStringCalculate();
        System.out.println("=====================");
        p2.toStringCalculate();

        }
    }
