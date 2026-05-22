SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE aumentoLimiteCredito (pRegion Clientes.Region%TYPE, pLimiteCorte Clientes.LimiteCredito%TYPE, pSubidaCredito Clientes.LimiteCredito%TYPE)
IS
	vTotalRegistros NUMBER := 0;
	vContadorClientes NUMBER := 0;
	vSumaTotalDeIncrementosDeCredito Clientes.LimiteCredito%TYPE := 0;
	vCantidadClientes NUMBER := 0;

	-- Guardamos el codigo, nombre, telefono y limite de credito de clientes de la region pedida.
	CURSOR cClientes IS
	SELECT CodigoCliente, NombreCliente, Telefono, LimiteCredito
	FROM Clientes
	WHERE UPPER(Region) = UPPER(pRegion);
	
	vClienteActual cClientes%ROWTYPE;

BEGIN
	-- Sacamos la cantidad de clientes para mostrarla por pantalla despues
	SELECT COUNT(*)
	INTO vCantidadClientes
	FROM Clientes;
	
	-- 1. Recorremos el cursor.
	OPEN cClientes ;
	
	LOOP
		FETCH cClientes INTO vClienteActual;
		EXIT WHEN cClientes%NOTFOUND;
		-- 2. Si el cliente cumple con la segunda condicion entramos en este if.
		IF pLimiteCorte < vClienteActual.LimiteCredito THEN
			DBMS_OUTPUT.PUT_LINE('El codigo del cliente es ' || vClienteActual.CodigoCliente);
			DBMS_OUTPUT.PUT_LINE('El nombre del cliente es ' || vClienteActual.NombreCliente);
			DBMS_OUTPUT.PUT_LINE('El telefono del cliente es ' || vClienteActual.Telefono);
			DBMS_OUTPUT.PUT_LINE('El limite del cliente antes de actualizar es ' || vClienteActual.LimiteCredito);
			
			-- 3. Actualizamos el limite de credito del cliente.
			UPDATE Clientes 
			SET LimiteCredito = LimiteCredito + pSubidaCredito
			WHERE CodigoCliente = vClienteActual.CodigoCliente;
			
			DBMS_OUTPUT.PUT_LINE('El limite del cliente despues de actualizar es ' || (vClienteActual.LimiteCredito + pSubidaCredito));
			
			-- 4. Actualizamos las variables para mostrarlas por pantalla despues.
			vContadorClientes := vContadorClientes + 1;
			vSumaTotalDeIncrementosDeCredito := vSumaTotalDeIncrementosDeCredito + pSubidaCredito;
			
		ELSE
			DBMS_OUTPUT.PUT_LINE('El cliente no cumple con el minimo de limite de credito.');
		END IF;
	END LOOP;
	vTotalRegistros := cClientes%ROWCOUNT;
	CLOSE cClientes;
	-- Comprobamos si ha habido clientes que cumplan con el primer requisito
	IF vTotalRegistros  <= 0 THEN
		DBMS_OUTPUT.PUT_LINE('No se han encontrado clientes que cumplan con el requisito de la region');
	
	-- Comprobamos si ha habido clientes actualizados gracias a cumplir los dos requisitos.
	ELSIF vContadorClientes <= 0 THEN
		DBMS_OUTPUT.PUT_LINE('No se han encontrado clientes que cumplan con los dos requisitos por lo tanto ninguno se ha actualizado');
	
	-- Si se han actualizado clientes se guardan los cambios.
	ELSE
		COMMIT;
		DBMS_OUTPUT.PUT_LINE('El numero de clientes que cumplen con la region son ' || vTotalRegistros);
		DBMS_OUTPUT.PUT_LINE('El numero de clientes que cumplen con las 2 condiciones y por lo tanto se han actualizado correctamente es ' || vContadorClientes);
		DBMS_OUTPUT.PUT_LINE('El numero total de clientes sin filtrar es ' || vCantidadClientes);
		DBMS_OUTPUT.PUT_LINE('El coste total de la promocion es ' || vSumaTotalDeIncrementosDeCredito);
	END IF;
	
-- Si hay algun fallo volvemos atras y no guardamos los cambios en la base de datos.
EXCEPTION
	WHEN NO_DATA_FOUND THEN
		ROLLBACK;
		DBMS_OUTPUT.PUT_LINE('ERROR! La tabla de clientes esta vacia.');
		
	WHEN OTHERS THEN
		ROLLBACK;
		DBMS_OUTPUT.PUT_LINE('ERROR! Se ha encontrado un error desconocido.');
END;
/