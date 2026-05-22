Proceso sin_titulo
		definir word Como cadena ;
		definir perma Como cadena ;
		definir counter como entero ;
		escribir "Dame una palabra para comparar las demas" ;
		leer perma ;
		escribir "Dame una palabra para comparar con la dada" ;
		leer word ;
		counter <- 0 ;
		Mientras word <> "stop" hacer
			si perma = word Entonces
				counter <- counter + 1 ;
				escribir "Esta palabra es igual a la dada,llevamos " , counter , " palabras repetidas" ;
			FinSi
			escribir "Dame otra palabra o pon stop para parar " ;
			leer word ;
		FinMientras
		escribir "La palabra se repite " , counter , " veces" ; 
FinProceso

