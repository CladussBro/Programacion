package U4.TAREA2.EJ2;

public class principal {
    public static void main(String[] args) {
        PilaTabla p = new PilaTabla();
        for (int i = 0; i < 10; i++) {
            p.apilar(i);
        }
        Integer num = p.desapilar();
        while (num != null) {
            System.out.println(num);
            num=p.desapilar();
        }
    }
}
