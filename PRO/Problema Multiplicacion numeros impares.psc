// Dada una serie de numeros terminados en cero. Me piden realizar la multiplicacion de aquellos
// numeros que estan en las posiciones impares.
Proceso sin_titulo
	Definir Resultado Como Entero ;
	Definir Numero Como Entero ;
	Resultado <- 1 ;
	Escribir "Pon el primer numero " ;
	Leer Numero ;
	Mientras Numero <> 0 Hacer
		Si Numero %2 <>0 Entonces 
			Resultado <- Resultado * Numero ;
		FinSi
		Escribir "Esta multiplicacion ha dado " , Resultado ;
		Escribir "Pon otro numero o 0 para salir " ;
		Leer Numero ;
	FinMientras
	Escribir "El resultado de la multiplicacion de estos numeros impares es " , Resultado ;
 FinProceso
