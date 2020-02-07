package U5.ENTREGA;

import static U5.ENTREGA.Terrestre.color.*;

public class principal {
    public static void main(String[] args) {
        Terrestre v1=new Coche("Citroen C4","12345678A",2003, AZUL,5);
        Terrestre v2=new Coche("Audi TT","12345678B",2008,VERDE,4);
        Terrestre v3=new Coche("Range Rover Evoque","12345678C",2018,AMARILLO,5);
        Terrestre v4=new Moto("Ducati Monster 1200","12345678D",2017,ROJO,2);
        Terrestre v5=new Moto("KTM","1234578E",2015,AMARILLO,2);
        Terrestre v6=new Moto("Kawasaki 07","12345678F",2019,AZUL,2);
        Aereo a1=new Helicoptero("Kobe",1200,"UP-A300I",9);
        Aereo a2=new Avioneta("Lemar",1400,"UP-A400I",7);

        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
        System.out.println(v4.toString());
        System.out.println(v5.toString());
        System.out.println(v6.toString());
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }

}
