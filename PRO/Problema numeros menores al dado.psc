//2. Me dan una serie  (lista,sucesiones,etc) de numeros y me piden obtener el aquellos numeros
//que son menores a uno dado.

// Ejemplo 3,1,8,10,12,7,0.

Proceso sin_titulo
	definir number Como Entero ;
	definir result Como Entero ; 
	escribir "Dame el numero que quieres comparar" ;
	leer result ;
	escribir "Dame el primer numero" ;
	leer number ;
	Mientras number <> 0 Hacer
		si result > number Entonces
			Escribir "El numero ", number , " es menor que el comparado " ;
		FinSi
		si result < number Entonces
			Escribir "El numero " , number , " es mayor que el comparado " ;
		FinSi
		Escribir "Dame otro numero" ;
		Leer number ;
	FinMientras
FinProceso
