// Se quieren insertar 3 numeros en las posiciones 3,5 y 7 en una lista de numeros dados, cada vez que inserte un numero tendre que volver otra vez al principio 

Proceso sin_titulo
	dimension array[50] ;
	definir p , long , n , i , array , long_array Como Entero ; // Define P como posicion , long como la longitud del array , n como entrada y i
	//como indice, long_array como el asistente del long.
	
	i <- 0 ; // Inicia el indice.
	Escribir "Dame el primer numero de la serie" ; // Te pide el primer numero.
	leer n ;
	mientras n <> 0 Hacer // Si el numero no es 0 lo mete al array.
		array[i] <- n ;
		i <- i + 1 ;
		Escribir "Dame otro numero de la serie" ; // Te pide otro numero.
		leer n ;
	FinMientras
	long <- i - 1 ;
	long_array <- long ;
	Escribir "Dame el numero a insertar" ;
	leer n ;
	Escribir "Dame la posicion en la que insertar el numero o pon 0 para salir" ;
	leer p ;
	Mientras p <> 0 Hacer
		long <- long_array ;
		mientras long >= p Hacer
		array[long + 1] <- array[long] ;
		long <- long - 1 ; 
		FinMientras
	array[p] <- n ;
	long_array <- long_array + 1 ;
	Escribir "Dame el numero a insertar" ;
	leer n ;
	Escribir "Dame la posicion en la que insertar el numero o pon 0 para salir" ;
	leer p ;
	FinMientras
	
	Para i <- 0 Hasta long_array con paso 1 Hacer
		Escribir "En la posicion " , i , " esta el numero " , array[i] ;
	FinPara
FinProceso
