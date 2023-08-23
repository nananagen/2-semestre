/* int inicio = 1, fim = 5;

Console.WriteLine($"Soma dos pares entre {inicio} e {fim}: {SomaPares(inicio, fim)}.");

int SomaPares(int primeiro, int ultimo, int soma = 0)
{
    int num = primeiro;

    if (num > ultimo)
        return soma;
    
    if (num % 2 == 0)
        soma += num;
    
    return SomaPares(num + 1, ultimo, soma);
} */

//or

/* int inicio = 1, fim = 5;

Console.WriteLine($"Soma dos pares entre {inicio} e {fim}: {SomaPares(inicio, fim)}.");

int SomaPares(int primeiro, int ultimo)
{
    int num = primeiro;

    if (num > ultimo)
        return 0;
    
    if (num % 2 == 0)
        return num + SomaPares(num + 1, ultimo);
    else
        return SomaPares(num + 1, ultimo);
} */

//or

/* int inicio = 1, fim = 5;

Console.WriteLine($"Soma dos pares entre {inicio} e {fim}: {SomaPares(inicio, fim)}.");

int SomaPares(int primeiro, int ultimo)
{
    if (primeiro > ultimo)
        return 0;
    
    if (primeiro % 2 == 0)
        return primeiro + SomaPares(primeiro + 1, ultimo);
    else
        return SomaPares(primeiro + 1, ultimo);
} */


