// a)
const edad = 20;
const dinero = 5 ;

const puedeEntrar = (edad >= 18 && dinero >= 10);
    console.log(`${puedeEntrar}`);

// b)
const aprobadoTeoria = true;
const aprobadoPractica = false;

const aprobado = (aprobadoPractica && aprobadoTeoria);
console.log(`${aprobado}`);

// c)
const usuario = null;

console.log(`El usuario es ${usuario ?? "Invitado"}`);

// d)
const Persona = {
    nombre : "Ana",
    direccion : {ciudad: "Murcia"}
};

console.log(`${Persona.telefono?.movil}`);

// e)
// (0 == false) = true Porque compara el resultado pero no el tipo de dato.
// (0 === false) = false Porque compara el resultado y el tipo de dato.
// ("" == false) = true Porque no compara el tipo de dato.