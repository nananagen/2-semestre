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


