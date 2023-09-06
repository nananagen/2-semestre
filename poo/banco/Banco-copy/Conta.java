public class Conta 
{
     private String numero, agencia;
     protected double saldo;
     private Banco banco;
     private Cliente cliente;
     
     public Conta(){
     }
     
     public Conta (String numero){
         this.numero = numero;
     }
     //public Conta (String agencia){
     //    this.agencia = agencia;
     //}
     public Conta (String numero,String agencia){
         this.numero = numero;
         this.agencia = agencia;
     }
     
     public void depositar (double valor){
         if (valor >= 0){
             saldo += valor;
        }
     }
     
     public void sacar (double valor){
         if (valor >= 0 && valor <= saldo){
             saldo -= valor;
        }
     }
     
     public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
     public String getAgencia(){
        return agencia;
    }
    
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    
     public double getSaldo(){
        return saldo;
    }
    
     public Banco getBanco(){
        return banco;
    }
    
    public void setBanco(String Banco){
        this.banco = banco;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(String Cliente){
        this.cliente = cliente;
    }
    
    
}