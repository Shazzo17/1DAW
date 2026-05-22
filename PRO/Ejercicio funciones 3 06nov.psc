// 3. Me dan unan cantidad de nombres y me pide que diga las veces que se repiten esos nombres(en funcion)

SubProceso repeat(array , array_repeat , long_array Por Valor)
	definir index , assis_index Como Entero ;
	
	index <- 0 ;
	assis_long <- long_array ;
	
	mientras index <= assis_long Hacer
		assis_index <- 0 ;
		Mientras assis_index <= long_array Hacer
			si array[index] = array[assis_index] Entonces
				array_repeat[index] <- array_repeat[index] + 1 ;
			FinSi
			assis_index <- assis_index + 1 ;
		FinMientras
		index <- index + 1 ;
	FinMientras
	
FinSubProceso

Proceso sin_titulo
	Dimension array[50] ;
	dimension array_repeat[50] ;
	Definir index , long_array Como Entero ;
	Definir array , entry , array_repeat como cadena ;
	
	index <- 0 ;
	
	escribir "Dame la primera palabra de la serie" ;
	leer entry ;
	
	Mientras entry <> "fin" Hacer
		array[index] <- entry ;
		index <- index + 1 ;
		escribir "Dame otra palabra de la serie o pon fin" ;
		leer entry ;
	FinMientras
	
	long_array <- index - 1 ;
	
	repeat(array , array_repeat , long_array) ;
	
	Para index <- 0 Hasta long_array con paso 1 Hacer
		Escribir "El numero " , array[index] , " se repite " , array_repeat[index] ;
	FinPara
	
	
FinProceso
