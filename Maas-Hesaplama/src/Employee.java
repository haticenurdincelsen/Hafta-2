public class Employee {
    //Nitelikleri Tanımlayalım
    String name;
    double salary;
    int workHours;
    int hireYear;
    double taxDeduction ;
    int extra;
    double increase;

    //method tanımlayalım .
    Employee(String name,double salary,int workHours,int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    //Vergi dilimine girip giremdiği kontrol edilsin.
    double tax() {
        if (this.salary > 1000) {
            return this.taxDeduction = this.salary * 0.03;
        } else {
            return 0;
        }
    }
    //Fazla mesai ücreti hesaplansın
    //40 saatten fazla çalışan için hesaplanacak
    double extra() {
        if (this.workHours > 40) {
            return extra = 30 * (this.workHours - 40);
        }
        return 0;
    }
    //Maaş artışını yıllara göre hesaplayalım
    double raiseSalary() {
        if (2021 - this.hireYear < 9) {
            return this.increase = this.salary * 0.05;
        } else if (2021 - this.hireYear >= 10 && 2021 - this.hireYear < 19) {
        return this.increase=this.salary*0.10;
        }else{
            return this.increase = this.salary * 0.15;
        }
    }
    //Verileri yazdıralım
    void toStringCalculate(){
        System.out.println("Çalışanın ");
        System.out.println("Adı ve Soyadı :"+this.name);
        System.out.println("Maaşı :"+this.salary);
        System.out.println("Çalışma Saati :"+workHours);
        System.out.println("İşe Giriş Yılı :"+this.hireYear);
        System.out.println("Vergi Kesintisi :"+tax());
        System.out.println("Bonus :"+extra());
        System.out.println("Maaaş Artışı "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Maaşı:  "+(this.salary-this.taxDeduction+this.extra));
        System.out.println("Toplam Maaşı:  " +(+this.salary+this.extra+this.increase-this.taxDeduction));
    }
}
