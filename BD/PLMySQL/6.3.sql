SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE actualizarPreciosGama(pGama GamasProductos.Gama%TYPE, pSubidaPrecio Productos.PrecioVenta%TYPE)
IS
	vSumaTotalSubidaPrecio Productos.PrecioVenta%TYPE := 0;
	vContador NUMBER := 0;
	
	-- Guardamos codigo, nombre y precio filtrando por la gama indicada
	CURSOR cProductos IS 
	SELECT CodigoProducto, Nombre, PrecioVenta
	FROM Productos
	WHERE UPPER(Gama) = UPPER(pGama);

BEGIN
	FOR ProductoActual IN cProductos LOOP
        -- 1. Mostramos los datos originales del producto
		DBMS_OUTPUT.PUT_LINE('El codigo del producto es ' || ProductoActual.CodigoProducto);
		DBMS_OUTPUT.PUT_LINE('El nombre del producto es ' || ProductoActual.Nombre);
		DBMS_OUTPUT.PUT_LINE('El precio del producto antes de actualizar es ' || ProductoActual.PrecioVenta);

        -- 2. Aplicamos la subida de precio a este producto en concreto
		UPDATE Productos
		SET PrecioVenta = ProductoActual.PrecioVenta + pSubidaPrecio
		WHERE CodigoProducto = ProductoActual.CodigoProducto;

        -- 3. Actualizamos metricas para el resumen final
		vContador := vContador + 1;
		vSumaTotalSubidaPrecio := vSumaTotalSubidaPrecio + pSubidaPrecio;

		DBMS_OUTPUT.PUT_LINE('El precio del producto actualizado es ' || (ProductoActual.PrecioVenta + pSubidaPrecio));
	END LOOP;
    
	-- Controlamos si el cursor estaba vacio para no mostrar reportes falsos
	IF vContador = 0 THEN
		DBMS_OUTPUT.PUT_LINE('No se han encontrado productos de esta gama.');
	ELSE
		DBMS_OUTPUT.PUT_LINE('El numero total de productos actualizados es ' || vContador);
		DBMS_OUTPUT.PUT_LINE('La suma total del importe que se ha incrementado es ' || vSumaTotalSubidaPrecio);
		COMMIT;
	END IF;


EXCEPTION
	-- Si hay un error critico deshacemos las actualizaciones a medias por seguridad
	WHEN OTHERS THEN
		ROLLBACK;
		DBMS_OUTPUT.PUT_LINE('Se ha encontrado un error desconocido.');
END;
/