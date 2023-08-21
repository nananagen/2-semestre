import java.util.Date;

public class Funcionario extends DepPessoal
{
    private double salario;

    public Funcionario(String nome, String sobrenome, Date datanasc, String docCnh)
    {
        super(nome, sobrenome,datanasc,docCnh);
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }
    public double getSalario()
    {
        return salario;
    }

}