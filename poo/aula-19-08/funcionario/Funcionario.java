public class Funcionario
{
    //atributos
    private String nome;
    private double salarioBruto;
    private boolean usaValeTransporte, ehGerente;
    private int numeroFilhos;
    
    //Construtor
    Funcionario(String vNome,double vSalBruto,
    boolean vVale, boolean vGerente, int vNumFilhos){
        nome = vNome;
        salarioBruto = vSalBruto;
        usaValeTransporte = vVale;
        ehGerente = vGerente;
        numeroFilhos = vNumFilhos;
    }
    //Metodos de Acesso
    public String getNome(){
        return nome;
        //pode-se ou nao usar o this, nesse caso
    }
    public void setNome(String nome){
        if ( !nome.equals("") ) {
            this.nome = nome;
        }
        //ou muda o nome, vnome. this procura variavel no sistema
    }
    
    // Metodos da Classe
    
    double inss(){
        return salarioBruto * 0.13;
    }
    double descontoVale(){
        return (usaValeTransporte)?(salarioBruto*0.03):0;
    }
    double bonusPorFilho(){
        return (numeroFilhos >= 0 && numeroFilhos <=3)?(numeroFilhos * 115):3 * 115;
    }
    double bonusGerencia(){
        return (ehGerente)?(salarioBruto*0.1):0;
    }
    
    double salarioLiquido(){        
        return salarioBruto - inss() - descontoVale() +
            bonusPorFilho() + bonusGerencia();
    }
}
