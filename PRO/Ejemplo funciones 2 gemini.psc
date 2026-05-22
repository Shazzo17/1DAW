Proceso sin_titulo
	// **********************************************
	// * Subprocesos (Funciones/Procedimientos) *
	// **********************************************
	
	// Subproceso: Imprimir un arreglo
	SubProceso Imprimir(arreglo1 Por Referencia, longitud_arreglo Por Referencia)
		// Comentario: Definimos la variable 'indice' como entero para usarla en el ciclo.
		Definir indice Como Entero;
		// Comentario: Iniciamos un ciclo que va desde el índice 0 hasta el índice de la última posición válida.
		Para indice<-0 Hasta longitud_arreglo Con Paso 1 Hacer
			// Comentario: Escribimos (imprimimos) el valor del elemento actual del arreglo.
			Escribir arreglo1[indice];
		FinPara
		
FinSubProceso // Comentario: Fin del subproceso Imprimir.


// Subproceso: Intercambiar dos valores dentro del arreglo.
SubProceso Intercambio (arreglo1 Por Referencia, longitud_ar Por Valor, posicion Por Valor)
	// Comentario: Definimos 'auxiliar' como entero para guardar temporalmente un valor.
	Definir auxiliar Como Entero;
	
	// Comentario: Guardamos el valor en la posición a intercambiar (el máximo) en 'auxiliar'.
	auxiliar<-arreglo1[posicion];
	// Comentario: Movemos el valor del final del arreglo (longitud_ar) a la posición del máximo.
	arreglo1[posicion]<-arreglo1[longitud_ar];
	// Comentario: Colocamos el valor que estaba en 'auxiliar' (el máximo) en la posición final.
	arreglo1[longitud_ar]<-auxiliar;
FinSubProceso // Comentario: Fin del subproceso Intercambio.


// Subproceso (Función): Leer datos del usuario y devolver la longitud.
SubProceso longitud_arreglo1 <- entrada_datos (arreglo1 Por Referencia)
	// Comentario: Definimos la variable de retorno 'longitud_arreglo1' como entero.
	Definir longitud_arreglo1 Como Entero;
	// Comentario: Definimos el 'indice' para el arreglo y la 'entrada' para la lectura.
	Definir indice Como Entero;
	Definir entrada Como Entero;
	
	// Comentario: Inicializamos el índice del arreglo en 0.
	indice<-0;
	
	// Comentario: Pedimos el primer número al usuario.
	Escribir "Dame los numeros (ingresa 0 para terminar):";
	// Comentario: Leemos el valor y lo guardamos en 'entrada'.
	Leer entrada;
	
	// Comentario: Iniciamos un bucle que continúa mientras el número ingresado no sea 0.
	Mientras entrada<>0 Hacer
		// Comentario: Asignamos el número ingresado al arreglo en la posición actual del índice.
		arreglo1[indice]<-entrada;
		// Comentario: Incrementamos el índice para la siguiente posición.
		indice<-indice+1;
		// Comentario: Volvemos a pedir el siguiente número.
		Escribir "Dame el siguiente numero (ingresa 0 para terminar):";
		// Comentario: Leemos el siguiente valor.
		Leer entrada;
	FinMientras // Comentario: Fin del bucle Mientras.
	
	// Comentario: Calculamos la longitud_arreglo1. Si se ingresaron N números, el último índice es N-1.
	longitud_arreglo1<-indice-1;
FinSubProceso // Comentario: Fin del subproceso (función) entrada_datos.


// Subproceso (Función): Encontrar la posición del valor máximo.
SubProceso dato <- maximo (arreglo1 Por Referencia, longitud_arreglo Por Valor)
	// Comentario: Definimos 'dato' (la posición) como entero para el retorno.
	Definir dato Como Entero;
	// Comentario: Definimos variables de control para el ciclo, el valor máximo y su posición.
	Definir indice Como Entero;
	Definir maximo_entero Como Entero;
	Definir posicion Como Entero;
	
	// Comentario: Inicializamos el índice del arreglo en 0.
	indice<-0;
	// Comentario: Inicializamos el valor máximo con el primer elemento del arreglo.
	// NOTA: Tu código original lo inicializaba en 0, lo cual es incorrecto si los números pueden ser negativos.
	maximo_entero<-arreglo1[indice]; 
	// Comentario: Inicializamos la posición del máximo en 0.
	posicion<-indice;
	
	// Comentario: Bucle para recorrer el arreglo desde el índice 0 hasta el final.
	Mientras indice<=longitud_arreglo Hacer
		// Comentario: Preguntamos si el elemento actual es mayor que el máximo_entero que hemos encontrado hasta ahora.
		Si arreglo1[indice]>maximo_entero Entonces
			// Comentario: Si es mayor, actualizamos el valor del máximo_entero.
			maximo_entero<-arreglo1[indice];
			// Comentario: Guardamos el índice actual como la nueva posición del máximo.
			posicion<-indice;
		FinSi
		// Comentario: Avanzamos al siguiente elemento del arreglo.
		indice<-indice+1;
		
	FinMientras // Comentario: Fin del bucle Mientras.
	
	// Comentario: Devolvemos la posición donde se encontró el número más grande.
	dato<-posicion;
FinSubProceso // Comentario: Fin del subproceso (función) maximo.


// **********************************************
// * Algoritmo Principal *
// **********************************************

Algoritmo Ordenamiento_Primera_Pasada
	// Comentario: Reservamos espacio para un arreglo de 50 elementos.
	Dimension arreglo1[50];
	// Comentario: Definimos todas las variables que se usarán en el algoritmo principal.
	Definir arreglo1 Como Entero; // Definimos el arreglo (es un error de sintaxis de PSeInt si ya se usó Dimension, pero lo mantenemos por tu ejemplo).
	Definir resultado Como Entero; // Para guardar la posición del número máximo.
	Definir longitud_arreglo Como Entero; // Para guardar el índice del último elemento válido.
	Definir indice Como Entero; // Para usar en los bucles.
	
	// Comentario: Llamamos al subproceso para llenar el arreglo y obtener la longitud.
	longitud_arreglo<-entrada_datos(arreglo1);
	
	// Comentario: Llamamos al subproceso para encontrar la posición del número más grande.
	resultado<-maximo(arreglo1,longitud_arreglo);
	
	// Comentario: Llamamos al subproceso para intercambiar el elemento máximo (en 'resultado') con el último elemento válido (en 'longitud_arreglo').
	Intercambio(arreglo1,longitud_arreglo,resultado);
	
	// Comentario: Mostramos un mensaje.
	Escribir "--- Resultado de la primera pasada ---";
	// Comentario: Mostramos la posición donde estaba el elemento máximo.
	Escribir "El elemento mas grande se encontraba en la posicion: ", resultado;
	// Comentario: Mostramos el valor del último índice del arreglo (el que fue intercambiado).
	Escribir "La nueva posicion del elemento mas grande (ultimo indice): ", longitud_arreglo;
FinProceso
