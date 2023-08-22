function areaQuadrado (lado){
    return lado * lado;
}

areaQuadrado(4) //16
areaQuadrado(5) //25
areaQuadrado(2) //4

function imprimeAreaQuadrado (lado){
    console.log (lado*lado);
}
function imprimeAreaQuadrado(base,altura){
    var area = base * altura;
    console.log(`A area do retangulo com base: ${base} e altura: ${altura} é ${area}`);
}
imprimeAreaQuadrado(3,4);

// var areaQuadrado2 = areaQuadrado; //referencia a função
var areaQuadrado2 = areaQuadrado(1); //executa o parenteses 
console.log(areaQuadrado2);

var areaQuadrado2 = areaQuadrado;
console.log(areaQuadrado2(4)); //pansando por aqui

/*
    addEventListener('click', function() {
    console.log('Clicou!');
}); 
*/

function imprimeClique(){ //imprinmindo cliques
    console.log('Clicou!');
};
addEventListener('click', imprimeClique); //sem parametros p/ execução

var cont = 0; //contando os cliques
var imprimeClique = function(){
    console.log((`Clicou ${++cont}`));
}
addEventListener('click', imprimeClique);

/* var cont = 0; //alternativa 1
addEventListener('click', imprimeClique = function(){
    console.log((`Clicou ${++cont}`));
});

var cont = 0; //alternativa 2
addEventListener('click', function(){
    console.log(`Clicou ${++cont}`);
}); */

function imc (peso, altura) {
    const imc = peso / (altura ** 2);
    return undefined;
}
var resultado = imc(80, 1.80);
console.log(resultado);

/* function teste(parametro){
    console.log(parametro);
}

var teste2 = function(params){
    console.log(params);
}

//var teste3 = teste2;

console.log(teste2);

var teste3 = (params) => {
    console.log(params);
} */


/* var imc = (peso, altura) => {
    return peso / (altura ** 2);
}

imc(80, 1.0);
console.log(imc(80, 1.80)); */

/* var nota = 10;
var media = 7;
var frequencia = 0.75;

function aprovado(nota, frequencia){
    if (nota >= media){
        if (frequencia >= frequencia){
            return true;
        }
        return true;
    }
    return false;

} 

console.log(aprovado(7, 0.8)); */

/* var profissao = 'Desenvolvedor';

function dados() {  
    var nome = 'Joãozinho';  
    var idade = 28;
    var outrosDados = function() {
        var endereco = 'Rio de Janeiro';
        var idade = 29;
        return `${nome}, ${idade}, ${endereco}, ${profissao}`;
    }
    return outrosDados();
}
*/

/*
function imc(peso, altura) {
    const imc = peso / (altura ** 2);  
    console.log(imc);
}

imc(80, 1.80); // imc aparece no console , funcao está feita primeiro.
*/ 
//exercicios aula 22/08 (topico 3)

/* function verificarValor(valor) {
    if (!valor) {
        return true;
    }
}

function perimetroQuadrado(lado) {
    var perimetro = lado * 4;
    return perimetro;
}

function retornaNomeCompleto(nome, sobrenome) {
    return `${nome} ${sobrenome}`;
    
}

function oNumeroEhPar(numero) {
    if (numero / 2 == 0) {
        console.log(`numero par`);
    }
}

function type(argums) {
    return (typeof argums);
} */

addEventListener('scroll', ()=>{
    var nomeCompleto = 'laura nagen';
    console.log(nomeCompleto);
    
});

//metodos:

var quadrado = {  
    lados: 4,
    area: function(lado) {
        return lado * lado;
    },
    perimetro: function(lado) {
        return this.lados * lado;
    }
}

quadrado.lados; // 4
quadrado.area(5); // 25
quadrado.perimetro(5); // 20
