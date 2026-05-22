 CREATE OR REPLACE FUNCTION ciudadYPaisCodigoDado(codigoacomparar VARCHAR2)
 RETURN VARCHAR2
 IS 
 
 ciudad VARCHAR2(50);
 pais VARCHAR2(50);
 ciudadypais VARCHAR2(50);
 
 BEGIN
 SELECT Ciudad, Pais
 INTO ciudad, pais
 FROM Oficinas
 WHERE CodigoOficina = codigoacomparar;
 
 ciudadypais:= ciudad || '-' || pais;
 RETURN ciudadypais;
 
 
 EXCEPTION
 WHEN NO_DATA_FOUND THEN
 RETURN 'No se encontraron datos en la base de datos';
 WHEN OTHERS THEN
 RETURN 'Se encontro un error desconocido';
 
 END;
 /