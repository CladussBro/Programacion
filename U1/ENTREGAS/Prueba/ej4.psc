Proceso ej4
	Definir nums, i, respuesta Como Entero
	
	Dimension nums[20]
	
	Para i<-1 Hasta 20 Con Paso 1 Hacer
		nums[i]<-(AZAR(401))
		Escribir i+1,"º número: ",nums[i]
	FinPara
	
	Escribir Sin Saltar "Elige a resaltar los múltiplos de 5 o de 7"
	Leer respuesta 
	Si respuesta = 5 Entonces
		Para i<-1 hasta 20 Con Paso 1 Hacer
			Si nums[i]%5=0 Entonces
				Escribir "[" nums[i] "]"
			FinSi
		FinPara
	SiNo
		Si respuesta = 7 Entonces
			Para i<-1 Hasta 20 Con Paso 1 Hacer
				Si nums[i]%7=0 Entonces
					Escribir "[" nums[i] "]"
				FinSi
			FinPara
		FinSi
	FinSi
FinProceso
