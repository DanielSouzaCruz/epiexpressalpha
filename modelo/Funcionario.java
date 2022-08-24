//primeira version por daniel
package modelo;

public class Funcionario {
  private int id;
    private String nome;
    private String cpf;
    private int idSetor;
    private int idFuncao;
    private Empresa empresa;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, String cpf, int idSetor,int idFuncao, Empresa empresa) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.idSetor = idSetor;
        this.idFuncao = idFuncao;
        this.empresa = empresa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSetor() {
        return idSetor;
    }

    public int getIdFuncao() {
        return idFuncao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", idSetor=" + idSetor + ", idFuncao=" + idFuncao + ", empresa=" + empresa + '}';
    }
      
}
