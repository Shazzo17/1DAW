const nombre = "Miguel Angel";
const apellidos = "Saez Martinez";
const edad = 19;
const ciudad = "Murcia";
const modulo = null;

console.log(`Me llamo ${nombre} ${apellidos},
tengo ${edad} años, soy de ${ciudad} y mi modulo favorito es ${modulo ?? "ninguno"}.`);

console.log(`El tipo de dato nombre es ${typeof nombre}, 
El tipo de dato apellidos es ${typeof apellidos}, 
El tipo de dato edad es ${typeof edad}, 
El tipo de dato ciudad es ${typeof ciudad}, 
El tipo de dato modulo es ${typeof modulo}.`);