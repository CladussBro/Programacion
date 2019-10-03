Algoritmo once_dos
	Repetir
		Escribir "Introduce un número y te diré su raíz cuadrada"
		Leer num
		Si num<0 Entonces
			Escribir "Introduzca un número positivo"
		SiNo
			Si num>=1 Entonces
			Escribir "La raíz del número introducido es:" RAIZ(num)
			FinSi
		Fin Si
	Hasta Que num=0 
	
	
	
FinAlgoritmo
