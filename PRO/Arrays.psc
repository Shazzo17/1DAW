Proceso sin_titulo
	definir array Como Entero ;
	definir number como entero ;
	definir counter como entero ;
	definir array_long Como Entero ;
	dimension array[50] ;
	escribir "Dame el primer numero" ;
	leer number ;
	counter <- 0 ;
	mientras number <> 0 hacer
		array[counter] <- number ;
		escribir "La posicion " , counter , " es " , array[counter] ;
		counter <- counter + 1 ;
		escribir "Dame el siguiente numero o 0 para salir" ;
		leer number ;
	FinMientras
	array_long <- counter - 1 ;
	Para counter <- 0 Hasta array_long Con Paso 1 Hacer
		Escribir "La posicion " , counter , " continene " , array[counter] ;
	FinPara
FinProceso
