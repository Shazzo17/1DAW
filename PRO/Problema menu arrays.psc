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
	definir array Como Entero ;
	definir counter Como Entero ;
	definir array_long Como Entero ;
	counter <- 0 ;
	dimension array[10] ;
	Escribir "Dame el primer numero de una serie de numeros para usar o usa 0 para salir" ;
	leer number ;
	Mientras number <> 0 hacer
		array[counter] <- number ;
		escribir "La posicion " , counter , " es " , array[counter] ;
		counter <- counter + 1 ;
		Escribir "Dame otro numero de una serie de numeros para usar o usa 0 para salir" ;
		leer number ;
	FinMientras
	array[counter] <- 0 ;
	escribir "La posicion " , counter , " es " , array[counter] ;
	Repetir
		Escribir "Usa el numero 1 para sumar la serie de numeros" ;
		Escribir "Usa el numero 2 para multiplicar la serie de numeros" ;
		Escribir "Usa el numero 3 para obtener el mayor de la serie de numeros" ;
		Escribir "Usa el numero 4 para obtener la suma de los impares de la serie de numeros" ;
		Escribir "Usa el numero 5 para salir" ;
		leer menu ;
		number <- 1 ;
	Segun menu Hacer
	1:
		counter <- 0 ;
		result <- 0 ;
		Mientras array[counter] <> 0 hacer
		Escribir result , "+" , array[counter] , "=" ,result + array[counter] ; 
		result <- result + array[counter] ;
		counter <- counter + 1 ;
	FinMientras
	2:
		counter <- 0 ;
		result <- 1 ;
		Mientras array[counter] <> 0 hacer
		Escribir result , "*" , array[counter] , "=" ,result * array[counter] ; 
		result <- result * array[counter] ;
		counter <- counter + 1 ;
	FinMientras
	3:
		result <- 0 ;
		counter <- 0 ;
		Mientras array[counter] <> 0 hacer
			si array[counter] > result entonces
				result <- array[counter] ;
				Escribir "El numero " , array[counter] , " es mayor" ;
			SiNo
				Escribir "El numero " , array[counter] , " es menor" ;
			FinSi
			counter <- counter + 1 ;
		FinMientras
		Escribir "El numero mayor es " , result ;
	4:
		result <- 0 ;
		counter <- 0 ;
		Mientras array[counter] <> 0 hacer
			si array[counter] % 2 <> 0 entonces
				Escribir result , "+" , array[counter] , "=" ,result + array[counter] ; 
				result <- result + array[counter] ;
			FinSi
			counter <- counter + 1 ;
		FinMientras
		Escribir "El resultado de la suma de los impares es " , result ;
FinSegun
Hasta Que menu = 5 ;
FinProceso