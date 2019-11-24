package U3_Tablas;

import java.util.Scanner;

public class ej9 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int apuesta[] = new int[6];
	int winner[] = { 01, 23, 29, 31, 35, 42 };
	int aciertos = 0;
	
	for (int i = 0; i < 6; i++){
		System.out.println("Introduce el número de la posicion " + (i+1));
		apuesta[i] = teclado.nextInt();
		if (apuesta[i]==winner[i]){
			aciertos++;
		}
	}
	System.out.println("Has acertado:  " + aciertos + " números");
	}
}
