// 1. Agrupamos los datos en un solo Objeto
const alumno = {
    nombre: "Miguel Angel",
    apellidos: "Saez Martinez",
    edad: 19,
    ciudad: "Murcia",
    modulo: null ?? "Ninguno"
};

// 2. Extraemos las variables del objeto (Destructuring) para usarlas fácil en el texto
const { nombre, apellidos, edad, ciudad, modulo } = alumno;

// 3. Imprimimos el texto (esto se queda igual de bien que lo tenías)
console.log(`Me llamo ${nombre} ${apellidos},
tengo ${edad} años, soy de ${ciudad} y mi modulo favorito es ${modulo ?? "ninguno"}.`);

// 4. Buena práctica de DevTools: Ver la estructura del objeto en una tabla
console.table(alumno);