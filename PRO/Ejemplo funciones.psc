SubProceso variable_de_retorno <- Nombre ( Argumentos )
	definir assis Como Entero ;
	assis <- array[position] ;
	array[position] <- array[long_array]
FinSubProceso


SubProceso long_array <- entry ( array )
	definir entry_array , index Como Entero ;
	
	index <- 0 ;
	
	Escribir "Mete el primer numero de la serie" ;
	leer entry_array ;
	
	Mientras entry_array <> 0 Hacer
		array[index] <- entry_array ;
		index <- index + 1 ;
		Escribir "Mete otro numero de la serie o pon 0 para salir" ;
		leer entry_array ;
	FinMientras
	long_array <- index - 1 ;
FinSubProceso

SubProceso entero result <- max ( array , long_array )
	Definir index , max_array , array , number , long_array , como entero ;
	index <- 0 ;
	max_array <- 0 ;
	Mientras index <= long_array hacer
		si array[index] > max_array Entonces
			max_array <- array[index] ;
		FinSi
		index <- index + 1 ;
	FinMientras
	number <- max_array ;
FinSubProceso

Proceso sin_titulo
	dimension array[50] ;
	definir result como entero ;
	
	long_array <- entrada_datos ( array ) ;
	result <- max ( array , long_array) ;

FinProceso
