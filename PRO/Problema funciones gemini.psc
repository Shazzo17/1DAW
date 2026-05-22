// Crear una función que reciba una lista de registros de temperatura y un nuevo valor, y decida si la temperatura ya está registrada. Si no lo está, debe aplicar una regla de alerta y, si se cumple, 
// insertarla en una posición específica de la lista.

SubProceso assis <- test(array,entry,index,long_array)
	Definir assis , position como entero ;
	
	position <- 0 ;
	index <- 0 ;
	entry <- 0 ;
	assis <- 0 ;
	
	mientras index <= long_array y array[index] <> entry Hacer
		index <- index + 1 ;
	FinMientras
	
	si array[index] <> entry Entonces
		Escribir "La temperatura ha sido encontrada" ;
	SiNo
		Escribir "La temperatura no ha sido encontrada" ;
		Escribir "¿En que posicion quieres insertar la temperatura?" ;
		leer position ;
		
		mientras position <= long_array Hacer
			assis <- long_array ;
			array[long_array + 1] <- array[long_array] ;
			long_array <- long_array - 1 ;
		FinMientras
		array[position] <- entry ;
	FinSi
FinSubProceso

Proceso sin_titulo
	dimension array[50] ;
	definir array , long_array , index , entry Como Entero;
	index <- 0 ;
	entry <- 0 ;
	
	escribir "Dame el primer numero" ;
	leer entry ;
	
	Mientras entry <> 0 Hacer
		array[index] <- entry ;
		index <- index + 1 ;
		escribir "Dame otro numero o pon 0 para salir" ;
		leer entry ;
	FinMientras
	
	long_array <- index - 1 ;
	
	Escribir "¿Que temperatura quieres buscar?" ;
	leer entry ;

	assis <- test(array,entry,index,long_array) ;

	Para index <- 0 hasta assis con paso 1 Hacer
		Escribir "En la posicion " , index , " esta la temperatura " , array[index] ;
	FinPara
	
FinProceso
