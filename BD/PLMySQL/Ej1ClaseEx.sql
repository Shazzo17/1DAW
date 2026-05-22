SET SERVEROUTPUT ON;

DECLARE
    resultado VARCHAR2(100);
BEGIN
    -- Llamamos a la función con una oficina de prueba
    resultado := ciudadYPaisCodigoDado('TOK-JP');
    DBMS_OUTPUT.PUT_LINE('El resultado es: ' || resultado);
END;
/