Algoritmo doce_dos
	Escribir "Introduce tu nombre"
	Leer nombre
	aleat=""
	long1=longitud(nombre)
	
	Para i<-0 Hasta long1 Con Paso 1 Hacer
		Si i%2=0
			aleat <- Concatenar(aleat,Mayusculas(Subcadena(nombre,i,i)))
		SiNo
			aleat <- Concatenar(aleat,Minusculas(Subcadena(nombre,i,i)))
		FinSi
	Fin Para
	Escribir aleat
	
FinAlgoritmo
