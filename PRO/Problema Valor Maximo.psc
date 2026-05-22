//1. Me dan una serie (lista,sucesiones,etc) de numeros, y me piden obtener el valor maximo.

// Ejemplo 3,1,8,10,12,7,0.

Proceso sin_titulo
	definir number Como Entero ;
	definir result Como Entero ; 
	escribir "Ponme un numero" ;
	leer number ;
	result <- 0 ;
	mientras number <> 0 Hacer
		si result < number entonces
			result <- number ;
			Escribir "El numero " , result , " es mayor que el anterior" ;
		FinSi
		Escribir "Ponga otro numero o un 0 para salir" ;
		leer number ;
	FinMientras
	Escribir "El numero mayor es " , result ;
FinProceso
