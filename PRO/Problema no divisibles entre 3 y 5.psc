Proceso sin_titulo
		Definir Numero Como Entero ;
		Definir Parada Como Entero ;
		Definir Resultado Como Entero ;
		Resultado <- 0 ;
		Escribir "Dame el primer numero" ;
		Leer Numero ;
		Mientras Numero <> 0 Hacer ;
			Si Numero % 3 <> 0 y Numero % 5 <> 0 Entonces
				Resultado <- Resultado + Numero ;
				Escribir "El resultado parcial es " , Resultado ;
				Escribir "Pon un numero que no se va a sumar " ;
				Leer Parada ;
			FinSi
			Escribir "Dame el siguiente numero " ;
			Leer Numero ;
		FinMientras
		Escribir "La suma de los numeros no divisibles entre 3 y 5 es: " , Resultado ;
FinProceso

// Sumar no divisibles entre 3 y 5.