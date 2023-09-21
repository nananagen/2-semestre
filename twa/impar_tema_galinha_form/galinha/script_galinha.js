let imagens =
['../assets/images/bao.webp',
'../assets/images/esquisito.jpg',
'../assets/images/familia.webp',
'../assets/images/ruim.jpg'];

let atual = 0;

const slide = document.getElementById('slide');
slide.setAttribute('src', imagens[atual]); //insere a primeira image da lista(array)

const linkAvancar = document.getElementById('linkAvancar');
const linkVoltar = document.getElementById('linkVoltar');

linkAvancar.addEventListener('click', (event) =>{
    event.preventDefault();
    atual++;
    if (atual == imagens.length){ atual = 0; }
    slide.setAttribute('src', imagens[atual]); 
});

linkVoltar.addEventListener('click', (event) =>{
    event.preventDefault();
    atual--;
    if (atual == -1){ atual = imagens.length-1; }
    slide.setAttribute('src', imagens[atual]); 
});

slide.addEventListener('click', avancar);
slide.addEventListener('dblclick', voltar);

const nome = document.getElementById('name');
const senha = document.getElementById('senha');
const cadastro = document.getElementById('cadastro');

cadastro.addEventListener('submit', event =>{
    event.preventDefault();
    const senhaAlert = senha.value;
    if (senhaAlert.length < 6 ) {
        alert(`${nome} a senha deve ter 6 dígitos.`)
    }else{
        cadastro.submit();
    }
});

