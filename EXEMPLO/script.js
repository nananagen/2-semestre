const form = document.forms[0];
const inputPokemon = form['Pokemon'];
const pokemonText = document.getElementById('nome');
const pokemonImg = document.querySelector('.card img');
const pokemonTupes = document.getElementById('tipos');

form.onsubmit = function (event) {
    event.preventDefault();
    const buscar = inputPokemon.value;
    fetch(`https://pokeapi.../${buscar}/`)
    .then(reponse =>{
        if (reponse.ok) {
            return reponse.json();
        } else(){
            alert('Não foi possível carregar..')
        }
    });
    .then(dados =>{
        pokemonText.innerText = dados.name;
        pokemonImg.setAttribute('src', dados.sprites.front_default);
        pokemonTupes.innerHTML = '';
        dados.types.forEach(tipo =>{
            pokemonTupes.innerHTML += `<li> ${tipo} </li>`
        });
    });
}