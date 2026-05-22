SubProceso   Imprimir(arreglo1 por referencia,longitud_arreglo por referencia)
	definir indice como entero;
	para indice<-0 hasta longitud_arreglo con paso 1 Hacer
		escribir arreglo1[indice];
	FinPara
	
FinSubProceso

SubProceso intercambio ( arreglo1,longitud_ar,posicion )
	definir auxiliar como entero;
	auxiliar<-arreglo1[posicion];
	arreglo1[posicion]<-arreglo1[longitud_ar];
	arreglo1[longitud_ar]<-auxiliar;
FinSubProceso
//nigga1
SubProceso longitud_arreglo1 <- entrada_datos ( arreglo1 )
	definir longitud_arreglo1 como entero;
	definir indice como entero;
	definir entrada como entero;
	indice<-0;
	escribir "dame los numeros ";
	leer entrada;
	
	mientras entrada<>0 Hacer
		arreglo1[indice]<-entrada;
		indice<-indice+1;
		escribir "dame los numeros ";
		leer entrada;
	FinMientras
	longitud_arreglo1<-indice-1;
FinSubProceso

SubProceso  dato <- maximo ( arreglo1,longitud_arreglo)
	definir dato como entero;
	definir indice como entero;
	definir maximo_entero como entero;
	definir posicion como entero;
	indice<-0;
	maximo_entero<-0;
	mientras indice<=longitud_arreglo Hacer
		si arreglo1[indice]>maximo_entero Entonces
			maximo_entero<-arreglo1[indice];
			posicion<-indice;
		FinSi
		indice<-indice+1;
		
	FinMientras
	dato<-posicion;
FinSubProceso

//nigga 
Proceso sin_titulo
	dimension arreglo1[50];
	definir arreglo1 como entero;
	definir resultado como entero;
	definir posicion como entero;
	definir longitud_arreglo como entero;
	definir indice como entero;
	
	longitud_arreglo<-entrada_datos(arreglo1);
	resultado<-maximo(arreglo1,longitud_arreglo);
	intercambio(arreglo1,longitud_arreglo,resultado);

	escribir "Los datos ordenados son ";
	escribir " ordenados la primera pasada " , arreglo1[indice] , arreglo1[longitud_arreglo] ;
	
	para indice<-0 hasta longitud_arreglo con paso 1 Hacer
		escribir arreglo1[indice];
	FinPara
FinProceso