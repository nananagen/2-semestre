
public abstract class Pessoa
{
    private String nome, telefone, email;
    
    public Pessoa(){
        
    }
    
    public abstract String toString();
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
}
