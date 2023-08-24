/*
var lala = {
    nome : 'Lala',
    nota : 8.0,
    matricula : 121321,
    frequencia : 0.9,
    aprovado() {
        if ((this.nota >= 6) && (this.frequencia >= 0.7)){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
};

var laura = {
    nome : 'Laura',
    nota : 8.0,
    matricula : 121321,
    frequencia : 0.9,
    aprovado() {
        if ((this.nota >= 6) && (this.frequencia >= 0.7)){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
};

//console.log(`A Aluno ${aluno.nome} tem a nota : ${aluno.nota} e foi ${aluno.aprovado}`);

//aluno.telefone = "(32)4344-5435";

var alunos= [lala, 'laura']; //tanto faz o tipo do elemento nesse array

console.log(alunos[0]); //[0] = Lala, [1] = Laura

var juca = {
    nome : 'juca',
    nota : 8.0,
    matricula : 34535,
    frequencia : 0.9,
    aprovado() {
        if ((this.nota >= 6) && (this.frequencia >= 0.7)){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
};

console.log(alunos);

alunos.push(juca); //insere no final do array

console.log(alunos);

alunos.pop(juca); //retira do array

console.log(alunos.pop());

for (let i = 0; i < alunos.length ; i++) {
    console.log(alunos[i].nome);
}
*/

// Crie o objeto Mariana, que tem o atributo numero e o metodo conta
// O metodo conta deve contar até o valor de numero e exibir a letra
// da música

// https://www.galinhapintadinha.com.br/musicas/letras/dvd-galinha-pintadinha-vol-1/mariana/

var mariana = {
    numero: 10,
    conta(){
        for (let i = 1; i < numero.length; i++) {
            console.log(`Mariana conta ${i}`);
            console.log(`Mariana conta ${i}: é`[0]`é`[1]`é`);
        }
        console.log(`Ana, viva a Mariana, viva a Mariana`);
    }
}  
console.log(mariana);
