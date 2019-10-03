Algoritmo nueve_tres
	Dimension nums[5];
	Definir nums, suma Como Entero;
	Definir media Como Real;
	suma <- 0;
	Definir i Como Entero;
	
	Para i <- 1 Hasta 5 Con Paso 1 Hacer
		Escribir "Escriba un número: ";
		Leer nums[i];
	FinPara
	
	Para i <- 1 Hasta 5 Con paso 1 Hacer
		suma <- suma + nums[i];
	FinPara
	
	Escribir "La suma es: ", suma;
	media <- suma/5;
	Escribir "La media es de: ", media;
	
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Si nums[i]>media Entonces
			Escribir "Los números mayores a la media: " nums[i]
		FinSi
	Fin Para
	
FinAlgoritmo
