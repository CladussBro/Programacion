Algoritmo nueve_dos
	Dimension datos[5];
	Definir datos, suma Como Entero;
	Definir media Como Real;
	suma <- 0;
	Definir i Como Entero;
	
	Para i <- 1 Hasta 5 Con Paso 1 Hacer
		Escribir "Escriba un número: ";
		Leer datos[i];
	FinPara
	
	Para i <- 1 Hasta 5 Con paso 1 Hacer
		suma <- suma + datos[i];
	FinPara
	
	Escribir "La suma es: ", suma;
	media <- suma/5;
	Escribir "La media es de: ", media;
FinAlgoritmo
