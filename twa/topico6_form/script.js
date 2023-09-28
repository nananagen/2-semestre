const botaoAdd = document.getElementById('add');
const telefones = document.getElementById('telefones');
const campoTelefone = document.querySelector('.campoTelefone');
botaoAdd.addEventListener('click', event => {
    const novoCampo = campoTelefone.cloneNode(true);
    telefones.insertBefore(novoCampo, botaoAdd);
});

/* const botaoAdd = document.getElementById('add');
const telefones = document.getElementById('telefones');

botaoAdd.addEventListener('click', event => {
    const novoTelefone = document.createElement('input');
    novoTelefone.setAttribute('type', 'text');
    telefones.insertBefore(novoTelefone, botaoAdd);
    novoTelefone.outerHTML += '<br>';
});
*/
