CREATE OR REPLACE FUNCTION tipoCliente (codigoacomparar INTEGER)
RETURN INTEGER
IS
tipo INTEGER;
credito INTEGER;


BEGIN
SELECT LimiteCredito
INTO credito
FROM Clientes
WHERE CodigoCliente=codigoacomparar;

IF credito < 10000 THEN
tipo:=1;

ELSIF credito >= 10000 AND credito <100000 THEN
tipo:=2;

ELSE
tipo:=3;
END IF;

return tipo;

EXCEPTION
WHEN NO_DATA_FOUND THEN
tipo:=-1;
return tipo;

END;
/