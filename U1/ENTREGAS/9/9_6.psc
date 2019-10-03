Algoritmo nueve_seis
	Dimension bloque1[2, 10]
	Escribir "Introduce 10 números"
	Para i<-1 Hasta 2 Hacer
		Escribir "Escribe 10 números"
		Leer bloque1[x,1]
	Fin Para
	maximo<-0
	Para x<-1 Hasta 10 Hacer
		Si maximo<bloque1[x,1]
			maximo=bloque1[x,1]
		FinSi
	FinPara
	maximo2<-0
	Para x<-1 Hasta 10 Hacer
		Si maximo<bloque1[x,2]
		FinSi
	FinPara
	
	Para x<-1 Hasta 10 Hacer
		Si maximo<bloque1[x,2]
			maximo=bloque1[x,2]
		FinSi
	FinPara
FinAlgoritmo
