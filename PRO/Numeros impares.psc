Proceso sin_titulo
	Definir Numero Como Entero ;
	Definir Parada Como Entero ;
	Definir Resultado Como Entero ;
	Resultado <- 0 ;
	Escribir "Dame el primer numero" ;
	Leer Numero ;
	Mientras Numero <> 0 Hacer ;
		Si Numero % 2 <> 0 Entonces
			Resultado <- Resultado + Numero ;
			Escribir "El resultado parcial es " , Resultado ;
			Leer Parada ;
		FinSi
		Escribir "Dame el siguiente numero " ;
		Leer Numero ;
	FinMientras
	Escribir "La suma de los numeros impares es: " , Resultado ;
FinProceso
