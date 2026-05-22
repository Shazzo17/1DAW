//Dada una serie de numeros terminados en 0 me piden las veces que se repiten los distintos numeros. Ejemplo 3,5,7,3,7,2,8,10,15,10,15,15,0
//3 se repite 2
//5 se repite 1
//7 se repite 2
//2 se repite 1
//8 se repite 1
//10 se repite 2
//15 se repite 3

Proceso sin_titulo
	dimension array_number[50] ;
	dimension array_rep[50] ;
	dimension array_orig[50] ;
	definir number , array_orig , array_number , array_rep , counter_number , counter_orig , counter_rep , long_number , long_orig , long_rep , temp Como Entero ;
	escribir "Dame el primer numero de una serie de numeros para ver cuantos se repiten" ;
	leer number ;
	counter_number <- 0 ;
	mientras number <> 0 y counter_number <= 49 Hacer
		array_number[counter_number] <- number ;
		counter_number <- counter_number + 1 ;
		escribir "Dame otro numero de la serie de numeros para ver cuantos se repiten" ;
		leer number ;
	FinMientras
	long_number <- counter_number - 1 ;
	
	counter_number <- 0 ;
	counter_orig <- 0 ;
	mientras counter_number <= long_number hacer
		temp <- array_number[counter_number] ;
		si counter_orig = 0 Entonces
			array_orig[counter_orig] <- temp ;
			array_rep[counter_orig] <- 1 ;
			counter_orig <- counter_orig + 1 ;
		SiNo
			counter_orig <- 0 ;
			Escribir "El counter_orig es " , counter_orig ;
			mientras counter_orig <= long_orig y array_orig[counter_orig] <> temp Hacer //Si no ha llegado al final y no ha encuentrado un numero igual al comparado sigue comparandolo con los siguientes hasta el final.
				counter_orig <- counter_orig + 1 ;
			FinMientras
			si counter_orig > long_orig Entonces
				array_orig[counter_orig] <- temp ;
				array_rep[counter_orig] <- 1 ;
				long_orig <- counter_orig ;
			SiNo
				array_rep[counter_orig] <- array_rep[counter_orig] + 1 ;
			FinSi
		FinSi
		long_orig <- counter_orig ;
		counter_number <- counter_number + 1 ;
	FinMientras
	Para counter_orig <- 0 hasta long_orig con paso 1  Hacer
		Escribir array_orig[counter_orig] ;
		Escribir array_rep[counter_rep] ;
	FinPara
	
FinProceso
