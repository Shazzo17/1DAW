Proceso Prueba2
	Definir Edad Como Entero;
	Definir Resultado Como Entero ;
	Escribir "Dame tu edad" ;
	Leer Edad ;
	Resultado <- Edad ;
	Escribir "La edad es " , Resultado ;
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
FinProceso