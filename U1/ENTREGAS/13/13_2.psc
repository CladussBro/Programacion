Algoritmo trece_dos
	Definir num1,num2 Como Entero;
	Escribir "Introduce un n�mero"
	Leer num1;
	Escribir "Introduce otro n�mero";
	Leer num2;
	Si EsMultiplo(num1,num2) Entonces
		Escribir num1," es m�ltiplo de ",num2;
	SiNo
		Escribir num1," no es m�ltiplo de ",num2;
	FinSi
FinAlgoritmo
Funcion multiplo <- EsMultiplo(num1,num2)
	Definir multiplo Como Logico;
	Si num1 % num2 = 0 Entonces
		multiplo <- Verdadero;
	SiNo
		multiplo <- Falso;
	FinSi
FinFuncion
