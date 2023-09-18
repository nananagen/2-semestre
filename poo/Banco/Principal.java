import java.util.Scanner;
import java.util.ArrayList;

public class Principal
{
    private static Scanner leExt = new Scanner(System.in);
    
    public static void main(String args[])
    {
        Scanner le = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<> ();
        Banco bco = new Banco("Banco do Brasil");
        System.out.println("##### GERBAN "+bco.getNome().toUpperCase()+" #####");
        
        while(true)
        {
            int escolha = montaMenu(le);
            
            if(escolha == 5)
            {
                break;
            }
            else if (escolha == 1)
            {
                clientes.add(novoCliente());
            }
            else if (escolha == 2)
            {
                bco.addConta( criaConta( bco ) );
            }
        }
        System.out.println(" Ate Logo"+clientes.size());
    }
    
    public static int montaMenu(Scanner x)
    {
            System.out.println("## 1) Cadastrar Cliente");
            System.out.println("## 2) Criar conta");
            System.out.println("## 3) Operaçoes");
            System.out.println("## 4) Relatorios");
            System.out.println("## 5) Sair");
            int i = x.nextInt();x.nextLine();
            return i;
    }
    
    public static Cliente novoCliente()
    {
        Scanner le = new Scanner(System.in);
        Cliente c = new Cliente();
        System.out.println("#### informe o nome do cliente: ");
        c.setNome( le.nextLine());
        System.out.println("#### informe o cpf do cliente: ");
        c.setCpf( le.nextLine());
        return c;
    }
    
    public static Cliente escolhaCliente (ArrayList<Cliente> clientes){
        int i = 1;
        for (Cliente c: clientes){
            System.out.println("## "+(i++)+") "+c.getNome() );
        }
        int escolha = leExt.nextInt();
        
        return clientes.get (escolha -1 );
    }
    
    public static Conta criaConta(Banco bco)
    {
        System.out.println("## Escolha o tipo de conta: (C)onta, (P) ou Conta (E)special ");
        String resp = leExt.next();
        Conta c;
        if (resp.equalsIgnoreCase("C"))
        {
            c = new Conta();
        }
        else if (resp.equalsIgnoreCase("P"))
        {
            c = new Poupança();
        }
        else 
        {
            c = new ContaEspecial();
        }
        System.out.println("#### informe o numero da conta");
        c.setNumero(leExt.next() );
        System.out.println("#### informe o numero da agencia");
        c.setAgencia(leExt.next() );
        c.setBanco( bco );
        
        if(c instanceof ContaEspecial){
            System.out.println("");
            ((ContaEspecial)c).setLimiteCredito(leExt.nextDouble());
    }
        System.out.println("### Clientes ja cadastrados, escolha 1:");
        Cliente cli = escolhaCliente(clientes);
        c.setCliente( cli );
        cli.addConta( c );
        
        return c;
    }
    
    public static void imprimeDados(Banco bco, ArrayList<Cliente> clientes){
        System.out.println("## Relatorio");
        System.out.println("## numero de Clientes :"+clientes.size());
        System.out.println("## numero de contas :"+bco.getContas().size());
        System.out.println("## Saldo Contas Banco : "+bco.saldoContas());
        System.out.println("## Nome do primeiro Cliente do Banco : "
        +bco.getContas().get(0).getCliente().getNome());
        System.out.println("## Clientes : ");
        for (Cliente c: clientes){
            System.out.println("##### "+c.getNome() +" R$ "+c.saldoContas()+
            " numero de Contas : "+c.getMinhasContas().size() );
            for (Conta cc: c.getMinhasContas()){
                System.out.println("##### Conta "+cc.getNumero() +"("+
                cc.getClass()+" )");
            }
        } 
        System.out.println("## Nome do Cliente com maior Saldo : ");
    }
}
