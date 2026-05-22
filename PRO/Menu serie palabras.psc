// Vamos a hacer un menu en el que la primera opcion sea insertar una serie de palabras,la segunda borrar un numero y la tercera salir. Todo esto en base a una serie de numeros dada.

Proceso sin_titulo
	dimension array[50] , array_e[50]; // Define las dos arrays	definir  long , i , n , long_e , p , j , assis Como Entero ; // Define long como la longitud del array , e como entrada de palabras, n como la entrada de numeros y i como indice.
	definir e , array , array_e como caracter ;
	definir i , long , long_e , assis , j , p , n Como Entero ;
	
	i <- 0 ;
	
	Escribir "Dame la primera palabra de la serie " ;
	leer e ;
	
	Mientras e <> "fin" hacer
		array[i] <- e ;
		i <- i + 1 ;
		Escribir "Dame otra palabra de la serie o pon fin para salir" ;
		leer e ;
	FinMientras
	
	long <- i - 1 ;
	
	Repetir
		n <- 0 ;
		
		Escribir "Usa el numero 1 para insertar una serie de palabras" ;
		Escribir "Usa el numero 2 para borrar una palabra" ;
		Escribir "Usa el numero 3 para salir" ;
		leer n ;
		
		Segun n Hacer
			1:
				i <- 0 ;
				
				Escribir "Dame la primera palabra de la serie " ;
				leer e ;
				
				Mientras e <> "fin" hacer
					array_e[i] <- e ;
					i <- i + 1 ;
					Escribir "Dame otra palabra de la serie o pon fin para salir" ;
					leer e ;
				FinMientras
				
				long_e <- i - 1 ;
				assis <- long_e + long ;
				i <- long ;
				j <- assis ; 
				
				Escribir "Dame la posicion en la que insertar la serie de palabras" ;
				leer p ;
				
				Mientras assis >= long hacer
				array[assis] <- array[i] ;
				assis <- assis - 1 ;
				i <- i - 1 ;
				FinMientras
			
				i <- 0 ;
				
				Mientras j > p Hacer
					array[p] <- array_e[i] ;
					i <- i + 1 ;
					p <- p + 1 ;
				FinMientras
					
				para i <- 0 Hasta j con paso 1 Hacer
					Escribir "La posicion " , i , " contiene la palabra " , array[i] ;
				FinPara
			2:

		FinSegun
	Hasta Que n = 3 ;
FinProceso
