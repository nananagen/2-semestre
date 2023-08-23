
    public class Funcionario
{
    //atributos
    private String nome;
    private double salarioBruto;
    private boolean usaValeTransporte, ehGerente;
    private int numeroFilhos;
    
    //Construtor
    public Funcionario(){}
    
    /* O que estava em Funcionario antes?
     * String vNome,double vSalBruto,
    boolean vVale, boolean vGerente, int vNumFilhos){
        nome = vNome;
        salarioBruto = vSalBruto;
        usaValeTransporte = vVale;
        ehGerente = vGerente;
        numeroFilhos = vNumFilhos; */
        
    //Metodos de Acesso
    public String getNome(){
        return nome;
        //pode-se ou nao usar o this, nesse caso
    }
    public void setNome(String nome){
        if ( !nome.toUpperCase().equals("") ) {
            this.nome = nome;
        }
        //ou muda o nome, vnome. this procura variavel no sistema
    }
    
    public int getNumeroFiho (){
        return this.numeroFilhos;
    }
    public void setNumeroFilho(int numeroFilhos){
        if (numeroFilhos >= 0){
            this.numeroFilhos = numeroFilhos;
        }
    }
    public double getSalarioBruto (){
        return this.salarioBruto;
    }
    public void setSalarioBruto(double salarioBruto){
        if (salarioBruto >= 0){
            this.salarioBruto = salarioBruto;
        }
    }
    public boolean usaValeTransporte (){
        return this.usaValeTransporte;
    }
    public void setUsaValeTransporte(boolean usaValeTransporte){
        if (salarioBruto >= 0){
            this.usaValeTransporte = usaValeTransporte;
        }
    }
    public boolean getEhGerente (){
        return this.usaValeTransporte;
    }
    public void setEhGerente(boolean ehGerente){
        if (salarioBruto >= 0){
            this.ehGerente = ehGerente;
        }
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
