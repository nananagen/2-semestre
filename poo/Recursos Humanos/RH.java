
public class RH
{
    private String nome;
    //lista de funcionarios
    
    public RH(){
        this("");
    }
    public RH(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
