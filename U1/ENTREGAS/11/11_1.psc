Algoritmo once_uno
	
	num_ale <- AZAR(100)
	Escribir "Intenta adivinar el n�mero aleatorio"
	Leer num_escri
	contador=1
	
	Mientras num_ale!=num_escri Y contador<=7 Hacer
		contador=contador+1
		
		
		Si num_escri>num_ale Y contador<=7 Entonces
			Escribir "El n�mero escrito por usted es mayor"
			Leer num_escri
			
		SiNo
			Si num_escri<num_ale Y contador<=7 Entonces
				Escribir "El n�mero escrito por usted es menor"
				Leer num_escri
			FinSi
			
		Fin Si
		
		
	Fin Mientras
	
	Si contador>7 Entonces
		Escribir "Se ha quedado sin intentos, el n�mero aleatorio era:" num_ale
	FinSi
	
	Si num_escri=num_ale Entonces
	Escribir "Ha adivinado el n�mero:" num_ale
	FinSi
	
FinAlgoritmo
