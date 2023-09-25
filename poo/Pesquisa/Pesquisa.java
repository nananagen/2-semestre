import java.util.ArrayList;

public class Pesquisa
{
    private ArrayList<Entrevistado> entrevistados;
    private String dataPesquisa;
    
    public Pesquisa(String data){
        this.dataPesquisa = data;
        entrevistados = new ArrayList<>();
    }
    
    //a) maior e menor altura
    public Entrevistado getEntrevistadoMaiorAltura(){
        if (entrevistados.size() > 0){
            Entrevistado maior = entrevistados.get(0);
            for (Entrevistado e : entrevistados){
                if (e.getAltura() > maior.getAltura()){
                    maior = e;
                }
            }
            return maior;
        }
        return null;
    }
    
    public Entrevistado getEntrevistadoMenorAltura(){
        return null;
    }
    
    public ArrayList<Entrevistado> getEntrevistados(){
        return entrevistados;
    }
    
    public void AdicionaEntrevistado(Entrevistado ent){
        if (ent != null){
            entrevistados.add(ent);
        }
    }
    
    public void setDataPesquisa(String dataPesquisa){
        this.dataPesquisa = dataPesquisa;
    }
}
