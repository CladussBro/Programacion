Algoritmo ej3
	Escribir "Introduce una altura"
	Leer altura
    Si altura>=3 o altura%2=0 Entonces
		Para x<-(altura-1) Hasta 1 Con Paso -2 Hacer
			Para m<-(altura-1)-x Hasta 0 Con paso -1 Hacer
				Escribir Sin Saltar " "
			FinPara
			Para l<-x Hasta 0 Con Paso -1 Hacer
				Escribir Sin Saltar " *"
			FinPara
			Escribir ""
		FinPara
		Para i<-0 Hasta altura con paso 2 Hacer
			Para aux<-0 Hasta (altura-i) Hacer
				Escribir Sin Saltar " "
			FinPara
			Para j<-0 Hasta i Con Paso 1 Hacer
				Escribir Sin Saltar "* "
			FinPara
			Escribir ""
		FinPara
	SiNo
		Escribir "Error, introduce un número impar mayor o igual a 3"
	FinSi
FinAlgoritmo
