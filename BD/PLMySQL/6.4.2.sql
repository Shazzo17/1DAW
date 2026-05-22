CREATE OR REPLACE TRIGGER ValidarLimiteCredito
BEFORE UPDATE OF LimiteCredito ON Clientes
FOR EACH ROW

DECLARE
	vSumaPagosCliente Pagos.Cantidad%TYPE;

BEGIN
	SELECT NVL(SUM(Cantidad), 0)
	INTO vSumaPagosCliente
	FROM Pagos
	WHERE CodigoCliente = :NEW.CodigoCliente;

	IF vSumaPagosCliente > :NEW.LimiteCredito THEN
		RAISE_APPLICATION_ERROR(-20001,'Este cliente no puede tener este limite ya que es inferior a la suma de sus pagos');
	END IF;

END;
/
 