// Borrar un numero en una dimension, de tal forma que cuando se encuentre termine el programa.

Proceso sin_titulo
	dimension array[50] ;
	definir p , long , n , i , array Como Entero ; // Define P como posicion , long como la longitud del array , n como entrada y i
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
	long <- i - 1 ;
	i <- 0 ;
	Escribir "Dame el numero a borrar" ;
	leer n ;
	mientras i < long Hacer
		si n = array[i] Entonces
			p <- i ;
			Mientras p < long Hacer
				array[p] <- array[p+1] ;
				p <- p + 1 ;
			FinMientras
			long <- long - 1 ;
		FinSi
		i <- i + 1 ;
	FinMientras
	
	Para i <- 0 Hasta long con paso 1 Hacer
		Escribir "En la posicion " , i , " esta el numero " , array[i] ;
	FinPara
FinProceso
