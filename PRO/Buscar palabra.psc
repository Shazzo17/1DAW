// Dada una array de palabras me piden que si me dan una palabra determinada diga si existe o no,en caso de que exista me debe devolver la posicion

Proceso sin_titulo
	dimension array[50] ;
	definir  long , i Como Entero ; // Define long como la longitud del array , n como entrada y i como indice.
	definir n , array como caracter ;
	
	i <- 0 ; // Inicia el indice.
	
	Escribir "Dame la primera palabra de la serie" ; // Te pide la primera palabra.
	leer n ;
	
	mientras n <> "fin" Hacer // Si la palabra no es fin te pide palabras y las añade a la array.
		array[i] <- n ;
		i <- i + 1 ;
		Escribir "Dame otra palabra de la serie o pon fin" ;
		leer n ;
	FinMientras
	
	long <- i - 1 ; // Convierte el long en la longitud del array.
	i <- 0 ; // Reinicia el contador.
	
	Escribir "Dame la palabra a buscar" ; // Te pide la palabra a buscar en el array.
	leer n ;
	
	mientras i < long y array[i] <> n Hacer // Si el array no ha llegado al final y no ha encontrado la palabra sigue buscando en el.
		i <- i + 1 ;
	FinMientras
	
	si n = array[i] Entonces // Si encuentra la palabra te lo dice y te dice su posicion y si no esta te dice que no esta.
		Escribir "La palabra existe y esta en la posicion " , i ;
	SiNo
		Escribir "La palabra no existe" ;
	FinSi
	
	Para i <- 0 Hasta long con paso 1 Hacer // Esto simplemente es para hacer pruebas y que se vea en que posicion esta cada palabra,pero no es necesario.
		Escribir "En la posicion " , i , " esta la palabra " , array[i] ;
	FinPara
FinProceso
