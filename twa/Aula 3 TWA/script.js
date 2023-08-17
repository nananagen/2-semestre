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

function imprimeClique(){
    console.log('Clicou!');
};
addEventListener('click', imprimeClique); //sem parametros p/ execução