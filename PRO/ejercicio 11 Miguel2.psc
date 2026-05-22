//Nos dan una dimension con unos determinados numeros, y nos piden
//ordenar esa dimension de menor a mayor
//8,4,6,9,15,7,12,0
//primera pasada
//obtener el maximo
//intercambio entre el maximo y el Final de Dimension 
//segunda pasada
//obtener el maximo con un elemento menos
//intercambio entre el maximo y el final de Dimensionar 
//sucesivamente se hara igual que en los pasos anteriores

Proceso sin_titulo
	dimension array[50] ; // Define la array con 50 espacios.
	definir array , number , counter , result , max_counter , array_long , long_number Como Entero ; // Define las variables como entero.
	counter <- 0 ; // Inicia estos 3 Valores.
	result <- 0 ;
	max_counter <- 0 ;
	Escribir "Dame el primer numero de la dimension" ; // Pide los numeros y los mete al array.
	leer number ;
	mientras number <> 0 y counter < 49 hacer 
		array[counter] <- number ;
		escribir "La posicion " , counter , " es " , array[counter] ;
		counter <- counter + 1 ;
		Escribir "Dame otro numero para la dimension" ;
		leer number ;
	FinMientras
	array_long <- counter - 1 ;// Reinicia los valores a cero y inicia la longitud del array.
	long_number <-  counter - 1 ;
	counter <- 0 ;
	Mientras array_long > 0 hacer // Si la longitud del array llega a 0 sale del mientras.
		counter <- 0 ; // Reinicia el contador.
		result <- 0 ; // Reinicia el resultado,osea el numero maximo.
		mientras array_long > counter hacer // Si la longitud del array es mayor que el counter sigue haciendolo.
				si result < array[counter] entonces // Si el resultado es menor que el numero del array pone el numero del array en el resultado.
					result <- array[counter] ;
					max_counter <- counter ; // Guarda la posicion del array del numero maximo.
					escribir "La posicion del valor maximo es ", max_counter ; // Escribe la posicion del numero maximo en el array.
				FinSi
			counter <- counter + 1 ; // Sube el counter para que siga comprobando.
		FinMientras
		array[max_counter] <- array[array_long] ; // Pone el ultimo numero del array en la posicion maxima.
		array[array_long] <- result ; // Pone el numero maximo al final del array.
		escribir "La posicion del numero maximo se ha convertido en " , array[max_counter] ; // Escribe la posicion del numero maximo,cual es el ultimo numero y cual es el numero mayor.
		escribir "El ultimo numero se ha convertido en " , array[array_long] ;
		escribir "El numero mayor es " , result ;
		array_long <- array_long - 1 ; // Baja el largo del array para que no coja el ultimo numero.
	FinMientras
	counter <- 0 ; // Reinicia el contador.
	Mientras long_number >= counter Hacer // Si el counter llega al numero maximo del array al principio para de hacerlo.
		Escribir "La posicion " , counter , " es " , array[counter] ; // Escribe la posicion y el numero que hay en ella del array,tambien suma 1 al counter para que siga haciendolo.
		counter <- counter + 1 ;
	FinMientras
FinProceso