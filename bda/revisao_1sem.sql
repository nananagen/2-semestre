create database hospital;
use hospital;
create table paciente (
	cpf decimal (11),
    rg numeric (11),
    nome varchar (80),
    rua varchar (50),
    bairro varchar (30),
    cidade varchar (20),
    cep char (10),
    datanasc date
);

 /*alter + alter = define padrão */
alter table paciente alter cidade set default 'juiz de fora';

/*alter + add */
alter table aciente add genero char(1);

/*alter + change = pd mudar nome e/ou tipo*/
alter table paciente change rua enrenco varchar (50);

/*alter + modify = mudo apenas tipo*/
alter table paciente modify nome varchar (100);




desc paciente;
