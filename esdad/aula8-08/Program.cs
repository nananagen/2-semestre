internal class Program
{
    /* private static void Main(string[] args)
     {
         int idade = 20;
         Alterar(ref idade);
         Console.WriteLine(idade);

 }
 //com ref = 40 | sem ref = 20
         static void Alterar (ref int numero){
             numero = numero * 2;
         }*/

    /*private static void Main(string[] args)
    {
        int n1 = 1, n2= 10, n3=200;
        Console.WriteLine("{1} , {0} , {2}", n1, n2, n3);

    }
    //com ref = 40 | sem ref = 20
    static void ImprimeLinha (string texto, int valor1, int valor2, int valor3)
    {
        texto = texto.Replace("{0}", valor1.ToString());
        texto = texto.Replace("{0}", valor2.ToString());
        texto = texto.Replace("{0}", valor3.ToString());

        Console.WriteLine(texto);
    }*/

    /*private static void Main(string[] args)
    {
        int n1 = 1, n2= 10, n3=200;

        Console.WriteLine("{1} , {0} , {2}", n1, n2, n3);

    }
    static void ImprimeLinha (string texto, params int[] valores)
    {
        for (int i = 0; i < valores.Length; i++){
             texto = texto.Replace("{" + i + "}", valores[i].ToString());
        }

        Console.WriteLine(texto);
    }*/

    /*private static void Main(string[] args)
    {
        int n1 = 1, n2= 10;
        string n3 = "Duzentos";

        ImprimeLinha("{1} , {0} , {2}", n1, n2, n3);
        //                                   0 , 1 , 3
    }
    static void ImprimeLinha (string texto, params object[] valores)
    {
        for (int i = 0; i < valores.Length; i++){
             texto = texto.Replace("{" + i + "}", valores[i].ToString());
        }

        Console.WriteLine(texto);
    }*/

    private static void Main(string[] args)
    {
        var p = new Produto();
        p.Codigo = 100;
        Alterar(p);
        Console.WriteLine(p.Codigo);
    }
    static void Alterar(Produto prod)
    {
        //prod.Codigo = prod.Codigo * 2;
        prod = new Produto();
        prod.Codigo = 1;
    }
    class Produto
    {
        private int _codigo;

        public int Codigo
        {
            get { return _codigo; }
            set {_codigo = value; }
        }
    }

}