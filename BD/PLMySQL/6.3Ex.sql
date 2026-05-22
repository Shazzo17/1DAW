SET SERVEROUTPUT ON;

DECLARE
	vGamaPrueba GamasProductos.Gama%TYPE := 'nigger' ;
	vSubidaPrueba Productos.PrecioVenta%TYPE := 1000000;
BEGIN
	actualizarPreciosGama(vGamaPrueba, vSubidaPrueba);
END;
/