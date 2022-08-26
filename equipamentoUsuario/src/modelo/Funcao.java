package modelo;

public class Funcao {
    private int codFuncao;
    private String nome;

    public Funcao() {
    }

    public Funcao(int codFuncao, String nome) {
        this.codFuncao = codFuncao;
        this.nome = nome;
    }

    public int getCodFuncao() {
        return codFuncao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
