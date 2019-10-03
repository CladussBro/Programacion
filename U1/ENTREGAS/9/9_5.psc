Algoritmo nueve_cinco
	Dimension datos[7]
	Para i<-1 Hasta 7 Hacer
		Leer datos[i]
	FinPara
	
	numMayor = datos[1]
	
	Para i<-1 Hasta 7 Hacer
	Si datos[i]>numMayor Entonces
		numMayor=datos[i]
	Fin Si
	Fin Para
	Escribir numMayor;
FinAlgoritmo
