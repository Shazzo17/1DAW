SubProceso Longitud_dimension<-entrada_datos(arreglo1)
	Definir Longitud_dimension Como Entero;
	Definir entrada Como Entero;
	Definir indice Como Entero;
	
	Escribir "Dame los datos con los que quieras operar";
	leer entrada;	
	
	indice<-0;
	
	Mientras entrada<>0 Hacer
		arreglo1[indice]<-entrada;
		Escribir "Dame más datos con los que operar";
		leer entrada;
		indice<-indice+1;
	FinMientras
	
	Longitud_dimension<-indice-1;
FinSubProceso

SubProceso sumar <- suma(arreglo1, Longitud_dimension)
	Definir sumar Como Entero;
	Definir indice Como Entero;
	
	indice<-0;
	sumar<-0;
	
	Mientras indice <= Longitud_dimension Hacer
		sumar <- sumar + arreglo1[indice];
		Escribir sumar , "+" , arreglo1[indice] , "=" , sumar + arreglo1[indice] ;
		indice <- indice + 1 ;
	FinMientras
FinSubProceso

SubProceso multiplicar <- multiplicacion(arreglo1,Longitud_dimension)
	definir indice , multiplicar como entero ;
	
	indice <- 0 ;
	multiplicar <- 1 ;
	
	mientras indice <= Longitud_dimension Hacer
		multiplicar <- multiplicar * arreglo1[indice] ;
		indice <- indice + 1 ;
	FinMientras
	
FinSubProceso

SubProceso mayor <- mayor_arreglo(arreglo1,Longitud_dimension)
	definir indice , mayor como entero ;
	
	indice <- 0 ;
	mayor <- 0 ;
	
	mientras indice <= Longitud_dimension Hacer
		si arreglo1[indice] > mayor Entonces
			mayor <- arreglo1[indice] ;
		FinSi
		indice <- indice + 1 ;
	FinMientras
	
FinSubProceso

SubProceso menor <- menor_arreglo(arreglo1,Longitud_dimension)
	definir indice , menor como entero ;
	
	indice <- 0 ;
	menor <- arreglo1[indice] ;
	
	mientras indice <= Longitud_dimension Hacer
		si arreglo1[indice] < menor Entonces
			menor <- arreglo1[indice] ;
		FinSi
		indice <- indice + 1 ;
	FinMientras
	
FinSubProceso

SubProceso sumar <- suma_impares(arreglo1, Longitud_dimension)
	Definir sumar Como Entero;
	Definir indice Como Entero;
	
	indice<-0;
	sumar<-0;
	
	Mientras indice<=Longitud_dimension Hacer
		si arreglo1[indice] % 2 <> 0 Entonces
			sumar <- sumar + arreglo1[indice];
			Escribir sumar , "+" , arreglo1[indice] , "=" , sumar + arreglo1[indice] ;
		FinSi
		indice <- indice + 1;
	FinMientras
FinSubProceso

Proceso sin_titulo
	Dimension arreglo1[50];
	Definir arreglo1, Longitud_dimension, opcion, sumar, multiplicar , mayor , menor Como Entero;
	Longitud_dimension<-entrada_datos(arreglo1);
	Repetir
		Escribir "1-Suma de datos";
		Escribir "2-Multiplicación de datos";
		Escribir "3-Obtener el mayor número de la serie";
		Escribir "4-Obtener el menor número de la serie";
		Escribir "5-Sumar los números impares de la serie";
		Escribir "6-Salir";
		leer opcion;
		Segun opcion Hacer
			1:
				Sumar<-suma(arreglo1, Longitud_dimension);
				Escribir "La suma de los datos es ", sumar;
			2:
				multiplicar <- multiplicacion(arreglo1,Longitud_dimension) ;
				Escribir "La multiplicacion de los datos es ", multiplicar;
			3:
				mayor <- mayor_arreglo(arreglo1,Longitud_dimension) ;
				Escribir "El numero mayor es ", mayor;
			4:
				menor <- menor_arreglo(arreglo1,Longitud_dimension) ;
				Escribir "El numero menor es ", menor;
			5: 
				sumar <- suma_impares(arreglo1, Longitud_dimension) ;
				Escribir "La suma de los impares es" , sumar ;
		FinSegun
	Hasta Que opcion=6;
FinProceso


	