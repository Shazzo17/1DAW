// 1. Me llegan unos clientes y me dicen,tengo aqui una cantidad de nombres y me piden saber de estos nombres cual es el mayor numero de caracteres (Hazlo en una funcion,aquella palabra que tenga el mayor numero de caracteres.)

SubProceso position <- higher(array , long_array)
	definir index , long_word , position Como Entero ;
	
	index <- 0 ;
	long_word <- 0 ;
	position <- 0 ;
	
	mientras index <= long_array Hacer
		si long_word < longitud(array[index]) Entonces
			long_word <- longitud(array[index]) ;
			position <- index ;
		FinSi
		index <- index + 1 ;
	FinMientras
FinSubProceso

Proceso sin_titulo
	Dimension array[50] ;
	Definir index , long_array , position Como Entero ;
	Definir array , entry como cadena ;
	
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
	
	position <- higher(array , long_array) ;
	
	Escribir "La palabra con mayor numero de caracteres es " , array[position] ;
FinProceso