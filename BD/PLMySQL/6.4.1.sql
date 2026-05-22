CREATE OR REPLACE TRIGGER actualizarStockPedido
BEFORE INSERT ON DetallePedidos
FOR EACH ROW

DECLARE
	vCantidadEnStock Productos.CantidadEnStock%TYPE := 0;
	vResultado Productos.CantidadEnStock%TYPE := 0;

BEGIN
	SELECT CantidadEnStock
	INTO vCantidadEnStock
	FROM Productos
	WHERE CodigoProducto = :NEW.CodigoProducto;

	vResultado := vCantidadEnStock - :NEW.Cantidad;

	IF vResultado < 0 THEN
		RAISE_APPLICATION_ERROR(-20001, 'Al hacer este calculo el stock se ha quedado en negativo,revisa que esta pasando');

	ELSE
		UPDATE Productos
		SET CantidadEnStock = vResultado
		WHERE CodigoProducto = :NEW.CodigoProducto;

	END IF;
END;
/
