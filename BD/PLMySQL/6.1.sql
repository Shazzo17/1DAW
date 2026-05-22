CREATE OR REPLACE FUNCTION cantidadPagosPaypal(pCodigoAComparar Clientes.CodigoCliente%TYPE) 
RETURN Pagos.Cantidad%TYPE
IS
vCantidadTotal Pagos.Cantidad%TYPE;
vExisteCliente Clientes.CodigoCliente%TYPE;

BEGIN
SELECT CodigoCliente
  INTO vExisteCliente
  FROM Clientes
 WHERE pCodigoAComparar = CodigoCliente;

SELECT NVL(sum(p.cantidad),0)
INTO vCantidadTotal
FROM Clientes c JOIN Pagos p
ON c.CodigoCliente = p.CodigoCliente
WHERE pCodigoAComparar = c.CodigoCliente
AND UPPER(p.FormaPago) = 'PAYPAL';

RETURN vCantidadTotal;

EXCEPTION
WHEN NO_DATA_FOUND THEN
RETURN -1;
WHEN OTHERS THEN
RETURN -2;

END;
/