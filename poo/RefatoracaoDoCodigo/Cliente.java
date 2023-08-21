import java.util.Date;

public class Cliente extends DepPessoal
{
    Veiculo veiculo = new Veiculo();

    public Cliente(String nome, String sobrenome, Date datanasc, String docCnh)
    {
        super(nome, sobrenome,datanasc,docCnh);
    }


}