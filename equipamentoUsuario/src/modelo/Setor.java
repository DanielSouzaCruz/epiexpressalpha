package modelo;

public class Setor {
        private int codSetor;
        private String nome;
        private Empresa Empresa;

    public Setor() {
    }

    public Setor(int codSetor, String nome, Empresa empresa) {
        this.codSetor = codSetor;
        this.nome = nome;
    }

    public Empresa getEmpresa() {
        return Empresa;
    }
   
    public int getCodSetor() {
        return codSetor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
        
        
}
