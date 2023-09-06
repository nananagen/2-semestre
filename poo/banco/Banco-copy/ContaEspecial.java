public class ContaEspecial extends Conta
{
    private double limiteCredito;
    
    public void sacar (double valor){
         if (valor >= 0 && valor <= (getSaldo()+limiteCredito)){
             saldo -= valor;
        }
        //extends = herança de dados 
    }
    
    private double getlimiteCredito(){
        return limiteCredito;
    }
    private void setlimiteCredito (double limiteCredito){
        this.limiteCredito = limiteCredito;
    }
}