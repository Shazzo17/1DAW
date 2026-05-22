Proceso sin_titulo
	Definir Edad Como Entero;
	Definir Resultado Como Entero ;
	Escribir "Dame tu edad" ;
	Leer Edad ;
	Resultado <- Edad ;
	Escribir "La edad es " , Resultado ;
	Mientras Edad <= 18 Hacer
		Escribir "Eres menor de edad" ;
		Escribir "Dame otra edad" ;
		Leer Edad ;
	FinMientras
FinProceso
