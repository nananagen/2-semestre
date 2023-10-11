

public class DisciplinaConceito implements IDisciplina
{
    private String nome;
    private Professor professor;
    private ENotaConceito nota;
    
    public boolean isAprovado(){
        return (nota == ENotaConceito.A) ||
        (nota == ENotaConceito.B) ||
        (nota == ENotaConceito.C);
    }
    
    public double mediaFinal(){
        if (nota == ENotaConceito.A){
            return 10;
        }
        if (nota == ENotaConceito.B){
            return 8;
        }
        if (nota == ENotaConceito.C){
            return 7;
        }
        if (nota == ENotaConceito.D){
            return 4;
        }
        if (nota == ENotaConceito.E){
            return 0;
        }
        return 0;
    }
    
    public DisciplinaConceito(String nome, Professor p){
        this.nome = nome;
        this.professor = p;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setProfessor(double p){
        this.nome = nome;
    }
    public Professor getProfessor(){
        return this.professor;
    }
  
    public void setNota(ENotaConceito p){
        this.nota = p;
    }
    public ENotaConceito getNota(){
        return this.nota;
    }

}
