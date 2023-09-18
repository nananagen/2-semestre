//Coesao - alta(Quantidade de coisas que um metodo faz)
//
public class ContaEspecial extends Conta
{
     private double limiteCredito;
     
     @Override
     public void sacar(double valor)
     {
         if (valor >= 0 && valor <= (getSaldo()+limiteCredito))
         {
             saldo -= valor;
         }
     }
     
     public double getLimiteCredito(){
         return limiteCredito;
     }
     
     public void setLimiteCredito(double limite){
         limiteCredito = limite;
     }
}
