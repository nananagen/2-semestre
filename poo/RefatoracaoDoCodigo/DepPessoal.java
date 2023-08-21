import java.util.Date;

public class DepPessoal
{
    private String nome;
    private String sobrenome;
    private Date datanasc;
    private String docCnh;

    public DepPessoal()
    {

    }

    public DepPessoal(String nome, String sobrenome, Date datanasc, String docCnh)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.datanasc = datanasc;
        this.docCnh = docCnh;
    }

}