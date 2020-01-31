package U5.T1.U4;

public class principal {
    public static void main(String[] args) {
        HoraExacta a= new HoraExacta(10,20,30);
        HoraExacta b= new HoraExacta(20,30,40);
        HoraExacta c= new HoraExacta(30,40,50);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}
