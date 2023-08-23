int inicio = 1, fim = 5;

Console.WriteLine($"Soma dos pares entre {inicio} e {fim}: {SomaPares(inicio, fim)}.");

int SomaPares(int primeiro, int ultimo, int soma = 0)
{
    int num = primeiro;

    if (num > ultimo)
        return soma;
    
    if (num % 2 == 0)
        soma += num;
    
    return SomaPares(num + 1, ultimo, soma);
}
