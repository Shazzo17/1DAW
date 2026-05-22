const variables = {
numeroEntero: 42,
numeroDecimal: 3.14,
booleanoVerdadero: true,
booleanoFalso: false,
valorNulo: null,
valorSinDefinir: undefined
};

const { numeroEntero, numeroDecimal, booleanoVerdadero, booleanoFalso, valorNulo, valorSinDefinir } = variables;

console.log (`${numeroEntero} ${typeof numeroEntero}
${numeroDecimal} ${typeof numeroDecimal}
${booleanoVerdadero} ${typeof booleanoVerdadero}
${booleanoFalso} ${typeof booleanoFalso}
${valorNulo} ${typeof valorNulo}
${valorSinDefinir} ${typeof valorSinDefinir}
${Number.isNaN(Number("hola"))}
${Number.isNaN(0/0)}
${Number.isNaN(parseInt("abc"))}
${Number.isNaN(42)}`);

console.table(variables);