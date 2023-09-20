import java.util.ArrayList;
public class Banco
{
    private String nome;
    private ArrayList<Conta> contas;
    
    public Banco(){
        contas = new ArrayList<>();
    }
    public Banco(String nome){
        this.nome = nome;
        contas = new ArrayList<>();
    }
    
    public Cliente getClientemaiorSaldo(){
        if (contas.size() == 0){
            return null;
        }
        Cliente clienteMaior = contas.get(0).getCliente();
        for (Conta c : contas){
            if (c.getCliente().saldoContas() > clienteMaior.saldoContas() ){
                clienteMaior = c.getCliente();
            }
        }
        return clienteMaior;
    }
    
    public double saldoContas(){
        return 0;
    }
    
    public String getNome(){
        return nome;    
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public ArrayList<Conta> getContas(){
        return contas;
    }
    
    public void addConta(Conta c){
        contas.add(c);
    }
    
    public double saldoDasContas(){
        double soma = 0;
        for(Conta c: contas)
        {
            soma += c.getSaldo();
        }
        return soma;
    }
}
