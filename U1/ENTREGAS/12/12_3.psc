Algoritmo doce_tres
	Escribir "Dime una frase/oraci�n"
	Leer frase
	num_palabras<-1
	long1<- Longitud(frase)-1
	Para i<-0 hasta long1 Hacer
		Si subcadena(frase,i,i)= " " Entonces
			num_palabras<-num_palabras+1
		FinSi
	FinPara
	Escribir "La frase/oraci�n contiene ",num_palabras
FinAlgoritmo

