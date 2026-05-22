// QUEREMOS LA FUNCION . Me dan una cantidad de numeros,no se cuantos pero los tengo a mi disposicion, realice una funcion que dado un numero me diga que si existe,me devuelva "el numero ha sido encontrado",
// en caso contrario me diga que no ha sido encontrado y debe ser insertado en una posicion si es divisible entre 3.

SubProceso long_assis <- insert(array,long_array,entry)
	definir index como entero ;
	definir long_assis como entero ;
	index <- 0 ;
	Mientras index <= long_array y array[index] <> entry Hacer
		index <- index + 1 ;
	FinMientras
	si index < long_array Entonces
		escribir "El numero " , entry , " esta en el array" ;
	SiNo
		escribir "El numero " , entry , " no esta en el array" ;
		si entry % 3 = 0 Entonces
			position <- 3 ;
			long_assis <- long_array ;
			Mientras position <= long_array Hacer
				array[long_array + 1] <- array[long_array] ;
				long_array <- long_array - 1 ;
			FinMientras
			array[position] <- entry ;
			long_assis <- long_assis + 1 ;
		SiNo
			escribir "El numero " , entry , " es imposible de insertar" ;
		FinSi
	FinSi
	
FinSubProceso

Algoritmo sin_titulo
	definir result Como Entero ;
	result <-  insert(array,long_array,entry);
	si result <> long_array Entonces
		escribir "Se ha insertado un numero" ;
		FinSi
FinAlgoritmo
