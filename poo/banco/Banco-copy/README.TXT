Um Cliente possui diversas contas bancarias,
cada conta ele pode fazer depositos e retiradas.
Mensalmente ele deseja apurar o saldo de todas as contas,
bem como saldo das contas de um determinado banco.
O banco deseja saber o total alocado em suas contas.

Classes:
Banco ->
    - nome;
    - nomeGerencia;
    - Lista de Contas;
    __________________
    - saldoContas();
    
Cliente ->
    - nome;
    - cpf;
    - Lista de Contas;
    __________________
    - saldoContas();

Conta ->
    - Banco;
    - Saldo;
    - numero;
    - Cliente;
    - Agencia;
    __________
    Metodos:
    - Sacar;
    - Depositar;