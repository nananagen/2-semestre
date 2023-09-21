let paragrafo = document.getElementsByTagName('p');
console.log(paragrafo.className);
//classList e className
let pImpar = document.getElementsByClassName('impar');
let divPrincipal = document.getElementsByTagName('div')

let selParagrafos = document.querySelector('#primeiro');
let todosParagrafos = document.querySelectorAll('p');
let selImpar = document.querySelectorAll('.impar');


const corpo= document.querySelector('body'); //fora referencia todas as funções
const botao = document.getElementById('botao');

function modoEscuro() {
    //const corpo= document.querySelector('body'); 
    //dentro p referenciar esta função

    if (botao.innerText == 'Modo Claro') {
        corpo.classList.remove('escuro');
        botao.innerText = "Modo Escuro";
    } else {
        corpo.classList.add('escuro');
        botao.innerText = "Modo Claro";
    }
}

function alterarModo() {
    const textosVermelhos= document.querySelectorAll('.texto-vermelho');

    if (textosVermelhos.length > 0) {
        textosVermelhos.forEach( texto => {
            texto.classList.replace('texto-vermelho', 'texto-azul');
        });
    }else {
        const textosAzuis = document.querySelectorAll('.texto-azul')

        textosAzuis.forEach( texto => {
            texto.classList.replace('texto-azul', 'texto-vermelho');
        });
    }
    
    corpo.classList.toggle('escuro');
}

let link = document.getElementById("LinkGoogle");
link.setAttribute('nomeAtributo', 'Novo Valor');



//console.log(link.getAttributes('href'));
//console.log(link.attributes(1));