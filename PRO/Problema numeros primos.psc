//2. Me dan un numero y me piden que diga si es primo o no
Proceso sin_titulo
	definir number , counter_div , counter_number Como Entero ; // Define las variables a usar como entero.
	Escribir "Dame el primer numero para ver si es primo o no o usa 0 para salir" ; // Me pide el primer numero
	leer number ;
	mientras number <> 0 hacer // Si el numero no es cero hace el mientras
		counter_div <- 1 ; // Inicia y reinicia el contador en 1 para que se pueda dividir entre el.
		counter_number <- 0 ; // Inicia y reinicia el contador del numero en 0.
		Mientras counter_div <= number Hacer // Si el contador de la division es menor o igual que el numero sigue dividiendolo.
			si number % counter_div = 0 Entonces // Si es divisible entre el y el 1 entra al si.
				counter_number <- counter_number + 1 ;
			FinSi
			counter_div <- counter_div + 1 ;
		FinMientras
		si counter_number <= 2 Entonces
		Escribir "El numero " , number , " es primo" ;
		SiNo
			Escribir "El numero " , number , " no es primo" ;
		FinSi
		Escribir "Dame otro numero para ver si es primo o no o usa 0 para salir" ;
		leer number ;
	FinMientras
FinProceso
