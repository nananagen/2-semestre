
public abstract class Funcionario
{
   private String nome;
   private EEscolaridade escolaridade;
   
   public Funcionario(){
       this("");
   }
   public Funcionario(String nome){
       this.nome = nome;
   }

   public abstract double salario();
   public abstract double DecimoTerceiro();
   public abstract double contribuicaoSindical();
   public double ferias(){
       return salario()/3;
   }
   
   public void setNome(String nome){
       this.nome= nome;
   }
   
   public String getNome(){
       return nome;
   }
   
   public void EEscolaridade (){
        this.escolaridade = escolaridade;
   }
   public String EEscolaridade(){
       return escolaridade;
   }
   
}
