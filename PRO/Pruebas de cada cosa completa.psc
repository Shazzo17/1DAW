Proceso Prueba2
		Definir Edad Como Entero;
		Definir Resultado Como Entero ;
		Escribir "Dame tu edad" ;
		Leer Edad ;
		Resultado <- Edad ;
		Escribir "La edad es " , Resultado ;
		Si Resultado >= 18 Entonces
			Escribir "La persona es mayor de edad" ;
		SiNo
			Escribir "La persona es menor de edad" ;
		FinSi
		Segun Resultado Hacer
			1:
				Escribir "Estoy en la primera opcion" ;
			2:
				Escribir "Estoy en la segunda opcion" ;
			3:
				Escribir "Estoy en la tercera opcion" ;
				
			De Otro Modo:
				Escribir "No estoy en ninguna opcion" ;
		FinSegun
		Mientras Edad <= 18 Hacer
			Escribir "Eres menor de edad" ;
			Escribir "Dame otra edad" ;
			Leer Edad ;
		FinMientras
FinProceso
