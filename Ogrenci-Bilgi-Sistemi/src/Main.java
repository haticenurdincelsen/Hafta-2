import com.sun.source.tree.NewArrayTree;

public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut Hoca","555","TRH");
        Teacher t2=new Teacher("Graham Bell","587","FZK");
        Teacher t3=new Teacher("Kül yutmaz","542","KMY");

        Course tarih =new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik =new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course kimya =new Course("Kimya","103","KMY");
        kimya.addTeacher(t3);

        Student s1 =new Student("İnek Şaban","1","4",tarih,fizik,kimya);
        s1.addBulkExamNote(100,60,50,50,90,80);
        s1.isPass();

        Student S2= new Student("Güdük Necmi","12","4",tarih,fizik,kimya);
        S2.addBulkExamNote(66,10,40,42,56,75);
        S2.isPass();
    }
}