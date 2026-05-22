//1. Me dan una cantidad de palabras que terminan con la palabra fin y me piden que haga un programa que me tiene que ordenar las palabras alfabeticamente de menor a mayor.

Proceso sin_titulo
	dimension array_word[50] ;
	definir array_word , word , ass como cadena ; // Define la variable de la palabra y la auxiliar para cambiarla.
	definir n , i Como Entero ; // Define el la variable i como contador y la n como la longitud del array.
	definir change Como Logico ; // Define un booleano el cual es change.
	
	i <- 0 ; // Define el contador i como 0.
	Escribir "Dame la primera palabra(escrible fin para terminar)" ; // Te pide la primera palabra.
	leer word ;
	
	mientras word <> "fin" Hacer // Mientras la variable de la palabra no sea fin se ejecutara el mientras.
		array_word[i] <- word ; // La palabra es introducida en el array
		i <- i + 1 ; // Suma 1 en el contador
		Escribir "Dame otra palabra(escrible fin para terminar)" ; // Te pide otra palabra para poder salir o poner mas.
		leer word ;
	FinMientras
	n <- i - 1 ; // Guarda la longitud del array.
	change <- Verdadero ; // Inicia la variable change.
	Mientras change hacer // Si el booleano es verdadero entra al mientras.
		change <- falso ; // Pone el booleano como falso.
		i <- 0 ; // Reinicia el contador para que pueda comprobar todos los numeros.
		mientras i < n hacer // Si el contador no llega al final hace el mientras.
			si array_word[i] > array_word[i+1] entonces // Si el array es mayor alfabeticamente al siguiente se cambia de posicion.
				ass <- array_word[i+1] ;
				array_word[i+1] <- array_word[i] ;
				array_word[i] <- ass ;
				change <- verdadero ;
			FinSi
			i <- i + 1 ; // Suma 1 al contador para seguir contando.
		FinMientras
	FinMientras
	
	Para i <- 0 Hasta n Con Paso 1 Hacer
		Escribir array_word[i] ;
	FinPara
	
FinProceso
