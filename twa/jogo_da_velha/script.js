const casas = document.querySelectorAll('.casa')
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

});