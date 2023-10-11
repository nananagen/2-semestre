
public class Professor extends Pessoa
{
    private double salario;
    
    @Override
    public String toString(){
        String msg = "###### PROFESSOR ######"+
                    "# Nome....: " +getNome()+"\n"+
                    "# Email...: " +getEmail()+"\n"+
                    "# Telefone: " +getTelefone()+"\n"+
                    "# Salario.: " +salario+"\n"+
                    "# Total Diciplinas: XXXX\n";
        return msg;
    }
    public void setSalario(double salario){
        
    }
}
