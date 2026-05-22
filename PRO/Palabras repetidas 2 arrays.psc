//Nos dan un arreglo de palabras. Nos piden la cantidad de palabras que hay en un array en el otro

Proceso sin_titulo
	dimension array_serial[50] , array_compare[50] , array_result[50]; // Define las 3 arrays que vamos a usar,una para la serie de palabras,otra para las palabras a comparar y otra para el resultado.
	definir index_serial , long_serial , index_compare , array_result , long_compare Como Entero; // Define los indices de las 2 arrays,las longitudes de las 2 arrays y el array del resultado.
	definir array_serial , entry , array_compare como cadena ; // Define la entrada y los dos arrays faltantes.
	
	index_serial <- 0 ; // Inicia el indice a usar en la array de la serie.
	
	Escribir "Dame la primera palabra de la serie" ; // Te pide la primera palabra del array de la serie.
	leer entry ;
	
	mientras entry <> "fin" Hacer // Mete la palabra,suma 1 al indice y te pide otra palabra hasta que pongas fin.
		array_serial[index_serial] <- entry ;
		index_serial <- index_serial + 1 ;
		escribir "Dame otra palabra de la serie o pon fin para salir" ;
		leer entry ;
	FinMientras
	
	long_serial <- index_serial - 1 ; // Define la longitud del array de la serie de palabras.
	
	escribir "Dame las palabras a buscar y te dire las veces que se repiten en el array" ; // Te pide la primera palabra de las del array de comparar.
	leer entry ;
	
	index_compare <- 0 ; // Inicia el indice a usar en la array de comparar.
	
	mientras entry <> "fin" Hacer // Mete la palabra,suma 1 al indice y te pide otra palabra hasta que pongas fin.
		array_compare[index_compare] <- entry ;
		index_compare <- index_compare + 1 ;
		escribir "Dame otra palabra a buscar o pon fin para salir" ;
		leer entry ;
	FinMientras
	
	long_compare <- index_compare - 1 ; // Define la longitud de la array de comparar.
	index_compare <- 0 ; // Reinicia el indice de la array a comparar para que se recorra desde 0.

	
	Mientras long_compare >= index_compare Hacer // Si el indice de la array a comparar es menor que la longitud hace el mientras.
		index_serial <- 0 ; // Reinicia el contador del array de la serie.
		array_result[index_compare] <- 0 ; // Pone un valor al array resultado en la posicion que vas a usar para que no de error.
		Mientras long_serial >= index_serial Hacer // Si el array de serie no llega a la longitud hace el mientras.
			mientras long_serial >= index_serial y array_serial[index_serial] = array_compare[index_compare] hacer // Si el array de serie no llega a la longitud y la palabra que estas comparando es igual con la que has puesto hace el mientras.
				array_result[index_compare] <- array_result[index_compare] + 1; // Suma 1 al resultado para que quede como que se repite 1 vez mas que antes.
				index_serial <- index_serial + 1 ; // Suma 1 al indice para comparar con el siguiente numero del array de la serie.
			FinMientras
			index_serial <- index_serial + 1 ; // Suma 1 al indice para comparar con el siguiente numero del array de la serie.
		FinMientras
		index_compare <- index_compare + 1 ; // Suma 1 al indice para comparar con el siguiente numero del array de la comparacion.
	FinMientras
	
	Para index_compare <- 0 Hasta long_compare Con Paso 1 Hacer // Muestra el resultado.
		Escribir "La palabra " , array_compare[index_compare] , " se repite " , array_result[index_compare] , " veces" ;
	FinPara
FinProceso
