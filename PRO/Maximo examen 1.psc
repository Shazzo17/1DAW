Proceso sin_titulo
	dimension array_n[50]
	definir array_n , max , n , i , assi , long , p como entero ;
	
	i <- 0 ;
	
	escribir "Dame los numeros de la dimension " ;
	leer n ;
	mientras n <> 0 hacer
		array_n[i] <- n ;
		i <- i + 1 ;
		escribir "Dame los siguientes numeros de la dimension o cero para terminar " ;
		leer n ;
	FinMientras
	
	long <- i - 1 ;
	i <- 0 ;
	
	mientras i <= long Hacer
		i <- 0 ;
		max <- 0 ;
		Mientras i <= long hacer
			si array_n[i] < max entonces
				max <- array_n[i] ;
				p <- i ;
			FinSi
			i <- i + 1 ;
		FinMientras
		assi <- array_n[p] ;
		array_n[i] <- assi ;
		array_n[p] <- array_n[i] ;
		i <- 0 ;
		i <- i + 1;
	FinMientras
	
FinProceso
