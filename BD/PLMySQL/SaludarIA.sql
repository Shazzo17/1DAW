CREATE OR REPLACE FUNCTION saludar(nombre VARCHAR2)
RETURN VARCHAR2
IS
	salida VARCHAR2(100);

BEGIN

	salida:='Hola,' || nombre || ' qué pasa!';
	RETURN salida;
END;
/