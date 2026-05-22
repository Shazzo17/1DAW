// 2. Me dan una serie de numeros terminados en 0 y me dicen que tengo que devolver aquellos numeros que no sean divisibles entre 3 y 5.(en funcion)

SubProceso long_result <- numbers(array , array_result , long_array)
	Definir index , long_result Como Entero ;
	
	index <- 0 ;
	long_result <- 0 ;
	
	Mientras index <= long_array Hacer
		si array[index] % 3 <> 0 y array[index] % 5 <> 0 Entonces
			array_result[long_result] <- array[index] ;
			long_result <- long_result + 1 ;
		FinSi
		index <- index + 1 ;
	FinMientras
	long_result <- long_result - 1 ;
	
FinSubProceso

Proceso sin_titulo
	Dimension array[50] ;
	Dimension array_result[50] ;
	Definir index , long_array , position , array , entry , array_result ,long_result Como Entero ;
	
	index <- 0 ;
	
	escribir "Dame el primer numero de la serie" ;
	leer entry ;
	
	Mientras entry <> 0 Hacer
		array[index] <- entry ;
		index <- index + 1 ;
		escribir "Dame otro numero de la serie o pon fin" ;
		leer entry ;
	FinMientras
	
	long_array <- index - 1 ;
	
	long_result <- numbers(array , array_result , long_array) ;
	
	Para index <- 0 Hasta long_result con paso 1 Hacer
		Escribir array_result[index] ;
	FinPara
	
FinProceso
