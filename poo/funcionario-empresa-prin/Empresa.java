public class Empresa
{
    private String nome;
    private Funcionario[] funcionarios;
    
    public Empresa(){
        nome = "";
        funcionarios = new Funcionario[3];
    }
    public Empresa(String nome){
        this.nome = nome;
        funcionarios = new Funcionario[3];
        //funcionarios[0] = new Funcionario();
        //pegar o nome do primeiro funcionario //um objeto dentro do outro //caminhando ate o nome
        //funcionarios[0].getNome();
    }
    
    public double totalPagamento(){
        double total = 0;
        for (int i = 0; i < funcionarios.length; i++){
            total += funcionarios[i].salarioLiquido();
        }
        return total;
        /*
         * for (Funcionario f: funcionarios){
         *     total += f.salarioLiquido();
         }
         return total;
         */
    }
    
    public Funcionario[] getFuncionarios(){
        return funcionarios;
    }
    public void addFuncionario(int pos, Funcionario func){
        if (pos >= 0 && pos <= (funcionarios.length-1)){
        funcionarios[pos] = func;
        }
    }
    public void removeFuncionario(int pos) {
       if (pos >= 0 && pos <= (funcionarios.length-1)){
        funcionarios[pos] = null;
        } 
    }
    public Funcionario seachFuncionario(String nome){
        for (int i = 0; i < funcionarios.length;i++){
           if (nome.equals( funcionarios[i].getNome() )){
               return funcionarios[i];
           }
        }
        return null;
    } 
    
    //public void setFuncionarios(Funcionario[] vetFunc){
    //funcionarios = vetFunc;
    
        public String getNome (){
        return this.nome;
    }
    
    public void setNome(String nome){
        if (  !nome.toUpperCase().equals("")  ){
            this.nome = nome;
        }
    }
}