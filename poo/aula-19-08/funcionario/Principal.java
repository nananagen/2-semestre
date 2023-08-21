
public class Principal
{
    public static void main(String args[]){
        System.out.println("###Empresa xpto ###");
        
        Funcionario f= new Funcionario("Zezin", 800, true, false, 8);
        
        f.numeroFilhos = -15;
        
        System.out.println("#Funcionario: "+ f.nome + "Salario : R$" + f.salarioLiquido() );
        
    }
}
