/*const casas = document.querySelectorAll('.casa')
let atual = 'X'

casas.forEach( casa =>{

    casa.addEventListener('click', event =>{

        if (event.target.innerText == '') {
            event.target.innerText = atual;
        if (atual == 'X'){
            atual = 'O';
        }else{
            atual = 'X';
        }
        }

    });

}); */

const casas = document.querySelectorAll('.casa');
let atual = 'X';
let contador = 0;

casas.forEach( casa =>{
    casa.addEventListener('click', event =>{
        if(event.target.innerText == ''){
            event.target.innerText = atual;
            contador++;
            atual = (atual == 'X')?'0':'X';
            const ganhador = verificarVitoria();
            if (ganhador) {
                alert(`o jogador ${ganhador} venceu!`);
            }else if(contador == 9){
                alert(`o jogo empatou!`);
            }
        }
    });

});

function verificarVitoria() {
    //verificar linhas

    if ((casas[0].innerText) && 
    (casas[0].innerText == casas[1].innerText) &&
    (casas[1].innerText == casas[2].innerText)) {
        return casas[0].innerText;
    }

    if ((casas[3].innerText) && 
    (casas[3].innerText == casas[4].innerText) &&
    (casas[4].innerText == casas[5].innerText)) {
        return casas[3].innerText;
    }

    if ((casas[6].innerText) && 
    (casas[6].innerText == casas[7].innerText) &&
    (casas[7].innerText == casas[8].innerText)) {
        return casas[6].innerText;
    }

    //verificar colunas

    if ((casas[0].innerText) && 
    (casas[0].innerText == casas[3].innerText) &&
    (casas[3].innerText == casas[6].innerText)) {
        return casas[0].innerText;
    }

    if ((casas[0].innerText) && 
    (casas[0].innerText == casas[1].innerText) &&
    (casas[1].innerText == casas[2].innerText)) {
        return casas[3].innerText;
    }

    if ((casas[0].innerText) && 
    (casas[0].innerText == casas[1].innerText) &&
    (casas[1].innerText == casas[2].innerText)) {
        return casas[3].innerText;
    }

    //verificar diagonais

    if ((casas[0].innerText) && 
    (casas[0].innerText == casas[5].innerText) &&
    (casas[4].innerText == casas[8].innerText)) {
        return casas[0].innerText;
    }

    if ((casas[2].innerText) && 
    (casas[2].innerText == casas[6].innerText) &&
    (casas[4].innerText == casas[2].innerText)) {
        return casas[2].innerText;
    }

}