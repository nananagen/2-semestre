const form = document.forms[0];
const inputCEP  = form["cep"];
const respLogradouro = document.getElementById("logradouro");
const bntJoke = document.getElementById("joke");
const txtJoke = document.getElementById("joke-text")

bntJoke.onclick = async function (event) {
    const response = await fetch('https://api.chucknorris.io/jokes/random')
    if(response.ok){
        const piada = await response.json();
        txtJoke.innerText = piada.value;
}};

form.addEventListener('submit',async (event)=>{
    event.preventDefault();
    const cep = inputCEP.value;
    try {
        let dados;
        const response = await fetch(`https://brasilapi.com.br/api/cep/v2/${cep}`)
            if (response.status == 200){
                dados = await response.json();
            }if (response.status == 404){
                dados =  "CEP não encontrado";
            }
            else{
                dados = "CEP inválido";
            }    
            const resposta = dados.street?`Logradouro: ${dados.street}`:dados;
            respLogradouro.innerText = resposta;
    } catch (error) {
        console.log(error);
    }
});