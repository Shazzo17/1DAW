// Me dan una serie de numeros y me dicen que quieren saber la cantidad de numeros que se repiten a un numero dado.

Proceso sin_titulo
	definir number Como Entero ;
	definir perma Como Entero ;
	definir counter como entero ;
	escribir "Dame un numero para comparar los demas" ;
	leer perma ;
	escribir "Dame un numero para comparar con el dado" ;
	leer number ;
	counter <- 0 ;
	Mientras number <> 0 hacer
		si perma = number Entonces
			counter <- counter + 1 ;
			escribir "Este numero es igual al dado,llevamos " , counter , " numeros repetidos" ;
		FinSi
		escribir "Dame otro numero " ;
		leer number ;
	FinMientras
	escribir "El numero dado se repite " , counter , " veces" ; 
FinProceso
