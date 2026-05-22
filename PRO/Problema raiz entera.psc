// A mi me dan un numero y quiero obtener la raiz exacta de ese numero.

Proceso sin_titulo
	definir number Como entero ;
	definir multiply Como Entero ;
	Escribir "Dame un numero para sacar su raiz exacta" ;
	leer number ;
	multiply <- 1 ;
	mientras multiply * multiply <= number Hacer
		multiply <- multiply + 1 ;
	FinMientras
	escribir "El resultado es " , multiply -1 ;
FinProceso
