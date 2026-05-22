// 1. Datos del inventario (Array de Objetos)
const productos = [
    {nombre: "Raton", precio: 25, enStock: true},
    {nombre: "Teclado", precio: 60, enStock: true}
];

// 2. Selectores del DOM (Nuestros "enchufes")
const boton = document.querySelector("#btnOfertas");
const lista = document.querySelector("#listaProductos");

// 3. Evento que escucha el click en el botón
boton.addEventListener("click", () => {
    // Vaciamos la lista antes de pintar para no duplicar datos
    lista.innerHTML = "";
    
    // Filtramos los productos por precio y stock
    const filtrados = productos.filter(prod => prod.precio < 50 && prod.enStock === true);
    
    // Recorremos los productos que han pasado el filtro y los pintamos en el HTML
    filtrados.forEach(prod => { 
        const li = document.createElement("li");
        li.textContent = `${prod.nombre} - ${prod.precio}€`;
        lista.appendChild(li);
    });
});