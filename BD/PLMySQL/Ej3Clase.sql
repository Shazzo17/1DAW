SET SERVEROUTPUT ON;
CREATE OR REPLACE PROCEDURE datosclientes(codigoacomparar Clientes.CodigoCliente%TYPE)
IS
vCodigoCliente Clientes.CodigoCliente%TYPE;
vNombreCliente	Clientes.NombreCliente%TYPE;
vTelefonoCliente Clientes.Telefono%TYPE;
vCodigoEmpleadoRepVentas Clientes.CodigoEmpleadoRepVentas%TYPE;
vNombreEmpleadoRepVentas Empleados.Nombre%TYPE;
vCodigoOficina Empleados.CodigoOficina%TYPE;
vCiudadYPaisOficina VARCHAR2(100);
vTipoCliente INTEGER;

BEGIN

SELECT c.CodigoCliente,c.NombreCLiente,c.Telefono,c.CodigoEmpleadoRepVentas,e.Nombre,e.CodigoOficina
INTO vCodigoCliente,vNombreCliente,vTelefonoCliente,vCodigoEmpleadoRepVentas,vNombreEmpleadoRepVentas,vCodigoOficina
FROM Clientes c JOIN Empleados e
ON c.CodigoEmpleadoRepVentas=e.CodigoEmpleado
WHERE codigoacomparar=c.CodigoCliente;

DBMS_OUTPUT.PUT_LINE('El codigo del cliente es ' || vCodigoCliente);
DBMS_OUTPUT.PUT_LINE('El nombre del cliente es ' || vNombreCliente);
DBMS_OUTPUT.PUT_LINE('El Telefono del cliente es ' || vTelefonoCliente);
DBMS_OUTPUT.PUT_LINE('El codigo del empleado representante de ventas del cliente es ' || vCodigoEmpleadoRepVentas);
DBMS_OUTPUT.PUT_LINE('El nombre del empleado representante de ventas del cliente es ' || vNombreEmpleadoRepVentas);
DBMS_OUTPUT.PUT_LINE('El codigo de la oficina del empleado representante de ventas del cliente es ' || vCodigoOficina);

vCiudadYPaisOficina:=ciudadYPaisCodigoDado(vCodigoOficina);
DBMS_OUTPUT.PUT_LINE('La ciudad y el pais del codigo de la oficina del empleado representante de ventas del cliente es ' || vCiudadYPaisOficina);

vTipoCliente:=tipoCliente(codigoacomparar);
DBMS_OUTPUT.PUT_LINE('El tipo de cliente es '|| vTipoCliente);

EXCEPTION
WHEN NO_DATA_FOUND THEN
DBMS_OUTPUT.PUT_LINE('Error: No existe ningun cliente con ese codigo');

END;
/