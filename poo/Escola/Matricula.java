import java.util.ArrayList;
public class Matricula
{
    private ArrayList<IDisciplina> materias;
    private int ano;
    
    public Matricula(){
        materias = new ArrayList<>();
    }
    
    
    public boolean estaAprovado(){
        for(IDisciplina d : materias){
            if(!d.isAprovado()){
                return false;
            }
        }
        return true;
    }
    
    public double mediaGeral(){
        double ng = 0;
        for(IDisciplina d : materias){
            ng += d.mediaFinal();
        }
        return ng/materias.size();
    }
    
    public ArrayList<IDisciplina> getMaterias(){
        return materias;
    }
    public void matricular(IDisciplina d){
        materias.add(d);
    }
    
}
