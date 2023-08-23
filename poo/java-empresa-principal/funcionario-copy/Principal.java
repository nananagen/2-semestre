import java.util.Scanner;

public class Principal
{
    public static void main(String args[]){
        /* System.out.println("###Empresa xpto ###");
        
        Funcionario f= new Funcionario("Zezin", 800, true, false, 8);
        
        f.setNome("Pedrin") ;
        
        //f.numeroFilhos = -15;
        
        System.out.println("#Funcionario: "+ f.getNome() + "Salario : R$" + f.salarioLiquido() );
        */
       
       //set para operar
       //get para exibir
       //scanner, classe para leitura (informar o import) 
       //'next' le o que o usuario digitou ata o 1º espaço
       
       Scanner leia = new Scanner(System.in);
       
       System.out.println("###Empresa###");
        
       Empresa emp = new Empresa( leia.next() );
       System.out.println("# informe o nome da empresa:");
       
       System.out.println("# empresa:: "+emp.getNome());
       
       //ler funcionarios
       
       while (true){
           Funcionario f = new Funcionario();
           
           System.out.println("## nome do funcionario?");
           f.setNome( leia.next() );
           
           System.out.println("## Salario Bruto?");
           f.setSalarioBruto( leia.nextDouble() );
           
           System.out.println("## numero de filhos?");
           f.setNumeroFilho( leia.nextInt() );
           
           System.out.println("## Usa Vale Transporte? (True ou False)");
           f.setUsaValeTransporte( leia.nextBoolean() );
           
           System.out.println("## Eh gerente? (S/N)");
           f.setUsaValeTransporte( leia.next().equalsIgnoreCase("S") ); //ler sim/nao como true ou false
           
           System.out.println("## Nome "+f.getNome() 
               +" Salario R$"+f.salarioLiquido() );
               
            System.out.println("deseja cadastrar outro?(s/n)");
           if ( leia.next().equalsIgnoreCase("N") ){ /*consultando se for == */
               break;
           } 
       }
       
       
       
    }
}
