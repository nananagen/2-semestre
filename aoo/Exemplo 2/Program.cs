internal class Program
{
    static void Main(string[] args){
    /* Func<int, int, int> SomaNumeros = (int a, int b) => a + b;
        Func<int, int, int> SomaNumeros = (int a, int b, int c) => a + b + c; */
        
    Console.WriteLine (Somar(1,2));
    Console.WriteLine(Somar(1,2,3));
    }

     //sobrecarga
     static int Somar (int a, int b)
     {
        return a + b;
     }
     static int Somar (int a, int b, int c)
     {
         return a + b + c;
     }
}
