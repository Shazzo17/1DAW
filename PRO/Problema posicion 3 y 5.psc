Proceso sin_titulo
	Definir Numero Como Entero ;
	Definir Resultado Como Entero ;
	Definir Contador Como Entero; ;
	Resultado <- 0 ;
	Contador <- 0 ;
	Escribir "Dame el primer numero" ;
	Leer Numero ;
	Contador <- Contador + 1 ;
	Mientras Numero <> 0 Hacer ;
		Si Contador = 3  Entonces
			Resultado <- Resultado + Numero ;
			Escribir "El resultado parcial es " , Resultado ;
		FinSi
		Si Contador = 5  Entonces
			Resultado <- Resultado + Numero ;
			Escribir "El resultado parcial es " , Resultado ;
		FinSi
		Escribir "Dame el siguiente numero " ;
		Leer Numero ;
		Contador <- Contador + 1 ;
	FinMientras
	Escribir "La suma de los numeros en las posiciones 3 y 5 es: " , Resultado ;
FinProceso
// Me piden que sume aquellos numeros que estan en la posicion 3 y 5