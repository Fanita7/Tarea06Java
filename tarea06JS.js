/*
Crear un programa en Java que realice lo siguiente:
eduardo
odraude
Debe solicitar al usuario por consola una palabra o frase.
Debe mostrar por consola el texto escrito al revés.
*/

let palabra = prompt ("Escribe una palabra").toLocaleLowerCase();

function backwards(){
    let palabraAlReves = palabra.split("").reverse().join("");
    return `la palabra al revés es: ${palabraAlReves} `;
    }

console.log(backwards());