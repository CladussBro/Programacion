package U5.T2.U1;

public class principal {
    public static void main(String[] args) {
        Pila p=new PilaTabla();
        for (int i = 0; i < 10; i++) {
            p.apilar(i);
        }
        Integer num=p.desapilar();
        while(num!=null){
            System.out.println(num);
            num=p.desapilar();
        }
    }
}
