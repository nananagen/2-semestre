
public class Disciplina implements IDisciplina
{
    private String nome;
    private Professor professor;
    private Double nota1, nota2;
    
    public boolean isAprovado(){
        return mediaFinal() >= 7;
    }
    
    public double mediaFinal(){
        return ((nota1 + nota2)/2);
    }
    
    public Disciplina(String nome, Professor p){
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
  
    public void setNota1(double n1){
        this.nota1 = n1;
    }
    public double getNota1(){
        return this.nota1;
    }
    
    public void setNota2(double n2){
        this.nota2 = n2;
    }
    public double getNota2(){
        return this.nota2;
    }
}
