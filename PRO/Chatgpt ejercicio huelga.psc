//Nos dan una dimension con unos determinados numeros, y nos piden
//ordenar esa dimension de menor a mayor
//8,4,6,9,15,7,12,0

Proceso sin_titulo
    Dimension array[20];
    definir array , number, counter, result, max_counter, array_long, n Como Entero;
	
    // inicializaciones
    counter <- 1;
    result <- 0;
    max_counter <- 0;
	
    Escribir "Dame el primer numero de la dimension";
    Leer number;
	
    Mientras number <> 0 Y counter <= 20 Hacer
        array[counter] <- number;
        Escribir "La posicion " , counter , " es " , array[counter];
        counter <- counter + 1;
        Escribir "Dame otro numero para la dimension";
        Leer number;
    FinMientras;
	
    // guardamos n = numero de elementos leidos
    n <- counter - 1;
	
    Si n = 0 Entonces
        Escribir "No hay elementos para ordenar.";
FinSi;

// ponemos centinela (opcional, no lo usamos en inner loop)
array[counter] <- 0;

// usamos array_long como indice del ultimo elemento no ordenado
array_long <- n;

// Algoritmo: cada pasada busca máximo en 1..array_long y lo pone en array[array_long]
Mientras array_long > 0 Hacer
	// inicializar búsqueda del máximo en el rango 1..array_long
	counter <- 1;
	result <- array[1];
	max_counter <- 1;
	
	Mientras counter <= array_long Hacer
		Si result < array[counter] Entonces
			result <- array[counter];
			max_counter <- counter;
		FinSi;
		counter <- counter + 1;
	FinMientras;
	
	// intercambio: poner el máximo en la posición array_long
	array[max_counter] <- array[array_long];
	array[array_long] <- result;
	
	Escribir "La posicion del valor maximo era ", max_counter;
	Escribir "Ahora la posicion ", max_counter, " contiene ", array[max_counter];
	Escribir "El ultimo elemento (pos ", array_long, ") ahora es ", array[array_long];
	Escribir "El numero mayor de la pasada fue ", result;
	
	// reducir el segmento no ordenado
	array_long <- array_long - 1;
FinMientras;

// Mostrar resultado final (menor a mayor)
Escribir "Array ordenado (de menor a mayor):";
Para counter <- 1 Hasta n Hacer
	Escribir array[counter];
FinPara;
FinProceso
