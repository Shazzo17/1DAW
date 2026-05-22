SET SERVEROUTPUT ON
DECLARE
numero1 INT;
numero2 INT;
BEGIN
numero1:=&Dime_el_primer_numero;
numero2:=&Dime_el_segundo_numero;
if numero1 > numero2 THEN
DBMS_OUTPUT.PUT_LINE('El numero '||numero1||' es mayor que el numero '||numero2);
else
DBMS_OUTPUT.PUT_LINE('El numero '||numero2||' es mayor que el numero '||numero1);
END IF;
END;
/