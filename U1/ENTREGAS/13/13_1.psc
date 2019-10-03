Algoritmo trece_uno
	Definir text como caracter
	Escribir "Introduce una frase/oración"
	Leer frase
	EscribirCentrado(frase)
FinAlgoritmo


SubProceso EscribirCentrado(frase)
	Definir i,espacios Como Entero
	espacios <-redon(longitud(frase)/2)
	
	Para i <-0 Hasta 40-espacios
		Escribir Sin Saltar " "
	FinPara
	Escribir frase
FinSubProceso
