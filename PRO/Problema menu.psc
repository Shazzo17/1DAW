// Realizar un menú, con las siguientes opciones.
// 1. Sumar una serie de numeros.
// 2. Multiplicar una serie de numeros.
// 3. Obtener el mayor de la serie de numeros.
// 4. Obetener la suma de los numeros impares de la serie.
// 5. Salir.

Proceso sin_titulo
	definir number como entero ;
	definir result como entero ;
	definir menu Como Entero ;
	Repetir
		Escribir "Usa el numero 1 para sumar una serie de numeros" ;
		Escribir "Usa el numero 2 para multiplicar una serie de numeros" ;
		Escribir "Usa el numero 3 para obtener el mayor de una serie de numeros" ;
		Escribir "Usa el numero 4 para obtener la suma de los impares de una serie de numeros" ;
		Escribir "Usa el numero 5 para salir" ;
		leer menu ;
		number <- 1 ;
	Segun menu Hacer
	1:
		result <- 0 ;
		Mientras number <> 0 hacer
		Escribir "Dame un numero para sumar o usa 0 para salir" ;
		leer number ;
		Escribir result , "+" , number , "=" ,result + number ; 
		result <- result + number ;
	FinMientras
	2:
		result <- 1 ;
		Mientras number <> 0 hacer
		Escribir "Dame un numero para multiplicar o usa 0 para salir" ;
		leer number ;
		Escribir result , "*" , number , "=" ,result * number ; 
		result <- result * number ;
	FinMientras
	3:
		result <- 0 ;
		Mientras number <> 0 hacer
			Escribir "Dame un numero para ver si es mayor o usa 0 para salir" ;
			leer number ;
			si number > result entonces
				result <- number ;
				Escribir "El numero " , number , " es mayor" ;
			SiNo
				Escribir "El numero " , number , " es menor" ;
			FinSi
		FinMientras
		Escribir "El numero mayor es " , result ;
	4:
		result <- 0 ;
		Mientras number <> 0 hacer
			Escribir "Dame un numero para sumar los impares o usa 0 para salir" ;
			leer number ;
			si number % 2 <> 0 entonces
				Escribir result , "+" , number , "=" ,result + number ; 
				result <- result + number ;
			FinSi
			Escribir "El resultado de la suma de los impares es " , result ;
		FinMientras
FinSegun
Hasta Que menu = 5 ;
FinProceso