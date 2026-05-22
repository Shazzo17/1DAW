SET SERVEROUTPUT ON;

DECLARE 
resultado INTEGER;
codigoacomparar INTEGER;
BEGIN
codigoacomparar:=1;
resultado:=tipoCliente(codigoacomparar);
DBMS_OUTPUT.PUT_LINE('El resultado es ' || resultado);

END;
/