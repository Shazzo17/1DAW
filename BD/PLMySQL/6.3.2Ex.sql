SET SERVEROUTPUT ON;

DECLARE
vRegion Clientes.Region%TYPE := 'Barcelona';
vLimiteCorte Clientes.LimiteCredito%TYPE := 2000;
vSubidaCredito Clientes.LimiteCredito%TYPE := 1000;

BEGIN
aumentoLimiteCredito (vRegion, vLimiteCorte, vSubidaCredito);

END;
/