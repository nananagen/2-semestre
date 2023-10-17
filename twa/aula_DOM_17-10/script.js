/*const botao = document.getElementById("botao");
let contador = 0;
const resultado = document.createElement('h1');
botao.after(resultado);
resultado.innerText = `contador : ${contador}`;

botao.addEventListener('click'),() =>{
    contador++;
    resultado.innerText = `contador : ${contador}`
};

const juquinha = new Aluno("juquinha", "1234");

const texto = "isso é um texto";

console.log(texto.charAt(5));
*/

//Orientação a objetos. Classes:
function Aluno(nome, matricula){
    this.nome = nome;
    this.matricula = matricula;
}
Aluno.prototype.digaOi = function () {
    console.log(`oi eu sou o ${this.nome}`);
}

function Bolsista(nome, matricula, projeto) {
    Aluno.call(this.nome.matricula);
    this.projeto = projeto;
    this.nome = nome;
    this.matricula = matricula;
}

Bolsista.prototype = Object.create(Aluno.prototype);

const maria = new Bolsista("Maria", 1234,"IA");

maria.digaOi();

console.log(maria);
