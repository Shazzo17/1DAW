// Dada una serie de numeros almacenados en una dimension, se pide obtener el numero mayor

Proceso sin_titulo
	definir counter Como Entero ;
	definir number Como Entero ;
	definir array Como Entero ;
	definir array_long como entero ;
	definir result Como Entero ;
	counter <- 0 ;
	result <- 0 ;
	dimension array[10] ;
	Escribir "Dame el primer numero" ;
	leer number ;
	mientras number <> 0 hacer 
		si number > result entonces
			result <- number ;
		FinSi
		array[counter] <- number ;
		escribir "La posicion " , counter , " es " , array[counter] ;
		counter <- counter + 1 ;
		escribir "Dame el siguiente numero o 0 para salir" ;
		leer number ;
	FinMientras
	array_long <- counter - 1 ;
	counter <- 0 ;
	mientras counter <= array_long Hacer
		si array[counter]>result Entonces
			result <- array[counter] ;
		FinSi
		counter <- counter + 1 ;
	FinMientras
	Escribir "El numero mayor es " , result ;
	
FinProceso
