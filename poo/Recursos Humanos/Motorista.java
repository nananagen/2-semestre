
public class Motorista extends Funcionario
{
    public final double VALOR_HORA_PADRAO = 35.59;
    private int numeroViagens;
    private int numeroPernoites;
    private double tempoViagem;
    private double auxilioAlimentacao;
    
    public double salario(){
        return (numeroViagens * (VALOR_HORA_PADRAO/2)) +
        (numeroPernoites * 300) + (tempoViagem * VALOR_HORA_PADRAO + auxilioAlimentacao);
    }
    
    public double DecimoTerceiro(){
        return salario() * 1.3;
    }
    
    
}
