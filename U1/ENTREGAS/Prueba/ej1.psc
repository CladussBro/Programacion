Proceso ej1
	Definir horas, i Como Entero
	Escribir "Introduce el número de horas trabajadas a la semana"
	Leer horas
	Si horas<=40 Entonces
		Escribir "El sueldo semanal es de: " horas*10
	SiNo
		Si horas>=41 Entonces
			Escribir "El sueldo semanal es de: " (40*10)+((horas-40)*15)
		FinSi
	FinSi
FinProceso
