CREATE TABLE PagosEliminados (
	CodigoCliente integer NOT NULL,
	FormaPago varchar(40) NOT NULL,
	IDTransaccion varchar(50) NOT NULL,
	FechaPago date NOT NULL,
	Cantidad numeric(15,2) NOT NULL
);

CREATE OR REPLACE TRIGGER AuditarBorradoPagos
BEFORE DELETE ON Pagos
FOR EACH ROW

BEGIN
	INSERT INTO PagosEliminados VALUES (:OLD.CodigoCliente,:OLD.FormaPago,:OLD.IDTransaccion,:OLD.FechaPago,:OLD.Cantidad);

END;
/