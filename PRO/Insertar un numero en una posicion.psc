//

Proceso sin_titulo
	dimension array[50] ;
	definir p , long , n , i , array , long_array Como Entero ; // Define P como posicion , long como la longitud del array , n como entrada y i
	//como indice.
	
	i <- 0 ;
	Escribir "Dame el primer numero de la serie" ;
	leer n ;
	mientras n <> 0 Hacer
		array[i] <- n ;
		i <- i + 1 ;
		Escribir "Dame otro numero de la serie" ;
		leer n ;
	FinMientras
	long_array <- i ;
	long <- i - 1 ;
	Escribir "Dame el numero a insertar" ;
	leer n ;
	Escribir "Dame la posicion en la que insertar el numero" ;
	leer p ;
	
	mientras long >= p Hacer
		array[long + 1] <- array[long] ;
		long <- long - 1 ; 
	FinMientras
	array[p] <- n ;
	
	Para i <- 0 Hasta long_array con paso 1 Hacer
		Escribir "En la posicion " , i , " esta el numero " , array[i] ;
	FinPara
FinProceso