//4. Dada una dimension de unos determinados numeros,quiero obtener las posiciones impares y almacenarlos en una dimension y mostrarlos

Proceso sin_titulo
	dimension array_number[50] ; // Define los dos arrays,los dos contadores,la longitud del array,la entrada y el resultado o numero auxiliar.
	Dimension array_result[50] ;
	definir array_number , array_result , number , n , i , j , n_j , result Como Entero ;
	
	i <- 0 ; // Inicia el primer contador.
	Escribir "Dame el primer numero para obtener los impares" ; // Te pide el primer numero.
	leer number ;
	
	Mientras number <> 0 Hacer
		array_number[i] <- number ;
		i <- i + 1 ;
		Escribir "Dame otro numero para añadirlo o un 0 para salir" ;
		leer number ;
	FinMientras
	
	n <- i - 1 ;
	
	mientras i < n Hacer
		si array_number[i] % 2 <> 0 Entonces
			array_result[i] <- array_number[j] ;
		FinSi
		i <- i + 1 ;
		j <- j + 1 ;
	FinMientras
	
	n_j <- j - 1 ;
	
	Para j <- 0 Hasta n con paso 1 hacer
		Escribir array_result[j] ;
	FinPara
	
	
	
FinProceso
