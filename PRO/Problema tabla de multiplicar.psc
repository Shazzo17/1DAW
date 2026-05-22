// Me llega un cliente y me pide un programa que me de las tablas de multiplicar,yo le meto un numero y te tiene que mostrar la tabla de ese numero hasta el 10.

Proceso sin_titulo
	definir number como entero ;
	definir table como entero ;
	escribir "Dame un numero para hacer su tabla de multiplicaciones" ;
	leer number ;
	table <- 1 ;
 	mientras table < 11 hacer
		Escribir table , "*" , number , "=" , table * number ;
		table <- table+1 ;
	FinMientras
	
FinProceso
