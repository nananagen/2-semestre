public class Conta 
{
     private String numero, agencia;
     private double saldo;
     private Banco banco;
     private Cliente cliente;
     private Conta(){
         
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
}