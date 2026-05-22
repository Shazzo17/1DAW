SET SERVEROUTPUT ON;

DECLARE
vResultado Pagos.Cantidad%TYPE;

BEGIN
vResultado := cantidadPagosPaypal(50);

IF vResultado = -1 THEN
DBMS_OUTPUT.PUT_LINE('No se ha encontrado a un cliente con ese codigo');
ELSIF vResultado = -2 THEN
DBMS_OUTPUT.PUT_LINE('Se ha encontrado un error desconocido');
ELSE
DBMS_OUTPUT.PUT_LINE('El pago total con paypal de este cliente es '|| vResultado);
END IF;

END;
/