//Dada una serie de numeros terminado en cero, se pide sumar las posiciones 3 y 5, de dicha serie.
Proceso sin_titulo
	Definir Indice Como Entero ; // Saber las posiciones que se han leido
	Definir Sumar Como Entero ; // Sumara las posiciones que el problema indique.
	Definir Entrada Como Entero ; // Sumara los numeros que se van leyendo
	Indice <- 1 ;
	Sumar <- 0 ;
	Escribir "Dame el primer numero " ;
	Leer Entrada ;
	Mientras Entrada <> 0 Hacer
		Si Indice = 3 Entonces
			Sumar <- Sumar + Entrada ;
		FinSi
		Si Indice = 5 Entonces
			Sumar <- Sumar + Entrada ;
		FinSi
		Indice <- Indice + 1 ;
		Escribir "Dame otro numero o 0 para salir " ;
		Leer Entrada ;
	FinMientras
	Escribir "La suma de los numeros en las posiciones 3 y 5 es: " , Sumar ;
FinProceso
