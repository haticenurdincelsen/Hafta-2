public class Main {
    public static void main(String[] args) {
        int [] dizi={1,2,3,4,5};
        double harmonik=0;
        for (int i=0; i<dizi.length;i++){
            harmonik+=1.0/dizi[i];
        }
        System.out.println(dizi.length/harmonik);
    }
}