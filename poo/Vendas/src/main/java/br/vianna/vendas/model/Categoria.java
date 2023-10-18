package br.vianna.vendas.model;

public class Categoria {
    private String nome;
    private boolean temIsencao;

    public String getNome() {
        return nome;
    }

    public Categoria(boolean temIsencao) {
        this.temIsencao = temIsencao;
    }

    public Categoria(String nome) {
        this.nome = nome;
    }

    public Categoria() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isTemIsencao() {
        return temIsencao;
    }

    public void setTemIsencao(boolean temIsencao) {
        this.temIsencao = temIsencao;
    }
}
