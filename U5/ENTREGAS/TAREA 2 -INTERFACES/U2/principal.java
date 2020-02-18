package U5.T2.U2;

import java.util.Arrays;

public class principal {
    public static void main(String[] args) {
        Cliente[] tablaCliente=new Cliente[5];

        tablaCliente[0]=new Cliente("123","Claudia",19,500);
        tablaCliente[1]=new Cliente("456","Carlos",21,800);
        tablaCliente[2]=new Cliente("789","Iisdro",20,100);
        tablaCliente[3]=new Cliente("101","Sebas",20,300);
        tablaCliente[4]=new Cliente("112","David",25,400);

        Arrays.sort(tablaCliente);
        System.out.println("DNI: "+Arrays.toString(tablaCliente));
        Arrays.sort(tablaCliente,new CompararNombres());
        System.out.println("Nombres: "+Arrays.toString(tablaCliente));
        Arrays.sort(tablaCliente,new CompararEdad());
        System.out.println("Edades: "+Arrays.toString(tablaCliente));
    }
}
