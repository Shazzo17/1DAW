Proceso sin_titulo
	definir text Como cadena ;
	definir size Como Entero ;
	definir result como cadena ;
	definir conca como cadena ;
	definir text2 como cadena ;
	text <- "Hola mundo" ;
	text2 <- "Estamos en clase " ;
	size <- longitud ( text ) ;
	escribir "La cantidad del texto es " , size;
	result <- subcadena ( text , 4, 8 ) ;
	escribir "La subcadena de " , text , " es " , result ;
	conca <- Concatenar( text, text2 ) ;
	escribir "La cadena concatenede de " , text , " y " , text2 , " es " , conca ;
FinProceso
