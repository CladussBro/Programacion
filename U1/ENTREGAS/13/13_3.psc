Algoritmo trece_tres
	Escribir "Introduce un n�mero"
	Leer num1
	Escribir EsPar(num1)
FinAlgoritmo

Funcion resultado <- Espar(num1)
	Definir resultado Como Logico
	
	Si num1%2=0 Entonces
		resultado <- Verdadero
	SiNo
		resultado <- Falso
	FinSi
FinFuncion
