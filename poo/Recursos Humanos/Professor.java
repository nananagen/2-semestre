
public class Professor extends Funcionario implements ISindicato
{
    private int numeroAulas;
    
    public double salario(){
        return (numeroAulas * 8.00) + bonusEscolaridade();
    }
    
    public double DecimoTerceiro(){
        return salario() * (2 - bonusEscolaridade());
    }
    
    public double ferias(){
        return super.ferias() * 1.5; 
        //(super)usando o metodo padrao ferias do codigo pai
    }
    
    public double bonusEscolaridade(){
        if (getEscolaridade() == EEscolaridade.MESTRADO){
            return 1.10;
        }else if(getEspecialidade() == EEscolaridade.DOUTORADO){
            return 1.12;
        }
        return 1;
    }
    public double contribuicaoSindical();
}
